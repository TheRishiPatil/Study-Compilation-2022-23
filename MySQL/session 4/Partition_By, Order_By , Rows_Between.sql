-- ROWS:-
SELECT EMPLOYEE_NUMBER, NUMBER_ATTENDANCE
  , SUM(NUMBER_ATTENDANCE)OVER( PARTITION BY EMPLOYEE_NUMBER, EXTRACT(YEAR FROM ATTENDANCE_MONTH) 
                                ORDER BY ATTENDANCE_MONTH
                                ROWS BETWEEN 1 PRECEDING AND 1 FOLLOWING) AS TOTAL_ATTENDANCE
FROM TBL_ATTENDANCE
ORDER BY EMPLOYEE_NUMBER, ATTENDANCE_MONTH;

-- CURRENT ROW, UNBOUNDED:-
SELECT EMPLOYEE_NUMBER, NUMBER_ATTENDANCE
  , SUM(NUMBER_ATTENDANCE)OVER( PARTITION BY EMPLOYEE_NUMBER, EXTRACT(YEAR FROM ATTENDANCE_MONTH) 
                                ORDER BY ATTENDANCE_MONTH
                                ROWS BETWEEN UNBOUNDED PRECEDING AND CURRENT ROW) AS TOTAL_ROWS
FROM TBL_ATTENDANCE
ORDER BY EMPLOYEE_NUMBER, ATTENDANCE_MONTH;

-- RANGE:-
SELECT EMPLOYEE_NUMBER, NUMBER_ATTENDANCE
  , SUM(NUMBER_ATTENDANCE)OVER( PARTITION BY EMPLOYEE_NUMBER, EXTRACT(YEAR FROM ATTENDANCE_MONTH) 
                                ORDER BY ATTENDANCE_MONTH
                                RANGE UNBOUNDED PRECEDING) AS TOTAL_RANGE
FROM TBL_ATTENDANCE
ORDER BY EMPLOYEE_NUMBER, ATTENDANCE_MONTH;


