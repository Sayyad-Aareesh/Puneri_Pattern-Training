package com.emp;

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

@WebServlet("/RegisterEmployee")
public class RegisterEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		Employee e = new Employee();
		String ename = request.getParameter("ename");
		e.setEname(ename);
		
		e.setEmail( request.getParameter("email"));
		e.setEpass(request.getParameter("password"));
		
		System.out.println(e);
		
		
		
		if(e.getEname().trim() !="" && e.getEmail().trim() != "" && e.getEpass().trim() !="") {
			
			int result=saveEmp(e);
		
			if(result>0)
		{
			RequestDispatcher rd= request.getRequestDispatcher("Sucess.html");
			rd.forward(request, response);
					
		}
		else
		{
			out.print("Error while Register...try Again latter");
			
			RequestDispatcher rd= request.getRequestDispatcher("AddEmployee.html");
			rd.include(request, response);
		}
		}
		else
		{
			out.println("Field's Can not be Empty..");
		}
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	
	private int saveEmp(Employee e)
	{
		int result =0;
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection con=DriverManager.getConnection("url","username","password");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_employee","root","root");
			PreparedStatement st = con.prepareStatement("insert into employee(name,email,password) values (?,?,?)");
			
			st.setString(1, e.getEname());
			st.setString(2, e.getEmail());
			st.setString(3, e.getEpass());
			
			result =st.executeUpdate();
		
			
			
		}
		catch(ClassNotFoundException | SQLException ex)
		{
			ex.printStackTrace();
		}
		return result;
		
	}

}
