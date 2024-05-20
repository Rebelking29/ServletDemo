<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Demo</title>
</head>
<body>

	<h1>Welcome to JSP</h1>
	
	<!--  Scriptlet Tag  -->
	
	<% String name = "Virus";
		out.print("Name: " + name);
	%>
	<br><br>
	<!-- Expression Tag -->
	
	<%= name.length() %>
	<br><br>
	<!--  Declaration Tag -->
	
	<%! int add(){
		
		return 10*10;
		
	}		
	%>
	
	
	<%= add() %>

</body>
</html>