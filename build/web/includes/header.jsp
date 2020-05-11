<!-- header-section-starts -->
		<div class="header-top-strip">
			<div class="container">
				
				<div class="header-top-right">
				<div class="modal fade">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">Modal title</h4>
      </div>
      <div class="modal-body">
        <p>One fine body&hellip;</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
	</div><!-- /.modal -->
	<!-- Button trigger modal  -->

	<!---pop-up-box---->  
					<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
					<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
					<!---//pop-up-box---->
					
                     <script>
						$(document).ready(function() {
						$('.popup-with-zoom-anim').magnificPopup({
							type: 'inline',
							fixedContentPos: false,
							fixedBgPos: true,
							overflowY: 'auto',
							closeBtnInside: true,
							preloader: false,
							midClick: true,
							removalDelay: 300,
							mainClass: 'my-mfp-zoom-in'
						});
																						
						});
				</script>
				<!-- Large modal -->
				
				
					<%@ page import="java.util.*"%>
                                        	<%@ page import ="java.sql.*" %>   
      
		
<%
    if ((session.getAttribute("username") == null) || (session.getAttribute("username") == "")) {
%>
				
<button class="btn btn-primary" data-toggle="modal" data-target="#myModal">
    Login</button>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel"
    aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;</button>
                <h4 class="modal-title" id="myModalLabel">
                    Don't Wait, Login now!</h4>
            </div>
			
			<%
			String msg=request.getParameter("msg");
			%>
			
			
			
            <div class="modal-body">
                <div class="row">
                    <div class="col-md-8" style="border-right: 1px dotted #C2C2C2;padding-right: 30px;">
                        <!-- Nav tabs -->
                        <ul class="nav nav-tabs">
                            <li class="active"><a href="#Login" data-toggle="tab">Login</a></li>
                            <li><a href="#Registration" data-toggle="tab">Registration</a></li>
							
                        </ul>
                        <!-- Tab panes -->
                        <div class="tab-content">
                            <div class="tab-pane active" id="Login">
                                <form role="form" class="form-horizontal" action="loginprocess.jsp" method="post">
                                <div class="form-group">
                                    <label for="email" class="col-sm-2 control-label">
                                        Email</label>
                                    <div class="col-sm-10">
                                        <input type="email" class="form-control" name="email" id="email1" placeholder="Email" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1" class="col-sm-2 control-label">
                                        Password</label>
                                    <div class="col-sm-10">
                                        <input type="password" class="form-control" id="exampleInputPassword1" name="pwd" placeholder="password" />
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-sm-2">
                                    </div>
                                    <div class="col-sm-10">
                                        <button type="submit" class="btn btn-primary btn-sm">
                                            Submit</button>
                                        <a href="javascript:;">Forgot your password?</a>
                                    </div>
                                </div>
                                </form>
                            </div>
							
							
							
							
							
							
                            <div class="tab-pane" id="Registration">
                                <form role="form" class="form-horizontal" action="registerprocess.jsp" method="post">
                                <div class="form-group">
                                    <label for="email" class="col-sm-2 control-label">
                                        Name</label>
                                    <div class="col-sm-10">
                                        <div class="row">
                                            <div class="col-md-3">
                                                <select class="form-control">
                                                    <option>Mr.</option>
                                                    <option>Ms.</option>
                                                    <option>Mrs.</option>
                                                </select>
                                            </div>
                                            <div class="col-md-9">
                                                <input type="text" class="form-control" placeholder="Name" name="fname" />
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="email" class="col-sm-2 control-label">
                                        Email</label>
                                    <div class="col-sm-10">
                                        <input type="email" class="form-control" id="email" placeholder="Email" name="email"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="mobile" class="col-sm-2 control-label">
                                        Mobile</label>
                                    <div class="col-sm-10">
                                        <input type="mobile" class="form-control" id="mobile" placeholder="Mobile" name="mobile" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="password" class="col-sm-2 control-label">
                                        Password</label>
                                    <div class="col-sm-10">
                                        <input type="password" class="form-control" id="password" placeholder="Password" name="pwd" />
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-sm-2">
                                    </div>
                                    <div class="col-sm-10">
                                        <button type="submit" class="btn btn-primary btn-sm">
                                            Save & Continue</button>
                                        <button type="button" class="btn btn-default btn-sm">
                                            Cancel</button>
                                    </div>
                                </div>
                                </form>
                            </div>
                        </div>
                        <div id="OR" class="hidden-xs">
                            OR</div>
                    </div>
                    
                    
                    <div class="col-md-4">
                        <div class="row text-center sign-with">
                            <div class="col-md-12">
                                <h3 class="other-nw">
                                    Sign in with</h3>
                            </div>
                            <div class="col-md-12">
                                <div class="btn-group btn-group-justified">
                                    <a href="#" class="btn btn-primary">Facebook</a> <a href="#" class="btn btn-danger">
                                        Google +</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
$('#myModal').modal('show');
</script>

	<%}
	
	
	else {

  Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
    
    Statement st = con.createStatement();
    ResultSet rs=st.executeQuery("select * from user where fname='"+session.getAttribute("username")+"'");
    
    while(rs.next())
               {
       %>


 
<%
    }}
