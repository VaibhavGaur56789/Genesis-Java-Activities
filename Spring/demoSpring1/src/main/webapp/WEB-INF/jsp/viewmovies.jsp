<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>
<td>Movie Id</td>
<td>Movie Name</td>
<td>Actor</td>
<td>Actress</td>
<td>Movie Type</td>
<td>Release Date</td>
</tr>
<c:forEach items="${movies}" var="m">
<tr>
<td><c:out value="${m.getMovieId() }"></c:out></td>
<td><c:out value="${m.getMovieName() }"></c:out></td>
<td><c:out value="${m.getCast1() }"></c:out></td>
<td><c:out value="${m.getCast2() }"></c:out></td>
<td><c:out value="${m.getMovieType() }"></c:out></td>
<td><c:out value="${m.getReleaseDate() }"></c:out></td>
</tr>
</c:forEach>
</table>

</body>
</html>