<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import = "com.ltts.mov.dao.*, com.ltts.mov.model.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Movie Edit</h1>
<%
MovieDao md= new MovieDao();
int id = Integer.parseInt(request.getParameter("id"));
Movie m = md.getMovieById(id);
%>
<form action = "./updateMovieServlet" method="post">
<input type="hidden" name="mid" value="<%=id%>"><br><br>
Movie Name: <input type="text" name="mname" value="<%=m.getMoviename() %>"><br><br>
Actor: <input type="text" name="mctor" value="<%=m.getActor() %>"><br><br>
Actress: <input type="text" name="mactress" value="<%=m.getActress() %>"><br><br>
Release Date: <input type="text" name="mdate" value="<%=m.getReleasedate() %>"><br><br>
Language: <input type="text" name="mlanguage" value="<%=m.getLanguage() %>"><br><br>
Movie Type: <input type="text" name="mtype" value="<%=m.getMovietype() %>"><br><br>
Production ID: <input type="text" name="mid" value="<%=m.getProductionid() %>"><br><br>

<input type="submit" value="Update Movie"><br> 
</form>

</body>
</html>