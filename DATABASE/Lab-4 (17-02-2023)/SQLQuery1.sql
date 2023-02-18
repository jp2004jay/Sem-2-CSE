create database University_Management

create table Student
(
	Enrollment_No varchar(20),
	Name varchar(25),
	CPI decimal(5,2),
	Birthdate datetime
)


alter table Student
Add City varchar(20),
	Backlog int not null

alter table Student
Alter column Name varchar(35)

alter table Student
alter column CPI int

SP_RENAME 'Student.Enrollment_No', 'ENO'

Alter table Student
Drop Column City

SP_RENAME Student, Student_Master

alter table Student_Master
Drop column Backlog

Alter Table Student_Master
Alter Column Name varchar(35) not null

SP_RENAME 'Student_Master.Birthdate', 'BDate'

Alter Table Student_Master
Alter Column ENO varchar(12)