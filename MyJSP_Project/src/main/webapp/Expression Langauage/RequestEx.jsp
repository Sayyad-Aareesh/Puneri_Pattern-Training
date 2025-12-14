<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 request.setAttribute("myName", "Aareesh");
%>
<jsp:forward page="ExpressionLangugeEx2.jsp"></jsp:forward>
</body>
</html>