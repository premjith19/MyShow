<!-- header-section-starts -->
		
		
		<div class="container">
		  <div class="main-content">
			<div class="header">
				<div class="logo">
					<a href="admin.jsp"><h1>My Show</h1></a>
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
                    <li class="active"><a href="admin.jsp">Home</a></li>	
					
					
					
					<li class="dropdown"><a href="#" data-toggle="dropdown" class="dropdown-toggle">Add List<b class="caret"></b></a>
							 <ul class="dropdown-menu" role="menu">

	<li><a href="addmovie.jsp">Add Movie</a></li>
	<li><a href="blog.html">Add Theatre</a></li>
	<li><a href="addschedule.jsp">Add Schedule</a></li>
	                    </ul>
                       <!-- end dropdown-menu -->
					</li><!-- end standard drop down -->
					
					
					<li class="dropdown"><a href="#" data-toggle="dropdown" class="dropdown-toggle">Delete List<b class="caret"></b></a>
							 <ul class="dropdown-menu" role="menu">

	<li><a href="deletemovie.jsp">Delete Movie</a></li>
	<li><a href="deletereview.jsp">Delete Review</a></li>
	<li><a href="deletetheatre.jsp">Delete Theatre</a></li>
	
                            <li class="dropdown-submenu">
                                <a href="#">News</a>
								<ul class="dropdown-menu">
																	<li><a href="press.html">Press Release</a></li>
	<li><a href="public-relations.html">Public Relations</a></li>
	<li><a href="press.html">Press Coverage</a></li>
								</ul><!-- end dropdown-menu -->
                            </li><!-- end dropdown-submenu -->
                        </ul>
                       <!-- end dropdown-menu -->
					</li><!-- end standard drop down -->
					
					
					
					<li class="dropdown"><a href="#" data-toggle="dropdown" class="dropdown-toggle">Update List<b class="caret"></b></a>
							 <ul class="dropdown-menu" role="menu">

	<li><a href="about.html">About</a></li>
	<li><a href="blog.html">Blog</a></li>
	<li><a href="404.html">404</a></li>
	<li><a href="contact.html">Contact us</a></li>
	<li><a href="faq.html">FAQs</a></li>
	<li><a href="about.html">Current Openings</a></li>
                            <li class="dropdown-submenu">
                                <a href="#">News</a>
								<ul class="dropdown-menu">
																	<li><a href="press.html">Press Release</a></li>
	<li><a href="public-relations.html">Public Relations</a></li>
	<li><a href="press.html">Press Coverage</a></li>
								</ul><!-- end dropdown-menu -->
                            </li><!-- end dropdown-submenu -->
                        </ul>
                       <!-- end dropdown-menu -->
					</li><!-- end standard drop down -->
					<!-- end dropdown w3_megamenu-fw -->
					
					
					
					<li class="dropdown"><a href="#" data-toggle="dropdown" class="dropdown-toggle">Data List<b class="caret"></b></a>
							 <ul class="dropdown-menu" role="menu">

	<li><a href="contactlist.jsp">ContactList</a></li>
	<li><a href="schedulelist.jsp">Schedule List</a></li>
	<li><a href="bookinglist.jsp">Booking List</a></li>
	
                        </ul>
                       <!-- end dropdown-menu -->
					</li><!-- end standard drop down -->
					
					
					
					
					
					
                </ul><!-- end nav navbar-nav -->
                
				
				
				<%
    if ((session.getAttribute("username") == null) || (session.getAttribute("username") == "")) {}
	else{
%>
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a href="#" data-toggle="dropdown" class="dropdown-toggle">Hi, <%=session.getAttribute("username")%><b class="caret"></b></a>
                        <ul class="dropdown-menu">
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
