CREATE TABLE NULL1
(FIRSTNAME VARCHAR(20), MIDDLENAME VARCHAR(20), LASTNAME VARCHAR(20), ROLL_NUMBER DECIMAL(5, 2));

INSERT INTO NULL1
VALUES ('RISHI', 'KRISHNA', 'PATIL', 123.234);

INSERT INTO NULL1(FIRSTNAME, LASTNAME)
VALUES ('RISHI', 'PATIL');

INSERT INTO NULL1(MIDDLENAME, LASTNAME, roll_number)
VALUES ('KRISHNA', 'PATIL', 5+1.2654);

INSERT INTO NULL1
VALUES ('RISHI', 'RISHI', 'PATIL', NULL);

SELECT FIRSTNAME, MIDDLENAME, LASTNAME, firstname || ' ' || middlename || ' ' || lastname AS FULLNAME, roll_number
FROM NULL1;

SELECT FIRSTNAME, MIDDLENAME, LASTNAME, NVL(firstname, '(No First Name)') || ' ' || NVL(middlename, '(No Middle Name)') || ' ' || lastname AS FULLNAME, roll_number
FROM NULL1; -- NVL  ==> Max 2 Arguments

SELECT FIRSTNAME, MIDDLENAME, LASTNAME, NVL2(FIRSTNAME, firstname || ' ', '') || NVL2(MIDDLENAME, middlename || ' ', '') || lastname AS FULLNAME, roll_number
FROM NULL1; -- NVL2  ==> 3 Arguments

SELECT FIRSTNAME, MIDDLENAME, LASTNAME, COALESCE(firstname, '(No First Name)') || ' ' || COALESCE(middlename, ' (No Middle Name)') || ' ' || lastname AS FULLNAME, roll_number
FROM NULL1; -- COALESCE  ==> Multiple Arguments

SELECT FIRSTNAME, MIDDLENAME, LASTNAME, NULLIF(firstname, middlename) || ' ' || middlename || ' ' || lastname AS FULLNAME, roll_number
FROM NULL1; -- NULLIF  ==> If 2 Arguments Are Same Then Execute 1st Argument

--TRUNCATE TABLE NULL1;

DROP TABLE NULL1;