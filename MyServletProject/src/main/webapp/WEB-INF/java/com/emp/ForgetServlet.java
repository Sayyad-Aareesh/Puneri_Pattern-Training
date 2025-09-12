package com.emp;

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

@WebServlet("/ForgetServlet")
public class ForgetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		String email= request.getParameter("email");
		
		//int result =getEmpById(email);
		
		if(getEmpById(email)) {
			RequestDispatcher rd = request.getRequestDispatcher("ForgetForm");
			rd.forward(request, response);
			
		}
		else {
			out.print("No Account Found With This Email...");
			RequestDispatcher rd = request.getRequestDispatcher("ForgetForm");
			rd.include(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	private boolean getEmpById(String email)
	{
		boolean result=false;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_employee","root","root");
			
			PreparedStatement st =con.prepareStatement("select * from employee where email=?");
			st.setString(1, email);
			
			ResultSet rs =st.executeQuery();
			
			result=rs.next();
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		
		return result;
		
	}
}

	