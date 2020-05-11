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

        <%
int count =0;
        
        
        String [] x=new String[200];
        
        for(int j=1;j<=100;j++)
        {
            if(request.getParameter("checkbox"+j+"")!=null)
            {
                count++;
            x[count]=request.getParameter("checkbox"+j+"");
            
            }
         }
        
        for(int k=1;k<=count;k++)
        {

       
        %>
<h1><%=x[k]%></h1>
        
        <%        }

        StringBuffer sb=new StringBuffer("");
        
        int[] d=new int[101];
        int t=0;
        for(int g=1;g<=100;g++)
        {
            if(x[g]!=null)
            {

            }
            
        }
        
        
        %>
    </body>
</html>
