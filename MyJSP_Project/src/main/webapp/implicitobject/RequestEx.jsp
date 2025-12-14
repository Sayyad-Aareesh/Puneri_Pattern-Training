<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request Example</title>
</head>
<body>
<%

String name= request.getParameter("myname");
out.print("Your name is :"+name);

%>
</body>
</html>