CREATE USER C##RISHI IDENTIFIED BY Rishi123;

CONNECT C##RISHI
CREATE TABLE C##RISHI.TBL_EMPLOYEE
(MYFIELD VARCHAR2(20));

ALTER TABLE C##RISHI
ADD MYFIELD2 NUMBER(4, 0);

ALTER TABLE C##RISHI.TBL_EMPLOYEE
SET UNUSED (MYFIELD2);

ALTER TABLE C##RISHI.TBL_EMPLOYEE
DROP UNUSED COLUMNS;