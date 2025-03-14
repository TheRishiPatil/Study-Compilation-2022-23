DROP TABLE RISHI;

CREATE TABLE RISHI
(Dates1 TIMESTAMP, Dates2 DATE);

INSERT INTO RISHI
VALUES(TIMESTAMP '2002-01-22 13:20:55', '22-01-2002');

SELECT 'THE DATE IS ' || RTRIM(TO_CHAR(my_timestamp, 'YYYY Month Day')) || '.' AS Result -- Month is case sensitive
FROM RISHI;

SELECT 'THE DATE IS ' || RTRIM(TO_CHAR(my_timestamp, 'DL')) || '.' AS Result -- Month is case sensitive
FROM RISHI; -- DATE IN LONG FORM

SELECT 'THE DATE IS ' || RTRIM(TO_CHAR(my_timestamp, 'DS')) || '.' AS Result -- Month is case sensitive
FROM RISHI; -- DATE IN SHORT FORM

SELECT 'THE DATE IS ' || RTRIM(TO_CHAR(my_timestamp, 'IW')) || '.' AS Result -- Month is case sensitive
FROM RISHI; -- WEEK NUMBER

SELECT 'THE DATE IS ' || RTRIM(TO_CHAR(my_timestamp, 'WW')) || '.' AS Result -- Month is case sensitive
FROM RISHI; -- WEEK NUMBER

SELECT 'THE DATE IS ' || RTRIM(TO_CHAR(my_timestamp, 'SYEAR')) || '.' AS Result -- Month is case sensitive
FROM RISHI; -- YEAR IN WORDS

SELECT 'THE DATE IS ' || RTRIM(TO_CHAR(my_timestamp, 'RM')) || '.' AS Result -- Month is case sensitive
FROM RISHI; -- ROMAN NUMBERS

SELECT 'THE DATE IS ' || RTRIM(TO_CHAR(my_timestamp, 'CC')) || '.' AS Result -- Month is case sensitive
FROM RISHI; -- CENTURY

SELECT 'THE DATE IS ' || RTRIM(TO_CHAR(my_timestamp, 'FMMM')) || '.' AS Result -- Month is case sensitive
FROM RISHI;  -- DELETE STARTING ZERO

SELECT 'THE DATE IS ' || RTRIM(TO_CHAR(my_timestamp, 'FMDDTH')) || '.' AS Result -- Month is case sensitive
FROM RISHI; -- ST,RD,ND

SELECT  'The time is ' || RTRIM(TO_CHAR(DATES1, 'HH')) || '.' AS RESULT
FROM RISHI; -- HOURS IN 12

SELECT  'The time is ' || RTRIM(TO_CHAR(DATES1, 'HH24:MI:SS:FF AM')) || '.' AS RESULT
FROM RISHI; -- HOURS IN 24, 'MI' FOR MINUTES NOT MM, 'SS' FOR SECONDS,
--'FF' FRACTIONS OF SECONDS AND ADD NUMBERS FOR HOW MANY DIGITS NEED AFTER SECONDS LIKE 'FF2', 'FF5'. OR USE 'SSSS' FOR HOW MANY DIGITS NEED AFTER SECONDS, 
-- WE CAN USE ,-.; ALSO INPLACE OF :

SELECT  'The time is ' || RTRIM(TO_CHAR(DATES1, 'DL TS')) || '.' AS RESULT
FROM RISHI; -- SHORTCUT