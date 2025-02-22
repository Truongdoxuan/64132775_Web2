<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<%
	String ten = request.getParameter("tendn");
	String matkhau = request.getParameter("mk");
	if("ABC".equals(ten) && "MNK".equals(matkhau)) {
		response.sendRedirect("UserProfile.html");
	} else {
		response.sendRedirect("Login.html?error=true");
	}
	%>
</body>
</html>