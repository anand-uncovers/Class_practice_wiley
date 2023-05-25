package com.wiley.jdbcapp1;
import java.sql.Connection;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
	public static void addCandidate(
			String firstName,
			String lastName,
			Date dob,
			String email,
			String phone,
			int []skills)throws SQLException{
		
		Connection conn=null;
		
		PreparedStatement ps = null;
		PreparedStatement psSkills = null;
		ResultSet rs=null;
		
		try {
			DBConnection dbcon = new DBConnection();
			conn=dbcon.createDBConnection();
			
			
			/*JDBC Transactions */
			//Disable the autocommit
			conn.setAutoCommit(false);
			
			
			//Here is your transaction
			//insert the candidate
			String sqlInsert ="INSERT INTO Candidates(first_name,last_name,dob,phone,email)VALUES(?,?,?,?,?)";
			
			
			ps=conn.prepareStatement(sqlInsert,Statemenr.RETURN_GENERATED_KEYS);
			
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setDate(3, dob);
			ps.setString(4, phone);
			ps.setString(5, email);
			
			int rowAffected =ps.executeUpdate();
			
			rs = ps.getGeneratedKeys();
			System.out.println("Generated keys"+rs);
			
			int candidateId=0;
			if(rs.next())
				candidateId=rs.getInt(1);
			System.out.println("Candidate id: "+candidateId);
			
			if(rowAffected ==1) {
				String sqlSkillInsert="INSERT INTO candidate_skills(candidate_id,skill_id)VALUES(?,?)";
				
				psSkills = conn.prepareStatement(sqlSkillInsert);
				
				for(int skillId:skills) {
					psSkills.setInt(1,candidateId);
					psSkills.setInt(2,skillId);
					
					psSkills.executeUpdate();
				}
				conn.commit();
			}else {
				System.out.println("roll back donr");
				conn.rollback();
			}
			//If everything is ok,commit the transaction
			//conn.commit();
		}catch(SQLException e) {
			try {
				if(conn!=null)
					conn.rollback();
			}catch(SQLException e2) {
				System.out.println(e2.getMessage());
			}
		}finally {
			try {
				if(rs!=null)rs.close();
				if(ps!=null)ps.close();
				if(psSkills!=null)psSkills.close();
				if(conn!=null)conn.close();
			}catch(SQLException e2) {
				System.out.println(e2.getMessage());
			}
		}
	}
	

    public static void main( String[] args )
    {
    	int[]skills= {1,2,3};
    	addCandidate("Venkat","B",Date.valueOf("1990-02-04"),"bvsrao91@gmail.com","9000003434",skills);;
    	
    }
}
   // }
    	//
    	//EmployeeDaoImpl e = new EmployeeDaoImpl();
    	
    	//Scanner sc = new Scanner(System.in);
    	
    	//while(true)
    	//{
    		
    		
    	//	System.out.println("1 : Add Employee");
        //	System.out.println("2 : Show all employees");
        //	System.out.println("3 : Show employee based on id");
        //	System.out.println("4 : Update employee");
        //	System.out.println("5 : delete employee");
        //	System.out.println("6 : search employee");
        //	System.out.println("7 : sort employee");
        //	System.out.println("6 : Exit");
        	
        //	int n = sc.nextInt();
    		
    	//	if(n==1)
    	//	{
    		//	System.out.println("Enter employee id");
    			
           //     int id = sc.nextInt();
                
           //     System.out.println("Enter employee name");
                
                
            //    String name = sc.next();
                
               // System.out.println("Enter employee salary");
              //  int salary = sc.nextInt();
              //  System.out.println("Enter employee age");
               // int age = sc.nextInt();
                
              //  Employee emp = new Employee(id,name,salary,age);
                
              //  e.createEmployee(emp);
                
                
                
    	//	}
    	//	else if(n==2)
    	//	{
    			
    		//	
    		//	e.getAllEmployees();
    		//}
    		//else if(n==3)
    		//{
    		//	System.out.println("Enter Employee Id");
    			
    		//	int id = sc.nextInt();
    			
    		//	e.getEmpById(id);
    			
    		//}
    		//else if(n==4)
    		//{
