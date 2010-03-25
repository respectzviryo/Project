<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>

<html:html>
<head>
	<title>Struts File Upload and Save Example</title>
	<html:base />
</head>
<body bgcolor="white">
	<html:form action="/FileUploadAndSave" method="post"
		enctype="multipart/form-data">
		<table>
			<tr>
				<td align="center" colspan="2">
					<font size="4">File Upload on Server</font>
			</tr>

			<tr>
				<td align="left" colspan="2">
					<font color="red"><html:errors />
					</font>
			</tr>


			<tr>
				<td align="right">
					File Name
				</td>
				<td align="left">
					<html:file property="theFile" />
				</td>
			</tr>


			<tr>
				<td align="center" colspan="2">
					<html:submit>Upload File</html:submit>
				</td>
			</tr>
		</table>


	</html:form>
</body>
</html:html>