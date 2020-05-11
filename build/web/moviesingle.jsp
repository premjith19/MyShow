<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>My Show a Entertainment Category Flat Bootstarp responsive Website Template | Movies single_page :: w3layouts</title>
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
			
			
			
			                        function submit()
                        {
                            var mid =document.getElementById("movie").value;
                            var mdate =document.getElementById("mdate").value;
                             //alert(movie+mdate);
                               // window.location ="test.jsp?movie="+movie+"&amp;mdate="+mdate;
                                                                window.location ="movieselectshow.jsp?mid="+mid+"&&mdate="+mdate;
    }
		</script>
<!---- start-smoth-scrolling---->
</head>
<body>
<%@ include file="/includes/header.jsp" %>

	<div class="m-tickets-instantly">
		<h4>Book tickets instantly</h4>
		<div class="fleft m-select">

                    </div>
                
                
                
		<div class="m-select-movie">
                    
                    
				<%
    		
			  	Class.forName("com.mysql.jdbc.Driver");
       Connection cont=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
			   
			    Statement stmt = cont.createStatement();
				    ResultSet rt,rp,rz;
                                    rt=stmt.executeQuery("select DISTINCT lang from movie");
   
   
	%>
                                        <select class="list_of_movies" name="movie" id="movie">
					<option value="">Select Movie</option>
					
  					<%
					while(rt.next())
                                        {
                                            
                                            
                                           
             		    Statement stm = cont.createStatement();
          ResultSet ru=stm.executeQuery("select mname,mid from movie where lang='"+rt.getString("lang")+"'");
        
                                            %>
                                         
                                            <optgroup label="<%=rt.getString("lang")%>">
                                           					<%
					while(ru.next())
                                        {
                                            
                                            
                                            %>
                                                   <option style="padding-left: 10px;" value="<%=ru.getString("mid")%>"><%=ru.getString("mname")%></option>
                                           <%
                                        }
                                            %>
                                            </optgroup>
                                              <%
                                        }
                                            %>
                                         
					</select>
				</div>
				
				         <%@ page import="java.text.*" %>
				<%@ page import="java.io.*,java.util.Date, javax.servlet.*" %>
                              <%
                                Date dNow = new Date( );
   SimpleDateFormat ft = new SimpleDateFormat ("d MMMM");
     SimpleDateFormat vft = new SimpleDateFormat ("yyyy-MM-dd");
     
Date dNo= new Date(new Date().getTime() + 60*60*24*1000);
   SimpleDateFormat ftt = new SimpleDateFormat ("d MMMM ");
      SimpleDateFormat vftt = new SimpleDateFormat ("yyyy-MM-dd");
      
Date d= new Date(new Date().getTime() + 60*60*24*2000);
   SimpleDateFormat fttd = new SimpleDateFormat ("EEEE, d MMMM ");
      SimpleDateFormat vfttd = new SimpleDateFormat ("yyyy-MM-dd");
      
