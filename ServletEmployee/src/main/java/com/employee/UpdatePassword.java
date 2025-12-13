package com.employee;

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

@WebServlet("/UpdatePassword")
public class UpdatePassword extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		String email=request.getParameter("email");
		String p = request.getParameter("password");
		String cp =request.getParameter("cpassword");
		
		if(email.trim() !="" && p.trim() !="" && cp.trim() !="")
		{
			if(p.equals(cp))
			{
				int result =updateEmployee(email ,p);
				
				if(result > 0)
				{
					out.println("Password Updated Successfully...Login with nnew Password");
					RequestDispatcher rd =request.getRequestDispatcher("EmpLogin.html");
					rd.include(request, response);
				}
				else
				{
					out.println("Password and Conform Password dosent Match...Try Again...");
					RequestDispatcher rd =request.getRequestDispatcher("ForgetPassword.html");
					rd.include(request, response);
				}
						
			}
			else 
			{
				out.println("Password and Conform Password doent match...Try Again...");
				RequestDispatcher rd =request.getRequestDispatcher("ForgetPassword.html");
				rd.include(request, response);
		
			}
				
				
			
		}
		else
		{
			out.print("All Fields Are Mindatory...");
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	protected int updateEmployee(String email,String pass)
	{
		int result=0;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection con=DriverManager.getConnection("url","username","password");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_employee","root","root");
			PreparedStatement st = con.prepareStatement("update employee SET password=? where email=?");
			
			st.setString(1, pass);
			st.setString(2 ,email);
			
			result=st.executeUpdate();
		}
		catch(SQLException | ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		return result;
	}

}
