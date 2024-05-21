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
	
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		if(pass.equals("admin")){
			
			response.sendRedirect("Success.jsp?temail=" + email);
		}else{
			response.getWriter().print("Invalid Password");
			request.getRequestDispatcher("Login.html").include(request, response);
		}
	
	%>

</body>
</html>