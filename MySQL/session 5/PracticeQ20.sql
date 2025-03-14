SELECT category_name, subcategory_name, SUM(actual_cost) AS total_actual_cost,
        CASE GROUPING_ID(category_name, subcategory_name)
        WHEN 0 THEN 'ORIGINAL DATA'
        WHEN 1 THEN 'SUB_TOTAL DATA'
        WHEN 3 THEN 'GRAND_TOTAL DATA' END AS NAME_GROUPING_ID
FROM ptbl_transaction
NATURAL LEFT JOIN ptbl_product
NATURAL LEFT JOIN ptbl_subcategory
NATURAL LEFT JOIN ptbl_category
GROUP BY ROLLUP(category_name, subcategory_name)
ORDER BY category_name, subcategory_name;