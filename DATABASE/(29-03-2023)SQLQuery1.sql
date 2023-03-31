create table Computer(
	RollNo int, 
	Name varchar(50)
)

create table Electrical(
	RollNo int, 
	Name varchar(50)
)

--1
select Name from Computer
UNION
select Name from Electrical

--2
select Name from Computer 
UNION All
select Name from Electrical

--3
select Name from Computer
Intersect
select Name from Electrical

--4
select Name from Computer
Except
select Name from Electrical

--5
select Name from Electrical
Except
select Name from Computer

--6
select * from Computer
Union
select * from Electrical

--7
select * from Computer
Intersect
select * from Electrical
