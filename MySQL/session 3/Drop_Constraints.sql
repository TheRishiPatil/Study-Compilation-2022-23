ALTER TABLE TBL_EMPLOYEE
DROP CONSTRAINT CHECK_DATE_OF_BIRTH;

ALTER TABLE TBL_EMPLOYEE
DROP CONSTRAINT UNQ_EMPLOYEE_NUMBER;

ALTER TABLE TBL_EMPLOYEE
DROP CONSTRAINT CHECK_MIDDLE_NAME;

ALTER TABLE TBL_TRANSACTION
DROP CONSTRAINT CHECK_AMOUNT;