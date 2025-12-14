<%@page import="com.student.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Student</title>
</head>
<body>
<jsp:useBean id="s" class=com.student.Student></jsp:useBean>
<jsp:setProperty property="*" name="s"/>
<%
int result = StudentDao.regisStudent(s);
if(result >0)
{
	out.print("Student Registred Successfully...");
}
else
{
	out.print("Fail to Regiter...");
}


%>
</body>
</html>