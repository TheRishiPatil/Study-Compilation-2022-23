SELECT * FROM tbl_employee
WHERE UPPER(employee_last_name) = 'WRIGHT';

SELECT * FROM tbl_employee
WHERE UPPER(employee_last_name) < UPPER('B'); 
-- < BEFORE, <> != ^= NOT EQUAL

SELECT * FROM tbl_employee
WHERE UPPER(employee_last_name) LIKE 'W%';
-- START FROM W

SELECT * FROM tbl_employee
WHERE UPPER(employee_last_name) LIKE '%W';
-- END WITH W

SELECT * FROM tbl_employee
WHERE UPPER(employee_last_name) LIKE '%W%';
--COULD BE START, MIDDLE AND END 

SELECT * FROM tbl_employee
WHERE UPPER(employee_last_name) LIKE '_W%';
-- SECOND WORD IS W


-- WILDCARDS % = 0-INFINITY CHARACTERS
-- WILDCARDS _ = 1 CHARACTER

-- 0-9 ==> 48-57
-- A-Z ==> 65-90
-- a-z ==> 97-122 
-- So w > Z