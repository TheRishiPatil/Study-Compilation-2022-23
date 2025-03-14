-- INNER JOIN
SELECT 
    tbl_transaction.amount_number 
    ,tbl_employee.employee_first_name
    ,tbl_employee.employee_last_name
    ,SUM(AMOUNT_NUMBER) AS "SUM OF NUMBER"
FROM 
    TBL_EMPLOYEE JOIN TBL_TRANSACTION
    ON tbl_employee.employee_number = tbl_transaction.employee_number
GROUP BY
    tbl_transaction.amount_number 
    ,tbl_employee.employee_first_name
    ,tbl_employee.employee_last_name    
HAVING 
    AMOUNT_NUMBER >= 0;
  
--------------------------------------------------------------------------------
   
-- LEFT (INNER/OUTER) JOIN
SELECT 
    tbl_transaction.amount_number 
    ,tbl_employee.employee_first_name
    ,tbl_employee.employee_last_name
    ,SUM(AMOUNT_NUMBER) AS "SUM OF NUMBER"
FROM 
    TBL_EMPLOYEE LEFT JOIN TBL_TRANSACTION
    ON tbl_employee.employee_number = tbl_transaction.employee_number
GROUP BY
    tbl_transaction.amount_number 
    ,tbl_employee.employee_first_name
    ,tbl_employee.employee_last_name    
HAVING 
    AMOUNT_NUMBER >= 0;
 
--------------------------------------------------------------------------------
    
-- RIGHT (INNER/OUTER) JOIN
SELECT 
    tbl_transaction.amount_number 
    ,tbl_employee.employee_first_name
    ,tbl_employee.employee_last_name
    ,SUM(AMOUNT_NUMBER) AS "SUM OF NUMBER"
FROM 
    TBL_EMPLOYEE RIGHT JOIN TBL_TRANSACTION
    ON tbl_employee.employee_number = tbl_transaction.employee_number
GROUP BY
    tbl_transaction.amount_number 
    ,tbl_employee.employee_first_name
    ,tbl_employee.employee_last_name    
HAVING 
    AMOUNT_NUMBER >= 0;
 
--------------------------------------------------------------------------------

-- FULL (INNER/OUTER) JOIN
SELECT 
    tbl_transaction.amount_number 
    ,tbl_employee.employee_first_name
    ,tbl_employee.employee_last_name
    ,SUM(AMOUNT_NUMBER) AS "SUM OF NUMBER"
FROM 
    TBL_EMPLOYEE FULL JOIN TBL_TRANSACTION
    ON tbl_employee.employee_number = tbl_transaction.employee_number
GROUP BY
    tbl_transaction.amount_number 
    ,tbl_employee.employee_first_name
    ,tbl_employee.employee_last_name    
HAVING 
    AMOUNT_NUMBER >= 0;
     
-------------------------------- NOT RECOMMENDED -------------------------------

-- CARTESIAN PODUCT JOIN
SELECT 
    tbl_transaction.amount_number 
    ,tbl_employee.employee_first_name
    ,tbl_employee.employee_last_name
--    ,SUM(AMOUNT_NUMBER) AS "SUM OF NUMBER"
FROM 
    TBL_EMPLOYEE CROSS JOIN TBL_TRANSACTION
--    ON tbl_employee.employee_number = tbl_transaction.employee_number
--GROUP BY
--    tbl_transaction.amount_number 
--    ,tbl_employee.employee_first_name
--    ,tbl_employee.employee_last_name    
--HAVING 
--    AMOUNT_NUMBER >= 0
;