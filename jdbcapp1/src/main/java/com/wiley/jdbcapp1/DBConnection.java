package com.wiley.jdbcapp1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
   static Connection conn;
   public static  Connection createDBConnection() {
	   try {
		   
		 String driver ="com.mysql.cj.jdbc.Driver";
       	
	      // connection string
	        	String url="jdbc:mysql://localhost:3306/wileyjdbc";
	        	String username="root";
	        String password="Aas@mysql13";
	        	
	       	Class.forName(driver);
	        	
	        conn=DriverManager.getConnection(url,username,password);
	       System.out.println("Connection success");
	       }catch(Exception e) {
	       	e.printStackTrace();
	       }
	return conn;
   }
}
