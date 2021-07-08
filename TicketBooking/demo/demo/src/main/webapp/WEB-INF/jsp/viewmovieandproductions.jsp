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
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
  width:1000px;
  text-align:center;
}
</style>
</head>
<body style="background-color:#E3E2DF ; text-align:center">
<table>
<tr>
<th>MovieId</th>
<th>MovieName</th>
<th>production id</th>
<th>production name</th>
</tr>

<c:forEach items="${prmo}" var="p" >




<tr>
<td><c:out value="${p.getMovieid()}"></c:out></td>
<td><c:out value="${p.getMoviename()}"></c:out></td>
<td><c:out value="${p.getProductionid()}"></c:out></td>
<td><c:out value="${p.getProductionname()}"></c:out></td>
</tr>
</c:forEach>


</table>

<br><br>
<a href="/">Home</a>
</body>
</html>