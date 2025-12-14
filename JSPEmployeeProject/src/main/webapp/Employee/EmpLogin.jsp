<%@ page language="java" import="com.employee.EmpDao" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Login</title>
<style type="text/css">
h3
{
	text-align: center;
	border: 1px solid red;
	color: black;
	width: 50%;
	height: 20%;
}
</style>
</head>

<jsp:useBean id="e" class="com.employee.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="e"/>
<body>
<%

boolean r =EmpDao.login(e.getEmail(), e.getPassword());

if(r)
{
	%>
	<jsp:forward page="EmpDashboard.jsp"></jsp:forward>
	<% 
}
else
{
	out.print("<h3>Error...While Login , please use valid email and passwor </h3>");
	%>
	 <jsp:include page="EmployeeLogin.html"></jsp:include>
	<% 
}
%>
</body>
</html>
