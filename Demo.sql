Create table emp
(
	id number(5) primary key,
	Name varchar(10) not null ,
	Salary number(6) check(salary > 25000),
	Age number(3)  check (age <= 100),
	Desig varchar(10) default 'GET',
	pan VARCHAR(10) unique
)
