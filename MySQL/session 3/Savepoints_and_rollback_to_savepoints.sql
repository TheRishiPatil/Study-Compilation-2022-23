SET TRANSACTION NAME 'TBL_EMPLOYEE';

SELECT 'Start' AS Status, employee_number FROM TBL_EMPLOYEE WHERE employee_number IN (121, 122, 123);

UPDATE TBL_EMPLOYEE SET employee_number = 122 WHERE employee_number = 123;
SAVEPOINT Spt_1;
SELECT 'After spt_1' AS Status, employee_number FROM TBL_EMPLOYEE WHERE employee_number IN (121, 122, 123);

UPDATE TBL_EMPLOYEE SET employee_number = 121 WHERE employee_number = 122;
SAVEPOINT Spt_2;
SELECT 'After spt_2' AS Status, employee_number FROM TBL_EMPLOYEE WHERE employee_number IN (121, 122, 123);

ROLLBACK TO Spt_2;
SELECT 'After Rollback to Spt_2' AS Status, employee_number FROM TBL_EMPLOYEE WHERE employee_number IN (121, 122, 123);

ROLLBACK TO Spt_1;
SELECT 'After Rollback to Spt_1' AS Status, employee_number FROM TBL_EMPLOYEE WHERE employee_number IN (121, 122, 123);

ROLLBACK;
SELECT 'Rollback to start' AS Status, employee_number FROM TBL_EMPLOYEE WHERE employee_number IN (121, 122, 123);