//System.out.println("Enter Employee Id");
    			
    		//	int id = sc.nextInt();
    			
    			//System.out.println("Enter Employee name");
    			
    			//String name = sc.next();
    			
    			//e.updateEmpNameById(id, name);
    		//}
    		//else if(n==5)
    		//{
    			//System.out.println("Enter Id");
    	//		 int id = sc.nextInt();
    			 
    	//		 e.deleteEmpById(id);
   // 		}
    	//	else if(n==6) {
    	//		System.out.println("Enter the id of the employee to be searched:- ");
    	//		int id=sc.nextInt();
    	//		e.getEmpById(id);
       	//	}
          // else if(n==7) {
   		//	e.getAllEmployees();
    	//	}
    	//	else if(n==8)
    	//	{
    		//	System.out.println("Exit");
    		//	System.exit(0);
    	//	}
    	//	else
    	//	{
    		//	System.out.println("Invalid Choice");
    	//	}
    //	}
    
        
//        String query = "select * from student";
//        
//        try
//        {
//        	Class.forName("com.mysql.cj.jdbc.Driver");
//        	connection = DriverManager.getConnection(
//        			  "jdbc:mysql://localhost:3306/temp",
//        			  "root", "imsachin@161");		
//        	
//        	Statement statement = connection.createStatement();
//        	
//        	ResultSet result = statement.executeQuery(query);
//        	
//        	while(result.next())
//        	{  
//        		String data = "";
//        		for(int i=1;i<=5;i++)
//        		{
//        			data += result.getString(i)+" | ";
//        		}
//        		System.out.println(data);
//        	}
//
//        }
//        catch(Exception e)
//        {
//        	e.printStackTrace();
//        }
    }
}
//import com.wiley.jdbcapp1.EmployeeDaoImpl;
//import java.util.Scanner;

/**
 * Hello world!
 *
 */
//public class App 
//{
	
   /// public static void main( String[] args )throws SQLException{
    	
    //	EmployeeDaoImpl empdle= new EmployeeDaoImpl();
    //	System.out.println("-------------------Wiley employee management---------------------");
    //	Scanner sc = new Scanner(System.in);
    //	System.out.println()
    	
    	
    	
    //---------------------------------------------------------
        //try {
        	//String driver ="com.mysql.cj.jdbc.Driver";
        	
        //	//connection string
        	//String url="jdbc:mysql://localhost:3306/wileyclassic";
        	//String username="root";
        	//String password="Aas@mysql13";
        	
        //	Class.forName(driver);
        	
        //	Connection come=DriverManager.getConnection(url,username,password);
        //	System.out.println("Connection success");
       // }catch(Exception e) {
        //	e.printStackTrace();
        //}
    	
    	//---------------------------------------------------------------
    	
    	 // try(Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyclassic?user=root&password=Aas@mysql13")){
           //   PreparedStatement statement = con.prepareStatement("select * from customers");
           //   ResultSet rs =statement.executeQuery();
           //   while ((rs.next())){
           //       System.out.println(rs.getString(1)+" "+rs.getString(2));
          //    }
          //} catch (SQLException e) {

          //}
    	//-----------------------------------------------------------
    	//DBConnection dbcon = new DBConnection();
    	//Connection conn =dbcon.createDBConnection();
    	
    	//create statement object
    	//Statement stmt = conn.createStatement();
    	
    	//MySQL query
    	//String sql ="SELECT first_name,last_name,email FROM candidates";
    	
    	//ResultSet rs =stmt.executeQuery(sql);
    	
    	//while(rs.next()) {
    		//System.out.println(
    		//		rs.getString("first_name")+"\t"+
    		//rs.getString("last_name")+"\t"+
    		//rs.getString("email"));
    	//}
    	//try {
    		//rs.close();
    		//stmt.close();
    	//}catch(SQLException e) {
    	//	System.out.println(e.getMessage());
    	//}
    	//---------------------------------------------------------------------------
    	
   // }
//}

