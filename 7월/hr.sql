/*
SELECT * FROM all_tables;

SELECT name, sal, deptno
From professor;


SELECT studno, name, deptno
FROM student
Where grade = '1';


desc student;


insert into student
values(10110, '±èÁ¤¿¬', 'kim', '', '', '', '', '', '', '', '');

commit;

select * from student
where name = '±èÁ¤¿¬';

*/
update professor
set position = 'ºÎ±³¼ö'
where profno = 9903;

select * from professor;
