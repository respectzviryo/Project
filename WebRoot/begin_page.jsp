<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/c.tld" prefix="c"%>

<html:html>
<head>
	<title>Hello everyone!</title>
	<script type="text/javascript">
		function setfocus(){
			document.getElementById("username").focus();
		}
	</script>
</head>
<body onload="setfocus()">
<H4>Congratulations! You have run the Java project!</H4>
<div>
	<html:form action="/beginAction.do" method="POST">
		<html:text property="user" size="25" styleId="username"/>
		<html:submit value="Submit"/>
	</html:form>
</div>
</body>
</html:html>
