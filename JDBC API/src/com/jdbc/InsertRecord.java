package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String sname = sc.next();
		
		System.out.println("Enter email : ");
		String email = sc.next();
		
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter per : ");
		double per = sc.nextDouble();
		Connection conn = Connectivity.conn();
		try {
			
			//insert record
			//insert into student(sname,email,age ,per) value(' ',' ', ,);
			PreparedStatement st = conn.prepareStatement("insert into student (sname ,email,age ,per)"
					+ "value(?,?,?,?)");
			
			st.setString(1, sname);
			st.setString(2, email);
			st.setInt(3, age);
			st.setDouble(4, per);
			
			int r = st.executeUpdate();
			if(r > 0)
			{
				System.out.println("Data inserted Successfully....");
			}
		
		conn.close();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
