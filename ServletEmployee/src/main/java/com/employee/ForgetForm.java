package com.employee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ForgetForm")
public class ForgetForm extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		String e =request.getParameter("email");
		
		out.println("<form action='UpdatePassword' method='post'>");
		out.println("<input type='hidden' name='email' value='"+e+"'><br><br>");
		out.println("Enter the Password :  <input type='password' name='password'><br><br>");
		out.println("Conform Password : <input type='password' name='cpassword'><br><br>");
		
		out.println("<input type='submit' value='Update'><br><br>");
		out.println("</form>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
