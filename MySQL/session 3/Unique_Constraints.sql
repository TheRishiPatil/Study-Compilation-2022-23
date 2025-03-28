ALTER TABLE TBL_EMPLOYEE
ADD CONSTRAINT UNQ_GOVERNMENT_ID UNIQUE(EMPLOYEE_GOVERNMENT_ID);

SELECT EMPLOYEE_GOVERNMENT_ID, COUNT(EMPLOYEE_GOVERNMENT_ID) AS COUNT
FROM TBL_EMPLOYEE 
GROUP BY EMPLOYEE_GOVERNMENT_ID
HAVING COUNT(EMPLOYEE_GOVERNMENT_ID) > 1;

SET TRANSACTION NAME 'Delete_From_Employee';

DELETE FROM TBL_EMPLOYEE
WHERE EMPLOYEE_NUMBER < 3;

SELECT * FROM TBL_EMPLOYEE WHERE EMPLOYEE_NUMBER IN (131, 132);

DELETE FROM TBL_EMPLOYEE
WHERE EMPLOYEE_NUMBER IN (131, 132);

Insert into TBL_EMPLOYEE (EMPLOYEE_NUMBER,EMPLOYEE_FIRST_NAME,EMPLOYEE_MIDDLE_NAME,EMPLOYEE_LAST_NAME,EMPLOYEE_GOVERNMENT_ID,DATE_OF_BIRTH,DEPARTMENT) values (131,'Jossef','H','Wright','HI108464V                                         ',to_date('04-04-80','DD-MM-RR'),'Customer Relations');
Insert into TBL_EMPLOYEE (EMPLOYEE_NUMBER,EMPLOYEE_FIRST_NAME,EMPLOYEE_MIDDLE_NAME,EMPLOYEE_LAST_NAME,EMPLOYEE_GOVERNMENT_ID,DATE_OF_BIRTH,DEPARTMENT) values (132,'Dylan','A','Word','QK881576I                                         ',to_date('24-03-71','DD-MM-RR'),'Customer Relations');

COMMIT;