use assignment;
CREATE TABLE EMP(
Empno int(4) Not null primary key default 0,
Ename varchar(10),
Job varchar(9),
Mgr int(4),
Hiredate date,
Sal decimal(7,2),
comm decimal(7,2),
deptno int(2) 
);

create table dept(
Deptno int(2) primary key default 0,
Dname varchar(14),
Loc varchar(13)
);

create table student(
Rno int(2) not null primary key default 0,
Sname varchar(14),
City varchar(20),
State varchar(20)
);

create table emp_log(
emp_id int(5),
log_date date,
new_salary int(10),
action varchar(20)
);

select * from dept;

insert into dept
values (10, 'ACCOUNTING', 'NEWYORK');
insert into dept
values (20, 'RESEARCH', 'DALLAS');
insert into dept
values (30, 'SALES' , 'CHICAGO');
insert into dept
values (40, 'OPERATION' , 'BOSTON');

insert into emp
value (7369,'smith','clerk',7902,'1980-12-17',800,null,20);
insert into emp
value (7499,'allen','salesman',7698,'1981-02-20',1600,300,30);
insert into emp
value (7521,'ward','salesman',7698,'1981-02-22',1250,500,30);
insert into emp
value (7566,'jones','manager',7839,'1981-04-02',2975,null,20);
insert into emp
value (7654,'martin','salesman',7698,'1981-09-28',1250,1400,30);
insert into emp
value (7698,'blake','manager',7839,'1981-05-01',2850,null,30);
insert into emp
value (7698,'blake','manager',7839,'7369-02-01',2850,null,30);
insert into emp
value (7697,'blake','manager',7839,'7369-02-01',2850,null,10);

SELECT DISTINCT Job FROM EMP;

SELECT * FROM EMP
ORDER BY deptno;

SELECT * FROM EMP
ORDER BY Job desc;

SELECT distinct job FROM EMP
GROUP BY Job
ORDER BY Job DESC;

select * from EMP
where Hiredate < ('1981-01-01');

select * from EMP
where 'Hiredate' > ('7369-03-01');

select * from EMP
where comm>Sal;

select * from EMP
where Job='CLERK' or Job='ANALYST';

select Ename from EMP
where Ename like 'S%' and char_length(Ename)=5;

select Empno from EMP
where Empno not like 78;

select * from EMP
where Job='clerk' and deptno=20;


select distinct e1.* from EMP e1, EMP e2 
where e1.deptno=20 and e2.deptno=10 and e1.Job=e2.Job;

select e1.* from EMP e1, EMP e2 
WHERE (e2.Ename='smith' or e2.Ename='allen') and e1.Sal=e2.Sal;


select e1.* from EMP e1, EMP e2 
WHERE (e2.Ename='smith' or e2.Ename='allen') and e1.Job=e2.JOb;

select distinct e1.* from EMP e1, EMP e2 
where e1.deptno=20 and e2.deptno=10 and e1.Job<>e2.Job;



SELECT MAX(Sal) FROM EMP;

select * from EMP
where Sal = max(Sal);


