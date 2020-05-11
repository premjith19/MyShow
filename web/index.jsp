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
                        
                        
                        
                        function submit()
                        {
                            var mid =document.getElementById("movie").value;
                            var mdate =document.getElementById("mdate").value;
                             //alert(movie+mdate);
                               // window.location ="test.jsp?movie="+movie+"&amp;mdate="+mdate;
                                                                window.location ="movieselectshow.jsp?mid="+mid+"&&mdate="+mdate;
    }
                        function cinema()
                        {
                            var tid =document.getElementById("cinema").value;
                           // var mdate =document.getElementById("mdate").value;
                             //alert(movie+mdate);
                               // window.location ="test.jsp?movie="+movie+"&amp;mdate="+mdate;
                                                                window.location ="movielist.jsp?tid="+tid;
    }                   
		</script>
<!---- start-smoth-scrolling---->

</head>
<body background="images/movie2.jpg">

	             <%@ page import ="java.sql.*" %>			
		
	<%@ include file="/includes/header.jsp" %>  
		





	<div class="main-banner">
		 <div class="banner col-md-8">
			<section class="slider">
				<div class="flexslider">
						<ul class="slides">
						<li>
							<img src="images/32-Prabhas-Baahubali-Movie-Wallpapers-Ultra-HD.jpg" class="img-responsive" style="width:666px;height:355px;" alt="" />
						</li>
						<li>
							<img src="images/poster_h1.jpg" class="img-responsive" style="width:666px;height:355px;" alt="" />
						</li>
						<li>
							<img src="images/1280x720-JDw.jpg" class="img-responsive" alt="" />
						</li>
						<li>
							<img src="images/pic4.jpg" class="img-responsive" alt="" />
						</li>
				  </ul>
				</div>
					</section>
				 <!-- FlexSlider -->
				 <script defer src="js/jquery.flexslider.js"></script>
				 <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
					<script type="text/javascript">
				$(function(){
				 SyntaxHighlighter.all();
				});
				$(window).load(function(){
				  $('.flexslider').flexslider({
					animation: "slide",
					start: function(slider){
					  $('body').removeClass('loading');
					}
				 });
				});
			 </script>
         </div>
		 
		 
		 
		 
		 
		 
		 
		 <div class="col-md-4 banner-right">
			<h4>Instant Ticket Booking</h4>
			<div class="grid_3 grid_5">
				   <div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
			<ul id="myTab" class="nav nav-tabs" role="tablist">
			  <li role="presentation" class="active"><a href="#home" id="home-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">Movies</a></li>
			  <li role="presentation"><a href="#profile" role="tab" id="profile-tab" data-toggle="tab" aria-controls="profile" aria-expanded="false">Cinema</a></li>
			  
			</ul>
			<div id="myTabContent" class="tab-content">
			  <div role="tabpanel" class="tab-pane fade in active" id="home" aria-labelledby="home-tab">				  
                    
					
				     <%@ page import ="java.sql.*" %>	
