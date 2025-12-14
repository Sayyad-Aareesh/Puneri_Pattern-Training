<%@page import="com.employee.EmpDao"%>
<%@page import="com.employee.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Desh-board</title>
</head>
<body>
<form>
<%

	String email=request.getParameter("email");
	Employee emp=EmpDao.findEmpByEmail(email);
	
	%>
	
<p> Welcome to Desh-board <%= emp.getEname() %>..!</p>
<p>Your Email is : <%= emp.getEmail() %></p>
<br>

<a href="Update.jsp?id=<%= emp.getId() %>">Update</a>
<a href="Showdetails.jsp?id=<%= emp.getId() %>">Show my Details</a>
</form>
</body>
</html>