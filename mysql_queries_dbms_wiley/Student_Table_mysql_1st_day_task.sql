use wiley_table;

CREATE TABLE Student
(
Roll_ID INT ,
First_name  VARCHAR(100),
Last_name  VARCHAR(100),
Father_name VARCHAR(60),
Mother_name VARCHAR(60),
dob DATE,
Course VARCHAR(20),
Gender CHAR,
Admission_Date DATE);
DESC Student;
#structure of Student table
SELECT *FROM Student;

INSERT INTO Student VALUES(100,"Anand","Kumar","Mr.Ajay Kumar","Mrs.Smita Sonam",'2000-01-22',
"BTECH-CS",'M','2019-07-22');
INSERT INTO Student VALUES(101,"Amrita","Singh","Mr.Vijay Singh","Mrs.Smriti Singh",'2000-07-12',
"BTECH-IT",'F','2019-07-12');
INSERT INTO Student VALUES(102,"Binod","Kumar","Mr.Balram Kumar","Mrs.Babita",'2000-08-21',
"BTECH-MECH",'M','2019-07-02');
INSERT INTO Student VALUES(103,"Brinda","Sharma","Mr.Gokul Ram","Mrs.Sia Ram",'2001-01-12',
"BTECH-CIVIL",'F','2019-07-29');
INSERT INTO Student VALUES(104,"Sagar","Kumar","Mr.Srikanth Kumar","Mrs.Priyanka",'2000-12-22',
"BTECH-ECE",'M','2019-07-22');
INSERT INTO Student VALUES(105,"Prerna","Kumari","Mr.Ram Kumar","Mrs.Karishma Kumari",'2002-11-22',
"BTECH-EEE",'F','2019-07-13');

