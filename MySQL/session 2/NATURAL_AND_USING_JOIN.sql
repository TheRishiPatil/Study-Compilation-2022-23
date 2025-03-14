---------------------------------- NATURAL JOIN --------------------------------
-- SAME LIKE JOIN = INEER, LEFT, RIGHT, FULL
SELECT
    employee_number
    ,employee_first_name
    ,employee_last_name
    ,amount_number
FROM tbl_employee NATURAL JOIN tbl_transaction

---------------------------------- USING JOIN ----------------------------------
-- SAME LIKE JOIN = INEER, LEFT, RIGHT, FULL
SELECT
    employee_number
    ,employee_first_name
    ,employee_last_name
    ,amount_number
FROM tbl_employee JOIN tbl_transaction
    USING(employee_number)