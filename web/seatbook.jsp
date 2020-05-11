<%-- 
    Document   : seatbook
    Created on : Aug 16, 2015, 3:19:01 PM
    Author     : USER
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
            //get the seat nos using request parameters in string
            String select = "1,2,3";
            List<Integer> selected = new ArrayList<Integer>();
            int index;
            do {
                index = select.indexOf(',');
                if(index == -1){
                    index = select.length();
                }
                selected.add(Integer.parseInt(select.substring(0, index)));
                if(select.length() > (index))
                {
                    select = select.substring(index+1, select.length());
                }
                else
                    break;
            }while(true);
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cinema", "root", "");
            Statement st = con.createStatement();
            
            //add where clause to just obtain one row from the booking table
            ResultSet rs = st.executeQuery("select * from booking");
            while (rs.next()) {
                String seats = rs.getString("seat");
                StringBuffer booking = new StringBuffer(seats);
                for(int a : selected) {
                    booking.replace(a-1, a, "1");
                }
                seats = booking.toString();
                //update query to change the value
                
                //we want to book for only one row
                break;
            }
        %>
    </body>
</html>
