<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Scripting tag in JSP -->

<!-- Jsp provide three type of scripting tags to add java source code in jsp page or file  -->

<%-- 1.Scriplet Tag : 

Scriplet tag provide a way to add java souce code means it allowed to print the data
on web page or to declare the valriable also.

It does not allowed to declare the method on it. 

syntax : 
<% java source code  %>

Example : 
 --%>
 
 <%
 	out.print("This code is write by using scriplet tag in jsp....");
 	
 	//Declaration of variable and initialization of variable is allowed.
 	int a=20;
 	
 	out.println("<br><br>value of a is : "+a);
 	
 	//not allowed 
 	/* int add(int x ,int y)
 	{
 		return x+y;
 	} */
 %>
 
 <%-- Declaration tag:
 
 In Jsp , Declaration tag allowed to declare and initialized variable and method declaration.
 It does not allowed to print the data on console or web page. 
 syntax:
 <%!
 methods or variable declaration
 %>
 
 Example: 
 --%>
 
 <%!
 int add(int x,int y)
 {
	 return x+y;
 }
 
 //does not allowed 
 /* out.print("addtion is :"+add(2,5)); */
 %> 
 
 <%-- Expression tag:
 
 in jsp ,Expression tag is used to print the expression or data on console.
 It does not allowed to declare variable or method .
 It only print the expression.
 
 syntax :
 <%= "Expression"%>
  
  Example
  --%>
 
 <%= "<br><br>Expression Example"%> 
  <%= "<br>Addtion is : "+add(3,4) %>


  </body>
</html>