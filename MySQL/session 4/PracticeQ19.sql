SELECT TO_CHAR(Transaction_Date, 'YYYY-MM') AS THE_DATE, SUM(Actual_Cost) AS Total_Actual_Cost,
 SUM(Actual_Cost) - LAG(SUM(Actual_Cost), 1) OVER(ORDER BY TO_CHAR(Transaction_Date, 'YYYY-MM')) AS PREVIOUS_MONTH,
 SUM(Actual_Cost) - LEAD(SUM(Actual_Cost), 1) OVER(ORDER BY TO_CHAR(Transaction_Date, 'YYYY-MM')) AS PREVIOUS_MONTH
FROM PTBL_TRANSACTION
GROUP BY TO_CHAR(Transaction_Date, 'YYYY-MM')
ORDER BY TO_CHAR(Transaction_Date, 'YYYY-MM');

SELECT Transaction_Date, Actual_Cost,
NTILE(10) OVER(ORDER BY Transaction_Date) AS BUCKET,
ROW_NUMBER() OVER (ORDER BY Transaction_Date) AS THE_ROW,
rank() OVER (ORDER BY Transaction_Date) AS THE_RANK
FROM PTBL_TRANSACTION;