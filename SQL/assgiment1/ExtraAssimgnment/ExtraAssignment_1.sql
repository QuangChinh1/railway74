create database ExtraAssignment1;

use ExtraAssignment1;


create table Trainee(
	TraineeID 					INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Full_Name 					VARCHAR(225) NOT NULL,
    Birth_Date 					DATE NOT NULL,
    Gender 						ENUM('MALE','FEMALE','UNKNOWN') NOT NULL,
	ET_IQ 						INT UNSIGNED NOT NULL,
    check 						(0<=ET_IQ<=20),
    ET_Gmath 					INT UNSIGNED NOT NULL,
    check 						(0<=ET_Gmath<=20),
   ET_English 					INT UNSIGNED NOT NULL,
   check 						(0<=ET_English<=50),
   Training_Class 				VARCHAR(50) NOT NULL,
   Evaluation_Notes 			VARCHAR(225)
);

create table Data_types(
	ID 							INT UNSIGNED  AUTO_INCREMENT PRIMARY KEY,
    `Name` 						VARCHAR (225) NOT NULL,
    `Code` 						VARCHAR (5) NOT NULL,
    Modified_date 				DATETIME NOT NULL
);

create table Data_types_2(
	ID 							INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `Name` 						VARCHAR(225) NOT NULL,
    Birth_date 					DATE NOT NULL,
    Gender 						ENUM('0','1','NULL'),
    Is_deleted_flag 			ENUM('0','1') NOT NULL
);






