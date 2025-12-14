<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 

	Date  d=new Date();
	out.println("<h3>Today's date is  : </h3>"+d);
	
	List<Integer> l =new ArrayList<Integer>();
	l.add(12);
	l.add(23);
	l.add(45);
	l.add(66);
	
	out.println("list of integer"+l);
%>


</body>
</html>