%>
	
	
</div>
				<div class="clearfix"></div>
			</div>
		</div>
		
		<div class="container">
		  <div class="main-content">
			<div class="header">
				<div class="logo">
					<a href="index.jsp"><h1>My Show</h1></a>
				</div>
				<div class="search">
					<div class="search2">
					  <form action="searchresult.jsp" method="post">
						<i class="fa fa-search"></i>
						 <input type="text" name="search" value="Search for a movie" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search for a movie, play, event, sport or more';}"/>
					  </form>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
	<div class="bootstrap_container">
            <nav class="navbar navbar-default w3_megamenu" role="navigation">
                <div class="navbar-header">
          			<button type="button" data-toggle="collapse" data-target="#defaultmenu" class="navbar-toggle"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button><a href="index.jsp" class="navbar-brand"><i class="fa fa-home"></i></a>
				</div><!-- end navbar-header -->
        
            <div id="defaultmenu" class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="index.jsp">Home</a></li>	
                    <!-- Mega Menu -->
					<li class="dropdown w3_megamenu-fw"><a href="movies.html" data-toggle="dropdown" class="dropdown-toggle">Movies<b class="caret"></b></a>
                        <ul class="dropdown-menu fullwidth">
                            <li class="w3_megamenu-content">
                                <div class="row">
								<h5 class="movies-page">for movies page - <a href="movies.html">Click here</a> </h5>
                                    <div class="col-sm-4">
                                  		<h3 class="title">Now Showing</h3>
					<%
					int count=0;

  Class.forName("com.mysql.jdbc.Driver");
       Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
    
    Statement stt = conn.createStatement();					
				int a;	
	ResultSet rsz=stt.executeQuery("SELECT avg(r.rate)*20 as perc ,m.mname, m.mid,m.mtype FROM review r,movie m where r.mid=m.mid group by mid order by rdate desc");
    
    while(rsz.next())
               {
    				
					
					
					a=rsz.getInt(1);
					
					%>
					<ul class="mov_list">
						<li><%=a%>%</li>
						<li><a href="moviesingle.jsp?mid=<%=rsz.getString(3)%>"><%=rsz.getString(2)%> (<%=rsz.getString(4)%>) </a></li>
					</ul>

					
					
					
			   <%
			   
			   count++;
					if(count==5)
					{
						break;
				}
			   
			   
			   }
			   
			   
			   
			   
			   %>
                                    </div><!-- end col-4 -->
                                    <div class="col-sm-4 movie-dd">
                                  		<h3 class="title">Next Change</h3>
										                                   <%@ page import="java.text.*" %>
				<%@ page import="java.io.*,java.util.Date, javax.servlet.*" %>
                              <%
                                Date dNown = new Date( );
   SimpleDateFormat ftn = new SimpleDateFormat ("d MMMM");
     SimpleDateFormat vftn= new SimpleDateFormat ("yyyy-MM-dd");
     
										
										ResultSet rch=stt.executeQuery("SELECT mname,DATE_FORMAT(rdate,'%W, %M %d'),mid FROM movie where rdate>'"+vftn.format(dNown)+"' order by rdate asc limit 5");
    
    while(rch.next())
               {
    
										%>
										
										<p><a href="moviesingle.jsp?mid=<%=rch.getString("mid")%>"><%=rch.getString("mname")%></a><span>... (<%=rch.getString(2)%>)</span></p>

			   <%}%>
										   </div><!-- end col-4 -->
                                    <div class="col-sm-4 movie-dd">
                                  		<h3 class="title">Comming Soon</h3>
<%

