<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<!-- For html page -->
	${param.name}
	<br>
	
	<!-- Arithmatic Expression -->
	 ${(10+20+40)*2}
	 
	 <br>
	<!--  Turnary Operator -->
	
	${10>20? "10 is greater":"20 is Greater" }
	
	<br>
	
	 ${requestScope.email}
	 
	 <br>
	  ${sessionScope.email}

</body>
</html>