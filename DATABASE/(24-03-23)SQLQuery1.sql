--1
select getdate() as Today_Date

--2
select getdate()+365

--3
select convert(varchar(100), getdate(), 100)

--4
select convert(varchar(100), getdate(), 106)

--5
select convert(varchar(100), getdate(), 107)

--6
select DATEDIFF(Month, '31-Dec-08', '31-Mar-09')

--7
select DATEDIFF(YEAR, '25-Jan-12', '14-Sep-10')

--8
select DATEDIFF(HOUR, '25-Jan-12 7:00', '26-Jan-12 10:30')

--9
select DATENAME(DAY, '12-May-16') as _Day,
		DATENAME(MONTH, '12-May-16') as _Month,
		DATENAME(YEAR, '12-May-16') as _Year

--10
select DATEADD(Year, 5, getdate())

--11
select DATEADD(MONTH, -2, GETDATE())

--12
select DATENAME(MONTH, GETDATE()) as _DateName,
		DATEPART(Month, GETDATE()) as _DatePart

--13
select EOMONTH(GETDATE())

--14
select DATEADD(Day, 30, GETDATE())

--15
select DATEDIFF(Year, '16-Dec-2004', GETDATE())-1 as _Year,
		(DATEDIFF(MONTH , '16-Dec-2004', GETDATE()))-(12*DATEDIFF(Year, '16-Dec-2004', GETDATE()))+12
 as _Month
