SELECT transaction_id, quantity, actual_cost
FROM ptbl_transaction
WHERE MOD(quantity, 3) = 0
UNION ALL -- UNION / INTERSECT / MINUS(1-2) / MINUS(2-1)
SELECT transaction_id, quantity, actual_cost
FROM ptbl_transaction
WHERE quantity>=8; --> 382 / 313 / 69/ 112 / 132

ACCEPT Answer PROMPT 'What is the minimum quantity for Set 2?'
SELECT transaction_id, quantity, actual_cost
FROM ptbl_transaction
WHERE MOD(quantity, 3) = 0
MINUS
SELECT transaction_id, quantity, actual_cost
FROM ptbl_transaction
WHERE quantity>= &Answer; 

SELECT  count(Product_ID) as Number_Of_Records, NVL(subcategory_name, 'No subcategory')
FROM PTBL_PRODUCT
NATURAL LEFT JOIN PTBL_SUBCATEGORY
GROUP BY subcategory_name
ORDER BY subcategory_name;


SELECT NVL(subcategory_name, 'No subcategory'), CASE (count(Product_ID))
WHEN 1 THEN 'Only one'
ELSE 'More than one'
END AS Number_Of_Records
FROM PTBL_PRODUCT
NATURAL LEFT JOIN PTBL_SUBCATEGORY
GROUP BY subcategory_name
ORDER BY subcategory_name;