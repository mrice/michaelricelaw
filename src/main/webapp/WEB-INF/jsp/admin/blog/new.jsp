<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>new blog entry</title>
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/michaelrice.css" />" />
</head>
<body>
	<form method="post">
		<p>Title: <input type="text" name="title" value="${entry.title}" /> <br/>
			Url: <input type="text" name="urlPart" value="${entry.urlPart}" /> </p>
		<p>Body:<br/>
		<textarea cols="60" rows="16" name="body">${entry.body}</textarea></p>
		<p>Entry id: ${entry.id}</p>
		<p><input type="submit" value="save" /></p>
		
	</form>
</body>
</html>