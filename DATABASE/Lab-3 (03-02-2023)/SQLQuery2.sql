CREATE DATABASE UNIVERSITY

CREATE TABLE Students
(
	StuId int,
	FirstName varchar(25),
	LastName varchar(25), 
	Website varchar(50), 
	City varchar(25),
	Division varchar(20)
)

Insert into Students
values (1011, 'Keyur', 'Patel', 'techonthenet.com', 'Rajkot', 'II-BCX'),
		(1022, 'Hardik', 'Shah', 'digminecraft.com', 'Ahmedabad', 'I-BCY'),
		(1033, 'Kajal', 'Trivedi', 'bigactivitys.com', 'Baroda', 'IV-DCX'),
		(1044, 'Bhoomi', 'Gajera', 'cheakyourmath.com', 'Ahmedabad', 'III-DCW')

Insert into Students(StuID, FirstName, LastName, City, Division)
values (1055, 'Harmit', 'Mitel', 'Rajkot', 'II-BCY'),
		(1066, 'Ashok', 'Jani', 'Baroda', 'II-BCZ')

select * from Students

select FirstName from Students
where FirstName like 'K%'

select FirstName from Students
where FirstName like '_____'

select FirstName, LastName from Students
where city like '_____a'

select * from Students
where LastName like '%tel'

select * from Students
where FirstName like 'ha%'
	and FirstName like '%t'

select * from Students
where FirstName like 'K_y%'

select FirstName from Students
where Website is null
and FirstName like '_____'

select * from Students 
where LastName like '%jer%'

select * from Students
where City like 't%'
	or City like 'r%'