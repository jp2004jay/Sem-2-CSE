SELECT ACTNO, CNAME, AMOUNT FROM DEPOSITE

SELECT LOANNO, AMOUNT FROM BORROW

SELECT * FROM BORROW 
WHERE BNAME = 'ANDHERI'

SELECT ACTNO, AMOUNT FROM DEPOSITE
WHERE ACTNO = 106

SELECT CNAME FROM BORROW
WHERE AMOUNT>5000

SELECT CNAME FROM DEPOSITE
WHERE ADATE<'12-1-96'

SELECT CNAME FROM DEPOSITE
WHERE ACTNO>105

SELECT CNAME FROM CUSTOMERS
WHERE CITY = 'NAGPUR'
OR CITY = 'DELHI'

SELECT CNAME FROM CUSTOMERS
WHERE CITY IN('NAGPUR', 'DELHI')

SELECT CNAME FROM DEPOSITE
WHERE AMOUNT>4000
AND ACTNO<105

SELECT * FROM BORROW 
WHERE AMOUNT>=3000
AND AMOUNT<=8000