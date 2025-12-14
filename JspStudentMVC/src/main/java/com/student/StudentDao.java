package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao 
{
	public static Connection conn()
	{
		Connection con =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentjspmvc","root","root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(con !=null)
		{
			System.out.println("Connected...");
		}
		else
		{
			System.out.println("unable to connect...");
		}
		return con;
	}
	
	public static  int regisStudent(Student s)
	{
		int result=0;
		Connection con =conn();
		try {
			
			
			PreparedStatement st =con.prepareStatement("insert into student(name,address,age) value(?,?,?)");
		
		st.setString(1, s.getName());
		st.setString(2, s.getAddress());
		st.setInt(3, s.getAge());
		
		result =st.executeUpdate();
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}

}
