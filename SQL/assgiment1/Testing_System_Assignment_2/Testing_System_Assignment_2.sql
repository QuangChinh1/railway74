create database Testing_System_Assignment_2;

use Testing_System_Assignment_2;

create table Department(
	Department_id 						INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Department_name 					VARCHAR(225) UNIQUE NOT NULL
);

create table `position`(
	Position_id 						INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Position_name 						ENUM('Dev','Test','Scrum Master','PM') NOT NULL
);

create table `Account`(
	Account_id 							INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Email 								VARCHAR(225) UNIQUE NOT NULL,
    User_name 							VARCHAR(225) UNIQUE NOT NULL,
	Full_name 							VARCHAR(225) NOT NULL,
    Department_id 						INT UNSIGNED,
    Position_id 						INT UNSIGNED,
    Create_date 						DATE NOT NULL,
    foreign key (Department_id) 		references Department(Department_id),
    foreign key (Position_id) 			references `position`(Position_id)
);

create table `group`(
	Group_id 							INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Group_name 							VARCHAR(225) UNIQUE NOT NULL,
    Creator_id 							INT UNSIGNED NOT NULL,
    Create_date 						DATE NOT NULL,
    foreign key (Creator_id) 			references `Account`(Account_id)
);

create table Group_Account(
	Group_id 							INT UNSIGNED NOT NULL ,
    Account_id 							INT UNSIGNED NOT NULL,
    Join_date 							DATE NOT NULL,
    primary key (Group_id,Account_id),
    foreign key (Account_id) 			references `Account` (Account_id),
    foreign key (Group_id) 				references `group` (Group_id)
);

create table Type_Question(
	Type_id 							INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Type_name 							ENUM('Essay','Multiple-Choice') NOT NULL
);

create table Category_question(
	Category_id 						INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Category_name 						VARCHAR(225) UNIQUE NOT  NULL
);

create table Question(
	Question_id 						INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Content 							VARCHAR(225) UNIQUE NOT  NULL,
	Category_id 						INT UNSIGNED NOT NULL,
	Type_id 							INT UNSIGNED NOT NULL,
	Creator_id 							INT UNSIGNED NOT NULL,
	Create_date 						DATE NOT NULL,
    foreign key (Category_id) 			references Category_question (Category_id),
    foreign key (Creator_id) 			references `Account` (Account_id),
    foreign key (Type_id) 				references Type_Question (Type_id)
);

create table Answer(
	Answer_id 							INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content 							VARCHAR(225) NOT NULL,
    Question_id 						INT UNSIGNED NOT NULL,
    isCorrect 							ENUM('T','F') NOT NULL,
    foreign key (Question_id) references Question (Question_id)
);

create table Exam(
	Exam_id 							INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `Code` 								VARCHAR(10) NOT NULL,
    Title 								VARCHAR(50) NOT NULL,
    Category_id 						INT UNSIGNED NOT NULL,
    Duration 							INT UNSIGNED NOT NULL,
    Creator_id 							INT UNSIGNED NOT NULL,
    Create_date 						DATE NOT NULL,
    foreign key (Category_id) 			references Category_question (Category_id),
    foreign key (Creator_id) 			references `Account` (Account_id)
);

create table Exam_question(
	Exam_id 							INT UNSIGNED NOT NULL,
    Question_id 						INT UNSIGNED NOT NULL,
	foreign key (Exam_id) 				references Exam (Exam_id),
	foreign key (Question_id) 			references Question (Question_id)
);

INSERT INTO `testing_system_assignment_2`.`department`
	(`Department_id`,`Department_name`)
VALUES
	(1,'sale'),
	(2,'marketing'),
    (3,'BAO VE'),
	(4,'GIAM DOC'),
    (5,'KE TOAN');
    
INSERT INTO `testing_system_assignment_2`.`position`
	(`Position_id`,`Position_name`)
VALUES
	(1,'Dev'),
    (2,'Test'),
    (3,'Scrum Master'),
    (4,'PM'),
    (5,'Test');
    
INSERT INTO `testing_system_assignment_2`.`account`
(`Account_id`,`Email`,`User_name`,`Full_name`,`Department_id`,`Position_id`,`Create_date`)
VALUES
(1,'a3@gmail.com','a3','NGUYEN VAN A3',1,1,'2023-05-01'),
(2,'b3@gmail.com','b3','NGUYEN VAN B3',2,2,'2023-05-02'),
(3,'c3@gmail.com','c3','NGUYEN VAN C3',3,3,'2023-05-03'),
(4,'d3@gmail.com','d3','NGUYEN VAN D3',4,4,'2023-05-04'),
(5,'e3@gmail.com','e3','NGUYEN VAN E3',5,5,'2023-05-05');

INSERT INTO `testing_system_assignment_2`.`group`
(`Group_id`,`Group_name`,`Creator_id`,`Create_date`)
VALUES
(1,'a4',1,'2023-05-06'),
(2,'b4',1,'2023-05-07'),
(3,'c4',1,'2023-05-08'),
(4,'d4',1,'2023-05-09'),
(5,'e4',1,'2023-05-10');

INSERT INTO `testing_system_assignment_2`.`group_account`
(`Group_id`,`Account_id`,`Join_date`)
VALUES
(1,1,'2023-05-06'),
(2,2,'2023-05-07'),
(3,3,'2023-05-08'),
(4,4,'2023-05-09'),
(5,5,'2023-05-10');

INSERT INTO `testing_system_assignment_2`.`type_question`
(`Type_id`,`Type_name`)
VALUES
(1,'Essay'),
(2,'Multiple-Choice'),
(3,'Essay'),
(4,'Multiple-Choice'),
(5,'Essay');

INSERT INTO `testing_system_assignment_2`.`category_question`
(`Category_id`,`Category_name`)
VALUES
(1,'Java'),
(2,'NET'),
(3,'SQL'),
(4,'Postman'),
(5,'Ruby');

INSERT INTO `testing_system_assignment_2`.`question`
(`Question_id`,`Content`,`Category_id`,`Type_id`,`Creator_id`,`Create_date`)
VALUES
(1,'a8',1,1,1,'2023-05-03'),
(2,'b8',2,2,2,'2023-05-04'),
(3,'c8',3,3,3,'2023-05-05'),
(4,'d8',4,4,4,'2023-05-06'),
(5,'e8',5,5,5,'2023-05-07');


INSERT INTO `testing_system_assignment_2`.`answer`
(`Answer_id`,`Content`,`Question_id`,`isCorrect`)
VALUES
(1,'a9',1,'T'),
(2,'b9',2,'F'),
(3,'c9',3,'T'),
(4,'d9',4,'F'),
(5,'e9',5,'T');

INSERT INTO `testing_system_assignment_2`.`exam_question`
(`Exam_id`,`Question_id`)
VALUES
(1,1),
(2,2),
(3,3),
(4,4),
(5,5);



    
    
    
    
    
    
    