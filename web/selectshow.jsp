<%-- 
    Document   : selectshow
    Created on : 3 Sep, 2015, 10:10:56 AM
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
        <h1>Hello World!</h1>
        				     <%@ page import ="java.sql.*" %>	
<%
    		
			  	Class.forName("com.mysql.jdbc.Driver");
       Connection cont=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
			   
			    Statement stmt = cont.createStatement();
				    ResultSet rt;
                                    rt=stmt.executeQuery("select Distinct lang from movie");
String lang="";




int [] arr=new int[10];
arr[0]=1;
arr[1]=2;
arr[2]=3;

stmt.executeUpdate("insert into schedule(11.00) values('"+arr+"')");








        while(rt.next())
        {
            
              out.println(rt.getString("lang"));
             lang=rt.getString("lang");
             		    Statement stm = cont.createStatement();
          ResultSet rp=stm.executeQuery("select mname from movie where lang='"+rt.getString("lang")+"'");
        while(rp.next())
        {
        out.println(rp.getString("mname"));
        }
        
        
        }
                                    
                                    
                                    
                                    
        %>
        
        
        
    </body>
</html>