<%
    		
			  	Class.forName("com.mysql.jdbc.Driver");
       Connection cont=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
			   
			    Statement stmt = cont.createStatement();
				    ResultSet rt,rp,rz,rm;
                                    rt=stmt.executeQuery("select DISTINCT lang from movie");
   
   
	%>
                                            
                                        <select class="list_of_movies" name="movie" id="movie">
					<option>Select Movie</option>
					
  					<%
					while(rt.next())
                                        {
                                          
             		    Statement stm = cont.createStatement();
          ResultSet ru=stm.executeQuery("select mname,mid from movie where lang='"+rt.getString("lang")+"' and rdate<'"+vftn.format(dNown)+"'");
        
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
					
					
					<select class="list_of_movies" name="mdate" id="mdate" onchange="submit();">
                                        <option value="">Select Date</option>
					<option style="padding-left: 10px;" value="<%=vft.format(dNow)%>">Today, <%=ft.format(dNow)%></option>
					<option style="padding-left: 10px;" value="<%=vftt.format(dNo)%>">Tomorrow, <%=ftt.format(dNo)%></option>
					<option style="padding-left: 10px;" value="<%=vfttd.format(d)%>"><%=fttd.format(d)%></option>
					<option style="padding-left: 10px;" value="<%=vfttu.format(du)%>"><%=fttu.format(du)%></option></select>
					
					
					<h5 class="pre"><i class="fa fa-heart"></i>Preferred Cinemas :<h5>
					<h6 class="ipre"><a href="#">Cinemax Cinemas: Malad(W), </a> <a href="#"> INOX Cinemas: Kandivali(E)</a>, <a href="#"></a></h6>
			  </div>
<%

 rp=stmt.executeQuery("select tname,area,tid from theatre order by tname");

%>			  
			  
			  <div role="tabpanel" class="tab-pane fade" id="profile" aria-labelledby="profile-tab">
				  <select class="list_of_movies" onchange="cinema();" name="cinema" id="cinema"><option value="">Select Cinema</option>
				  <optgroup label="Cinema List">
<%
while(rp.next())
{
%>				

				<option style="padding-left: 10px;" value="<%=rp.getString("tid")%>"><%=rp.getString("tname")%>(<%=rp.getString("area")%>)</option>

<%
}
%>
				</optgroup>
			</select>
			  </div>
			  
			  
			  
			  

			</div>
		   </div>
		  </div>
		 </div>
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 <div class="clearfix"></div>
	</div>
	
	
	
	
	
	<%
	
	Class.forName("com.mysql.jdbc.Driver");
	  
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
    
    Statement st = con.createStatement();
	ResultSet rs=st.executeQuery("select mid,mname,DATE_FORMAT(rdate,'%M %d, %Y'),poster from movie where rdate < '"+vft.format(dNow)+"'");
	
	
	%>
				<div class="review-slider">
			 <ul id="flexiselDemo1">
			<%
				while(rs.next())
{

  %>
	  

			
			<li>
				<a href="moviesingle.jsp?mid=<%=rs.getString("mid")%>"><img src="<%=rs.getString("poster")%>" style="width:200px;height:250px;" alt=""/></a>
				
				<div class="date-city">
					<h5><center><%=rs.getString(3)%></center></h5>
					<h6><center><%=rs.getString("mname")%></center></h6>
					<div class="buy-tickets">
						<a href="movieselectshow.jsp?mid=<%=rs.getString("mid")%>">BUY TICKETS</a>
					</div>
				</div>
			</li>
<%
}
%>
		</ul>
			<script type="text/javascript">
		$(window).load(function() {
			
		  $("#flexiselDemo1").flexisel({
				visibleItems: 5,
				animationSpeed: 1000,
				autoPlay: true,
				autoPlaySpeed: 3000,    		
				pauseOnHover: false,
				enableResponsiveBreakpoints: true,
				responsiveBreakpoints: { 
					portrait: { 
						changePoint:480,
						visibleItems: 2
					}, 
					landscape: { 
						changePoint:640,
						visibleItems: 3
					},
					tablet: { 
						changePoint:800,
						visibleItems: 4
					}
				}
			});
			});
		</script>
		<script type="text/javascript" src="js/jquery.flexisel.js"></script>	
		</div>
		
		
		
		
		
		<div class="footer-top-grid">
		<div class="list-of-movies col-md-8">
			<div class="tabs">
				<div class="sap_tabs">	
						 <div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
						  <ul class="resp-tabs-list">
						  	  <li class="resp-tab-item" aria-controls="tab_item-2" role="tab"><span>Now Playing</span></li>
							  <li class="resp-tab-item" aria-controls="tab_item-0" role="tab"><span>Comming Soon</span></li>
							  <div class="clearfix"></div>
						  </ul>		


<%
                                
 rz=stmt.executeQuery("select * from movie where rdate < '"+vft.format(dNow)+"'order by mid desc limit 3");
 
 
 

%>


						  
							<div class="resp-tabs-container">
							    <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
									<ul class="tab_img">
									  
									  <%
									  while(rz.next())
									  {

										  %>
									  
									  <li>
										<div class="view view-first">
					   		  			  <a href="moviesingle.jsp?mid=<%=rz.getString("mid")%>"> <img src="<%=rz.getString("poster")%>" style="width:220px;height:270px;" class="img-responsive" alt=""/></a>
										   <div class="info1"> </div>
											 <div class="mask">
						                     </div>
								              <div class="tab_desc">
													<a href="movieselectshow.jsp?mid=<%=rz.getString("mid")%>">Book Now</a>
													
											  </div>
										  </div>
										</li>
										
									  <%}%>
										
									  
										<div class="clearfix"></div>
									</ul>
							     </div>	
							     
							     <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-2">
									<ul class="tab_img">
										
										<%
										 rm=stmt.executeQuery("select DATE_FORMAT(rdate, '%M %d, %Y'),mid,mname,poster from movie where rdate > '"+vft.format(dNow)+"' limit 3");
										while(rm.next())
										{
										%>
										
										<li>
										  <div class="view view-first">
					   		  			  <a href="moviesingle.jsp?mid=<%=rm.getString("mid")%>"> <img src="<%=rm.getString("poster")%>" style="width:220px;height:270px;" class="img-responsive" alt=""/></a>
											 <div class="mask">
						                        <div class="info1"> </div>
								              </div>
								                <div class="tab_desc">
													<a href="moviesingle.jsp?mid=<%=rm.getString("mid")%>"><%=rm.getString(1)%></a>
																								  </div>
										  </div>
										</li>
										
										<%}%>
																				
										<div class="clearfix"></div>
									</ul>
							     </div>	
							     <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-3">
									<ul class="tab_img">
									  <li>
										<div class="view view-first">
					   		  			  <a href="movie-select-show.html"> <img src="images/pic-6.jpg" class="img-responsive" alt=""/></a>
											 <div class="mask">
						                        <div class="info1"> </div>
								              </div>
								                <div class="tab_desc">
													<a href="movie-select-show.html">Book Now</a>
											  </div>
										  </div>
										</li>
										<li>
										  <div class="view view-first">
					   		  			  <a href="movie-select-show.html"> <img src="images/pic-1.jpg" class="img-responsive" alt=""/></a>
											 <div class="mask">
						                        <div class="info1"> </div>
								              </div>
								                <div class="tab_desc">
													<a href="movie-select-show.html">Book Now</a>
											  </div>
										  </div>
										</li>
										<li>
										  <div class="view view-first">
					   		  			  <a href="movie-select-show.html"> <img src="images/pic-9.jpg" class="img-responsive" alt=""/></a>
											 <div class="mask">
						                        <div class="info1"> </div>
								              </div>
								                <div class="tab_desc">
													<a href="movie-select-show.html">Book Now</a>
											  </div>
										  </div>
										</li>
										<div class="clearfix"></div>
									</ul>
						    	</div>		        					 	        					 
			     		    </div>	
                        </div>
					</div>
				</div>	
				<div class="clearfix"></div>
				
				
				
				
				<div class="featured">
					<h4>Featured</h4>
					<ul>
						<li>
							<div class="f-movie">
								<div class="f-movie-img">
									<a href="movies.html"><img src="images/f4.jpg" alt="" /></a>
								</div>
									<div class="f-movie-name">
										<a href="movies.html">Lorem Ipsum used since</a>
										<p>Multi city</p>
									</div>
								<div class="f-buy-tickets">
									<a href="movie-select-show.html">BUY TICKETS</a>
								</div>
							</div>
						</li>
						<li>
							<div class="f-movie">
								<div class="f-movie-img">
									<a href="movies.html"><img src="images/f5.jpg" alt="" /></a>
								</div>
									<div class="f-movie-name">
										<a href="movies.html">looked up one of more</a>
										<p>Multi city</p>
									</div>
								<div class="f-buy-tickets">
									<a href="movie-select-show.html">BUY TICKETS</a>
								</div>
							</div>
						</li>
						<li>
							<div class="f-movie">
								<div class="f-movie-img">
									<a href="movies.html"><img src="images/f6.jpg" alt="" /></a>
								</div>
									<div class="f-movie-name">
										<a href="movies.html">The Live Lorem Ipsum </a>
										<p>Mumbai</p>
									</div>
								<div class="f-buy-tickets">
									<a href="movie-select-show.html">BUY TICKETS</a>
								</div>
							</div>
						</li>
						<li>
							<div class="f-movie">
								<div class="f-movie-img">
									<a href="movies.html"><img src="images/f1.jpg" alt=""></a>
								</div>
									<div class="f-movie-name">
										<a href="movies.html">The standard chunk</a>
										<p>Multi city</p>
									</div>
								<div class="f-buy-tickets">
									<a href="movie-select-show.html">BUY TICKETS</a>
								</div>
							</div>
						</li>
						<li>
							<div class="f-movie">
								<div class="f-movie-img">
									<a href="movies.html"><img src="images/f2.jpg" alt=""></a>
								</div>
									<div class="f-movie-name">
										<a href="movies.html">There are many 'variations'</a>
										<p>Multi city</p>
									</div>
								<div class="f-buy-tickets">
									<a href="movie-select-show.html">BUY TICKETS</a>
								</div>
							</div>
						</li>
						<li>
							<div class="f-movie">
								<div class="f-movie-img">
									<a href="movies.html"><img src="images/f3.jpg" alt=""></a>
								</div>
									<div class="f-movie-name">
										<a href="movies.html">The Live Tribute Show</a>
										<p>Mumbai</p>
									</div>								 
								<div class="f-buy-tickets">
									<a href="movie-select-show.html">BUY TICKETS</a>
								</div>
							</div>
						</li>
						<div class="clearfix"></div>
					</ul>
				</div>
				
				
				
				
				
			</div>
			
				  <%
  	
	ResultSet rsrt=st.executeQuery("SELECT avg(r.rate)*20 as perc ,m.mname, m.mid,m.mtype FROM review r,movie m where r.mid=m.mid group by mid order by perc desc ");
    int rate;

	  %>
	
			
			
			
			
			<div class="right-side-bar">
				<div class="top-movies-in-india">
					<h4>Top Movies in India</h4>
					
					<%



		while(rsrt.next())
		{
			rate=rsrt.getInt(1);
		
			%>
					<ul class="mov_list">
					
					

					
						<li><i class="fa fa-star"></i></li>
						<li><%=rate%>%</li>
						<li><a href="moviesingle.jsp?mid=<%=rsrt.getString(3)%>"><%=rsrt.getString(2)%>(<%=rsrt.getString(4)%>)</a></li>
						
						
					</ul>
				

		
		<%
		}
		%>		
								
				</div>
				
				
				
				<div class="quick-pay">
					<h3>Quick Pay</h3>
					<p class="payText">Make your online payments a breeze. Save your Credit, Debit card and Netbanking in your MyShow profile.. <a href="#">Read more</a></p>
				</div>
				<div class="our-blog">
					<h5>Our Blog</h5>
					<div class="post-article">
						<a href="blog.html" class="post-title">Bollywood?s Lesser Known Destinations</a>
						<i>Posted on September 26, 2015</i>
						<p>From shooting films in India alone, filmmakers have gone a long way to explore new destinations. Yash Chopra was known to film at least one romantic s...<br> <a href="blog.html">Read more</a></p>
					</div>
					<div class="post-article">
						<a href="blog.html" class="post-title">THE INTERN</a>
						<i>Posted on September 25, 2015</i>
						<p>The Intern, starring Robert De Niro and Anne Hathaway, is the sort of breezy, feel-good film that you?d typically stack in the rom-com pile, exc...<br> <a href="blog.html">Read more</a></p>
					</div>
				</div>
			</div>
			<div class="clearfix"></div>			
			</div>
		<div class="footer-top-strip">
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