ResultSet rchx=stt.executeQuery("SELECT mname,DATE_FORMAT(rdate,'%W, %M %d'),mid FROM movie where rdate>'"+vftn.format(dNown)+"' limit 5");
    
    while(rchx.next())
               {

%>

										<p><a href="moviesingle.jsp?mid=<%=rchx.getString("mid")%>"><%=rchx.getString("mname")%></a><span>... (<%=rchx.getString(2)%>)</span></p>
				<%
			   }
				%>						

										</div><!-- end col-4 -->
									<div class="clearfix"></div>
									
									
									<%
									
														int f=0;	
	ResultSet rk=stt.executeQuery("SELECT * FROM movie where rdate<'"+vftn.format(dNown)+"' order by rdate desc");
    
									
									%>
									
									<div class="menu-featured-movies">
										<h3 class="title">Featured Trailers</h3>
																<%

									while(rk.next())
									{
										
																					f++;
										%>
										
										<div class="col-md-2 menu-featured-movies-img">
										
											

										<a href="moviesingle.jsp?mid=<%=rk.getString("mid")%>"><img src="<%=rk.getString("poster")%>" style="width:100px;height:150px;"alt="" /></a>
										
										</div>

<%
									
									
									if(f==6)
										{
											break;
											}
									
									}%>
									
										<div class="clearfix"></div>
									</div>
									
									
									
									
									
                                </div><!-- end row -->
                                <hr>
                    
							</li>
                        </ul>
                    </li>
					
					
					
					
					
					
					
					
					<!-- end dropdown w3_megamenu-fw -->
                </ul><!-- end nav navbar-nav -->
                
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a href="#" data-toggle="dropdown" class="dropdown-toggle">Contact Us<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
							
<%
    if ((session.getAttribute("username") == null) || (session.getAttribute("username") == "")) {
%>
		
							
                                <form id="contact1" action="contactprocess.jsp" name="contactform" method="post">
                                    <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                                        <input type="text" name="name" id="name1" class="form-control" placeholder="Name"> 
                                        <input type="text" name="email" id="email1" class="form-control" placeholder="Email"> 
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                                        <input type="text" name="phone" id="phone1" class="form-control" placeholder="Phone">
                                        <input type="text" name="subject" id="subject1" class="form-control" placeholder="Subject"> 
                                    </div>                 
                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <textarea class="form-control" name="comments" id="comments1" rows="6" placeholder="Your Message ..."></textarea>
                                    </div>   
                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <div class="pull-right">
                                            <input type="submit" value="SEND" id="submit1" class="btn btn-primary small">
                                        </div>  
                                    </div>
									<div class="clearfix"></div>  
                                </form>
								
								<%
	}
	else{
		
		  Class.forName("com.mysql.jdbc.Driver");
       Connection cont=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
    
    Statement st = cont.createStatement();
    ResultSet ro=st.executeQuery("select * from user where fname='"+session.getAttribute("username")+"'");
		
		
		while(ro.next()){
		
		
								%>
								                                <form id="contact1" action="contactprocess.jsp" name="contactform" method="post">
                                    <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                                        <input type="text" name="name" id="name1" value="<%=ro.getString("fname")%>" class="form-control" placeholder="Name"> 
                                        <input type="text" name="email" id="email1" value="<%=ro.getString("email")%>" class="form-control" placeholder="Email"> 
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                                        <input type="text" name="phone" id="phone1" class="form-control" value="<%=ro.getString("mobile")%>" placeholder="Phone">
                                        <input type="text" name="subject" id="subject1" class="form-control" placeholder="Subject"> 
                                    </div>                 
                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <textarea class="form-control" name="comments" id="comments1" rows="6" placeholder="Your Message ..."></textarea>
                                    </div>   
                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <div class="pull-right">
                                            <input type="submit" value="SEND" id="submit1" class="btn btn-primary small">
                                        </div>  
                                    </div>
									<div class="clearfix"></div>  
                                </form>
								
	<%}}%>
								
								
								
                            </li>
                        </ul>
					</li>
				</ul>
				
				<%
    if ((session.getAttribute("username") == null) || (session.getAttribute("username") == "")) {}
	else{
%>
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a href="#" data-toggle="dropdown" class="dropdown-toggle">Hi, <%=session.getAttribute("username")%><b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            	<li><a href="about.html">About</a></li>
	
	<li><a href="bookinghistory.jsp">Booking History</a></li>
	<li><a href="editprofile.jsp">Editprofile</a></li>
	<li><a href="logout.jsp">Logout</a></li>
                        </ul>
					</li>
				</ul><!-- end nav navbar-nav navbar-right -->
				
				
				
	<%}
	
	%>
	
	
	
			</div><!-- end #navbar-collapse-1 -->
            
			</nav><!-- end navbar navbar-default w3_megamenu -->
		</div><!-- end container -->
    

<!-- AddThis Smart Layers END -->
