<%@page import="com.employee.EmpDao"%>
<%@page import="com.employee.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%

	String id=request.getParameter("id");
	int eid=Integer.parseInt(id);
	out.print("Eid :"+eid);	
	Employee emp=EmpDao.findEmpById(eid);	
	

%>
	
	<form action="DeleteEmp.jsp">


<input type="hidden" name="eid" value="<%= emp.getId() %>">
<p style="color :red">Please Delete my information</p>
<br>

<input type="submit" value="Delete" onclick="onDelete()">
</form>
<script type="text/javascript">
function onDelete()
{
	alert("Are you want to sure to Delete your information from here..");
	
}
</script>
</body>
</html>