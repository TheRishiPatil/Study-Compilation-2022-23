DROP TABLE RISHI;

CREATE TABLE RISHI
(My_Timestamp TIMESTAMP(5), My_Timestamp2 TIMESTAMP(5));

INSERT INTO RISHI
VALUES (TIMESTAMP '2002-01-22 13:12:33', DATE '2000-4-3');

INSERT INTO RISHI
VALUES ('22-January-2002', DATE '2000-4-3');

SELECT my_timestamp + 1 AS RESULT
FROM RISHI;

SELECT my_timestamp - 1 AS RESULT
FROM RISHI;

SELECT my_timestamp + 19/24 AS RESULT
FROM RISHI;

SELECT ADD_MONTHS(my_timestamp, -1) AS RESULT
FROM RISHI;

SELECT ROUND(my_timestamp) AS RESULT
FROM RISHI;

SELECT TRUNC(my_timestamp) AS RESULT
FROM RISHI;

SELECT LAST_DAY(my_timestamp) AS RESULT
FROM RISHI;

SELECT NEXT_DAY(my_timestamp, 'TUE') AS RESULT
FROM RISHI;

SELECT EXTRACT(YEAR FROM my_timestamp) AS RESULT
FROM RISHI;

SELECT my_timestamp, EXTRACT(MONTH FROM my_timestamp) AS RESULT
FROM RISHI;

SELECT TRUNC(my_timestamp) - EXTRACT(DAY FROM my_timestamp) +1 AS RESULT
FROM RISHI;

SELECT TRUNC(my_timestamp), TRUNC(my_timestamp2), TRUNC(my_timestamp) - TRUNC(my_timestamp2) AS RESULT
FROM RISHI;

SELECT TRUNC(my_timestamp), TRUNC(my_timestamp2), MONTHS_BETWEEN(my_timestamp, my_timestamp2) AS RESULT 
FROM RISHI;

SELECT CURRENT_DATE, SYSDATE
FROM DUAL;
