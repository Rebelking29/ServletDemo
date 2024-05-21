<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

<% 

	String name = request.getParameter("name");
	out.println("Name: "+name);
	
	String userid = config.getInitParameter("userid");
	out.println("Userid: " +userid);

%>

</body>
</html>