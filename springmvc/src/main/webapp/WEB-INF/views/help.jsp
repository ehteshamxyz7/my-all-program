<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help page</title>
</head>
<body>

<%
String name = (String) request.getAttribute("name");
Integer rollNumber = (Integer)request.getAttribute("rollNumber");
LocalDateTime time = (LocalDateTime)request.getAttribute("time");
%>

<h1>hello my name is <%=name %></h1>

<h1>this is help page</h1>

<h1>my rollNumber is <%=rollNumber %></h1>

<h1>Date and time is <%=time %></h1>
<hr>

<%-- ${marks }--%>

<c:forEach var="item" items="${marks }">
<%-- <h1> ${item }</h1> --%>

<h1><c:out value="${item }"></c:out></h1>
</c:forEach>


</body>
</html>