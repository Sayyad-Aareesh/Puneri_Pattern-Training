package com.request_response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentInfo")
public class StudentInfo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String rollNo = request.getParameter("roll_no");
		String sname = request.getParameter("sname");
		
		String math =request.getParameter("math");
		String physics =request.getParameter("phy");
		String chemistry =request.getParameter("chem");
		
		int m =Integer.parseInt(math);
		int p =Integer.parseInt(physics);
		int c =Integer.parseInt(chemistry);
		
		int total = m+p+c;
		
		double avg =total/3;
		
		out.println(" Student Roll_NO : "+rollNo);
		out.println("<br><br> Student Name is : "+sname);
		out.println("<br><br> Student total Marks is : "+total);
		out.println("<br><br> Avg is : "+avg);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
