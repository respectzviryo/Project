<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/c.tld" prefix="c"%>
<jsp:useBean id="RequestSessionKeys"
	class="ca.project.constants.RequestSessionKeys" />

<html:html>
<head>
	<link rel="icon" href="${ url_prefix }favicon.ico" type="image/x-icon" />
	<link rel="stylesheet" href="/Project/public/css/main.css"
		type="text/css">
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<html:base />
</head>

<body>

	<div class="user_label">
		<i>Your name:</i>
		<b><c:out value="${sessionScope.user}" /> </b>
	</div>
	<div id="main">
		<div style="margin-right: 270px">
			<h1>
				upload photo
				<a style="float: right;" href="/Project/tasks.do">Photo List</a>
			</h1>
		</div>
		<div style="margin-right: 270px;">

			<html:form action="/addTaskAction.do" method="POST"
				enctype="multipart/form-data" styleId="admin-contanier">

				<fieldset>
					<div class="form-row">
						<label>
							Photo:
						</label>
						<div class="content">
						</div>
					</div>
					<div class="form-row">
						<label>
							File path:
						</label>
						<div class="content">
							<html:file property="theFile"></html:file>
						</div>
					</div>
					<div class="form-row">
						<label>
							Description:
						</label>
						<div class="content">
							<html:textarea property="description"></html:textarea>
						</div>
					</div>
				</fieldset>

				<html:submit value="Submit" />
			</html:form>

		</div>
	</div>

</body>
</html:html>