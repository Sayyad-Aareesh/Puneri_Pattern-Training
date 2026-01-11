package com.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpDao {

	Connection conn=Connectivity.conn();
	Scanner sc =new Scanner(System.in);

	
	public int saveEmployee(Employee e)
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
			PreparedStatement st= conn.prepareStatement("insert into employee(name,email,address) value (?,?,?");
			st.setString(1, ename);
			st.setString(2, email);
			st.setString(3, eaddress);
			
			result =st.executeUpdate();
		
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		
		
		return result;
		
	}


	public static void main(String[] args) {
		
	}

}
