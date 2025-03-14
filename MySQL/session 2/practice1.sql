SELECT TO_CHAR(date_of_birth, 'FMMonth') AS BIRTH_MONTH
    ,COUNT(*) AS BIRTH_COUNT
    ,COUNT(employee_middle_name) AS MIDDLE_NAME
    ,COUNT(*) - COUNT(employee_middle_name) AS WITHOUT_MIDDLE_NAME
    ,REPLACE(TO_CHAR(MIN(date_of_birth), 'DL'), ' ', '-') AS MIN_DATE
    ,REPLACE(TO_CHAR(MAX(date_of_birth), 'DL'), ' ', '-') AS MAX_DATE
FROM 
    tbl_employee
GROUP BY 
    TO_CHAR(date_of_birth, 'FMMonth')
    ,TO_CHAR(date_of_birth, 'MM')
ORDER BY
    TO_CHAR(date_of_birth, 'MM');