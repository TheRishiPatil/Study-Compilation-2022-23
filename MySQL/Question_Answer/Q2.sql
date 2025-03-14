Create table Customers (id int, name varchar(255), CONSTRAINT Customers_Id PRIMARY KEY(id));

Create table Orders (id int, customerId int, CONSTRAINT Orders_Id PRIMARY KEY(id));

ALTER TABLE Orders
ADD CONSTRAINT customer_Order_Id FOREIGN KEY(customerId)
REFERENCES Customers(id)
ENABLE NOVALIDATE;

ALTER TABLE Orders
DROP CONSTRAINT customer_Order_Id;

SELECT NAME AS Customers  FROM Customers C
LEFT JOIN Orders O
ON C.ID = O.CUSTOMERID
WHERE O.CUSTOMERID IS NULL;

Truncate table Customers;
insert into Customers (id, name) values ('1', 'Joe');
insert into Customers (id, name) values ('2', 'Henry');
insert into Customers (id, name) values ('3', 'Sam');
insert into Customers (id, name) values ('4', 'Max');

Truncate table Orders;
insert into Orders (id, customerId) values ('1', '3');
insert into Orders (id, customerId) values ('2', '1');