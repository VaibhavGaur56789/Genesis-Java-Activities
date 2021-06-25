<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="index.html">Go to Home</a><br><br>
<%=session.getAttribute("uname") %> successfully logged out.

<%session.removeAttribute("uname"); %>

</body>
</html>