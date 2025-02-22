<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Java Server Page Example</title>
</head>
<body>
	<center>
		<h1>Hello JSP 64.CNTT-CLC</h1>
	<%="<b>Hôm nay tôi học JSP</b><br>" %>
	<%= new  Date().toString() %>
	</center>
	
</body>
</html>