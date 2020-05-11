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
	       <%@ page import ="java.sql.*" %>	
            
            <script>

            
function goBack() {
    window.history.back();
}
   
function myFunction() {
    <%
        
        
        
			  	Class.forName("com.mysql.jdbc.Driver");
       Connection cont=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
	String time=request.getParameter("time");		   
       String sid=request.getParameter("sid");
			    Statement stmt = cont.createStatement();
				    ResultSet ry;
                                    ry=stmt.executeQuery("select * from booking where sid="+sid);
        
        if(ry.next())
        {
        String seating="";
        seating=ry.getString("seats");
         String[] seatlist=seating.split(";");
        int s[]=new int[seatlist.length];
        for(int i=0;i<seatlist.length;i++)
            
        {s[i]=Integer.parseInt(seatlist[i]);        
        }

        
        
        
        for(int i=1;i<=100;i++)
        {
            
            for(int j=0;j<seatlist.length;j++)
        {
                    if(i==s[j]){
%>


    document.getElementById("checkbox<%=i%>").checked = true;
document.getElementById('checkbox<%=i%>').style.backgroundColor = "blue";
    document.getElementById("checkbox<%=i%>").disabled = true;

    
    <%
                    }
    }
        }}
    %>
}
</script>
    </head>
    <body onload="myFunction()" background="images/movie2.jpg">
<div class="example">

    <form action="bill.jsp?sid=<%=sid%>&&time=<%=time%>" method="post">
        

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
     
            %>
     
     <td align="left"><input id="checkbox<%=seat%>" type="checkbox" name="checkbox<%=seat%>" value="<%=seat%>" ><label for="checkbox<%=seat%>"><%=seat%></label></td>
		  <%
     
        }
           %>
		   
		   </tr>          
</table>
      </div>
        
        
        
        <%}%><br>
                <img src="images/screen.png" style="width:710px;height:30px;">
                <br><br>
                <button onclick="goBack()">Go Back</button>
		<a><input type="submit" value="Continue.."><a>
		</form><br><br>
<img src="images/movie-theater-auditorium-540x360.jpg" style="width:710px;height:300px;">


</div>
    
  </body>
</html>
