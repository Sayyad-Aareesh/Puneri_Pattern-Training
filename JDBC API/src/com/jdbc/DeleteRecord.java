package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRecord 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to be Deleted...");
		int id = sc.nextInt();
		Connection con = Connectivity.conn();
		try {
			PreparedStatement st = con.prepareStatement("delete from student where id=?");
			st.setInt(1, id);
			
			int result =st.executeUpdate();
			if(result > 0)
			{
				System.out.println("Record Deleted...");
			}
			else
			{
				System.out.println("Id not Found... ");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
