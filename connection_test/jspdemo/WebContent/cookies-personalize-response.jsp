<html>
<head>
<title>Confirmation</title>
</head>
<%
	String favlang = request.getParameter("favoriteLanguage");
	Cookie theCookie = new Cookie("myApp.favoriteLanguage", favlang);
	theCookie.setMaxAge(60 * 60 * 24 * 365);
	response.addCookie(theCookie);
%>
<body>

Thanks! We select your language to: ${param.favoriteLanguage}

<br/>

<a href="cookies-homepage.jsp">return to homepage</a>

</body>
</html>