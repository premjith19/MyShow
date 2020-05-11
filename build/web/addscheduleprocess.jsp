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
    
	Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
			   
			    Statement st = con.createStatement();
    
	
    String mid = request.getParameter("mname");
    String tid = request.getParameter("tname");	
    String screen = request.getParameter("screen"); 
	
    String rdate = request.getParameter("rdate");
    String time11 = request.getParameter("time11");    
	    String time3 = request.getParameter("time3");
		    String time6 = request.getParameter("time6");    
	    String time9 = request.getParameter("time9");
		
	String amount = request.getParameter("amount");   
	      


 String time="";
 if(time11!=null)
 {
	st.executeUpdate("insert into movieshow(tid,mid,showtime,sdate) values ('" + tid + "','" + mid + "','" + time11 + "','" + rdate + "')");
	 time=time+time11+";";

 
 }
  if(time3!=null)
 {
	st.executeUpdate("insert into movieshow(tid,mid,showtime,sdate) values ('" + tid + "','" + mid + "','" + time3 + "','" + rdate + "')");	
	time=time+time3+";";
 } if(time6!=null)
 {
	 st.executeUpdate("insert into movieshow(tid,mid,showtime,sdate) values ('" + tid + "','" + mid + "','" + time6 + "','" + rdate + "')");
	 time=time+time6+";";
 } if(time9!=null)
 {
	 st.executeUpdate("insert into movieshow(tid,mid,showtime,sdate) values ('" + tid + "','" + mid + "','" + time9 + "','" + rdate + "')");
	 time=time+time9+";";
 }
 
 
 
 	//ResultSet rs;
    int i = st.executeUpdate("insert into schedule(tid,mid,screen,rdate,time,amount) values ('" + tid + "','" + mid + "','" + screen + "','" + rdate + "','" + time + "','" + amount + "')");
    
	
	
	
	
	
	if (i > 0) {
        //session.setAttribute("userid", user);
response.sendRedirect("addschedule.jsp?msg=Movie added Successfully");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("admin.jsp");
    }

 
%>
        

    </body>
</html>
