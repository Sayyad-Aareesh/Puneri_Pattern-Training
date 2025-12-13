package com.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet
{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		if(email.trim() !="" && password.trim() !="")
		{
		boolean result=loginEmp(email,password);
		
			if(result)
			{
				RequestDispatcher rd= request.getRequestDispatcher("HomeServlet");
				rd.forward(request, response);
			}
			else
			{	out.print("Erro...Invalid id or Password");
				RequestDispatcher rd =request.getRequestDispatcher("EmpLogin.html");
				rd.include(request, response);
			}
	
		
		}
		else
		{
			out.print("Erro...All Fields Are Mindatory...");
			RequestDispatcher rd =request.getRequestDispatcher("EmpLogin.html");
			rd.include(request, response);
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	private boolean loginEmp(String  u,String p)
	{
		System.out.println("Email : "+u+" Password : "+p);
		boolean result=false;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection con=DriverManager.getConnection("url","username","password");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_employee","root","root");
			PreparedStatement st = con.prepareStatement("select * from employee where email=? and password = ?");
			
			st.setString(1, u);
			st.setString(2,p);
			
			
			ResultSet rs=st.executeQuery();
			result =rs.next();
		}
		catch(ClassNotFoundException | SQLException ex)
		{
			ex.printStackTrace();
		}
			
		
		
		return result;
		}
}
