SELECT employee_number, employee_first_name, employee_middle_name, employee_last_name, employee_government_id, date_of_birth, department
FROM tbl_employee
WHERE UPPER(employee_first_name) LIKE '%&employee_first_name_needed%'
ORDER BY &MY_NAME_IS_JOKER
;  

DEFINE L_NUMBER = 45;
SELECT &L_NUMBER AS NUMBER FROM DUAL;

UNDEFINE L_NUMBER;
DEFINE;

DEFINE L_NUMBER = 'RISHI';
SELECT LENGTH('&L_NUMBER') AS NAME
FROM DUAL;