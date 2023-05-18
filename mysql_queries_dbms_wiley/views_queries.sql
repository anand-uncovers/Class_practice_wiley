#views_queries
#customers,payments
#query and return data from both the table using inner join
#store a query in to a file 
#name your query Query
#view
CREATE VIEW customerPayments AS 
SELECT customerName,checkNumber,paymentDate,amount
FROM customers
    INNER JOIN payments USING(customerNumber);
    SELECT * FROM customerPayments;
