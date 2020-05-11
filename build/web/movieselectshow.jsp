<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>My Show a Entertainment Category Flat Bootstarp responsive Website Template | Select Show :: w3layouts</title>
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
	<div class="m-tickets-instantly">
		<h4>Book tickets instantly</h4>
		<div class="fleft m-select">
                        <label><input id="rdbMovie" name="rdbMovieSearch" type="radio" class="checkins" onclick="fnOcCriteria('ET', 'MT');" checked="checked">
                        <span class="fleft mr20">Movies</span></label>
                        <label><input id="rdbCinema" name="rdbMovieSearch" type="radio" class="checkins" onclick="fnOcCriteria('VN', 'MT');" checked="checked">
                        <span class="fleft mr20">Cinemas</span></label>
                    </div>
                
                
                
		<div class="m-select-movie">
                    
                    
				<%
    		
			  	Class.forName("com.mysql.jdbc.Driver");
       Connection cont=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
			   
			    Statement stmttt = cont.createStatement();
				    ResultSet rtat,rp,rz;
                                    rtat=stmttt.executeQuery("select DISTINCT lang from movie");
   
   
	%>
                                        <select class="list_of_movies">
					<option value="">Select Movie</option>
					
  					<%
					while(rtat.next())
                                        {
                                            
                                            
                                           
             		    Statement stm = cont.createStatement();
          ResultSet ru=stm.executeQuery("select mname from movie where lang='"+rtat.getString("lang")+"'");
        
                                            %>
                                         
                                            <optgroup label="<%=rtat.getString("lang")%>">
                                           					<%
					while(ru.next())
                                        {
                                            
                                            
                                            %>
                                                   <option style="padding-left: 10px;" value="ANAN"><%=ru.getString("mname")%></option>
                                           <%
                                        }
                                            %>
                                            </optgroup>
                                              <%
                                        }
                                            %>
                                         
					</select>
					
	
                
                                        
                                        
                </div>
		<div class="m-select-date">
					<select class="list_of_movies"><option value="">Select Date</option><option style="padding-left: 10px;" value="ANAN">Today, 18 jun</option><option style="padding-left: 10px;" value="CHDM">Tomorrow, 19 jun</option><option style="padding-left: 10px;" value="CHDM">saturday, 20 jun</option><option style="padding-left: 10px;" value="CHDM">sunday, 21 jun</option></select>
		</div>
		<div class="clearfix"></div>
	</div>
	
	

	
	
	
	<div class="now-showing-list">
	
		 <%@ page import ="java.sql.*" %>			
			<%

			  String p=request.getParameter("mid");
      Class.forName("com.mysql.jdbc.Driver");
	  
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
    
    Statement st = con.createStatement();
	
	
	
	
		ResultSet rs=st.executeQuery("select * from movie where mid="+p);
	
	
	while(rs.next())
{

  %>

		<div class="col-md-4 movies-by-category movie-booking">
			<h5>Looking for a specific cinema?</h5>
			<input type="text" class="text" value="Type a cinema Name to filter" onfocus="this.value = '';" onblur="if (this.value == 'Type a cinema Name to filter') {this.value = 'Search for a movie name';}">
			<div class="movie-ticket-book">
					<input type="checkbox" id="c1" name="cc">
					<label class="lang">Hide Unavailable Shows</label>
					<div class="clearfix"></div>
					<a href="moviesingle.jsp?mid=<%=rs.getString("mid")%>"><img src="<%=rs.getString("poster")%>" style="width:300px;height:400px;" alt="" />
					<div class="bahubali-details">
						<h4>Release Date:</h4>
						<p>Jul 10, 2015</p>
						<h4>Duration:</h4>
						<p>2 hrs 30 mins</p>
						<h4>Director:</h4>
						<p><%=rs.getString("dname")%></p>
						<h4>Language:</h4>
						<p><%=rs.getString("lang")%></p>
						<h4>Genre:</h4>
						<p><%=rs.getString("genre")%></p>
						<h4>Cast & Crew:</h4>
						<p><%=rs.getString("cname")%></p>
					</div>
				</div>
			</div>
			
			
			
<%}%>			
			
			
		<div class="col-md-8 movies-dates">	


		
		<%
		

    		String sdate=request.getParameter("mdate");
			  	
			    Statement stmt = con.createStatement();
				    ResultSet rt;
                                    rt=stmt.executeQuery("select * from movieshow where mid='"+p+"' and sdate='"+sdate+"' group by tid");
   
   
		while(rt.next())
		{
			
			
			
			Statement stz = con.createStatement();
			ResultSet rg=stz.executeQuery("select tname,tid,area from theatre where tid='"+rt.getString("tid")+"'");
   
			rg.next();
	%>
		    
			
				<div class="movie-date-selection">
				<ul>
					<li class="location">
						<a href="pic-a-movie.html"><i class="fa fa-map-marker"></i><%=rg.getString("tname")%>(<%=rg.getString("area")%>)</a>
					</li>
	
	<%
	
			Statement stna = con.createStatement();
			ResultSet rna=stna.executeQuery("select TIME_FORMAT(showtime,'%h:%i %p'),sid,tid,mid from movieshow where tid='"+rt.getString("tid")+"' and sdate='"+sdate+"' and mid="+p);
   
	while(rna.next())
	{
	%>
					
					
					
					<li class="time">
            		<a href="seatselection.jsp?sid=<%=rna.getString(2)%>&&time=<%=rna.getString(1)%>"><%=rna.getString(1)%></a>
					
					</li>
	<%}%>

				</ul>
			</div>
			
			
		<%
		}
		%>	
			
	
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