package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity

{
	public static Connection conn()
	{
		Connection con =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "system");
			if(con !=null)
			{
				System.out.println("Connected...");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void main(String[] args)
	{
		

		
		
		
		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//				 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "system");
//			
//				if(con !=null)
//				{
//					System.out.println("Connected successfully...");
//				}
//				
//		} catch (ClassNotFoundException | SQLException e) {
//			
//			e.printStackTrace();
//		}
//		finally
//		{
//			try {
//				con.close();
//			} catch (SQLException e) {
//			
//				e.printStackTrace();
//			}
//		}
		
	}

}
