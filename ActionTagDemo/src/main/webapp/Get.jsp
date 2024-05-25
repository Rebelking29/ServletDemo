<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="emp" class="com.pojo.Employee" scope="session"></jsp:useBean>
	<jsp:getProperty property="e_id" name="emp"/>
	<jsp:getProperty property="name" name="emp"/>
	<jsp:getProperty property="des" name="emp"/>
	<jsp:getProperty property="salary" name="emp"/>

</body>
</html>