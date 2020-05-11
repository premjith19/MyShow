<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>My Show a Entertainment Category Flat Bootstarp responsive Website Template | Home :: w3layouts</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link rel="stylesheet" href="css/menu.css" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="My Show Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->
<link href='http://fonts.googleapis.com/css?family=Oxygen:400,700,300' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>
	<!-- start menu -->
<link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/megamenu.js"></script>
<script>$(document).ready(function(){$(".megamenu").megamenu();});</script>
<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
<link rel="stylesheet" href="css/font-awesome.min.css" />
<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
		    <script type="text/javascript">
			    $(document).ready(function () {
			        $('#horizontalTab').easyResponsiveTabs({
			            type: 'default', //Types: default, vertical, accordion           
			            width: 'auto', //auto or any width like 600px
			            fit: true   // 100% fit in a container
			        });
			    });
</script>
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
<script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
<![endif]-->
<!---- start-smoth-scrolling---->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
				});
			});
		</script>
<!---- start-smoth-scrolling---->


<style>
table, th, td {
    border: 0.5px solid black;
}
</style>

</head>
<body>

	             <%@ page import ="java.sql.*" %>			
		
	<%@ include file="/includes/adminheader.jsp" %>  
		
<%
Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
			   
			    Statement st = con.createStatement();
    ResultSet rcon=st.executeQuery("select * from payment");
	

int count=0;

%>




	<h4>Booking List</h4>
	<br><br>
	<table style="width:100%">
  <tr>
    <th>Sr-No</th>

	<th>Pid</th>
    <th>Sid</th>
	<th>Seat</th>
    <th>Card No</th>
	<th>Card Name</th>
	<th>Expire</th>
	<th>Uid</th>
	<th>Amount</th>
	<th>Date</th>
	


	</tr>
	
	<%
	while(rcon.next())
{
	count++;
	
	%>
  <tr>
    <td><%=count%></td>
    <td><%=rcon.getString("pid")%></td>
	<td><%=rcon.getString("sid")%></td>
    <td><%=rcon.getString("seat")%></td>
	<td><%=rcon.getString("cardno")%></td>
    <td><%=rcon.getString("cardname")%></td>
	<td><%=rcon.getString("expiremonth")%>-<%=rcon.getString("expireyear")%></td>
	<td><%=rcon.getString("uid")%></td>
    <td><%=rcon.getString("amount")%></td>
	<td><%=rcon.getString("pdate")%></td>

	
  </tr>
  
  <%
  
}
  
  
  %>

</table>
		
		
		
		
			
			
		
	<%@ include file="/includes/adminfooter.jsp" %>  
		
		
</body>
</html>