Date du= new Date(new Date().getTime() + 60*60*24*3000);
   SimpleDateFormat fttu = new SimpleDateFormat ("EEEE, d MMMM ");
      SimpleDateFormat vfttu = new SimpleDateFormat ("yyyy-MM-dd");



                                
                                
                                %>	
					
				
				
				
				
		<div class="m-select-date">
	<select class="list_of_movies" name="mdate" id="mdate" onchange="submit();">
                                        <option value="">Select Date</option>
					<option style="padding-left: 10px;" value="<%=vft.format(dNow)%>">Today, <%=ft.format(dNow)%></option>
					<option style="padding-left: 10px;" value="<%=vftt.format(dNo)%>">Tomorrow, <%=ftt.format(dNo)%></option>
					<option style="padding-left: 10px;" value="<%=vfttd.format(d)%>"><%=fttd.format(d)%></option>
					<option style="padding-left: 10px;" value="<%=vfttu.format(du)%>"><%=fttu.format(du)%></option></select>
		</div>
		<div class="clearfix"></div>
	</div>
	
	
	
	
	
	
	       <%@ page import ="java.sql.*" %>			
			<%

			  String p=request.getParameter("mid");
      Class.forName("com.mysql.jdbc.Driver");
	  
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
    
    Statement st = con.createStatement();
	
	
		ResultSet rstt=st.executeQuery("select sum(rate),count(mid) from review where mid="+p);
	int sum=0,count2=0;
	while(rstt.next())
{
	sum=rstt.getInt(1);
	count2=rstt.getInt(2);
}

	int like;

	if(count2>0)
	{
	like=(sum*100)/(count2*5);
	}
	else
	{
		like=0;
	}
	
	
	ResultSet rs=st.executeQuery("select mname,dname,cname,duration,genre,desp,lang,DATE_FORMAT(rdate, '%M %d, %Y'),mtype,poster,trailer from movie where mid="+p);
	
	
	while(rs.next())
{

  %>
	
	
	
	
	<div class="m-single-article">
		<div class="article-left">
			<h3><%=rs.getString(1)%>|| <%=rs.getString(3)%> <span> <i class="fa fa-heart"></i><%=like%>%</span></h3>
			<p><a class="m-green" href="#">Action</a><a class="m-green" href="#">Thriller</a><a class="m-orange" href="#"><%=rs.getString(7)%></a></p>
			<div class="clearfix"></div>
			<div class="article-time-strip">
				<div class="article-time-strip-left">
					<p>Duration <span><i class="fa fa-clock-o"></i>2 hrs 30 mins </span>  &nbsp;&nbsp; Release Date <span><i class="fa fa-calendar"></i><%=rs.getString(8)%></span></p>
				</div>
				<div class="clearfix"></div>
				<div class="article-img">
					<iframe height="250" src=<%=rs.getString(11) %> frameborder="0" allowfullscreen></iframe>
				</div>
				<div class="review-info">
								<h6 class="span88"><%=rs.getString(1)%></h6>
								<p class="dirctr"><a href="">Reagan Gavin Rasquinha, </a>TNN, Mar 12, 2015, 12.47PM IST</p>								
								<p class="ratingview">Critic's Rating:</p>
								<div class="rating">
									<span>*</span>
									<span>*</span>
									<span>*</span>
									<span>*</span>
									<span>*</span>
								</div>
								<p class="ratingview">
								&nbsp;3.5/5  
								</p>
								<div class="clearfix"></div>
								<p class="ratingview c-rating">Avg Readers' Rating:</p>
								<div class="rating c-rating">
									<span>*</span>
									<span>*</span>
									<span>*</span>
									<span>*</span>
									<span>*</span>
								</div> 	
								<p class="ratingview c-rating">								
								&nbsp; 3.3/5</p>
								<div class="clearfix"></div>
								
								
								<%
								    Statement strev = con.createStatement();
	
								ResultSet revr=strev.executeQuery("select * from review where name='"+session.getAttribute("username")+"' and mid='"+p+"'");
								
								if(!revr.next())
								{
								
								%>
								
								
								
								<div class="yrw">
								<form action="reviewprocess.jsp?mid=<%=p%>" method="post">
								<h4>Would you also Like to review this movie??</h4>
			                <textarea name="review" type="text" cols="77" rows="6" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Review';}" required="">Write Your Review About the movie...</textarea>
							
							
									<div class="dropdown-button">           			
										<select name="rate" class="dropdown" tabindex="9" data-settings="{&quot;wrapperClass&quot;:&quot;flat&quot;}">
										<option value="0">Your rating</option>	
										<option value="1">1.Poor</option>
										<option value="2">2.Average</option>
										<option value="3">3.Watchable</option>
										<option value="4">4.(Very good)</option>
										<option value="5">5.Outstanding</option>
									  </select>
									</div>
<div class="clearfix"></div>
<div class="clearfix"></div>

									<div class="send">
									
									<%
    if ((session.getAttribute("username") == null) || (session.getAttribute("username") == "")) {
%>
				<a href="index.jsp" class="send">PLEASE LOGIN</a>
					
				 <%} else {
%>
									<a>	<input type="submit" value="Review this Movie"></a>
<%
    }
%>


									
									
									</div>
									<div class="clearfix"></div>
								</div>
								
								
								
								<%}%>
								
								
								
								<p class="info"><strong>CAST</strong>: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=rs.getString(3) %></p>
								<p class="info"><strong>DIRECTION</strong>: &nbsp;&nbsp;&nbsp;&nbsp;<%=rs.getString(2) %></p>
								<p class="info"><strong>STORY</strong>:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; V. Vijayendra Prasad.</p>
								<p class="info"><strong>DURATION</strong>:&nbsp;&nbsp;&nbsp; &nbsp; 2 hour 30 minutes.</p>
							</div>
			</div>
		</div>
		
		
		
		

		<div class="article-right">
			<div class="grid_3 grid_5">
				   <div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
			<ul id="myTab" class="nav nav-tabs" role="tablist">
			  <li role="presentation" class="active"><a href="#home" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">Mon-28</a></li>
			  <li role="presentation"><a href="#profile" role="tab" id="profile-tab" data-toggle="tab" aria-controls="profile">TUE-29</a></li>
			</ul>
			<div id="myTabContent" class="tab-content">
			  <div role="tabpanel" class="tab-pane fade in active" id="home" aria-labelledby="home-tab">				  
                 <p class="m-s-t">Cinemax Cinemas, Malad(W)</p>
				 <a class="show-time" href="movie-select-show.html">06:00 PM</a>
				 <div class="clearfix"></div>
				  <a class="more-show-time" href="movie-select-show.html">More Show Times</a>
			  </div>
			  <div role="tabpanel" class="tab-pane fade" id="profile" aria-labelledby="profile-tab">
				 <p class="m-s-t">INOX: Lorem Mall, Chicago</p>
				 <a class="show-time" href="movie-select-show.html">12:45 PM</a><a class="show-time" href="movie-select-show.html">06:30 PM</a>
				 <div class="clearfix"></div>
				 <a class="more-show-time" href="movie-select-show.html">More Show Times</a>
			  </div>
			</div>
		   </div>
		  </div>
		</div>
		<div class="clearfix"></div>
	</div>
	<div class="reviews-tabs">
      <!-- Main component for a primary marketing message or call to action -->
      <ul class="nav nav-tabs responsive hidden-xs hidden-sm" id="myTab">
        <li class="test-class active"><a class="deco-none misc-class" href="#how-to"> Synopsis</a></li>
        <li class="test-class"><a href="#features">Critic Reviews (1)</a></li>
        <li><a class="deco-none" href="#source">User Reviews </a></li>
      </ul>

      <div class="tab-content responsive hidden-xs hidden-sm">
        <div class="tab-pane active" id="how-to">
		 <p><strong> Director :</strong> <a href="#"><%=rs.getString(2) %></a></p>
          <p> <strong>Cast & Crew :</strong><%=rs.getString(3) %></p>
		  <p><%=rs.getString(6) %> <br>
		         
<%}%>     
        </div>
        <div class="tab-pane" id="features">
		  <p class="cr-left"><strong>123Telugu.com</strong></p><div class="rating-cr">
									<span>☆</span>
									<span>☆</span>
									<span>☆</span>
									<span>☆</span>
									<span>☆</span>
								</div> 
								<div class="clearfix"></div>
          <p>Continuing with the trend of crime comedies, yet another interesting flick titled Where is Vidya Balan has hit the screens today. Lets see how it is.</p>
        <a href="#">....Read full review</a>
		</div>
		<%
		  ResultSet rst=st.executeQuery("select image,name,review,DATE_FORMAT(date, '%d %M %Y') from review where mid="+p);
	
