CREATE TABLE ptbl_Prime_Numbers
(My_Values DECIMAL(2,0));

INSERT INTO ptbl_Prime_Numbers
VALUES (2);
INSERT INTO ptbl_Prime_Numbers
VALUES (3);
INSERT INTO ptbl_Prime_Numbers
VALUES (5);
INSERT INTO ptbl_Prime_Numbers
VALUES (7);
INSERT INTO ptbl_Prime_Numbers
VALUES (11);

SELECT my_values
FROM ptbl_prime_numbers;

DELETE FROM ptbl_Prime_Numbers
WHERE My_Values = 5;
DELETE FROM ptbl_Prime_Numbers
WHERE My_Values = 11;

TRUNCATE TABLE ptbl_Prime_Numbers;

DROP TABLE ptbl_Prime_Numbers;