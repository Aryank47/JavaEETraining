<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
	Welcome :<%=request.getParameter("myuser") %> to online book store<br>
	Hidden Data is :<%=request.getParameter("empid") %><br>
	Select Books<br><br><br>


</body>
</html>