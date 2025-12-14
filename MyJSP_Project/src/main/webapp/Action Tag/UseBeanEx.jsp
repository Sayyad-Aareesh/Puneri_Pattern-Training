<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%@ page import="com.basic.Addition"

%>
<jsp:useBean id="a" class="com.basic.Addition"></jsp:useBean>
<%

int z =a.add(4, 5);
out.print("Addtion is : "+z);
%>
</body>
</html>