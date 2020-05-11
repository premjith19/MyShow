<%-- 
    Document   : reviewprocess
    Created on : Jun 19, 2015, 12:02:34 PM
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
	    <%@ page import ="java.sql.*"%>
		
		<%@ page import="java.util.*"%>
		<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>

		
<%
    
	String mid = request.getParameter("mid");
    //String name = session.getAttribute("username"); 
    String review = request.getParameter("review");
   	String rate=request.getParameter("rate");


	
			
					Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
			   
			    Statement st = con.createStatement();
    ResultSet rs=st.executeQuery("select * from user where fname='"+session.getAttribute("username")+"'");
	
rs.next();


	
    int i = st.executeUpdate("insert into review(mid,name,review,rate,image) values ('" + mid + "','"+session.getAttribute("username")+"','" + review + "','"+rate+"','"+rs.getString("image")+"')");
    
	
	
	
	
	
	
	
	
	if (i > 0) {

response.sendRedirect("moviesingle.jsp?mid="+mid+"");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("error.jsp");
    }

	
	
%>
	
	
	
	
    </body>
</html>
