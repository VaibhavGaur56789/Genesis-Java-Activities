<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
 <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
<body  style="background-color:#FF3333">
<h1 style="text-align:center ">WELCOME</h1>
<h2 style="text-align:center ">BOOK YOUR SHOW</h2>

<table style="margin-left:18%">
<tr>
<th>MovieId</th>
<th>MovieName</th>
<th>Book Tickets</th>
</tr>
<c:forEach items="${movie}" var="m">
<tr>
<td><c:out value="${m.getMovieid()}"></c:out></td> 
<td><c:out value="${m.getMoviename()}"></c:out></td>
 <td><a href="book?id=<c:out value="${m.getMovieid()}"></c:out>">Book</a></td>

</c:forEach>
</table>
</body>
</html>