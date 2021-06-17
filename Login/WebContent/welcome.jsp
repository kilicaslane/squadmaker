<%@page import="com.squadmaker.entities.user"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<% user user = (user) session.getAttribute("logUser");
    if(user==null){
        response.sendRedirect("index.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
 Welcome, <%= user.getUsername() %></h1>
<h3>
Your Account ID: <%= user.getId() %> </h3>
<h3>
Your IGN: <%= user.getIgn() %> </h3>
<h3>
Your LI: <%= user.getLi() %> </h3>
<h3>
<h4><a href="signupform.jsp" >Sign up Weekly Trainings</h4>

<button><a href="logoutservlet">Log Out</a></button>
    </body>
</html>
