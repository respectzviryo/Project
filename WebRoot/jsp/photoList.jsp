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

<body class="main">
	<div class="header">
		<div class="main_links">
			<a href="/Project/photos.do">Main Albom</a>
			<a href="/Project/tasks.do">Manage Photos</a>
		</div>
		<div class="user_label">
			<i>Your name:</i>
			<b><c:out value="${sessionScope.user}" /> </b>
		</div>
	</div>
	<div id="main">
		<h1>
			My Pictures
		</h1>


		<c:forEach var="item"
			items="${requestScope[RequestSessionKeys.PHOTO_LIST]}"
			varStatus="lineInfo">

			<div class="photo">
				<a class="image" href="/Project/photoDetails.do?id=${item.id}"> <img border="0"
						src="/Project/upload/${item.fileName}" style="height: 100px;">
				</a>
				<br />
				"${item.description}" published on ${item.createdAt}, tagged
				<c:forEach var="tag" items="${item.tags}" varStatus="lineInfo">
					<c:if test="${tag.name != null}">
						<a href="#"><c:out value="${tag.name}"></c:out></a>&nbsp;
					</c:if>
				</c:forEach>
			</div>

		</c:forEach>


		<div id="footer">
			java development
		</div>



	</div>



</body>
</html:html>