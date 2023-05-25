package com.wiley.jdbcapp1;

import java.io.*;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

import com.mysql.cj.jdbc.CallableStatement;
public class BatchProcessing {
	public static void getBlobData(int candidateId,String filename) throws FileNotFoundException,ClassNotFoundException{
		
		        String selectSQL = "SELECT resume FROM candidates WHERE id=?";
		        ResultSet rs = null;

		        try (Connection conn = DBConnection.createDBConnection();
		                PreparedStatement pstmt = conn.prepareStatement(selectSQL);) {
		            // set parameter;
		            pstmt.setInt(1, candidateId);
		            rs = pstmt.executeQuery();

		            // write binary stream into file
		            File file = new File(filename);
		            FileOutputStream output = new FileOutputStream(file);

		           
		            while (rs.next()) {
		                InputStream input = rs.getBinaryStream("resume");
		                byte[] buffer = new byte[1024];
		                while (input.read(buffer) > 0) {
		                    output.write(buffer);
		                }
		            }
		        } catch (SQLException | IOException e) {
		            System.out.println(e.getMessage());
		        } finally {
		            try {
		                if (rs != null) {
		                    rs.close();
		                }
		            } catch (SQLException e) {
		                System.out.println(e.getMessage());
		            }
		        }

		    }

	
	public static void writeBlob(int candidateId,String filename)throws FileNotFoundException,ClassNotFoundException{
		
		String updateSQL="UPDATE candidates SET resume = ? WHERE id=?";
		
		try (
			Connection conn =DBConnection.createDBConnection();
			PreparedStatement ps =conn.prepareStatement(updateSQL)){
				File file=new File(filename);
				FileInputStream input = new FileInputStream(file);
				
				ps.setBinaryStream(1,input);
				ps.setInt(2,candidateId);
				
				System.out.println("Added file in the datbase");
				ps.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
	

	public static void main(String[] args) throws SQLException, FileNotFoundException, ClassNotFoundException {
		
		//writeBlob(133,"C:\\Users\\hp\\Documents\\AASTHA_WILEY_EDGE\\Wiley Edge-Job Role Details-Engg-SW.pdf");
		
		 getBlobData(122, "Wiley Edge-Job Role Details-Engg-SW");
		//String query="delete from employee where id=1";
		//Connection conn=null;
		
	
		//DBConnection dbcon=new DBConnection();
		//conn= dbcon.createDBConnection();
		//conn.setAutoCommit(false);
		//Statement st=conn.createStatement();
		
		//st.addBatch(query);
		
		//st.executeBatch();
		//conn.commit();
	//	
	
				 

}
}
