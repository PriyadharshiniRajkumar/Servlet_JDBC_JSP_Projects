<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%


response.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); //Not to store in cache of the Bowser,as this is secured page - Prevent back button after logout - Supports in HTTP 1.1

response.setHeader("Pragma", "no-cache"); //HTTP 1.0

response.setHeader("Expries","0"); //Proxies

if(session.getAttribute("username")==null){
	response.sendRedirect("index.jsp");
}%>
<!--  This above code is used to make sure that this session is having a user and noone can directly access the link 
 -->

This is Videos Page

<iframe width="420" height="315"
src="https://www.youtube.com/embed/Ades3pQbeh8">
</iframe>


</body>
</html>