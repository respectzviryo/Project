<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/c.tld" prefix="c"%>
<html>
<head>
<title>Add new task</title>
</head>
<body>
<html:form action="/addTaskAction.do" method="POST">
		<html:text property="name" size="25"/>
		<html:text property="description" size="25"/>
		<html:submit value="Submit"/>
	</html:form>
</body>
</html>