<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>Hello World!</title>
<p> p.s : I've said hello <s:property value="helloCount" /></p>
</head>
<body>
	<h1><s:text name="greeting" /></h1>

	<h2><s:property value="messageStore.message"/> </h2>
	
	<p>
	<s:property value="messageStore" />
	</p>
	
		<p>
	<s:property value="userName" />
	</p>
</body>
</html>