<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>My Show a Entertainment Category Flat Bootstarp responsive Website Template | Cinemas :: w3layouts</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
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
<link rel="stylesheet" href="css/menu.css" />
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
<%@ include file="/includes/header.jsp" %>
	
		<%@ page import ="java.sql.*" %>   
      
		
    
<!-- AddThis Smart Layers END -->

	<ol class="breadcrumb">
			  <li><a href="index.html">Home</a></li>
			  <li class="active">Cinemas Lists</li>
			</ol>
	<!----->
    <%
	
	String tid=request.getParameter("tid");
	Class.forName("com.mysql.jdbc.Driver");
       Connection conr=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
			   
			    Statement strd = conr.createStatement();
    
		ResultSet restd=strd.executeQuery("select * from theatre where tid='"+tid+"'");
	
	restd.next();
	
	%>    
	<div class="cinemas-list">
		<h3><%=restd.getString("tname")%> (<%=restd.getString("area")%>).</h3>
		<br/>
		<div class="col-md-6 cinema-list-left">
			
			               <%@ page import="java.text.*" %>
				<%@ page import="java.io.*,java.util.Date, javax.servlet.*" %>
                              <%
                                Date dNow = new Date( );
   SimpleDateFormat ft = new SimpleDateFormat ("E-d");
     SimpleDateFormat vft = new SimpleDateFormat ("yyyy-MM-dd");
     
Date dNo= new Date(new Date().getTime() + 60*60*24*1000);
   SimpleDateFormat ftt = new SimpleDateFormat ("E-d");
      SimpleDateFormat vftt = new SimpleDateFormat ("yyyy-MM-dd");
      
Date d= new Date(new Date().getTime() + 60*60*24*2000);
   SimpleDateFormat fttd = new SimpleDateFormat ("E-d");
      SimpleDateFormat vfttd = new SimpleDateFormat ("yyyy-MM-dd");
      
Date du= new Date(new Date().getTime() + 60*60*24*3000);
   SimpleDateFormat fttu = new SimpleDateFormat ("E-d");
      SimpleDateFormat vfttu = new SimpleDateFormat ("yyyy-MM-dd");

              


	Class.forName("com.mysql.jdbc.Driver");
       Connection connect=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
			   
			    Statement stcine = connect.createStatement();
    
		ResultSet rest=stcine.executeQuery("select * from movieshow where tid='"+tid+"'and sdate='"+vft.format(dNow)+"' group by mid");
		
			  %>	
			
			
					<div class="article">
			<div class="grid_3 grid_5">
				   <div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
			<ul id="myTab" class="nav nav-tabs" role="tablist">
			  <li role="presentation" class="active"><a href="#home" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true"><%=ft.format(dNow)%></a></li>
			<li role="presentation"><a href="#profile" role="tab" id="profile-tab" data-toggle="tab" aria-controls="profile"><%=ftt.format(dNo)%></a></li>
			<li role="presentation"><a href="#third" role="tab" id="profile-tab" data-toggle="tab" aria-controls="profile"><%=fttd.format(d)%></a></li>
			<li role="presentation"><a href="#fourth" role="tab" id="profile-tab" data-toggle="tab" aria-controls="profile"><%=fttu.format(du)%></a></li>			
			</ul>
			<div id="myTabContent" class="tab-content">
			<%
			while(rest.next())
			{
			
			
			    Statement stcinett = connect.createStatement();
    
		ResultSet restrs=stcinett.executeQuery("select * from movie where mid='"+rest.getString("mid")+"'");
		while(restrs.next())
			{
			
			
			%>
			
			  <div role="tabpanel" class="tab-pane fade in active" id="home" aria-labelledby="home-tab">				  
                 <h3><p class="m-s-t"><%=restrs.getString("mname")%>(<%=restrs.getString("mtype")%>)-<%=restrs.getString("lang")%></p></h3>
				 
				 <%
				 
				 Statement stcou = connect.createStatement();
    
		ResultSet restrso=stcou.executeQuery("select TIME_FORMAT(showtime,'%h:%i %p'),sid,tid,mid  from movieshow where mid='"+restrs.getString("mid")+"' and tid='"+tid+"' and sdate='"+vft.format(dNow)+"'");
		while(restrso.next())
			{
				 %>
				 <a class="show-time" href="seatselection.jsp?sid=<%=restrso.getString(2)%>&&time=<%=restrso.getString(1)%>"><%=restrso.getString(1)%></a>
				 
			<%}%>
			
				 <div class="clearfix"></div>
				
			  </div>
			
			<%}}%>
			
			

			<%
                        Statement stcinep = connect.createStatement();
    
		ResultSet restp=stcinep.executeQuery("select * from movieshow where tid='"+tid+"' and sdate='"+vftt.format(dNo)+"' group by mid");
		
			while(restp.next())
			{
			
			
			    Statement stcinext = connect.createStatement();
    
		ResultSet restrst=stcinext.executeQuery("select * from movie where mid='"+restp.getString("mid")+"'");
		while(restrst.next())
			{
			
			
			%>

			<div role="tabpanel" class="tab-pane fade" id="profile" aria-labelledby="profile-tab">
				

			     <h3><p class="m-s-t"><%=restrst.getString("mname")%>(<%=restrst.getString("mtype")%>)-<%=restrst.getString("lang")%></p></h3>
				 
				 <%
				 
				 Statement stcouz = connect.createStatement();
    
		ResultSet restrsot=stcouz.executeQuery("select TIME_FORMAT(showtime,'%h:%i %p'),sid,tid,mid from movieshow where mid='"+restrst.getString("mid")+"' and tid='"+tid+"' and sdate='"+vftt.format(dNo)+"'");
		while(restrsot.next())
			{
				 %>
				 <a class="show-time" href="seatselection.jsp?sid=<%=restrsot.getString(2)%>&&time=<%=restrsot.getString(1)%>"><%=restrsot.getString(1)%></a>
				 
			<%}%>
				 <div class="clearfix"></div>
				
			  </div>
			
			<%}}%>
			  
			  			  
			<%
                        Statement stcinept = connect.createStatement();
    
		ResultSet restpt=stcinept.executeQuery("select * from movieshow where tid='"+tid+"' and sdate='"+vfttd.format(d)+"' group by mid");
		
			while(restpt.next())
			{
			
			
			    Statement stcinext = connect.createStatement();
    
		ResultSet restrsta=stcinext.executeQuery("select * from movie where mid='"+restpt.getString("mid")+"'");
		while(restrsta.next())
			{
			
			
			%>

			<div role="tabpanel" class="tab-pane fade" id="third" aria-labelledby="profile-tab">
				

			     <h3><p class="m-s-t"><%=restrsta.getString("mname")%>(<%=restrsta.getString("mtype")%>)-<%=restrsta.getString("lang")%></p></h3>
				 
				 <%
				 
				 Statement stcouza= connect.createStatement();
    
		ResultSet restrsota=stcouza.executeQuery("select TIME_FORMAT(showtime,'%h:%i %p'),sid,tid,mid from movieshow where mid='"+restrsta.getString("mid")+"' and tid='"+tid+"' and sdate='"+vfttd.format(d)+"'");
		while(restrsota.next())
			{
				 %>
				 <a class="show-time" href="seatselection.jsp?sid=<%=restrsota.getString(2)%>&&time=<%=restrsota.getString(1)%>"><%=restrsota.getString(1)%></a>
				 
			<%}%>
				 <div class="clearfix"></div>
				
			  </div>
			
			<%}}%>	

			  <div role="tabpanel" class="tab-pane fade" id="fourth" aria-labelledby="fourth-tab">
				 <p class="m-s-t">INOX: inoxoxox Mall, Chicago</p>
				 <a class="show-time" href="movie-select-show.html">12:45 PM</a><a class="show-time" href="movie-select-show.html">06:30 PM</a>
				 
				 
