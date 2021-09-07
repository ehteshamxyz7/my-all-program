<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
	<h1>my name is ehtesham</h1>
	<h1>help us............</h1>

	<%
		String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	ArrayList<String> friends= (ArrayList)request.getAttribute("f");
	
	%>
	
	<h1>
		name is
		<%=name%></h1>


	<h1>
		Id id
		<%=id%></h1>


<%
for(String s : friends){
%>

<h1><%=s %></h1>

<%	
     }
%>

</body>
</html>