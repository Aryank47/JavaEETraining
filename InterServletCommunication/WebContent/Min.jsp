<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="ShowImage.jsp" %>
<br>
<br>
<br>
<br>
<%
	int sum=(Integer)application.getAttribute("result");
	
	
%>
Sum of two integers is: <%=sum %>
<!--  -->


</body>
</html>