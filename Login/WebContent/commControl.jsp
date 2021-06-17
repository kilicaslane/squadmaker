<%@page import="com.squadmaker.entities.user"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<% user user = (user) session.getAttribute("commanderLog");
    if(user==null){
        response.sendRedirect("commanderlogin.jsp");
    }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Training Control</title>
</head>
<body>
	<h1></h1>
</body>
</html>