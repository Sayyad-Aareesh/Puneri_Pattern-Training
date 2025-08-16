package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectSingleRecord {

	public static void main(String[] args) {
		Connection con = Connectivity.conn();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the id to display the record");
		int id =sc.nextInt();
		
		
			try {
				PreparedStatement st = con.prepareStatement("select * from student where id=? ");
				st.setInt(1, id);
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
				System.out.println("Please Enter Valid id...");
			}
			
		



	}

}
