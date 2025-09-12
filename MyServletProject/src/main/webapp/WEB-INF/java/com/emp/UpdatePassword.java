package com.emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.ReadOnlyFileSystemException;
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

@WebServlet("/UpdatePassword")
public class UpdatePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("email");
		String p = request.getParameter("password");
		String cp = request.getParameter("cpassword");
		
		System.out.println(email +" "+p +" "+cp);
		
		if(p.equals(cp))
		{
			int result=updateEmp(email ,p);
			if(result >0)
			{
				out.print("Password Updated Successfully...");
				RequestDispatcher rd = request.getRequestDispatcher("EmpLogin.html");
				rd.include(request, response);
			}
			else 
			{
				out.print("Error While Updating Password...");
				
				RequestDispatcher rd = request.getRequestDispatcher("ForgetPassword.html");
				rd.include(request, response);
				
				
			}
		}
		else
		{
			out.print("Error Password and Conform password Does not Match...Please Try Again...");
			
			RequestDispatcher rd = request.getRequestDispatcher("ForgetPassword.html");
			rd.include(request, response);
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	private int updateEmp(String e ,String p)
	{
		int result =0;
		System.out.print(e+" "+p);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_employee","root","root");
			
			PreparedStatement st =con.prepareStatement("update employee SET password=? where email=?");
			st.setString(1, p);
			st.setString(2, e);
			
			result =st.executeUpdate();
		}
			catch(ClassNotFoundException | SQLException ex)
			{
				ex.printStackTrace();
			}
		return result;
	}
}
