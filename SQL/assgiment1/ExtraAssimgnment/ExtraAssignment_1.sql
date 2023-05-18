create database ExtraAssignment1;
create table Trainee(
	TraineeID INT AUTO_INCREMENT PRIMARY KEY,
    Full_Name VARCHAR(225),
    Birth_Date date,
    Gender ENUM('MALE','FEMALE','UNKNOWN'),
	ET_IQ INT,
    check (0<=ET_IQ<=20),
    ET_Gmath INT,
    check (0<=ET_Gmath<=20),
   ET_English INT,
   check (0<=ET_English<=50),
   Training_Class VARCHAR(50),
   Evaluation_Notes VARCHAR(225)
);

