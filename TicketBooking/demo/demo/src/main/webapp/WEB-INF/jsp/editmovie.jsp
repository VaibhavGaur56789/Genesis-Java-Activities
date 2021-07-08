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
<form action="updatemovie" method="post" style="text-align: center;margin-top:40px"> 

MovieID:<input type="hidden" name="mid" value="${movie. getMovieid()}" ><br>
		<br> MovieName Name:<input type="text" name="mname" value="${movie. getMoviename()}" ><br>
		<br> Hero name:<input type="text" name="hname" value="${movie. getHero()}"><br>
		<br> Heroine name:<input type="text" name="hename" value="${movie. getHeroine()}"><br>
		<br> Release date:<input type="date" name="d" value="${movie. getDate()}"><br>
		<br> Language:<input type="text" name="lang" value="${movie. getLang()}"><br>
		<br> Length:<input type="number" name="len" value="${movie. getLength()}"><br>
		<br> Movie type:<select name="type" >
		<option value="Drama">Drama</option>
		<option value="Comedy">Comedy</option>
		<option value="Thriller">Thriller</option>
		<option value="Horror">Horror</option>
		</select><br><br>
		<br> ProductionID:<input type="number" name="pid" value="${movie.getProdid()}"><br>
		<br> <input type="submit" value="update movie details">
</form>
</body>
</html>