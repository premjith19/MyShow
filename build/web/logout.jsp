<%-- 
    Document   : logout
    Created on : Jun 13, 2015, 12:32:25 PM
    Author     : Tejabhai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%
session.setAttribute("username", null);
session.invalidate();
response.sendRedirect("index.jsp");
%>
    </body>
</html>
