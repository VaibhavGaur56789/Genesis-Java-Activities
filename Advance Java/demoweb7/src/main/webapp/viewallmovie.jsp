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

<%
MovieDao pd = new MovieDao();
List<Movie> li = pd.getMovieDetails();
%>
<table>
<tr>
<th>Movie id</th>
<th>Movie Name</th>
<th>Actor</th>
<th>Actress<th>
<th>Release Date<th>
<th>Language<th>
<th>Movie Type<th>
<th>Production ID<th>
</tr>
<%
for(Movie m:li)
{
%>
<tr>
<td><%=m.getMovieid() %></td>
<td><%=m.getMoviename() %></td>
<td><%=m.getActor() %></td>
<td><%=m.getActress() %></td>
<td><%=m.getReleasedate() %></td>
<td><%=m.getLanguage() %></td>
<td><%=m.getMovietype() %></td>
<td><%=m.getProductionid() %></td>
<td><a href = "editmovie.jsp?id=<%=m.getMovieid()%>" >Edit</a>
</tr>
<% } %>
</table>


</body>
</html>