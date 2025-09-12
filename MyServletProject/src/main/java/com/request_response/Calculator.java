package com.request_response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		String op =request.getParameter("op");
		
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		int operation = Integer.parseInt(op);
		if(n1>0 && n2>0)
		{
			switch(operation)
			{
			case 1 :
					out.println("Addition is : "+(n1+n2));
					break;
					
			case 2 :
				out.println("Substraction  is : "+(n1-n2));
				break;
				
			case 3 :
				out.println("Multtiplication is : "+(n1*n2));
				break;
				
			case 4 :
				out.println("Division is : "+(n1/n2));
				break;
				
			default:
				out.println("Invalid Selection ");
					
			}
		}
		else {
			out.println("Number should be Gretter then Zero..");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
