CREATE TABLE EMP(
Empno int(4) Not null primary key default 0,
Ename varchar(10),
Job varchar(9),
Mgr int(4),
Hiredate date,
Sal decimal(7,2),
comm decimal(7,2),
deptno int(2) 
)