create Table Cricket(
	 Name varchar (50), 
	 City varchar (50),
	 Age Int
)

--1
select * into WorldCup from Cricket

--2
select Name, City into T20 from Cricket
where 1=0

--3
select * into IPL from Cricket
where 1=0

--4
Insert into IPL
	select Name, City, Age from Cricket
	where Name like('_a_____%')

select * from IPL

--5
delete from IPL

--6
delete from Cricket
where city = 'Jharkhand'

--7
SP_RENAME 'IPL', 'IPL2018'

--8
drop table T20

