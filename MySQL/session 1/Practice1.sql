SELECT obj#, col#, col# / obj# AS calculation
FROM col$;

SELECT obj#, col#, FLOOR(col# / obj#) AS calculation
FROM col$;

SELECT obj#, col#, CEIL(col# / obj#) AS calculation
FROM col$;

SELECT obj#, col#, ROUND(col# / obj#, 1) AS calculation
FROM col$;