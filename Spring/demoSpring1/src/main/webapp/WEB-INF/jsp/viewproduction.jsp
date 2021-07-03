<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>
<td>Production ID</td>
<td>Production Name</td>
<td>Address</td>
<td>Date</td>
<td>Owner name</td>
</tr>


<c:forEach items="${production}" var="p">
<tr>
<td><c:out value="${p.getProductionid() }"></c:out></td>
<td><c:out value="${p.getProductionname() }"></c:out></td>
<td><c:out value="${p.getAddress() }"></c:out></td>
<td><c:out value="${p.getDateofstart() }"></c:out></td>
<td><c:out value="${p.getOwnername() }"></c:out></td>
<td><a href="editproduction?id=<c:out value="${p.getProductionid()}"></c:out>">Edit</a></td>
</tr>
</c:forEach>
</table>


</body>
</html>