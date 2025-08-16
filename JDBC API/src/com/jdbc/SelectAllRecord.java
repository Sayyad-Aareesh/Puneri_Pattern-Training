package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectAllRecord {

		public static void main(String[] args)
		{
			
			Connection con = Connectivity.conn();
			
			//
			
				try {
					PreparedStatement st = con.prepareStatement("select * from student ");
				
					ResultSet rs = st.executeQuery();
					while(rs.next())
					{
						System.out.print(rs.getInt("id"));
						System.out.print(" : "+rs.getString("sname"));
						System.out.print(" : "+rs.getString("email"));
						System.out.print(" : "+rs.getInt("age"));
						System.out.println(" : "+rs.getDouble("per"));
					}
					
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			


		}

}
