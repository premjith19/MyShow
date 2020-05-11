<%-- 
    Document   : seatselection
    Created on : 21 Aug, 2015, 8:38:15 PM
    Author     : Premjith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
            <link rel="stylesheet" href="stylesheet-image-based.css">
        <script>
            
            
 
function myFunction() {
    <%
        for(int i=1;i<=100;)
        {
%>
    document.getElementById("checkbox<%=i%>").disabled = true;
    
    <%
    i=i+2;
    }
    %>
}
</script>
    </head>
    <body onload="myFunction()">
<div class="example">
      <form action="bill.jsp" method="post">
        
        <%
		int no=74;
		char c;
        int seat=0;
        for(int i=1;i<=10;i++)
        {
			c=(char)no;
        %>
        <div>
			       <table style="width:50%">
  <tr>
           <td> <a><%=c%>  --> </a></td>
		
            <%
            no--;
for(int j=1;j<=10;j++)            
{
            seat++;
     if(seat%2==0)
     {
            %>
     
     <td align="right"><input id="checkbox<%=seat%>" type="checkbox" name="checkbox<%=seat%>" value="<%=seat%>" ><label for="checkbox<%=seat%>"><%=seat%></label></td>
		  <%}
     else{%>
     <td align="right"><input id="checkbox<%=seat%>" type="checkbox" name="checkbox<%=seat%>" value="<%=seat%>" checked="checked" ><label for="checkbox<%=seat%>"><%=seat%></label></td>
     <%
     }
        
        }
           %>
		   
		   </tr>          
</table>
      </div>
        
        
        
        <%}%>
		<input type="submit" value="Continue..">
		</form>
      </div>
    
  </body>
</html>
