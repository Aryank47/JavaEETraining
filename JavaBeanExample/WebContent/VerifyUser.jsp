<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="user" class="com.netcracker.beans.UserBean"></jsp:useBean>
    <jsp:setProperty property="*" name="user"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	boolean flag=user.validateUser();
	if(flag){
		
%>

<jsp:forward page="LoginSuccess.jsp"></jsp:forward>
<%
	}
	else{
		
	
%>
<jsp:forward page="LoginFailure.jsp"></jsp:forward>
<%
	}
%>
</body>
</html>