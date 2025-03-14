-- precision is the number of total digits, and scale is the number of digits after decimal
-- eg.:- 12345.75 --> (7 --> precision, 2 --> scale). default --> (38, 0)

-- string types:- char, nchar, varchar2, nvarchar2
-- CHAR --> Fixed Length, Computer Decides Coding System, 2000 Bytes Or Characters. -->  Rishi     .
--VARCHAR2 --> Variable Length, Computer Decides Coding System, 4000 Bytes Or Characters Extend Upto 32,767. -->  Rishi.
--NCHAR --> Fixed Length, Unicode, 2000 Bytes Or Characters. -->  Rishi     .
--NVARCHAR2 --> Variable Length, Unicode, 4000 Bytes Or Characters Extend Upto 32,767. -->  Rishi.
-- char and varchar takes 1 byte and nchar and nvarchar takes 2 bytes for each character

SELECT 45/5 FROM DUAL; -- dual is an unused table, which gives output in olny one row

CREATE TABLE RISHIPATIL (numbers DECIMAL(5,2), myname VARCHAR2(20)); -- created table

INSERT INTO RISHIPATIL VALUES (55.5, 'Rishi'); -- inserted values

TRUNCATE TABLE RISHIPATIL; -- deleted every data

INSERT INTO RISHIPATIL VALUES(60, 'Krishna');
INSERT INTO RISHIPATIL(myname) VALUES('Patil');
INSERT INTO RISHIPATIL(numbers) VALUES(80);
INSERT INTO RISHIPATIL(numbers) VALUES(55);

DELETE RISHIPATIL WHERE numbers = 55; -- deleted only conditional data

SELECT numbers || ' ' || myname as FullName FROM RISHIPATIL;
SELECT NVL(numbers, '(No numbers)') || ' ' || NVL(myname, '(No name)') AS FullName FROM RISHIPATIL; -- NVL  ==> Max 2 Arguments
SELECT NVL2(numbers, numbers || ' ', '') || NVL2(myname, myname || ' ', '') as FullName FROM RISHIPATIL; -- NVL2  ==> Max 3 Arguments
SELECT COALESCE(numbers, '(No numbers)') || ' ' || COALESCE(myname, '(No name)') as FullName FROM RISHIPATIL;







SELECT * FROM RISHIPATIL; -- selected all from table

DROP TABLE RISHIPATIL; -- droped table