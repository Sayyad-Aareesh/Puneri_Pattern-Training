<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ taglib prefix="c"
				uri="http://java.sun.com/jstl/core"
	 %>
	 <c:url var="uri" value="../index.jsp">
	 <c:param name="myname" value="Aareesh"></c:param>
	 </c:url> 
	 <a href="${uri}">Click Here</a>
</body>
</html>