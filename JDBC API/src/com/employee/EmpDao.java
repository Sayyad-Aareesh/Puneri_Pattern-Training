package com.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpDao {

	Connection conn=Connectivity.conn();
	Scanner sc =new Scanner(System.in);

	
	public int saveEmployee()
	{
		int result =0;
		System.out.println("Enter Employee Name");
		String ename=sc.next();
		
		System.out.println("Enter Employee Email");
		String email=sc.next();
		
		System.out.println("Enter Employee Address");
		String eaddress=sc.next();
		
		try
		{
			PreparedStatement st= conn.prepareStatement("insert into employee(name,email,address) value (?,?,?)");
			st.setString(1, ename);
			st.setString(2, email);
			st.setString(3, eaddress);
			
			result =st.executeUpdate();
			
			if(result > 0)
			{
				System.out.println("Employee Save Successfully...");
			}
		
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		
		
		return result;
		
	}
	
	public int updateEmployee()
	{
		 int result =0;
		 
		System.out.println("Enter Id To Update...");
		int id=sc.nextInt();
		
		try {
			PreparedStatement ps=conn.prepareStatement("select * from employee where e_id=?");
			ps.setInt(1, id);
			
		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
		{
			System.out.println("Enter Employee Name");
			String ename=sc.next();
			
			System.out.println("Enter Employee Email");
			String email=sc.next();
			
			System.out.println("Enter Employee Address");
			String eaddress=sc.next();
			
			ps = conn.prepareStatement("update employee set name=? ,email=? ,address=? where e_id=?");
			
			ps.setString(1, ename);
			ps.setString(2, email);
			ps.setString(3, eaddress);
			ps.setInt(4, id);
			
			result = ps.executeUpdate();
			
			if(result > 0)
			{
				System.out.println("Employee Updated Successfully....");
			}
			else
			{
				System.out.println("Fail to Update Employee...");
			}
		
		}
		else
		{
			System.out.println("No Employee Found With This id...Please try Agin...");
		}
		
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
		
		return result;
		
	}


	public int deleteEmployee()
	{
		int result =0;
		
		System.out.println("Enter Id To Delete the Employee...");
		int id=sc.nextInt();
		
		try {
			PreparedStatement ps = conn.prepareStatement("delete from employee where e_id=?");
			ps.setInt(1, id);
			
			result = ps.executeUpdate();
			if(result > 0)
			{
				System.out.println("Employee Deleted Successfully...");
			}
			else
			{
				System.out.println("No Employee Found with This id...Please try Again...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return result;
	}
	
	public boolean showSingleEmployeeDetail()
	{
		boolean result=false;
		Employee emp =new Employee();
		
		System.out.println("Enter Id To Show The Employee Details...");
		int id=sc.nextInt();
		
		try {
			PreparedStatement ps=conn.prepareStatement("select * from employee where e_id=?");
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				System.out.println("Id "+rs.getInt("e_id"));
				System.out.println("Name "+rs.getString("name"));
				System.out.println("Email "+rs.getString("email"));
				System.out.println("Address "+rs.getString("address"));
						}
			
			
			else {
				System.out.println("Unable to fetch data..");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	public static void main(String[] args) {
		
		EmpDao emp =new EmpDao();
		//emp.saveEmployee();
		
		//emp.updateEmployee();
		//emp.deleteEmployee();
	emp.showSingleEmployeeDetail();
	}

}
