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
		<h1>
			photo list
		</h1>
		<div style="margin-right: 270px;">
			<table cellspacing="0" class="main">
				<thead>
					<tr>
						<th>
							Photo
						</th>
						<th>
							Description
						</th>
						<th>
							Tag string
						</th>
						<th>
							Created at
						</th>
						<th>
							Actions
						</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item"
						items="${requestScope[RequestSessionKeys.TASK_LIST]}"
						varStatus="lineInfo">
						<tr>
							<td>
								<img src="/Project/upload/${item.fileName}"
									style="height: 100px;" />
							</td>
							<td>
								${item.description}
							</td>

							<td>
								<c:forEach var="tag" items="${item.tags}" varStatus="lineInfo">
									<c:if test="${tag != null}">
										<c:out value="${tag.name}"></c:out>
									</c:if>
								</c:forEach>
							</td>

							<td>
								${item.createdAt}
							</td>

							<td>
								<a href="/Project/editTask.do?id=${item.id}"> <img
										src="/Project/public/images/edit.png" border="0" /> </a>
								<a href="/Project/removeTask.do?id=${item.id}"> <img
										src="/Project/public/images/delete.png" border="0" /> </a>

							</td>
						</tr>
					</c:forEach>
				</tbody>
				<tfoot>
					<tr>
						<th colspan="5">
							1 result
						</th>
					</tr>
				</tfoot>
			</table>

			<br />
			<input type="button" value="create"
				onclick="document.location.href='/Project/addTask.do'"
				class="create-button">
		</div>

	</div>



</body>
</html:html>