<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ taglib
	prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"
%>

<%@ taglib

	prefix="fn"
	uri="http://java.sun.com/jsp/jstl/functions"
%>

<c:set var="str" value="Hello Java Coders..."></c:set>
<c:set var="str2" value="We are learning Jsp taglib Directiove"></c:set>

<p>String 1 is : <c:out value="${str}"></c:out>
<br>
String 2 is : <c:out value="${str2}"></c:out>
<br>
</p>


<p> 
 	Length of the String 1 is : ${fn:length(str)}  
 	<br>
 	Length of the String 2 is : ${fn:length(str2)}
 	<br>
 	
 	Length of "Java Coders" is : ${fn:length("Java Coders")}  
</p>

<p>

	Convert The String 1 in Upper Case : ${fn:toUpperCase(str2)}
	<br>
	Convert The String 1 in Lower Case : ${fn:toLowerCase(str2)}

</p>

<p>
	Replace some part of String str2 :${fn:replace(str,"Hello","Welcome")}
	 
</p>
<p>Search the word 'Coders' in String 1 : <c:if test="${fn:contains(str,'Coders')}">
<c:out value="Found"></c:out>
</c:if>
</body>

</html>