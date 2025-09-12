package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserDetails")
public class UserDetails extends HttpServlet {

       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		UserData ud=new UserData();
		String name=request.getParameter("uname");
		String email=request.getParameter("email");
		String age=request.getParameter("age");
		
		
		ud.setUname(name);
		ud.setUemail(email);
		ud.setAge(age);
		
		System.out.println("Name : "+name+" Email : "+email +" Age : "+age);		
				if(ud.getUname() !="" && ud.getUemail() !="" && ud.getAge() !="") {
					
					int result = addData(ud);
					if(result>0) {
						
							RequestDispatcher rd= request.getRequestDispatcher("Welcome.html");
							rd.forward(request, response);
						}
						else
						{	out.print("Erro...while add user , tyr agin letter");
							RequestDispatcher rd =request.getRequestDispatcher("UserDetails.html");
							rd.include(request, response);
						}
					
					}
				else {
					out.println("All Field's are minditory...");
					
					RequestDispatcher rd =request.getRequestDispatcher("UserDetails.html");
					rd.include(request, response);
				}
				
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private int addData(UserData u) {
		int result=0;
		System.out.println("Name : "+u.getUname()+" Email : "+u.getUemail() +" Age : "+u.getAge());
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection con=DriverManager.getConnection("url","username","password");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_employee","root","root");
			PreparedStatement st = con.prepareStatement("insert into user(name,email,age) values (?,?,?)");
			
			st.setString(1, u.getUname());
			st.setString(2, u.getUemail());
			st.setString(3, u.getAge());
			
			result =st.executeUpdate();
		}
		catch(ClassNotFoundException | SQLException ex)
		{
			ex.printStackTrace();
		}
		return result;
	}

}
