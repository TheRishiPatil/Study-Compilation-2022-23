SELECT * FROM TBL_EMPLOYEE WHERE EMPLOYEE_MIDDLE_NAME IS NULL;

DEFINE MyOption = 'Option B';
UNDEFINE MyOption;

SELECT CASE 
    WHEN '&MyOption' IS NULL THEN 'IS NULL'
    ELSE 'IS NOT NULL' 
    END AS HEHEHE
FROM DUAL; 

SELECT NVL('&MyOption', 'No Option') AS MyAnswer
FROM DUAL;

SELECT NVL2('&MyOption', 'Is Not Null', 'Is Null') AS MyAnswer
FROM DUAL;

SELECT COALESCE('&MyFirstOption', '&MySecondOption', 'Is Null') AS MyAnswer
FROM DUAL;