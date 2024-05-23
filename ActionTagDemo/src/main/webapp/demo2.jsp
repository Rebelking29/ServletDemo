<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% 
	
		request.setAttribute("email","a@gmail.com");
		request.getRequestDispatcher("Eldemo.jsp").forward(request, response);
		session.setAttribute("email","b@gmail.com");
	
	%>

</body>
</html>