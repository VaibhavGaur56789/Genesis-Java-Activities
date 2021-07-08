<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
 <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#EEFBFB">

<form action="updateproduction" method="post" style="text-align: center;margin-top:40px">
		ProductionID:<input type="hidden" name="pid" value="${Productions. getProductionid()}"><br>
		<br> Production Name:<input type="text" name="pname" value="${Productions. getProductionname()}"><br>
		<br> Address:<input type="text" name="add" value="${Productions. getAddress()}"><br>
		<br> Year of started:<input type="text" name="year" value="${Productions. getDateofStarted()}"><br>
		<br> Owner Name:<input type="text" name="oname" value="${Productions. getOwnername()}"><br>
		<br> <input type="submit" value="update production details">

	</form>
</body>
</html>