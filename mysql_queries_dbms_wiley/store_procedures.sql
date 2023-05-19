#store_procedures.sql
#19_05_23
#Return all rows in the table
SELECT city,state,postalCode,customerName,country 
FROM customers ORDER BY customerName;

#Create a Stored Procedure for the above query

use wileyclassic;
DELIMITER $$
CREATE PROCEDURE GetCustomers()
BEGIN 
     SELECT
          city,state,postalCode,customerName,country 
          FROM customers ORDER BY customerName;
          END $$ DELIMITER;
          
          #Change delimiter
        #  DELIMITER  delimeter_caracter
         # DELIMITER//
         # ex:-SELECT * FROM customers//
          RESET DELIMETER 
          DELIMITER;
          
          CALL GetCustomers();
          
          
         # CREATE PROCEDURE  TO GET ALL PRODUCTS
          CREATE  Procedure getAllProduct()
          BEGIN SELECT * FROM products;
          END $$
          DELIMETER;
          CALL getAllProduct() ;
          
       #   CREATE PROCEDURE procedure_name(parameters_list)
        #  BEGIN
         # statements;
          #END//
          #CALL stored_procedure_name(arguments_list)
          DELIMITER $$
          USE 'wileyClassic'
          CREATE PROCEDURE 'GetAllCustomers'()
          BEGIN
                SELECT * FROM customers;
          END $$
          
          #Drop procedure
          DROP procedure if EXISTS 'getAllProduct';
          show procedure status;
          
          DELIMITER $$
          CREATE PROCEDURE GEtOfficesByCountry(
          IN customerName VARCHAR(255)
          )
          BEGIN 
               SELECT * FROM offices WHERE country=customerName;
               END $$
               DELIMITER ;
               
                CALL GEtOfficesByCountry();
               
            #CReate a procedure to return number of orders by order status
            #input orderstatus VARCHAR
            #out total  INT
            
            
            DELIMITER $$
          CREATE PROCEDURE GEtOrderByStatus(
          IN orderStatus VARCHAR(25),
          OUT total INT
          )
          BEGIN 
               SELECT COUNT(orderNumber)
               INTO total
               FROM orders
               WHERE status =orderStatus;
               END $$
               DELIMITER ;
               
               CALL GEtOrderByStatus('Shipped',@total);
                SELECT @total;
                SELECT @total AS total_in_process;
                
                CALL GEtOrderByStatus('In Process',@total);
                SELECT @total AS total_in_process;
                
                
                #INOUT counter variable
                  DELIMITER $$
          CREATE PROCEDURE SetCounter(
          INOUT counter INT,
          IN inc INT
          )
          BEGIN 
               SET counter=counter+inc;
               END $$
               DELIMITER ;
               
               SET @counter=1;
               CALL SetCounter(@counter,1);#2
               CALL SetCounter(@counter,1);#3
               CALL SetCounter(@counter,7);#10
               SELECT @counter;
               
               
               #Using variales
               DECLARE variable_name data_type
               
               #Assign values to the variables
               SET variable_name = values;
               
               DELIMITER $$
               CREATE PROCEDURE GetTotalOrder()
               BEGIN 
                   DECLARE totalOrder INT DEFAULT 0;
                   
                   SELECT COUNT(*)
                   INTO totalOrder
                   FROM orders;
                   SELECT totalOrder;
                   END $$
                   DELIMITER ;
                   
                   CALL GetTotalOrder();
                   
                   #list procedure
                   SHOW procedure status WHERE db='wileyclassic';
                   SHOW PROCEDURE STATUS LIKE '%order%';
                   
                   #list the procedures using data dictionary
                   SELECT routine_name FROM information_schema.routines
                   WHERE routine_typpe = 'PROCEDURE'
                   AND
                   routine_schema='wileyclassic';
                   
                   #stored procedures with error  handeling
                  # DECLARE action HANDLER FOR condition_value statement;
                  # CONTINUE OR EXIT?
                  
                 # DECLARE action HANDLER FOR condition_value statement;
                 # CONTINUE OR EXIT?
                  
                   CREATE TABLE SupplierProducts(supplierId INT,productId INT,PRIMARY KEY(supplierId,productId));
                  #create a procedure 
                  
                  DROP procedure if EXISTS 'InsertSupplierProduct';
     DELIMITER $$
      CREATE PROCEDURE InsertSupplierProduct(
   IN inSupplierId  INT,
    IN inProductID INT
     )
   BEGIN
      #exitif the duplicate key occures
          DECLARE EXIT HANDLER FOR 1062
         BEGIN
           SELECT CONCAT('Duplicate key(',inSupplierId ,',',inProductId,')Occured')
          AS message;
						
          END;
  #insert new row into the supplierProducts
			INSERT INTO SupplierProducts(supplierId,productId) VALUES(inSupplier,inProductId);
             SELECT * FROM SupplierProducts;
#return the product supplied by the supplier id
           SELECT COUNT(*)
         FROM SupplierProducts
          WHERE supplierId = inSupplierId;
      END $$
       DELIMITER ;
       
#working with function
#CREATE a FUNCTION that returns the CUSTomer level based on credit
  DELIMITER $$
  CREATE FUNCTION customerLevel(
  credit DECIMAL(10,2)
  )
  RETURNS VARCHAR(20)
  DETERMINISTIC
  BEGIN
        DECLARE customerLevel VARCHAR(20);
        
        IF credit > 50000 THEN
                SET customerLevel = 'PLATINUM';
	     ELSEIF (credit <=50000 AND credit>10000) THEN
                SET customerLevel='Gold';
         ELSEIF credit<10000 THEN
                 SET customerLevel ='SILVER';
		END IF;
		RETURN(customerLevel);
                 
                 END $$
                 DELIMITER ;
                 #list functions
 SHOW FUNCTION  STATUS WHERE db='wileyclassic';
                 #using functions
  SELECT
  customerName,CustomerLevel(creditLimit) FROM
 customers ORDER BY customerName;
 #
               
               
               
               
          
          