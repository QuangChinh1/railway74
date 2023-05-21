create database Testing_System_Assignment_1;

use Testing_System_Assignment_1;

create table Department(
	Department_id INT,
	Department_name VARCHAR(225)
);

create table position (
	Position_id INT,
    Position_name VARCHAR(225)
);

create table Account(
	Account_id INT,
    Email VARCHAR(225),
    User_name VARCHAR(225),
	Full_name VARCHAR(225),
    Department_id INT,
    Position_id INT,
    Create_date DATE
);

create table group1(
	Group_id INT,
    Group_name VARCHAR(225),
    Creator_id INT,
    Create_date DATE
);

create table Group_Account(
	Group_id INT,
    Account_id INT,
    Join_date DATE
);

create table TypeQuestion(
	Type_id INT,
    Type_name VARCHAR(225)
);

create table Category_question(
	Category_id INT,
	Category_name VARCHAR(225)
);

create table Question(
	Question_id INT,
	Content VARCHAR(225),
	Category_id INT,
	Type_id INT,
	Creator_id INT,
	Create_date DATE
);

create table Answer(
	Answer_id INT,
    Content VARCHAR(225),
    Question_id INT,
    isCorrect VARCHAR(10)
);

create table Exam(
	Exam_id INT,
    Code VARCHAR(225),
    Title VARCHAR(225),
    Category_id INT,
    Duration VARCHAR(225),
    Creator_id INT,
    Create_date DATE
);

create table Exam_question(
	Exam_id INT,
    Question_id INT
);
