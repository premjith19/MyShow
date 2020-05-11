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
      
<%
    
    String mname = request.getParameter("mname");
    String dname = request.getParameter("dname");	
    String cname = request.getParameter("cname"); 
	
    String duration = request.getParameter("duration");
    String genre = request.getParameter("genre");
    String desp = request.getParameter("desp");
    String lang = request.getParameter("lang");
    String rdate = request.getParameter("rdate");
    String mtype = request.getParameter("mtype");    
	    String poster = request.getParameter("poster");
	String trailer = request.getParameter("trailer");   
	      

		Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
			   
			    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into movie(mname,dname,cname,duration,genre,desp,lang,rdate,mtype,poster,trailer) values ('" + mname + "','" +dname + "','" + cname + "','" + duration + "','" + genre + "','" + desp + "','" + lang + "','" + rdate + "','" + mtype + "','" + poster + "','"+trailer+"')");
    
	
	
	
	
	
	
	
	
	if (i > 0) {
        //session.setAttribute("userid", user);
response.sendRedirect("addmovie.jsp?msg=Movie added Successfully");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("admin.jsp");
    }


	
 
%>
        

    </body>
</html>