%>
		
        <div class="tab-pane" id="source">
		  <div class="response">
						
						<%	while(rst.next())
{
%>

						<div class="media response-info">
							<div class="media-left response-text-left">
								<a href="#">
									<img class="media-object" src="<%=rst.getString(1) %>" style="width:64px;height:64px;" alt="">
								</a>
								<h5><a href="#"><center><%=rst.getString(2) %></center></a></h5>
							</div>
							<div class="media-body response-text-right">
								<p><%=rst.getString(3) %></p>
								<ul>
									<li><%=rst.getString(4) %></li>
																	</ul>
							</div>
							<div class="clearfix"> </div>
						</div>
						
						<%}%>
						
						
					</div>
        </div>
		
		

		
      </div>		
	</div>
	<div class="footer-top-strip">
		<p><span>Showing in cities : </span><a href="movies.html">Bengaluru</a>, <a href="movies.html">Hyderabad</a>, <a href="movies.html">Khammam</a>, <a href="movies.html">Kurnool</a>, <a href="movies.html">Nizamabad</a>, <a href="movies.html">Vijayawada</a>, <a href="#">Vizag</a>, <a href="movies.html">Vizianagaram</a>, <a href="movies.html">Warangal</a></p>
		<p><span>Cinemas Nearby : </span><a href="movie-single.html"> INOX: Jyoti Mall, Kurnool </a>|
			<p><span>Next Change <i>(Friday, 19 Jun) </i>: </span><a href="movie-single.html">Disney's ABCD 2 (3D) (U)</a>, <a href="movie-single.html"> 2 Premi Premache</a> , <a href="movie-single.html">Dekh Ke (Bhojpuri)</a> , <a href="movie-single.html">Disney's ABCD 2 (2D) (U)</a>, <a href="movie-single.html">Dekh Ke (Bhojpuri)</a></p>
			<p><span>Coming Soon :</span><a href="movie-single.html"> 2 Premi Premache</a>, <a href="movie-single.html">Acharam, Dekh Ke (Bhojpuri)</a>, <a href="movie-single.html">Entourage</a>, <a href="movie-single.html">Kuttram Kadithal</a></p>
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
</body>
</html>