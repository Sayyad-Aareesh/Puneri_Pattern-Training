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
		String n =(String)session.getAttribute("myName");
		
	System.out.print(n);
		out.println("Welcome Back to Jsp Session Example : "+n);
		
		session.setAttribute("session3", n);
		
	
	%>
	<a href="session3.jsp">Click Me...</a>
</body>
</html>