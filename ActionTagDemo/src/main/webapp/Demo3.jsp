<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- By Using Expression Tag -->

	<% String s = request.getParameter("name"); %>
	
	<jsp:forward page="Print.jsp">
		<jsp:param value="<%= s %>" name="st"/>
	</jsp:forward>


	<!-- By Using Expression Language -->

	<jsp:forward page="Print.jsp">
		<jsp:param value="${param.name}" name="st"/>
	</jsp:forward>
	
	
	<!-- Manually Data Pass -->
	
	<jsp:forward page="Print.jsp">
		<jsp:param value="Manual Value" name="st"/>
	</jsp:forward>


</body>
</html>