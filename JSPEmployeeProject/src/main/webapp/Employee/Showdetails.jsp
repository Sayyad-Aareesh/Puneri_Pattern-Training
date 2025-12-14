<%@page import="com.employee.Employee"%>
<%@page import="com.employee.EmpDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body
{
background-color:olive;
}
table
{
	
	border-collapse: collapse;
	width: 80%;
}

th,td
{
	text-align: left;
	padding: 10px;
}
table,th,td
{
	border:2px solid black;
}


</style>
</head>
<body>
	<%
		String eid=request.getParameter("id");
		int id=Integer.parseInt(eid);
	Employee emp=EmpDao.findEmpById(id);
	if(emp !=null)
	{
		//out.print("eid : "+emp.getId() +" Ename : "+emp.getEname());
		
		out.print("<table>");
		out.print("<tr><th>id</th><th>Name</th><th>Email</th><th>Your password</th><th colspan='2'>Action</th></tr>");
		out.print("<tr><td>"+emp.getId()+"</td><td>"+emp.getEname()+
				"</td><td>"+emp.getEmail()+"</td><td>"+emp.getPassword()+
				"</td><td><a href='Update.jsp?id="+eid+"'>Update</a></td><td><a href='Delete.jsp?id="+eid+"'>Delete</a></td></tr>");
		out.print("</table>");
		
		
		
	}
	%>
	
	
	
</body>
</html>