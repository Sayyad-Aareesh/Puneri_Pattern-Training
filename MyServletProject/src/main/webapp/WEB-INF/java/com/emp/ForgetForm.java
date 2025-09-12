package com.emp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ForgetForm")
public class ForgetForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String e = request.getParameter("email");
		
		out.print("<form action='UpdatePassword' method='post'>");
		out.print("<input type='hidden' name='email' value='"+e+"'>");
		out.print("Enter New Password : <input type='password' name='password'><br><br>");
		out.print("Confirm Password : <input type='password' name='cpassword'><br><br>");
		out.print("<input type='submit' value='Update'>");
		
		out.print("</form>");
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
