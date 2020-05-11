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
    
    String fname = request.getParameter("fname"); 
   
    String email = request.getParameter("email");
    String pwd = request.getParameter("pwd");
    String mobile = request.getParameter("mobile");
	String image="images/web.png";

	String test;
	
			Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
    
    Statement st = con.createStatement();

	int i = st.executeUpdate("insert into user(fname,email,image,pwd,mobile) values ('" + fname + "','" + email + "','"+image+"','" + pwd + "','" + mobile + "')");
String msg="Register Successful..!!Now u can Login";
	
	
	
	
	
	
	
	if (i > 0) 
	{
		response.sendRedirect("index.jsp?msg="+msg);

    } 
	else 
	{
        response.sendRedirect("index.jsp?msg="+msg);
    }
	
	
	
		
%>
        

    </body>
</html>
