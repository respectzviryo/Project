<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/c.tld" prefix="c"%>
<jsp:useBean id="RequestSessionKeys" class="ca.project.constants.RequestSessionKeys" />

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
	<c:forEach var="item" items="${requestScope[RequestSessionKeys.TASK_LIST]}" varStatus="lineInfo">
		 <tr>
			<td>${item.description}</td>
			<td>${item.name}</td>
			<td><a href="/Project/removeTask.do?id=${item.id}">delete</a></td>
			<td><a href="/Project/editTask.do?id=${item.id}">edit</a></td>
		</tr>
		</c:forEach>
	</table>
	
	<br/>
	<a href="/Project/addTask.do">Add task</a>
</body>
</html:html>