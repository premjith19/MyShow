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
    
    String uname = request.getParameter("movie");
    String pwd = request.getParameter("mdate");
    
    
    
    out.println(uname);
        out.println(pwd);
        
    %>
    
<form action="test.jsp" method="POST">
    <select name="myselect" id="myselec">
        <option value="1">One</option>
        <option value="2">Two</option>
        <option value="3">Three</option>
        <option value="4">Four</option>
    </select>

    <select name="myselect" id="myselect" onchange="this.form.submit()">
        <option value="1">One</option>
        <option value="2">Two</option>
        <option value="3">Three</option>
        <option value="4">Four</option>
    </select>
</form>
    <%
    Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
    
    Statement st = con.createStatement();
    ResultSet rs=st.executeQuery("select DATE_FORMAT(date, '%d/%m/%Y') from review where rid=8");
		
    String demo="";
    while(rs.next())
               {
        demo=rs.getString(1);
		
		
		%>
		
		<h2><%=demo%></h2>
		<%
		
		
    }
	String demo2="";
ResultSet rsst=st.executeQuery("SELECT DATE_FORMAT(CURDATE(), '%d/%m/%Y')");
	
	while(rsst.next())
	{
		demo2=rsst.getString(1);
	}
	String h=demo.substring(0,demo.length()-4);
	String g=demo2.substring(0,demo.length()-4);
	
	if(h==g)
    
	{
		%>
                
                <h3>Success</h3>
                <%
	}
		%>
		
		<h2><%=h%></h2>
		<h2><%=g%></h2>
		
		<%
	
	
    con.close();
	
	
	
	
	
%>
        

    </body>
</html>
