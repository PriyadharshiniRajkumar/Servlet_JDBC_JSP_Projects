 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"  errorPage="error.jsp"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>   
<body>
		Servlet Filters
		
		<form action="JSTL_Demo">
		Id of the employee : <input type="text" name="id"/><br>
		Name of the employee :  <input type="text" name="name"/><br>
		<input type="submit"><br>
		</form>
		
	<!-- JSTL FUNCTION EXAMPLE
	<c:set var="str" value="I LOVE AMULU"></c:set>
	<hr>
	Length of ${str} is ${fn:length(str)}<br>
	Splitting of the string with space:
	<c:forEach items="${fn:split(str,' ')}" var="s">
	<br/>
	${s}
	</c:forEach>
	
	${fn:toLowerCase(str)};
	<br> -->
	
	
	<!-- SQL - JSTL Example
	<br>
   <sql:setDataSource var="db" driver="oracle.jdbc.driver.OracleDriver"  
     url="jdbc:oracle:thin:@localhost:1521:orcl"  
     user="sys as sysdba"  password="oracle"/>  
     
     <sql:query dataSource="${db}" var="rs">  SELECT * from player</sql:query>   
	<c:forEach items="${rs.rows}" var="p">
	<c:out value="${p.fristname}"></c:out> : <c:out value="${p.sports}"></c:out>
	</c:forEach>
	 -->
	
</body>
</html>

