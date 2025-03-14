SELECT 
    Transaction_Date
    , Subcategory_Name
    , SUM(Actual_Cost) AS "TOTAL ACTUAL COST"
    , SUM(Quantity) AS "TOTAL QUANTITY"
FROM 
    ptbl_Transaction NATURAL FULL OUTER JOIN ptbl_Product 
    NATURAL FULL OUTER JOIN ptbl_Subcategory
GROUP BY
    Transaction_Date, Subcategory_Name
ORDER BY 
    Transaction_Date, Subcategory_Name;

--------------------------------------------------------------------------------
      
SELECT 
    COUNT(PRODUCT_ID)
    , Subcategory_Name
    , Category_Name 
FROM 
    ptbl_Subcategory NATURAL FULL JOIN 
    ptbl_Category NATURAL FULL JOIN ptbl_Product 
GROUP BY 
    Subcategory_Name, Category_Name 
ORDER BY 
    Subcategory_Name, Category_Name ;