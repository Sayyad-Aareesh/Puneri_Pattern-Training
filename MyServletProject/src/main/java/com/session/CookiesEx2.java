package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookiesEx2")
public class CookiesEx2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		Cookie c[]=request.getCookies();
		
		//Cookie name
		//out.println("Cookie name is :"+c[0].getName());
		
		//Cookie value
		//out.println("Cookie name is :"+c[0].getValue());
		
		out.println("Welcome back to Cookie Example :"+c[0].getValue());
		
		Cookie c2=new Cookie("myCookie2", c[0].getValue());
		response.addCookie(c2);
		
		out.println("<br> <a href='CookiesEx3'>Jump to Third Cookie Page...</a>");
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
