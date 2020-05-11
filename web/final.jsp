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
	
								                                   <%@ page import="java.text.*" %>
				<%@ page import="java.io.*,java.util.Date, javax.servlet.*" %>
        <%

        String time=request.getParameter("time");
        String seat=request.getParameter("seat");
        String sid=request.getParameter("sid");
        
		String cardno=request.getParameter("cardno");
		String cardname=request.getParameter("cardname");
			String month=request.getParameter("month");
			String year=request.getParameter("year");
String qty=request.getParameter("qty");
			String amount=request.getParameter("amount");
		
						
		Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
								int i;
	 
			   
			    Statement stmt = con.createStatement();
				             ResultSet rut=stmt.executeQuery("select * from user where fname='"+session.getAttribute("username")+"'");
    
						rut.next();
						String uid=rut.getString("uid");
                                Date dNoln = new Date( );
     SimpleDateFormat vfat= new SimpleDateFormat ("yyyy-MM-dd");
     
													
										
								i=stmt.executeUpdate("insert into ticketbook(uid,sid,seat,qty,amount,tkdate) values('"+uid+"','"+sid+"','"+seat+"','"+qty+"','"+amount+"','"+vfat.format(dNoln)+"')");
							Statement stmtz = con.createStatement();
				
							i=stmtz.executeUpdate("insert into payment(sid,seat,cardno,cardname,expiremonth,expireyear,uid,amount,pdate) values('"+sid+"','"+seat+"','"+cardno+"','"+cardname+"','"+month+"','"+year+"','"+uid+"','"+amount+"','"+vfat.format(dNoln)+"')");
								
								
								
								
								
		
			   
			    Statement st = con.createStatement();
    					   
                             ResultSet rat=st.executeQuery("select * from booking where sid="+sid);
                             
								if(!rat.next())
                            {
												    Statement stg = con.createStatement();
  
                                        i = stg.executeUpdate("insert into booking(sid,seats,quantity,amount) values ('"+sid+"','" + seat + "','" + qty + "','" + amount + "')");
    
                            }
                            else
                                
                            {
                                String temp=rat.getString("seats");
                                seat=temp+seat;
										    Statement sty = con.createStatement();
  
                             i = sty.executeUpdate("update booking set seats='"+seat+"' where sid="+sid);
    
                            } 
	
	
	
	if (i > 0) {
        //session.setAttribute("userid", user);
            //window.location ="movieselectshow.jsp?mid="+mid+"&&mdate="+mdate;
response.sendRedirect("done.jsp?sid=Success");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
response.sendRedirect("moviepayment.jsp?sid="+sid+"&&seat="+seat+"&&time="+time+"&&qty="+qty);
    }

																
																
        
        
        
%>
        
    </body>
</html>
