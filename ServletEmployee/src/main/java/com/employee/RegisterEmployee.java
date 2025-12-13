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


@WebServlet("/RegisterEmployee")
public class RegisterEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		
			response.setContentType("text/html");
	PrintWriter out =response.getWriter();
	
	Employee emp=new Employee();
	
	String name=request.getParameter("ename");
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	
	
	emp.setName(name);
	emp.setEmail(email);
	emp.setPassword(password);
	//emp.s;
	//ud.setAge(age);
	
	System.out.println("Name : "+name+" Email : "+email +" Password : "+password);		
			if(emp.getName() !="" && emp.getEmail() !="" && emp.getPassword() !="") {
				
				int result = addData(emp);
				if(result>0) {
					
						RequestDispatcher rd= request.getRequestDispatcher("Success.html");
						rd.forward(request, response);
					}
					else
					{	out.print("Erro...while add user , tyr agin letter or email already exits.. ");
						RequestDispatcher rd =request.getRequestDispatcher("AddEmployee.html");
						rd.include(request, response);
					}
				
				}
			else {
				out.println("All Field's are minditory...");
				
				RequestDispatcher rd =request.getRequestDispatcher("AddEmployee.html");
				rd.include(request, response);
			}
			
	}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);
}

private int addData(Employee u) 
{
	
	int result=0;
	System.out.println("Name : "+u.getName()+" Email : "+u.getEmail() +" Password : "+u.getPassword());
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection con=DriverManager.getConnection("url","username","password");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_employee","root","root");
		PreparedStatement st = con.prepareStatement("insert into employee(name,email,password) value(?,?,?)");
		
		st.setString(1, u.getName());
		st.setString(2, u.getEmail());
		st.setString(3, u.getPassword());
		
		result =st.executeUpdate();
	}
	catch(ClassNotFoundException | SQLException ex)
	{
		ex.printStackTrace();
	}
	return result;
}

}
