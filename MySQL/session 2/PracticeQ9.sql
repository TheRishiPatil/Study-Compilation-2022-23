SELECT *
FROM ptbl_subcategory
WHERE UPPER(subcategory_name) LIKE '%BIKE%';

SELECT *
FROM ptbl_subcategory
WHERE product_category_id != 2;

SELECT *
FROM ptbl_subcategory
WHERE product_category_id <= 2;

SELECT *
FROM ptbl_subcategory
WHERE product_category_id BETWEEN 3 AND 5;