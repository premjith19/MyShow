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
		<%@ page import="javax.mail.internet.*,javax.activation.*"%>
		<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
		

		
		
		
		
<%
    
    String fname = request.getParameter("fname"); 
    String lname = request.getParameter("lname"); 
      
    String email = request.getParameter("email");
    String dob = request.getParameter("dob");
	String gender = request.getParameter("sex");
    String mobile = request.getParameter("phone");
	String img=request.getParameter("image");
	
	
			Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
    
	
	    String image="";
    if(img==null)
    {
    Statement swt=con.createStatement();
    ResultSet rs=swt.executeQuery("select * from user where fname="+session.getAttribute("username")); 
    while(rs.next())
    {
        image=rs.getString("image");
    }
    
    }
    
    else{
     image="images/"+img;
    }
    
	
	
    Statement st = con.createStatement();
	int i = st.executeUpdate("update user set fname='" + fname + "',lname='"+lname+"',gender='"+gender+"',dob='"+dob+"',email='" + email + "',mobile='" + mobile + "',image='"+image+"' where fname='"+session.getAttribute("username")+"'");
	
	if (i > 0) {
        //session.setAttribute("userid", user);
response.sendRedirect("editprofile.jsp?msg=Update Successful");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("index.jsp");
    }
	
	
	
		
%>
        

    </body>
</html>
