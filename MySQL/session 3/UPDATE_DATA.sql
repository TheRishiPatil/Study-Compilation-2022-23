SELECT * FROM tbl_transaction WHERE employee_number = 194;
SELECT * FROM tbl_transaction WHERE employee_number = 3;

UPDATE tbl_transaction
SET employee_number = 194
WHERE employee_number IN (3, 5, 7, 9) AND date_of_transaction > TO_DATE('1996-01-01', 'YYYY-MM-DD');

ROLLBACK;