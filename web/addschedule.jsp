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

</head>
<body>

	             <%@ page import ="java.sql.*" %>			
		
	<%@ include file="/includes/adminheader.jsp" %>  
		


	
	
	
	
		
		
		
		
			
			
			
		<div class="footer-top-strip">
			
						<form action="addscheduleprocess.jsp" method="post">
		

<table style="width:100%">
  
  <tr>
    <td><center><h1>Add Schedule</h1></center></td>
    <td>
	<%
	
	String msg=request.getParameter("msg");
	if(msg!=null)
		
	
	{
	%>
	
	
	<%=msg%>
	</td>
	<%}%>
</tr>

<%


		  	Class.forName("com.mysql.jdbc.Driver");
       Connection cont=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
			   
			    Statement stmt = cont.createStatement();
				    ResultSet rth,rmo;
					rth=stmt.executeQuery("select * from theatre");
   

%>
<tr>
    <td><h4>Theatre Name</h4></td>
    <td><select name="tname">
												<option value="">Select Theatre</option>
						<%
						while(rth.next())
						{
						%>
						<option value="<%=rth.getString("tid")%>"><%=rth.getString("tname")%>(<%=rth.getString("area")%>)</option>
						
						<%}%>
						
</select>
</td>

<%

					rmo=stmt.executeQuery("select * from movie");
   
%>
    <td><h4>Movie Name</h4></td>
    <td><select name="mname">
							<option value="">Select Movie</option>
	<%
	while(rmo.next())
	{
	%>

						<option value="<%=rmo.getString("mid")%>"><%=rmo.getString("mname")%></option>
						
	<%}%>
</select></td></tr>



<tr>
    <td><h4>Screen</h4></td>
    <td><select name="screen">
						<option value="">Select Screen</option>
						<option>1</option>
						<option>2</option>						
						<option>3</option>
						<option>4</option>						
						<option>5</option>


</select></td>
	<td><h4>Date</h4></td>
<td><input type="date" name="rdate" size="35"></td>
</tr>

<tr>
    <td><h4>Time</h4></td>

<td>

<input type="checkbox" name="time11" value="11:00"><label>11:00 AM</label>
<input type="checkbox" name="time3" value="15:00"><label>3:00 PM</label>
<input type="checkbox" name="time6" value="18:00"><label>6:00 PM</label>
<input type="checkbox" name="time9" value="21:00"><label>9:00 PM</label>
</td>
</tr>					 



<tr>
<td>Amount</td>
<td><input type="text" name="amount"></td>

<td><input type="submit" value="submit"></td>
</tr>






</table>

		

						</form>
			
			
			
		</div>
		</div>
		
				
	<%@ include file="/includes/adminfooter.jsp" %>  
			
</body>
</html>