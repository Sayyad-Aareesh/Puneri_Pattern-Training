<%@page import="com.employee.Employee"%>
<%@page import="com.employee.EmpDao" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Registration</title>
</head>
<jsp:useBean id="e" class="com.employee.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="e"/>
 <body>
		<%
		int result =EmpDao.addEmp(e);
		if(result>0) 
		{
			out.println("Registred Successfully..Please log by using your email and password....");
			
			
			%>
				<jsp:include page="EmployeeLogin.html"></jsp:include>
			
				<!-- RequestDispatcher rd= request.getRequestDispatcher("Success.html");
				rd.forward(request, response); -->
			<% 
			}
			else
			{	
				out.print("Erro...while add user , tyr agin letter or email already exits.. ");
			%>
				<jsp:include page="AddEmployee.html"></jsp:include>
			<%
			}
		%>
</body>
</html>