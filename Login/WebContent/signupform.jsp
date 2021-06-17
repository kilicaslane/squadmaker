<%@page import="com.squadmaker.entities.user"%>
<% user user = (user) session.getAttribute("logUser");
    if(user==null){
        response.sendRedirect("index.jsp");
    }
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignupFrom</title>
</head>
<body bgcolor="white">
        <form method="post" action="signupservlet"> /*degisecek*/
            <center>
            <table border="1" width="30%" cellpadding="5">
                <thead>
                    <tr>
                        <th>Sign Up Form</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
						<td>Username</td>                        
						<td><%= user.getUsername() %></td>
                    </tr>
                    <tr>
                        <td>IGN</td>
						<td><%= user.getIgn() %></td>
                    </tr>
					<tr>
                        <td>Support Roles</td>
                    </tr>
					<tr>
                        <td>Druid</td><td><input type="checkbox" name="druid" value="druid" /></td>
                    </tr>
					<tr>
                        <td>Hfb</td><td><input type="checkbox" name="hfb" value="hfb" /></td>
                    </tr>
					<tr>
                        <td>CTank</td><td><input type="checkbox" name="ctank" value="ctank" /></td>
                    </tr>
					<tr>
                        <td>Boon+Dps</td>
                    </tr>
					<tr>
						<td>Qfb</td><td><input type="checkbox" name="qfb" value="qfb" /></td>
                    </tr>
					<tr>
                       <td>BoonC</td> <td><input type="checkbox" name="boonc" value="boonc" /></td>
                    </tr>
					<tr>
                        <td>QChrono</td><td><input type="checkbox" name="qchrono" value="qchrono" /></td>
                    </tr>
					<tr>
                        <td>Alacren</td><td><input type="checkbox" name="alacren" value="alacren" /></td>
                    </tr>
					<tr>
                        <td>Dps</td>
                    </tr>
					<tr>                        
						<td>Banners</td><td><input type="checkbox" name="banner" value="banner" /></td>
                    </tr>
					<tr>
                        <td>PowerDps</td><td><input type="checkbox" name="powerdps" value="powerdps" /></td>
                    </tr>
					<tr>
                        <td>CondiDps</td><td><input type="checkbox" name="condidps" value="condidps" /></td>
                    </tr>
						 <td>SpecialRoles</td><td><input type="checkbox" name="special" value="special" /></td>
                    <tr>
					</tr>
						 <td>Training Days</td>
                    <tr>
					<tr>                        
						<td>Tuesday</td><td><input type="checkbox" name="tuesday" value="tuesday" /></td>
                    </tr>
					<tr>                        
						<td>Thursay</td><td><input type="checkbox" name="thursday" value="thursday" /></td>
                    </tr>
					<tr>                        
						<td>Saturday</td><td><input type="checkbox" name="saturday" value="saturday" /></td>
                    </tr>
                        <td><input type="submit" value="Submit" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">Already registered!! <a href="index.jsp">Login Here</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>
    </body>
</html>