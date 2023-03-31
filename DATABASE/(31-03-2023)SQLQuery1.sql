create database Lab_10

use Lab_10

create table Student(
	Rno int primary key,
	Name varchar(50),
	Branch varchar(50)
)

create table Result(
	RNo int primary key,
	SPI decimal(4,2)
)

create table Employee(
	EmployeeNo varchar(50) primary key,
	Name varchar(50),
	ManagerNo varchar(50)
)

--1
SELECT *
FROM student
CROSS JOIN result

--2
select
	Student.Rno,
	Student.Name,
	Student.Branch,
	Result.SPI
from Student
inner join Result
on Student.Rno = Result.RNo
where Student.Branch = 'CE'

--3
select
	Student.Rno,
	Student.Name,
	Student.Branch,
	Result.SPI
from Student
inner join Result
on Student.Rno = Result.RNo
where Student.Branch <> 'EC'

--4
select 
	Student.Branch,
	AVG(Result.SPI) as Average
from Student
inner join Result
on Student.Rno = Result.RNo
group by Student.Branch

--5
select 
	Student.Branch,
	AVG(Result.SPI) as Average
from Student
inner join Result
on Student.Rno = Result.RNo
group by Student.Branch
order by AVG(Result.SPI)

--6
select 
	Student.Branch,
	AVG(Result.SPI) as Average
from Student
inner join Result
on Student.Rno = Result.RNo
where Student.Branch = 'CE'
	or Student.Branch = 'ME'
group by Student.Branch

--7
Select 
	*
from Student
left outer join Result
on Student.Rno = Result.RNo

--8
Select 
	*
from Student
right outer join Result
on Student.Rno = Result.RNo

--9
Select 
	*
from Student
full outer join Result
on Student.Rno = Result.RNo

--10
Select
	EMP.Name as EmployeeName,
	Manager.Name as ManagerName
from Employee as Manager
join Employee as EMP
on Manager.EmployeeNo = EMP.ManagerNo