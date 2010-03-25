<html>

<head>
<title>Success</title>
</head>

<body>
<%
String fileName=(String)request.getAttribute("fileName");
%>

<p align="center"><font size="5" color="#000080">File Successfully Received</font></p>
<p align="center"><a href="upload/<%=fileName%>">Click here to download</a></p>
</body>

</html>