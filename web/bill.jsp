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
int count =0;
        String time=request.getParameter("time");
        
        String [] x=new String[200];
        
        for(int j=1;j<=100;j++)
        {
            if(request.getParameter("checkbox"+j+"")!=null)
            {
               
            x[count]=request.getParameter("checkbox"+j+"");
             count++;
            }
         }
        
        
        
        String seat="";
        String sid=request.getParameter("sid");
        
        for(int k=0;k<count;k++)
        {
            seat=seat+x[k]+";";
             }
       
		Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
			   
			    Statement st = con.createStatement();
    //ResultSet rs;
      
	int i=0;
	
	
	
	
	
	if (i > 0) {
        //session.setAttribute("userid", user);
            //window.location ="movieselectshow.jsp?mid="+mid+"&&mdate="+mdate;
response.sendRedirect("moviepayment.jsp?sid="+sid+"&&seat="+seat+"&&time="+time+"&&qty="+count);
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
response.sendRedirect("moviepayment.jsp?sid="+sid+"&&seat="+seat+"&&time="+time+"&&qty="+count);
    }

        
        
        
        
%>
        
    </body>
</html>
