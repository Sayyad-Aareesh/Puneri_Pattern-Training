package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.PreparedStatementWrapper;

public class SQLAggregationEx {

	public static void main(String[] args) {
		Connection con = Connectivity.conn();
		
		try {
			//count
			//PreparedStatement st = con.prepareStatement("select count(id) from student");
			
			//min per
			//PreparedStatement st = con.prepareStatement("select min(per) from student");
			//PreparedStatement st = con.prepareStatement("select max(per) from student");
			
			//PreparedStatement st = con.prepareStatement("select upper(sname) from student");
			PreparedStatement st = con.prepareStatement("select lower(sname) from student");
			ResultSet rs =st.executeQuery();
			
			while(rs.next())
			{
				//count id's
				//System.out.println("Number of id's  Count is: "+rs.getInt(1));
			
				//min per
				//System.out.println("Min per is : "+rs.getDouble(1));
				
				
				//max per
				//System.out.println("Max per is : "+rs.getInt(1));
			
				//Name in Upper case
				//System.out.println("Name in Upper Case : "+rs.getString(1));
				
				//Name in Lower case
				System.out.println("Name in Upper Case : "+rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
