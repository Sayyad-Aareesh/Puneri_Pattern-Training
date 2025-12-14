<%@page import="com.employee.EmpDao"%>
<%@page import="com.employee.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
</head>
<body>
<%

	String id=request.getParameter("id");
	int eid=Integer.parseInt(id);
	out.print("Eid :"+eid);	
	Employee emp=EmpDao.findEmpById(eid);	
	

%>
<form action="UpdateEmp.jsp">


<input type="hidden" name="eid" value="<%= emp.getId() %>">
Enter Name : <input type="text" name="ename" value="<%= emp.getEname() %>">
<br><br>
Enter Email : <input type="email" name="email" value="<%= emp.getEmail() %>" disabled>
<br><br>
Enter Password : <input type="password" name="password" value="<%= emp.getPassword() %>">

<br>
<p style="color :red">Do not Update Email</p>
<br>

<input type="submit" value="Update">
</form>
	<h2>Update...</h2>
</body>
</html>