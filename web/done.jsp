<%-- 
    Document   : bill
    Created on : 22 Aug, 2015, 11:53:32 PM
    Author     : Premjith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%@ page import ="java.sql.*" %>			
	
        <%
        String sid=request.getParameter("sid");
        out.println(sid);
        
        
        
%>
        
    </body>
</html>
