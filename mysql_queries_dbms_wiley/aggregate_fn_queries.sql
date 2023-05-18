#queries on 18_05_23
#aggregate_fn_queries

# calculate the average buy price of all products in the products
 SELECT AVG(buyPrice) FROM products;
 
 
 # calculate the average buy price using where clause of all products in the products
 SELECT AVG(buyPrice)'Average price of classic cars' FROM products WHERE
 productLine='Classic cars';
 
 #calculate if thhere are any products which have same prices
 SELECT COUNT(buyPrice)-COUNT(DISTINCT buyPrice) FROM products;

 #format
 SELECT FORMAT(AVG(buyPrice),2) FROM products;
 
 #using Having clause
 SELECT productLine,AVG(buyPrice) 'Average price' FROM products GROUP BY productLine HAVING AVG(buyPrice)>50;

 #Calculate the average buy price of the average buy price of product lines
 SELECT AVG(pl_avg)'Average Product' FROM(
   SELECT AVG(buyPrice) pl_avg FROM products GROUP BY productLine)avgs;
   
   #pl_avg:-45,67,58,NULL,45,89--as avg fn ignores NULL so no error
   
   # --CASE
  # CASE value
   #         WHEN values THEN result1
    #       WHEN values2 THEN result2
	#		---- 
     #          [ELSE else_result]
   #END
   
   
   #return the customers and their orders(order count)
   WITH cte AS( SELECT c.customerName,COUNT(o.customerNumber) AS order_count FROM 
    customers c LEFT JOIN orders o ON c.customerNumber=o.customerNumber
    GROUP BY c.customerNumber,c.customerName)
    SELECT
    customerName,order_count,CASE order_count 
                                WHEN 1 THEN 'One-time Customer'
                                WHEN 2 THEN 'Repeated Customer'
                                WHEN 3 THEN 'Frequent Customer'
                                ELSE 'Loyal Customer'
                                END customerType
          FROM cte
          ORDER BY customerName;
    
 #Sort the customer by states if the state is not null 
 #or sort the country in case the state is null
 SELECT customerName,state,country FROM customers ORDER BY (
 CASE WHEN stae IS  NULL THEN country ELSE state END)LIMIT 5;
 
 
 #SUM to calculate total sales orders by order status
 SELECT 
 SUM(
     CASE
     WHEN status ='Shipped'THEN 1
 ELSE 0
 END
 ) AS 'Shipped',
 SUM(
       CASE 
              WHEN status= 'On Hold' Then 1
               ELSE 0
	    END
  )AS 'On Hold', COUNT(*) AS Total FROM orders;
  #using if condn 
  SELECT IF(1=2,'TRUE','FALSE');
  SELECT IF(1=1,'TRUE','FALSE');
  
  #IF condn
  SELECT customerName,customerNumber,IF(state IS NULL, 'N/A',state
  )state,country FROM customers;
  
  #Ifnull 
  #IFNULL(expr1,expr2)
  #IFNULL(null,'If null function');
  #employee info
  #mobile,home phone
  SELECT contactName,IFNULL(mobile,home_phone)phone FROM emp_contact_info;
 #NULLIF
 #NULLIF(exp1,exp2);
 
 #CASE WHEN  exp1=exp2
 #THEN NULL
 #ELSE exp1
 #END;
 
 SELECT 1/0;
 SELECT 1/NULLIF(0,0);
 #get all orders created in June 2003
 SELECT orderNumber,orderDate,requireddate shippedDate,status
 FROM orders WHERE orderDate BETWEEN'2003-06-01'AND'2003-06-30';
 
 #
 SELECT SUM(IF(status='Shipped',1,0))/SUM(IF(status='Cancelled',1,0))
 FROM orders WHERE orderDate BETWEEN'2003-06-01'AND'2003-06-30';
 
 
 
 #-- calculate the average buy price for each product line:
 SELECT productLine,AVG(buyPrice) FROM products GROUP BY productLine;
 
 #Get the number of products in the products table as total
 SELECT COUNT(*) AS "Number of products" FROM products;
 
 # Use the COUNT() function with the GROUP BY clause to get the number of products for each product line order by product line
 SELECT productLine, COUNT(*) AS "Number of products"  FROM products GROUP BY productLine;
 
 # Get the total order value of each product, you can use the SUM() function in conjunction with the GROUP BY clause
 SELECT productCode,SUM(priceEach*quantityOrdered) AS total FROM orderdetails GROUP BY productCode ORDER BY total DESC;
 #-- Get more detail using join the orderdetails table to the products
  SELECT products.productCode,products.productName ,SUM(orderdetails.priceEach*orderdetails.quantityOrdered) AS total FROM orderdetails INNER JOIN 
  products WHERE products.productCode =orderdetails.productCode  GROUP BY products.productCode ORDER BY total;
  
  
  #Use the MAX() function to get the highest buy price from the p
  SELECT  MAX(buyPrice) FROM products;
  #Use the MAX() function with the GROUP BY clause to get the highest price per product line
   SELECT productLine,MAX(buyPrice) FROM products GROUP BY productLine;
   #Use the MIN() function to find the lowest price from the products table
   SELECT  MIN(buyPrice) FROM products;
   #Use the MIN() function with the GROUP BY clause to get the lowest price per product line
   SELECT productLine,MIN(buyPrice) FROM products GROUP BY productLine;
  
  
  #Group Concat
  SELECT firstName,lastName,GROUP_CONCAT(DISTINCT customerName ORDER BY customerName)customers
  FROM employees INNER JOIN customers ON customers.salesRepEmployeeNumber =employeeNumber
  GROUP BY employeeNumber ORDER BY firstName,lastName;
 
 
 