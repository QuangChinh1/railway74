use assignment;

-- Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo
-- trước 1 năm trước

	delimiter $$
	create trigger Question_1
	before insert on `accounts`
	for each row
	begin
	if new.created_date < now() - interval 1 year
	then 
	signal sqlstate '12345' 
	set message_text = 'can not';
	end if;
	end $$
	delimiter ;
 
-- Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào
-- department "Sale" nữa, khi thêm thì hiện ra thông báo "Department
-- "Sale" cannot add more user"

	delimiter $$
	create trigger Question_2
	before insert on `accounts`
	for each row
	begin
    declare deparment_sale_id tinyint;
    select department_id into deparment_sale_id
    from departments
    where department_name = 'Sale';
	if new.department_id = deparment_sale_id
	then 
	signal sqlstate '12345' 
	set message_text = 'Department "Sale" cannot add more user';
	end if;
	end $$
	delimiter ;
    
-- Question 3: Cấu hình 1 group có nhiều nhất là 5 user

-- trigger không cho thêm user vào nhóm đã có bằng hoặc nhiều hơn 5 user

	drop trigger if exists Question_3
    
	delimiter $$
    
	create trigger Question_3
	before insert on groups_accounts
	for each row
    
	begin
    
    declare total_accounts_1_groups tinyint;
    
    select count(account_id) 
    into total_accounts_1_groups
    from groups_accounts
    where group_id = new.group_id;
    
	if total_accounts_1_groups >= 5
	then 
	signal sqlstate '12345' 
	set message_text = ' Group cannot add more user';
	end if;
	end $$
	delimiter ;

-- trigger không cho update user vào nhóm đã có bằng hoặc nhiều hơn 5 user

	delimiter $$
	create trigger Question_3_2
	before update on groups_accounts
	for each row
	begin
    declare total_accounts_1_groups tinyint;
    
    select count(account_id) 
    into total_accounts_1_groups
    from groups_accounts
    where group_id = new.group_id;
    
	if total_accounts_1_groups >= 5
	then 
	signal sqlstate '12345' 
	set message_text = ' Group cannot add more user';
	end if;
	end $$
	delimiter ;
    
-- Question 4: Cấu hình 1 bài thi có nhiều nhất là 10 Question

	drop trigger if exists Question_4
    
	delimiter $$
    
	create trigger Question_4
	before insert on exams_questions
	for each row
    
	begin
    declare total_question_1_exam tinyint;
    
    select count(account_id) 
    into total_question_1_exam
    from exams_questions
    where exam_id = new.exam_id;
    
	if total_accounts_1_groups >= 10
	then 
	signal sqlstate '12345' 
	set message_text = ' exam cannot add more questions';
	end if;
	end $$
	delimiter ;
    
-- Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là
-- admin@gmail.com (đây là tài khoản admin, không cho phép user xóa),
-- còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông
-- tin liên quan tới user đó


    

    
-- Question 6: Không sử dụng cấu hình default cho field DepartmentID của table
-- Account, hãy tạo trigger cho phép người dùng khi tạo account không điền
-- vào departmentID thì sẽ được phân vào phòng ban "waiting Department"

drop trigger if exists Question_6
    
	delimiter $$
    
	create trigger Question_6
	before insert on `accounts`
	for each row
    
	begin
    
    declare DepartmentID_waiting_Department tinyint;
    
    select department_id into DepartmentID_waiting_Department
    from departments
    where department_name = 'phòng chờ';
    
	if new.department_id is null
		then 
		set new.department_id = DepartmentID_waiting_Department;
        
	end if;
	end $$
	delimiter ;

-- Question 7: Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi
-- question, trong đó có tối đa 2 đáp án đúng.    

	drop trigger if exists Question_7
    
	delimiter $$
    
	create trigger Question_7
	before insert on answers
	for each row
    
	begin
    
    declare total_answer tinyint;
    declare total_is_correct tinyint;
    
    select count(answer_id) into total_answer
    from answers
    where question_id = new.question_id;
    
	if total_answer >= 4
    then 
		signal sqlstate '12345' 
		set message_text = ' can not 1 ';
	end if ;
    
    select count(is_correct) into total_is_correct
    from answers
    where question_id = new.question_id
    and is_correct = 1;
    
    if total_is_correct > 1
    then 
		signal sqlstate '12345' 
		set message_text = ' can not 2 ';
        
	end if;
	end $$
	delimiter ;
    
-- Question 9: Viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày
    
	drop trigger if exists Question_9
    
	delimiter $$
    
	create trigger Question_9
	before delete on exams
	for each row
    
	begin
    
	if old.created_date > now() - interval 2 day
	then 
		signal sqlstate '12345' 
		set message_text = ' can not delete ';
	end if;
	end $$
	delimiter ;
    
-- Question 10: Viết trigger chỉ cho phép người dùng chỉ được update, delete các
-- question khi question đó chưa nằm trong exam nào

-- cách 1
	drop trigger if exists Question_10
    
	delimiter $$
    
	create trigger Question_10
	before delete on questions
	for each row
    
	begin

	if old.question_id in (	select question_id 
							from exams_questions)
	then 
		signal sqlstate '12345' 
		set message_text = ' can not delete ';
	end if;
	end $$
	delimiter ;
    
    delete from questions
    where question_id = 1;
    
    -- cách 2
	drop trigger if exists Question_10_2
    
	delimiter $$
    
	create trigger Question_10_2
	before delete on questions
	for each row
    
	begin
	declare total_question tinyint;
    
    select count(exam_id) into total_question
    from exams_questions
    where question_id = old.question_id;
    
	if total_question > 0
	then 
		signal sqlstate '12345' 
		set message_text = ' can not delete ';
	end if;
	end $$
	delimiter ;
    
-- Question 12: Lấy ra thông tin exam trong đó:

-- Duration <= 30 thì sẽ đổi thành giá trị "Short time"
-- 30 < Duration <= 60 thì sẽ đổi thành giá trị "Medium time"
-- Duration > 60 thì sẽ đổi thành giá trị "Long time"

	select *, 
		case 
			when duration <= 30 then 'Short time'
            when duration <= 60 then 'Medium time'
            when duration > 60 then 'Long time' 
		end as duration_type
	from exams;
    
-- Question 13: Thống kê số account trong mỗi group và in ra thêm 1 column nữa có tên
-- là the_number_user_amount và mang giá trị được quy định như sau:
-- Nếu số lượng user trong group =< 5 thì sẽ có giá trị là few
-- Nếu số lượng user trong group <= 20 và > 5 thì sẽ có giá trị là normal
-- Nếu số lượng user trong group > 20 thì sẽ có giá trị là higher
    
    select group_id, group_name, count(account_id),
		case
			when count(account_id) <= 5 then 'few' 
            when count(account_id) <= 20 then 'nomal' 
            when count(account_id) > 20 then 'higher' 
		end as the_number_user_amount
	from `groups`
    left join groups_accounts
    using (group_id)
    group by group_id;
    
-- Question 14: Thống kê số mỗi phòng ban có bao nhiêu user, nếu phòng ban nào
-- không có user thì sẽ thay đổi giá trị 0 thành "Không có User"

select department_name, department_id, count(account_id),
	case 
		when count(account_id) = 0 then 'Không có User'
        when count(account_id) > 0 then count(account_id)
	end as total_account
from departments
left join accounts
using (department_id)
group by department_id;
    
    