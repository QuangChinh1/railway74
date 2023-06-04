use assignment;

-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó

delimiter $$
create procedure Question_1( 
	in in_department_name varchar(50))
begin
	select *
    from accounts
    where department_id in (
		select department_id
        from departments
        where department_name = in_department_name);
end $$
delimiter ;
call Question_1('sale')

-- Question 2: Tạo store để in ra số lượng account trong mỗi group

delimiter $$
create procedure Question_2()
begin 
	select `groups`.group_id, count(group_id)
    from `groups`
    left join groups_accounts
    using (group_id)
    group by group_id ;
end $$
delimiter ;
 call Question_2;
 
 
-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo
-- trong tháng hiện tại

delimiter $$
create procedure Question_3()
begin 
	declare var_now datetime default now();

	select question_types.type_id, created_date, count(question_id)
    from question_types
    left join questions
    using (type_id)
    group by type_id 
    having month(created_date) = month (var_now) and year (created_date) = year(var_now);
end $$
delimiter ;
 call Question_3;

-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất

-- cách 1
delimiter $$
create procedure Question_4()
begin 
	create view Que_4 as
		select type_id, count(type_id) as num_questions
		from questions
		group by type_id;
    select type_id
    from Que_4
    where num_questions = 
		(select max(num_questions)
        from Que_4);
	
end $$
delimiter ;
 call Question_4;
 
-- cách 2 dùng functions
SET GLOBAL log_bin_trust_function_creators = 1;
delimiter $$
create function  Question_4_2() returns int
begin 
	declare var_type_id int;
    select type_id into var_type_id
    from Que_4
    where num_questions = 
		(select max(num_questions)
        from Que_4);
	return var_type_id;
end $$
delimiter ;
select Question_4_2();
 
 -- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
 
 select type_name 
 from question_types
 where type_id = Question_4_2();

-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên
-- chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa
-- chuỗi của người dùng nhập vào

	delimiter $$
	create procedure Question_6(
    in in_in_put varchar(255)
    )
	begin 
		select group_name as ket_qua
        from `groups`
        where group_name like concat('%', in_in_put, '%')
        union
        select username as ket_qua
        from accounts
        where username like concat ('%', in_in_put, '%' );
	end $$
	delimiter ;
	call Question_6('T');
    
-- Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và
-- trong store sẽ tự động gán:
-- username sẽ giống email nhưng bỏ phần @..mail đi
-- positionID: sẽ có default là developer
-- departmentID: sẽ được cho vào 1 phòng chờ
-- Sau đó in ra kết quả tạo thành công

delimiter $$
	create procedure Question_7(
		in in_in_put_fullName varchar(255),
		in in_in_put_email varchar(255)
    )
	begin 
		insert into `accounts` (email, username, full_name, department_id, position_id, created_date)
        value (
			in_in_put_email,
            (select substring_index(in_in_put_email, '@', '1')),
            in_in_put_fullName,
            11,
            1,
			curdate()
            );
		select *
        from accounts
        order by created_date desc
        limit 1;
	end $$
	delimiter ;
    
    call Question_7 ('asds', 'zxdc@gmail.com');
    
-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice
-- để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất

delimiter $$
	create procedure Question_8(
		in in_put enum ('Essay', 'Multiple-Choice')
    )
	begin
		with Qs_8 as (
			select *, length(content) as content_length
			from questions
			where type_id = (select type_id
							 from question_types
							 where type_name = in_put))
		select * 
        from Qs_8
        where content_length = ( select max(content_length)
								 from Qs_8);
	end $$
	delimiter ;
    
    call Question_8 ('Essay');
    
-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID

delimiter $$
	create procedure Question_9(
		in in_id int
    )
	begin
		delete from exams
        where exam_id = in_id;
	end $$
	delimiter ;
    
    call Question_9 ('11');
    
-- Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử
-- (sửdụng store ở câu 9 để xóa)
-- Sau đó in số lượng record đã remove từ các table liên quan trong khi removing

delimiter $$
	create procedure Question_10()
	begin
		declare var_removed int;
        declare var_removed_exams int;
        declare var_removed_exams_questions int;
        
        select count(exam_id) into var_removed_exams
        from exams
        where created_date < current_date - interval 3 year;
        
		select count(exam_id) into var_removed_exams_questions
		from exams_questions
        join exams
        using (exam_id)
        where created_date < current_date - interval 3 year;
        
        set var_removed = var_removed_exams + var_removed_exams_questions;
        
        call Question_9 (var_removed_exams);
        
        select concat ('số bản ghi đã xóa là :', var_removed) as kết_quả;
        
	end $$
	delimiter ;
    
    call Question_10 ();
    
-- Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng
-- nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được
-- chuyển về phòng ban default là phòng ban chờ việc

delimiter $$
	create procedure Question_11(
		in in_department_name varchar (225)
    )
	begin
		declare var_department_id int;
        
		select department_id into var_department_id
        from departments
        where department_name = in_department_name;
        
        update `accounts`
        set department_id = 11
        where department_id = var_department_id;
        
        delete from departments
        where department_id = var_department_id;
        
	end $$
	delimiter ;
    
    call Question_11 (12);
    
-- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay

delimiter $$
	create procedure Question_12()
	begin
		SELECT month, COUNT(question_id) AS num_questions
		FROM
		 (SELECT 1 AS month
        UNION
        SELECT 2 AS month
        UNION
        SELECT 3 AS month
        UNION
        SELECT 4 AS month
        UNION
        SELECT 5 AS month
        UNION
        SELECT 6 AS month
        UNION
        SELECT 7 AS month
        UNION
        SELECT 8 AS month
        UNION
        SELECT 9 AS month
        UNION
        SELECT 10 AS month
        UNION
        SELECT 11 AS month
        UNION
        SELECT 12 AS month) AS t1	
		left join
        (select month(created_date) as month, question_id
        from questions
        where year(created_date) = year (current_date)) as t2
        using (month)
        group by month;
        
        
	end $$
	delimiter ;
    
    call Question_12 ();
    
-- Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất
-- (Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng")

delimiter $$
	create procedure Question_13()
	begin
		SELECT year, month, if (	COUNT(question_id) = 0, 'Không có câu hỏi nào trong tháng,',
								COUNT(question_id)) AS num_questions
		FROM
			(SELECT year (current_date - interval 1 month) as year, month(current_date - interval 1 month) as month
			UNION
            SELECT year (current_date - interval 2 month) as year, month(current_date - interval 2 month) as month
            UNION
            SELECT year (current_date - interval 3 month) as year, month(current_date - interval 3 month) as month
            UNION
            SELECT year (current_date - interval 4 month) as year, month(current_date - interval 4 month) as month
            UNION
            SELECT year (current_date - interval 5 month) as year, month(current_date - interval 5 month) as month
            UNION
            SELECT year (current_date - interval 6 month) as year, month(current_date - interval 6 month) as month) as t3
        
		left join
        (select year (created_date) as year, month(created_date) as month, question_id
        from questions) as t4
        using (year, month)
        group by year, month;
        
        
	end $$
	delimiter ;
    
    call Question_13 ();
