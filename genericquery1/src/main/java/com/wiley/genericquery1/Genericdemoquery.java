package com.wiley.genericquery1;

import java.sql.*;

public class Genericdemoquery {
static final String url_dbms="jdbc:mysql://localhost:3306/";
static final String user ="root";
static final String paswrd="Aas@mysql13";

public static void main(String [] args) {
	Connection conn;
	Statement stmt;
	
	  try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          System.out.println("Connecting to database...");
          conn = DriverManager.getConnection(url_dbms,user, paswrd);
          // Execute create database query
          System.out.println("Creating database...");
          stmt = conn.createStatement();
          String sql = "CREATE DATABASE test_db1";
          stmt.executeUpdate(sql);
          System.out.println("Database created successfully...");

          // Execute use database query
          sql = "USE test_db1";
          stmt.executeUpdate(sql);
          System.out.println("Using database test_db...");

          // Execute create table query
          System.out.println("Creating table...");
          sql = "CREATE TABLE users (id INT, name VARCHAR(50), age INT, PRIMARY KEY (id))";
          stmt.executeUpdate(sql);
          System.out.println("Table created successfully...");

          // Execute drop table query
          System.out.println("Dropping table...");
          sql = "DROP TABLE users";
          stmt.executeUpdate(sql);
          System.out.println("Table dropped successfully...");

          // Execute drop database query
          System.out.println("Dropping database...");
          sql = "DROP DATABASE test_db1";
          stmt.executeUpdate(sql);
          System.out.println("Database dropped successfully...");

          stmt.close();
          conn.close();
      } catch(SQLException se){
          se.printStackTrace();
      } catch(Exception e){
          e.printStackTrace();
      }
  }
}
