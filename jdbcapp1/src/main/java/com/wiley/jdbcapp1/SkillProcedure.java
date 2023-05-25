package com.wiley.jdbcapp1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import com.mysql.cj.jdbc.CallableStatement;

public class SkillProcedure {

	public static void getCandidateSkills(int candidateId) {
		String query="{call get_candidate_skill(?)}";
		Connection conn=null;
		ResultSet rs=null;
		
		try {
			DBConnection dbcon=new DBConnection();
			conn=dbcon.createDBConnection();
			
			java.sql.CallableStatement cstmt = conn.prepareCall(query);
		cstmt.setInt(1,candidateId);
		
		rs=cstmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(
					String.format("%s - %s",
					rs.getString("first_name")+" "
					+rs.getString("last_name"),rs.getString("skill")
				
							)
					);
		}
		
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	//method for file write in main 
	//writeBlob(candidateid,filename) update query SET resume= ?
	//dobcon
	//prepared stmt
	//fileinput
	//get file  then create in file input straem()
	
	file new File(filename)
	fileinputstream(file)
	public static void main(String[] args) {
		getCandidateSkills(133);

	}

}
