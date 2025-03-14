CREATE OR REPLACE VIEW pView_by_Category (category_name, subcategory_name
    , total_quantity
    , total_actual_cost INVISIBLE) AS
SELECT category_name, subcategory_name
    , SUM(quantity) AS total_quantity
    , SUM(actual_cost) AS total_actual_cost
FROM ptbl_category
NATURAL LEFT JOIN ptbl_subcategory
NATURAL LEFT JOIN ptbl_product
NATURAL LEFT JOIN ptbl_transaction
GROUP BY category_name, subcategory_name
ORDER BY category_name, subcategory_name;

SELECT * FROM pview_by_category;