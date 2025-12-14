<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	
	String name=request.getParameter("myname");
	
	out.println("Welcome To Jsp Session Example : "+name);
	
	session.setAttribute("myName", name);
	%>
	
	<a href="session2.jsp">Click Here</a>
</body>
	
</html>