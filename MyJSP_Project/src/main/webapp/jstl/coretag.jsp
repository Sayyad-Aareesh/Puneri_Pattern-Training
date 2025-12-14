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
	<!-- print Operation -->
	<c:out value="${'Hello Welcome To jstl Tag Example'}"></c:out>
	<br><br>
	
	<!-- //set Variable value and initialize the value of variable -->
	<c:set var="a" value="${10 }"></c:set>
	<h3>Value of Variable a is :</h3>
	<c:out value="${a }"></c:out>
	
	<br>
	<!-- Simple if Condition -->
	<c:if test="${a>0 }">
		<c:out value="${'a is Greater then Zero' }"></c:out>
	</c:if>
	
	<br>
	<h3>choose-when-othrewise Example</h3>
	<br>
	<!-- switch Case -->
	<c:choose>
	<c:when test="${a > 0 }">
		<c:out value="${'a is Greater then Zero' }"></c:out>
	</c:when>
	
	<c:when  test="${a< 0 }">
		<c:out value="${'a is Less then Zero' }"></c:out>
	</c:when>
	
	<c:otherwise>
		<c:out value="${'a is Zero' }"></c:out>
	</c:otherwise>
	</c:choose>
	
	<c:forEach var="i" begin="1" end="5">
		<pre>Value of i : <c:out value="${ i}"></c:out></pre><br>
	</c:forEach>
	
	
</body>
</html>