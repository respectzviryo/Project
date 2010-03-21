<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/c.tld" prefix="c"%>

<html:html>
<head>
	<link rel="icon" href="${ url_prefix }favicon.ico" type="image/x-icon" />
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<html:base />
</head>

<body>

	Hello <c:out value="${sessionScope.user}"/>!

	<br>
	<table style="border: 1px solid black;" cellspacing="2">
	<c:forEach var="exam" items="${sessionScope.tasks}" varStatus="lineInfo">
		 <tr>
			<td>${exam.description}</td>
			<td>${exam.name}</td>
			<td><a href="/Project/removeTask.do">delete</a></td>
		</tr>
		</c:forEach>
	</table>
	
	<br/>
	<a href="/Project/addTask.do">Add task</a>
</body>
</html:html>