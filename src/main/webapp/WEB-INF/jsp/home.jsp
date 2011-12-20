<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>michael rice</title>
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/michaelrice.css" />" />
</head>
<body>

	<p>Hello. I am a web developer and <a href="<c:url value="/law/" />">a part-time intellectual property attorney</a>.</p>

	<p>Please forgive the dust. I am building this site from the ground up. The project is open source at <a href="https://github.com/mrice/michaelricelaw">https://github.com/mrice/michaelricelaw</a>.</p>
	
	<p><strong>Recent blog posts</strong></p>
	
	<c:forEach items="${entries}" var="entry">
		<div class="blogEntry">
			<p><strong>${entry.title}</strong></p>
			<p>${entry.body}</p>
		</div>
	</c:forEach>
	
	
	<p>Page generated: <fmt:formatDate value="${currentTime}" type="time"/> </p>
	
	
</body>
<script type="text/javascript">

  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-27453964-1']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</script>
</html>