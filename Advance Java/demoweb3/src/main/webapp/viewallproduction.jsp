<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import = "com.ltts.prod.dao.*, com.ltts.prod.model.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ProductionDao pd = new ProductionDao();
List<Production> li = pd.getProductionDetails();
%>
<table>
<tr>
<th>Production id</th>
<th>Production Name</th>
<th>Address</th>
<th>Date of Start<th>
<th>Owner Name<th>
</tr>
<%
for(Production p:li)
{
%>
<tr>
<td><%=p.getProductionid() %></td>
<td><%=p.getProductionname() %></td>
<td><%=p.getAddress() %></td>
<td><%=p.getDateofstart() %></td>
<td><%=p.getOwnername() %></td>
<td><a href = "editplayer.jsp?id=<%=p.getProductionid()%>" >Edit</a>
</tr>
<% } %>
</table>

</body>
</html>