<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page
    import="java.time.LocalDateTime" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">
<%!
	LocalDateTime date;

%>

<%
	date=LocalDateTime.now();

%>
Date is : <%=date.getDayOfMonth() %>:<%=date.getMonthValue() %>:<%=date.getYear() %> <br>

Time is : <%=date.getHour() %>:<%=date.getMinute() %>:<%=date.getSecond() %>

</body>
</html>