<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/c.tld" prefix="c"%>
<jsp:useBean id="RequestSessionKeys" class="ca.project.constants.RequestSessionKeys" />
<html>
<head>
<title>Edit task</title>
</head>
<body>
<html:form action="/updateTaskAction.do" method="POST">
		<html:text property="description" value="${requestScope[RequestSessionKeys.TASK].description}" size="25"/>
		<html:hidden property="id" value="${requestScope[RequestSessionKeys.TASK].id}"/>
		<html:submit value="Submit"/>
	</html:form>
</body>
</html>