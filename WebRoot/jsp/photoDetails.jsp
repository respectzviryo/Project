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
	<script type="text/javascript"
		src="/Project/public/javascripts/prototype.js"></script>
</head>

<body class="main">

	<div class="user_label">
		<i>Your name:</i>
		<b><c:out value="${sessionScope.user}" /> </b>
	</div>
	<div id="main">
		<a href="/Project/photos.do" style="display: block; float: right;">back
			to photo list</a>
		<h1>
			Photo details
		</h1>

		<a title="click for the full-size version"
			href="/Project/upload/${requestScope[RequestSessionKeys.PHOTO].fileName}">
			<img width="100%"
				src="/Project/upload/${requestScope[RequestSessionKeys.PHOTO].fileName}" />
		</a>
		<br />
		<p>
			"
			<c:out value="${requestScope[RequestSessionKeys.PHOTO].description}"></c:out>
			" published on
			<c:out value="${requestScope[RequestSessionKeys.PHOTO].createdAt}"></c:out>
			, tagged
			<c:forEach var="tag"
				items="${requestScope[RequestSessionKeys.PHOTO].tags}"
				varStatus="lineInfo">
				<c:if test="${tag.name != null}">
					<a href="#"><c:out value="${tag.name}"></c:out> </a>&nbsp;
					</c:if>
			</c:forEach>
		</p>
		<div id="comments">
			<h2>
				Comments
			</h2>

			<c:forEach var="comment"
				items="${requestScope[RequestSessionKeys.PHOTO].comments}">
				
					<div class="comment">
						<p class="details">
							<c:out value="${comment.author}"></c:out>
							said
						</p>
						<p class="body">
							<c:out value="${comment.body}"></c:out>
						</p>
					</div>
				

			</c:forEach>






			<div id="updateDiv">
				<a onclick="document.getElementById('addComment').style.display='';"
					href="javascript:;">Add a comment</a>
				<html:form styleId="addComment" method="post"
					action="/addComment.do"
					onsubmit="new Ajax.Updater('updateDiv', '/Project/addComment.do', {asynchronous:true, evalScripts:false, parameters:Form.serialize(this)}); return false;"
					style="display:none;">
					<html:hidden styleId="photo_id" name="photo_id" property="photoId"
						value="${requestScope[RequestSessionKeys.PHOTO].id}" />
					<label for="author">
						Your name
					</label>
					<br />
					<html:text property="author" styleId="author"></html:text>
					<html:textarea property="body" styleId="body"></html:textarea>
					<br />
					<html:submit></html:submit>
				</html:form>
			</div>
		</div>

		<div id="footer">
			java development
		</div>

	</div>

</body>
</html:html>