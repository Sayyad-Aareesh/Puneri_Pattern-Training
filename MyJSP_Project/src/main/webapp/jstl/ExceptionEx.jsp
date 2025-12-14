<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Exception Example -->
	<c:catch var="exception">
	<%
	int a=10 ,b=0;
	double div;
	div=a/b;
	
	out.println("Division is :"+div);
	%>
	</c:catch>
	
	<c:if test="${exception !=null }">
	<c:out value="${exception}"></c:out>
	</c:if>
	
	
</body>
</html>