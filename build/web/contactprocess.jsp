<%-- 
    Document   : registerprocess.jsp
    Created on : Jun 12, 2015, 4:31:43 PM
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
		<%@ page import="java.io.*,java.util.*,javax.mail.*"%>
		
<%
    
    String name = request.getParameter("name"); 
   
    String email = request.getParameter("email");
    String mobile = request.getParameter("phone");
	    String subject = request.getParameter("subject");
		    String message = request.getParameter("comments");
	

	
	
			Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
    
    Statement st = con.createStatement();

	int i = st.executeUpdate("insert into contactus(name,mobile, email,subject,message) values ('" + name + "','"+mobile+"','" + email + "','"+subject+"','" + message + "')");
    
	
	
	if (i > 0) {
        //session.setAttribute("userid", user);
response.sendRedirect("index.jsp?msg=Register Successful..!!Now u can Login..:)");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("index.jsp");
    }
	
	
	
		
%>
        

    </body>
</html>
