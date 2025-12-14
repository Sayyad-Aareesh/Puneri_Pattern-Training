package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDao 
{
	private static Connection conn()
	{
		Connection con =null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_employee","root","root");
		
			if(con !=null)
			{
				System.out.println("Connected...");
			}
		
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	
		return con;
	}
	
	public static int addEmp(Employee e)
	{
		int result=0;
		Connection con=conn();
		System.out.println("Name : "+e.getEname()+" Email : "+e.getEmail() +" Password : "+e.getPassword());
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Connection con=DriverManager.getConnection("url","username","password");
			 
			
			//Connection con=conn();
			PreparedStatement st = con.prepareStatement("insert into employee(name,email,password) value(?,?,?)");
			
			st.setString(1, e.getEname());
			st.setString(2, e.getEmail());
			st.setString(3, e.getPassword());
			
			result =st.executeUpdate();
		}
		catch(ClassNotFoundException  | SQLException ex)
		{
			ex.printStackTrace();
		}
		return result;
	}

	
	
	public static boolean login(String email ,String upass)
	{
		boolean result =false;
		Connection con=conn();
		try {
			PreparedStatement st= con.prepareStatement("select * from employee where email=? and password=?"); 
			st.setString(1, email);
			st.setString(2, upass);
			
			ResultSet rs =st.executeQuery();
			
			result =rs.next();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		
		return result;
	}
	
	
	public static  Employee findEmpByEmail(String email)
	{
		System.out.println("Email is :"+email);
		Employee e = new Employee();
		Connection con=conn();
		try {
			PreparedStatement st= con.prepareStatement("select * from employee where email=? "); 
			st.setString(1, email);
		
			ResultSet rs=st.executeQuery();
			
				while(rs.next())
				{
					int id=rs.getInt("id");
					e.setId(id);
					
					/*String ename=rs.getString("name");
					String mail=rs.getString("email");
					String pass=rs.getString("password");*/
					
					e.setEname(rs.getString("name"));
					e.setEmail(rs.getString("email"));
					e.setPassword(rs.getString("password"));
					
				}
			
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return e;
	
	}
	public static Employee findEmpById(int eid)
	{
		Employee e = new Employee();
		Connection con=conn();
		try {
			PreparedStatement st= con.prepareStatement("select * from employee where id=? "); 
			st.setInt(1, eid);
		
			ResultSet rs=st.executeQuery();
			
				while(rs.next())
				{
					int id=rs.getInt("id");
					e.setId(id);
					
					/*String ename=rs.getString("name");
					String mail=rs.getString("email");
					String pass=rs.getString("password");*/
					
					e.setEname(rs.getString("name"));
					e.setEmail(rs.getString("email"));
					e.setPassword(rs.getString("password"));
					
				}
			
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	
		return e;
	}
	public static int updateEmp(Employee e)
	{
		
		System.out.println("Eid : "+e.getId()+" Ename : "+e.getEname()+" password : "+e.getPassword() );
		int result=0;
		Connection con=conn();
		
		try {
			PreparedStatement st= con.prepareStatement("update employee SET name=? ,password=? where id=? "); 
			st.setString(1, e.getEname());
			st.setString(2, e.getPassword());
			//st.setString(3, e.getEmail());
			st.setInt(3, e.getId());
			
			result=st.executeUpdate();
		}catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return result;
		
				
	}
	
	public static int deleteEmp(int id)
	{
		int result=0;
		System.out.println("Eid : "+id);
		
Connection con=conn();
		
		try {
			PreparedStatement st= con.prepareStatement("delete from employee where id=? "); 
			st.setInt(1, id);
			
			result=st.executeUpdate();
		}catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	
		return result;
		
	}
}