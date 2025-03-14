SELECT Transaction_Date, SUM(Actual_Cost) AS Total_Actual_Cost
, SUM(Actual_Cost) OVER(ORDER BY Transaction_Date ROWS BETWEEN UNBOUNDED PRECEDING AND CURRENT ROW) AS Total_Actual_Cost_To_Date
FROM PTBL_TRANSACTION
GROUP BY Transaction_Date, SUM(Actual_Cost) OVER(ORDER BY Transaction_Date ROWS BETWEEN UNBOUNDED PRECEDING AND CURRENT ROW)
ORDER BY Transaction_Date; --> PROBLEM WE CAN'T USE GROUP BY AND OVER() TOGETHER


WITH myTable AS
(SELECT Transaction_Date, SUM(Actual_Cost) AS Total_Actual_Cost
FROM PTBL_TRANSACTION
GROUP BY Transaction_Date
ORDER BY Transaction_Date)
 
SELECT Transaction_Date, Total_Actual_Cost, 
SUM(Total_Actual_Cost) OVER(ORDER BY Transaction_Date ROWS BETWEEN UNBOUNDED PRECEDING AND CURRENT ROW) AS Total_Actual_Cost_To_Date,
SUM(Total_Actual_Cost) OVER(ORDER BY Transaction_Date ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) AS Total_Actual_Cost_WEEKLY_Date,
SUM(Total_Actual_Cost) OVER(PARTITION BY TO_CHAR(Transaction_Date, 'YYMM') ORDER BY Transaction_Date ROWS BETWEEN UNBOUNDED PRECEDING AND UNBOUNDED FOLLOWING) AS Total_Actual_Cost_MONTHLY_Date
FROM myTable;