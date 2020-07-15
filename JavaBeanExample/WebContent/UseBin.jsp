<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="emp"  class="com.netcracker.beans.Employee" scope="page"/>
    <jsp:setProperty property="*" name="emp"/>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
ID is: <jsp:getProperty property="id" name="emp"/><br>
Name is: <jsp:getProperty property="name" name="emp"/><br>
Salary is: <jsp:getProperty property="salary" name="emp"/><br>
</body>
</html>