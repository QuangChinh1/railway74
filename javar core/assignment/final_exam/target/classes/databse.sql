DROP DATABASE IF EXISTS final_exam;
CREATE DATABASE final_exam;
USE final_exam;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
    id                  TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    full_name           VARCHAR(50) NOT NULL,
    email               VARCHAR(50) UNIQUE KEY NOT NULL,
    `password`          VARCHAR(12) NOT NULL,
    pro_skill           VARCHAR(50),
    exp_in_year         TINYINT UNSIGNED,
    project_id			TINYINT UNSIGNED,
    `role`              ENUM('EMPLOYEE', 'MANAGER') NOT NULL
);

INSERT INTO `final_exam`.`user`
(`id`,
`full_name`,
`email`,
`password`,
`pro_skill`,
`exp_in_year`,
`role`)
VALUES
(1,
'NGUYEN VAN A',
'nva@gmail.com',
123456,
'java',
null,
'EMPLOYEE');

INSERT INTO `final_exam`.`user`
(`id`,
`full_name`,
`email`,
`password`,
`pro_skill`,
`exp_in_year`,
`role`)
VALUES
(2,
'NGUYEN VAN B',
'nvb@gmail.com',
123456,
null,
2,
'MANAGER');