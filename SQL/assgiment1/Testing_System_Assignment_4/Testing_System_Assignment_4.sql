use assignment;

-- Exercise 1: Join

-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ

	select *
    from `accounts`
    join departments 
    using(department_id);
    
-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010

	select *
    from `accounts`
    where created_date > '2010-12-20';
    
-- Question 3: Viết lệnh để lấy ra tất cả các developer

	select *
    from `accounts`
    join positions
    using(position_id)
    where position_name = 'Dev';
    
-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
	
    select departments.*
	from `accounts`
	join departments
	on accounts.department_id = departments.department_id
    group by departments.department_id
    having count(accounts.department_id) > 3;
    
-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất

	select questions.*, COUNT(exam_id)
	from exams_questions
	join questions 
    using (question_id)
	group by questions.question_id
	having COUNT(exam_id) = (select MAX(num_exams)
							from 	(select COUNT(exam_id) as num_exams
									from exams_questions
									group by question_id) as a);
								
                                    
-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question

	select question_categories.*, count(question_id)
    from question_categories
    left join questions
    using(category_id)
    group by category_id;
    
-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam

	select questions.*, count(exam_id)
    from questions
    left join exams_questions
    using(question_id)
    group by question_id;
    
-- Question 8: Lấy ra Question có nhiều câu trả lời nhất

	select questions.*
    from answers
    join questions
    using(question_id)
	group by question_id
    having count(answer_id)= 	(select max(num_answer)
								from	(select count(answer_id) as num_answer
										from answers
                                        group by question_id) as k);
                                        
 -- Question 9: Thống kê số lượng account trong mỗi group
 
	select `groups`.*, count(account_id)
    from `groups`
    left join groups_accounts
    using(group_id)
    group by group_id;
    
-- Question 10: Tìm chức vụ có ít người nhất

	select positions.*, count(account_id)
    from positions
	join accounts
    using(position_id)
    group by position_id
    having count(account_id) = (select min(num_account)
								from (select count(account_id) as num_account
									 from `accounts`
                                     group by position_id) as kq);
    
-- Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
    
	select department_name, position_name, COUNT(account_id)
    from departments
    cross join positions
	left join accounts
    using(department_id, position_id)
    where position_name in('Dev', 'Test', 'Scrum Master', 'PM')
    group by department_id, position_id;
    
-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, ...

	select *
	from questions q
	join question_types 
    using (type_id)
	join answers 
    using (question_id)
	join question_categories 
    using (category_id)
	join accounts a 
    on q.creator_id = a.account_id;
    
-- Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
	
    select question_types.*, COUNT(question_id)
	from question_types
	left join questions 
    using (type_id)
	where type_name in ('ESSAY', 'MULTIPLE_CHOICE')
	group by type_id;
    
-- Question 14:Lấy ra group không có account nào

	select `groups`.*
	from `groups`
	left join groups_accounts 
    using (group_id)
	where account_id IS NULL;
    
-- Question 16: Lấy ra question không có answer nào

	select questions.*
	from questions
	left join answers 
	using (question_id)
	where answer_id IS NULL;

-- Exercise 2: Union
-- Question 17:
-- a) Lấy các account thuộc nhóm thứ 1

	select accounts.*
	from accounts
	join groups_accounts 
    using (account_id)
	where group_id = 1;

-- b) Lấy các account thuộc nhóm thứ 2

	select accounts.*
	from accounts
	join groups_accounts 
    using (account_id)
	where group_id = 2;
    
-- c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau

	select accounts.*
	from accounts
	join groups_accounts 
    using (account_id)
	where group_id = 1
	union
	select accounts.*
	from accounts
	join groups_accounts 
    using (account_id)
	where group_id = 2;
    
-- Câu 18:
-- a) Lấy các group có lớn hơn 5 thành viên.

	select `groups`.*, COUNT(account_id)
	from `groups`
	join groups_accounts 
    using (group_id)
	group by group_id
	having num_accounts > 5;

-- b) Lấy các group có nhỏ hơn 7 thành viên

	select `groups`.*, COUNT(account_id)
	from `groups`
	join groups_accounts 
    using (group_id)
	group by group_id
	having COUNT(account_id) > 7;
    
-- c) Ghép 2 kết quả từ câu a) và câu b)

	select `groups`.*, COUNT(account_id)
	from `groups`
	join groups_accounts 
    using (group_id)
	group by group_id
	having COUNT(account_id) > 5
    union
	select `groups`.*, COUNT(account_id)
	from `groups`
	join groups_accounts 
    using (group_id)
	group by group_id
	having COUNT(account_id) > 7;