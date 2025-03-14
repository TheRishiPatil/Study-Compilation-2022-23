SELECT ' The first person is called Simon' AS Result 
FROM DUAL;

SELECT ' The first person is called Simon' || '.' AS Result 
FROM DUAL;

SELECT SUBSTR(' The first person is called Simon', 6, 5) AS Result 
FROM DUAL;

SELECT REPLACE(' The first person is called Simon','first','second') AS Result 
FROM DUAL;

SELECT LTRIM(' The first person is called Simon') AS Result 
FROM DUAL;