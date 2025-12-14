<%@page import="com.mysql.cj.exceptions.StreamingNotifiable"%>
<%@page import="com.employee.EmpDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="e" class="com.employee.Employee"></jsp:useBean>
<%-- <jsp:setProperty property="*" name="e"/>] --%>
<%
String eid=request.getParameter("eid");
int id=Integer.parseInt(eid);
e.setId(id);

e.setEname(request.getParameter("ename"));
e.setEmail(request.getParameter("email"));
e.setPassword(request.getParameter("password"));

/* out.print("Emp id : "+e.getId()+" Ename : "+e.getEname()+" Email : "+e.getEmail()+" Password : "+e.getPassword()); */

int result=EmpDao.updateEmp(e);

if(result >0)
{
	out.println("Password Updated Successfully...Login with New Password...");
	

%>
<jsp:include page="EmployeeLogin.html"></jsp:include>
<%
}
else
{
	out.println("<h1>Error...While Updating...</h1>");
	%>
	<jsp:include page="EmpDashboard.jsp"></jsp:include>	
	<% 
}
%>
</body>
</html>