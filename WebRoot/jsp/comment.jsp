<%@ taglib uri="/WEB-INF/tld/c.tld" prefix="c"%>
<jsp:useBean id="RequestSessionKeys"
	class="ca.project.constants.RequestSessionKeys" />

<div class="comment">
	<p class="details">
	<c:out value="${requestScope[RequestSessionKeys.COMMENT].author}"></c:out>
		said
	</p>
	<p class="body">
	<c:out value="${requestScope[RequestSessionKeys.COMMENT].body}"></c:out>
	</p>
</div>