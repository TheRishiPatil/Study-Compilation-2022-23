--SELECT * FROM tbl_employee
--WHERE date_of_birth >= TO_DATE('1976-01-01', 'YYYY-MM-DD') AND date_of_birth < TO_DATE('1987-01-01', 'YYYY-MM-DD');
--SELECT EXTRACT(YEAR FROM DATE_OF_BIRTH) AS RESULT, COUNT(*) AS COUNT
--FROM tbl_employee
--GROUP BY EXTRACT(YEAR FROM DATE_OF_BIRTH)
--ORDER BY 1 DESC--RESULT ASC;

SELECT SUBSTR(employee_last_name, 1, 1) AS employee_last_name, COUNT(*) AS Count_of_last_name
FROM tbl_employee
WHERE date_of_birth >= TO_DATE('1970-01-01', 'YYYY-MM-DD')
GROUP BY SUBSTR(employee_last_name, 1, 1)
HAVING COUNT(*) >= 50
ORDER BY COUNT(*) DESC;