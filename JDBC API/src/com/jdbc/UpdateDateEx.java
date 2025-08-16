package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UpdateDateEx {

	public static void main(String[] args) throws ParseException {
		String temp_date ="2020-11-30";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date d =format.parse(temp_date);
		System.out.println(d);
		
		Connection con = Connectivity.conn();
		
		try {
			PreparedStatement st = con.prepareStatement("update student set dob=? where id = ?");
			st.setDate(1, new java.sql.Date(d.getTime()));
			st.setInt(2, 3);
			st.executeUpdate();
			System.out.println("Updated...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
