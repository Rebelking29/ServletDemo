<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% String name = request.getParameter("str");
		out.print("Hello: " +name);
	
	%>
	
	<br>
	 ${param.str}
</body>
</html>