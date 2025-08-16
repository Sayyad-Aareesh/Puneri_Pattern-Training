package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRecord {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the id to Update...");
		int id = sc.nextInt();
		
		Connection con = Connectivity.conn();
		
		
		try {
			PreparedStatement st = con.prepareStatement("select * from student where id = ?");
			
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
			
			if(rs.next())
			{
				System.out.println("Enter name : ");
				String sname = sc.next();
				
				System.out.println("Enter email : ");
				String email = sc.next();
				
				System.out.println("Enter age : ");
				int age = sc.nextInt();
				
				System.out.println("Enter per : ");
				double per = sc.nextDouble();
				
				
				st = con.prepareStatement("update student SET sname=?,email=?,age=?,per=? where id =?");
				
				st.setString(1, sname);
				st.setString(2, email);
				st.setInt(3, age);
				st.setDouble(4, per);
				st.setInt(5, id);
				
				st.executeUpdate();
				
				System.out.println("Record Updated...");
				
			}
			else
			{
				System.out.println("No Record Found....");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

}
