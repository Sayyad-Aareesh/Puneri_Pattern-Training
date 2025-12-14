<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>This is Forward Example 1 Page</h2>
	<%-- <jsp:forward page="forwardEx2.jsp"></jsp:forward> --%>
	<jsp:forward page="forwardEx2.jsp">
	<jsp:param value="Aareesh" name="myname"/>
	</jsp:forward>
	
</body>
</html>