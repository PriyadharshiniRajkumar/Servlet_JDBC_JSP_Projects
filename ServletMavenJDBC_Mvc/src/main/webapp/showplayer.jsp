<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.maven.model.Players"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Player Information</title>
</head>
<body bgcolor="pink">

Player information

<%
		Players p1= (Players)request.getAttribute("players");
		out.println(p1);
%>
</body>
</html>