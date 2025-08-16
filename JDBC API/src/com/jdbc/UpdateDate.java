package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class UpdateDate
{
	
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("Todays Date is :"+d);
		
		System.out.println(d.getTime());
		
		Connection con = Connectivity.conn();
		
		try {
			PreparedStatement st =con.prepareStatement("update student set dob=? where id=? ");
			
			st.setDate(1, new java.sql.Date(d.getTime()));
			
			st.setInt(2, 3);
			
			st.executeUpdate();
			System.out.println("Updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
