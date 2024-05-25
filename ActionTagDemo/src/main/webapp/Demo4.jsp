<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% out.println("Hey"); %>
	

	<jsp:include page="Print.jsp">
	
		<jsp:param value="${param.name}" name="str"/>
	
	</jsp:include>

</body>
</html>