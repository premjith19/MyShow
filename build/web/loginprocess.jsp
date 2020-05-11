<%-- 
    Document   : loginprocess
    Created on : Jun 12, 2015, 4:44:26 PM
    Author     : USER
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
    
    String email = request.getParameter("email");
    String pwd = request.getParameter("pwd");
    
         Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
    
    Statement st = con.createStatement();
    ResultSet rs=st.executeQuery("select email,pwd,fname from user where email='"+email+"' and pwd='"+pwd+"'");
    
    while(rs.next())
               {
        if(rs.getString(1).equals("raj.shah1593@gmail.com")&& rs.getString(2).equals("admin"))
               {
			   session.setAttribute("username", rs.getString(3));
        response.sendRedirect("admin.jsp");
    }
           else if(rs.getString(1).equals(email)&& rs.getString(2).equals(pwd))
               {
			   session.setAttribute("username", rs.getString(3));
        response.sendRedirect("index.jsp");
    }
    }
    con.close();
%>
        

    </body>
</html>
