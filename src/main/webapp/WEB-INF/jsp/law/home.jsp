<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>michael rice law - software attorney</title>
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/michaelrice.css" />" />
</head>

<body>
	<p>Hi. I'm <strong>Michael Rice</strong>. I'm an attorney licensed to practice in Washington State.</p>
	
	<p>I focus my practice on <strong>intellectual property law</strong> for software companies and open source projects. 
	You can retain me to help you with non-disclosure agreements, employee assignment agreements, license agreements and disputes, copyright, trademark, and some limited patentability questions, and much more. 
	I charge a <strong>flat fee of $250 per month</strong>, and I'll guarantee at least 5 hours of work doing any of the foregoing.</p>  
	
	<p>I also will give you pro bono (free) time if you're running an <strong>open source project</strong>.</p>
	
	<p>Contact me: <br /> 
	<a href="mailto:attorney@michaelrice.com">attorney@michaelrice.com</a><br/>
	Skype at michaelrubenrice<br/>
	Phone at (206) 745-5001<br/>
	Freenode as michaelrice<br/> 
	By mail to 93 S. Jackson St., #60124, Seattle, Washington 98104.</p>
	
	<p>Page generated: <fmt:formatDate value="${currentTime}" type="time"/> </p>
	
	<p>The code for this site is open sourced at <a href="http://github.com/mrice/michaelricelaw">github.com/mrice/michaelricelaw</a>.</p>
	
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