<div class="clearfix"></div>
				 
			  </div>
			
			</div>
			
			
			
			
		   </div>
		  </div>
		</div>
			
			
			
			
			
			
			
			
			
		</div>
		
		
		
		<div class="clearfix"></div>
	</div>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	</div>
		<div class="footer">
			<div class="col-md-3 footer-left">
				<div class="f-mov-list">
					<h4>Latest Movies</h4>
					<ul>
						<li><a href="now-showing.html">Now Showing</a></li>
						<li><a href="comming-soon.html">Coming Soon</a></li>
						<li><a href="celebrities.html">Movie Celebrities</a></li>
					</ul>
					<div class="clearfix"></div>
				</div>
				<div class="f-mov-list">
					<h4>Movie Reviews</h4>
					<ul>
						<li><a href="404.html" target="target_blank">Entertainment News</a></li>
						<li><a href="blog.html" target="target_blank">Rajeev Masand</a></li>
						<li><a href="blog.html" target="target_blank">Film Reviews</a></li>
						<li><a href="write-us.html" target="target_blank">Guest Blogging</a></li>
					</ul>
					<div class="clearfix"></div>
				</div>
				<div class="f-mov-list">
					<h4>Movie Trailers</h4>
					<ul>
						<li><a href="trailers-now-showing.html">Now Showing</a></li>
						<li><a href="trailers-comming-soon.html">Coming Soon</a></li>						
					</ul>
					<div class="clearfix"></div>
				</div>
				</div>
			<div class="col-md-3 footer-left">
				<div class="f-mov-list">
					<h4>Cinemas & Regions</h4>
					<ul>
						<li><a href="regions.html">All Regions</a></li>
						<li><a href="cinema-chain.html">Cinema Chains</a></li>
						<li><a href="cinemas.html">Cinemas</a></li>						
					</ul>
					<div class="clearfix"></div>
				</div>
				<div class="f-mov-list">
					<h4>Movies by Language</h4>
					<ul>
						<li><a href="movies.html">Hindi</a></li>
						<li><a href="movies.html">English</a></li>
						<li><a href="movies.html">Marathi</a></li>
						<li><a href="movies.html">Bengali</a></li>
						<li><a href="movies.html">Tamil</a></li>
						<li><a href="movies.html">Telugu</a></li>
						<li><a href="movies.html">Malayalam</a></li>
						<li><a href="movies.html">Bhojpuri</a></li>
						<li><a href="movies.html">Kannada</a></li>					
					</ul>
					<div class="clearfix"></div>
				</div>
				</div>
			<div class="col-md-3 footer-left">
				<div class="f-mov-list">
					<h4>Exclusives</h4>
					<ul>
						<li><a href="donate.html">Book A Smile</a></li>
						<li><a href="vochers.html">Corporate Vouchers</a></li>
						<li><a href="gift-cards.html">Gift Cards</a></li>
					</ul>
					<div class="clearfix"></div>					
				</div>	
				<div class="f-mov-list">
					<h4>Help</h4>
					<ul>
						<li><a href="site-map.html">Sitemap</a></li>
						<li><a href="feed-back.html">Feedback</a></li>
						<li><a href="faq.html">FAQs</a></li>
						<li><a href="terms-and-conditions.html">Terms and Conditions</a></li>
						<li><a href="privacy-policy.html">Privacy Policy</a></li>
					</ul>
					<div class="clearfix"></div>
				</div>			
			</div>
			<div class="col-md-3 footer-left">
				<div class="f-mov-list">
					<h4>Movies by Genre</h4>
					<ul>
						<li><a href="movies.html">Action</a></li>
						<li><a href="movies.html">Romance</a></li>
						<li><a href="movies.html">Comedy</a></li>
						<li><a href="movies.html">Adult</a></li>
						<li><a href="movies.html">Adventure</a></li>
						<li><a href="movies.html">Classic</a></li>
						<li><a href="movies.html">Crime</a></li>
						<li><a href="movies.html">Drama</a></li>
						<li><a href="movies.html">Family </a></li>
						<li><a href="movies.html">Fantasy</a></li>
						<li><a href="movies.html">Musical</a></li>
						<li><a href="movies.html">Mystery</a></li>
						<li><a href="movies.html">Suspense</a></li>
						<li><a href="movies.html">Thriller</a></li>
					</ul>
					<div class="clearfix"></div>
				</div>
			</div>
			<div class="clearfix"></div>
			<div class="col-md-12">
			<div class="footer-right">
				<div class="follow-us">
					<h5 class="f-head">Follow us</h5>
					<ul class="social-icons">
						<li><a href="#"><i class="fa fa-facebook"></i></a></li>
						<li><a href="#"><i class="fa fa-twitter"></i></a></li>
						<li><a href="#"><i class="fa fa-youtube"></i></a></li>
						<li><a href="#"><i class="fa fa-pinterest"></i></a></li>
						<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
						<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
					</ul>
					<div class="clearfix"></div>
				</div>
				<div class="subscribe">
					<h5 class="f-head">Subscribe to our newsletters</h5>
					<input type="text" class="text" value="Enter Email ID" onfocus="this.value = '';" onblur="if (this.value == 'Enter email...') {this.value = 'Enter Email ID';}">
					<input type="submit" value="submit">
					<div class="clearfix"></div>
				</div>
				<div class="recent_24by7">
					<a class="play-icon popup-with-zoom-anim" href="#small-dialog" href="#"><i class="fa fa-calendar-o"></i>Resend Booking Confirmation</a>
					<a href="support.html"><i class="fa fa-question"></i>24/7 Customer Care</a>
				</div>
					<div class="clearfix"></div>
			</div>
			</div>
			<div class="clearfix"></div>
			</div>
			<div class="clearfix"></div>
		</div>
			<div class="copy-rights text-center">
				<p>© 2015 My Show. All Rights Reserved | Design by <a href="http://w3layouts.com/">W3layouts</a></p>
			</div>
	</div>
 <script src="js/responsive-tabs.js"></script>
    <script type="text/javascript">
      $( '#myTab a' ).click( function ( e ) {
        e.preventDefault();
        $( this ).tab( 'show' );
      } );

      $( '#moreTabs a' ).click( function ( e ) {
        e.preventDefault();
        $( this ).tab( 'show' );
      } );

      ( function( $ ) {
          // Test for making sure event are maintained
          $( '.js-alert-test' ).click( function () {
            alert( 'Button Clicked: Event was maintained' );
          } );
          fakewaffle.responsiveTabs( [ 'xs', 'sm' ] );
      } )( jQuery );

    </script>
 <script type="text/javascript">
						$(document).ready(function() {
							/*
							var defaults = {
					  			containerID: 'toTop', // fading element id
								containerHoverID: 'toTopHover', // fading element hover id
								scrollSpeed: 1200,
								easingType: 'linear' 
					 		};
							*/
							
							$().UItoTop({ easingType: 'easeOutQuart' });
							
						});
					</script>
				<a href="#home" class="scroll" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
</body