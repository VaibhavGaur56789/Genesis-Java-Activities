<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp" ></jsp:include>

<h2>
 <%=session.getAttribute("uname") %>
</h2>

<a href="welcome.jsp">Welcome! Click me</a>


<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>