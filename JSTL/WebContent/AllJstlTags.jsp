<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="Welcome to jstl"></c:out>
<c:set var="total" scope="request" value="${4000*20}"></c:set>
Total is:<c:out value="${total }"></c:out>
total is: ${total}
<c:remove var="total"/>
total is:<c:out value="${total }"></c:out>


<h1>if Demo</h1>
<c:set var="salary" value="5000" ></c:set> 
<c:if test="${salary ge 2000 }">
	<c:out value="Yes salary greater than 2000"></c:out>
</c:if>
<br>
<br>
<h1>Switch demo</h1>

<c:choose>
	<c:when test="${salary gt 500 and salary lt 1000 }">
		<c:out value="Income is not good"></c:out>
	</c:when>
	
	<c:when test="${salary >1000 and salary < 2500 }">
		<c:out value="Income is good"></c:out>
	</c:when>
	
	<c:when test="${salary >2000 and salary <= 5000 }">
		<c:out value="Income is  very good"></c:out>
	</c:when>
	
	<c:otherwise>
		<c:out value="Unknown"></c:out>
	</c:otherwise>
</c:choose>
<br>
<br>
<h1>Catch</h1>

<c:catch var="e">
	<%
		int x=20/0;
	%>
</c:catch>
	
	<c:if test="${e!=null }">
		<p>
		
			Exception type is ${e}
			Exception message is ${e.message }
			
		</p>
		
		
	</c:if>

<br>
<br>
<h1>For Each</h1>

<c:forEach begin="1" end="20" step="2" var="counter" items="">
	<c:out value="${counter}"></c:out><br>
</c:forEach>



</body>
</html>