<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
	<%
	int valueA = Integer.parseInt(request.getParameter("a")); 
	int valueB = Integer.parseInt(request.getParameter("b")); 
	out.print("Hiệu của "+valueA+" và "+valueB+" là ");
	out.print(valueA-valueB);
	%>
</body>
</html>