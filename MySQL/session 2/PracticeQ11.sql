SELECT product_name
    ,SUM(actual_cost)
    ,SUM(quantity)
FROM ptbl_Transaction JOIN ptbl_Product 
    ON ptbl_transaction.product_id = ptbl_product.product_id
GROUP BY
    product_name
ORDER BY product_name;
    
SELECT
    Category_Name
    ,Subcategory_Name
FROM ptbl_Subcategory JOIN ptbl_Category
USING(PRODUCT_CATEGORY_ID);

SELECT Subcategory_Name, COUNT(PRODUCT_ID)
FROM ptbl_Product NATURAL LEFT JOIN ptbl_Subcategory
GROUP BY Subcategory_Name
ORDER BY Subcategory_Name;