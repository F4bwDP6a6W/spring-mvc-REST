Step 1
Install MySQL, please record the random password given by the last step of Mysql installation:
"[Note] A temporary password is generated for root@localhost: pQAsm.fwQ4.1"

Step 2
Adding mysql commands into path, so you can run mysql command in Terminal(Mac OS X):
export PATH=${PATH}:/usr/local/mysql/bin/

Step 3
Open Terminal and run following command and give the random password:
mysql -u root -p

Step 4
Change password to 'Nokia123' by running:
SET PASSWORD = PASSWORD('Nokia123');

Step 5
Create a database called 'test':
CREATE DATABASE test;
USE test;

Step 6
Check all databases exist:
SHOW DATABASES;

Step 7
Create tables:

CREATE TABLE `Student` (
`id` int(11) unsigned NOT NULL AUTO_INCREMENT,
`firstName` varchar(100) NOT NULL DEFAULT '',
`lastName` varchar(100) NOT NULL DEFAULT '',
`uscId` varchar(10),
`birthday` DATE,
`gender` char(1),
`gpa` real(4,3),
`mentorId` int(11),
`department` varchar(255),
PRIMARY KEY(`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO Student VALUES (NULL, 'Jerry', 'Zhang', '1234509876', STR_TO_DATE('22-01-1987', '%d-%m-%Y'),'M',3.62,NULL,'Computer Science');




CREATE TABLE `Class` (
`id` int(11) unsigned NOT NULL AUTO_INCREMENT,
`name` varchar(255) NOT NULL DEFAULT '',
`section` char(1),
`days` varchar(10),
`beginTime` time,
`endTime` time,
PRIMARY KEY(`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO Class VALUES (NULL, 'Algorithm', 'A', 'TTH', STR_TO_DATE('12-01-2100 08:00:00','%m-%d-%Y %H:%i:%s'),NULL);



CREATE TABLE `ClassTaken` (
`studentId` int(11) unsigned NOT NULL,
`classId` int(11) unsigned NOT NULL,
`grade` varchar(2),
PRIMARY KEY(`studentId`,`classId`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


INSERT INTO ClassTaken VALUES (1, 1, 'A+');


drop table if exists Student;

