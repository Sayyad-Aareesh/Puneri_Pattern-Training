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
	
	out.print("This is Out Implicit Object Example");
	
	out.print("<br> This is JSP Tutorial");
	
	//File Type(jsp or servlet).
	out.print("<br><br> Servlet Name is : "+config.getServletName());
	
	//Project Name
	out.print("<br><br> Context Name : "+application.getContextPath());
	
	//Class path
	out.print("<br><br> Class Name is : "+page.getClass());
	
	
	%>
</body>
</html>