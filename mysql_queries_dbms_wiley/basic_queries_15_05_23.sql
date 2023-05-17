show databases;
use wileyclassic;

SELECT
		contactLastname,
		contactFirstname
    FROM
		customers
    ORDER BY
		contactLastname DESC;

SELECT lastName
FROM employees;

SELECT 
    lastName, 
    firstName, 
    jobTitle
FROM
    employees;
    
    SELECT * 
FROM employees;
SELECT 1 + 1;
SELECT NOW();
SELECT CONCAT('Wiley',' ','Edge');
