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
<%
String eid=request.getParameter("eid");
int id=Integer.parseInt(eid);

int result=0;
result=EmpDao.deleteEmp(id);
if(result>0)
{
	out.print("Your data Deleted Succesfully..");
	%>
	<jsp:include page="../index.jsp"></jsp:include>
<%
}
else
{
	out.print("Faild to Delete...<br>Please try again...");
%>
<jsp:include page="EmpDashboard.jsp"></jsp:include>			
<% 
}
%>
</body>
</html>