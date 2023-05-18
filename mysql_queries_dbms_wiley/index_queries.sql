#index_queries 18_05_23_2nd_half
#By default MySQL creates the B-Tree index if we don't specify the index type
#storage engine     allowed index types
#InnoDB               BTREE
#MyISAM               BTREE
#MEMORY/HEAP          Hash/BTREE






SELECT employeeNumber,lastName,firstName FROM
employees WHERE jobTitle='Sales Rep';
EXPLAIN SELECT employeeNumber,lastName,firstName FROM
employees WHERE jobTitle='Sales Rep';

EXPLAIN FORMAT=JSON SELECT employeeNumber,lastName,firstName FROM employees WHERE
jobTitle='Sales Rep';

#using indexes and creating indexes
CREATE INDEX idx_jobTitle ON employees(jobTitle);
SHOW INDEXES FROM employees;
SELECT COUNT(*) FROM employees;
#drop index
DROP INDEX index_name ON table_name
[algorithm_option | lock_option]

Algorithm_option:
COPY     : The table is copies to the new table row by row, the DROP IND
INPLACE : The table is rebuilt in place instead of copied 

Lock_options: (DEFAULT | NONE | SHARED | EXCLUSIVE)

DROP INDEX 'PRIMARY' ON table_name;

DROP INDEX idx_email  ON leads ALGORITHM = INPLACE LOCK = DEFAULT;
#LIST INDEXED
SHOW INDEXES FROM employees;

#When we don't connect to any database
SHOW INDEXES FROM employees IN database_name;
SHOW INDEXES FROM database_name.table_name;

SHOW INDEXES IN employees FROM database_name;
OR
SHOW KEYS FROM table_name IN database_name;
#KEYS synonym for INDEX

#Filter INDEX INFORMATION
SHOW INDEXES FROM table_name WHERE condition;

SHOW INDEXES FROM table_name WHERE visible = 'NO';
#created indexes but mysql can't see it

CREATE TABLE contacts(
    contact_id INT AUTO_INCREMENT,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    phone VARCHAR(20),
    PRIMARY KEY(contact_id),
    UNIQUE(email),
    INDEX phone(phone) INVISIBLE,
    INDEX name(first_name, last_name) comment 'By first name and/or last name'
);

SET @explain_format='TREE';
SHOW INDEXES FROM contacts WHERE visible ='NO';

#PREFIX INDEXES
column_name(length);

CREATE TABLE table_name(
column_list,INDEX(column_name(length));
OR
CREATE INDEX index_name ON table_name(column_name(length));


#using products table
#find the products whose names starts with string
EXPLAIN FORMAT =JSON SELECT productName,buyPrice,msrp FROM products WHERE productName
 LIKE '1970%';

SELECT COUNT(*) FROM products;

#20rows with 20 prefix length we can get actual data scanned
SELECT COUNT(DISTINCT LEFT(productName,20))unique_rows FROM products;

CREATE INDEX idx_productName ON products(productName(20));

EXPLAIN SELECT employeeNumber,lastName,firstName FROM
employees WHERE jobTitle='Sales Rep' \G;


# Unique Index
CREATE TABLE contacts(UNIQUE KEY unique_email(email));
CREATE UNIQUE INDEX index_name ON table_name(col1,col2,..);

#ADD UNIQUE CONSTRAINT ON EXISTING TABLE
ALTER TABLE table_name ADD CONSTRAINT constraint_name UNIQUE KEY(col1,col2,..);

#COMPOSITE INDEX
EXPLAIN FORMAT =JSON SELECT firstName,lastName and email from employees WHERE lastName ="Patterson";
CREATE INDEX name ON employees(lastName,firstName);

#INVISIBLE
CREATE INDEX index_name ON table_name(col1,cl2)[INVISIBLE|VISIBLE];
ALTER TABLE table_name ALTER INDEX index_name[INVISIBLE|VISIBLE];

CREATE INDEX extension ON employees(extension)VISIBLE;
ALTER TABLE employees ALTER INDEX extension VISIBLE;

SELECT firstName from employees use INDEX (extension) WHERE;

SELECT firstName from employees FORCE INDEX (extension) WHERE;
#Descendin Index
CREATE TABLE t(a INT NOT NULL,b INT NOT NULL,INDEX a_asc_b_DESC(a,b DESC))ENGINE=InnoDB;


#clustered index
#force index
EXPLAIN FORMAT =JSON SELECT productName,buyPrice 
FROM products where buyPrice BETWEEN 10 AND 80 ORDER BY buyPrice;
CREATE INDEX idx_buyprice ON products(buyPrice);
 EXPLAIN FORMAT = JSON  SELECT productName,buyPrice FROM products 
 FORCE INDEX(buyPrice) where buyPrice BETWEEN 10 AND 80 ORDER BY buyPrice;


















