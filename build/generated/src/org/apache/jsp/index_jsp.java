package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import java.sql.*;
import java.text.*;
import java.io.*;
import java.util.Date;
import javax.servlet.*;
import java.sql.*;
import java.text.*;
import java.io.*;
import java.util.Date;
import javax.servlet.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/includes/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--\r\n");
      out.write("Author: W3layouts\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>My Show a Entertainment Category Flat Bootstarp responsive Website Template | Home :: w3layouts</title>\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/menu.css\" />\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"My Show Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!--webfont-->\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Oxygen:400,700,300' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t<!-- start menu -->\r\n");
      out.write("<link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/megamenu.js\"></script>\r\n");
      out.write("<script>$(document).ready(function(){$(\".megamenu\").megamenu();});</script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.leanModal.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" />\r\n");
      out.write("<script src=\"js/easyResponsiveTabs.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t    <script type=\"text/javascript\">\r\n");
      out.write("\t\t\t    $(document).ready(function () {\r\n");
      out.write("\t\t\t        $('#horizontalTab').easyResponsiveTabs({\r\n");
      out.write("\t\t\t            type: 'default', //Types: default, vertical, accordion           \r\n");
      out.write("\t\t\t            width: 'auto', //auto or any width like 600px\r\n");
      out.write("\t\t\t            fit: true   // 100% fit in a container\r\n");
      out.write("\t\t\t        });\r\n");
      out.write("\t\t\t    });\r\n");
      out.write("</script>\r\n");
      out.write("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("<script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<!---- start-smoth-scrolling---->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t\t\t$(\".scroll\").click(function(event){\t\t\r\n");
      out.write("\t\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        function submit()\r\n");
      out.write("                        {\r\n");
      out.write("                            var mid =document.getElementById(\"movie\").value;\r\n");
      out.write("                            var mdate =document.getElementById(\"mdate\").value;\r\n");
      out.write("                             //alert(movie+mdate);\r\n");
      out.write("                               // window.location =\"test.jsp?movie=\"+movie+\"&amp;mdate=\"+mdate;\r\n");
      out.write("                                                                window.location =\"movieselectshow.jsp?mid=\"+mid+\"&&mdate=\"+mdate;\r\n");
      out.write("    }\r\n");
      out.write("                        function cinema()\r\n");
      out.write("                        {\r\n");
      out.write("                            var tid =document.getElementById(\"cinema\").value;\r\n");
      out.write("                           // var mdate =document.getElementById(\"mdate\").value;\r\n");
      out.write("                             //alert(movie+mdate);\r\n");
      out.write("                               // window.location =\"test.jsp?movie=\"+movie+\"&amp;mdate=\"+mdate;\r\n");
      out.write("                                                                window.location =\"movielist.jsp?tid=\"+tid;\r\n");
      out.write("    }                   \r\n");
      out.write("\t\t</script>\r\n");
      out.write("<!---- start-smoth-scrolling---->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"images/movie2.jpg\">\r\n");
      out.write("\r\n");
      out.write("\t             \t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t");
      out.write("<!-- header-section-starts -->\r\n");
      out.write("\t\t<div class=\"header-top-strip\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"header-top-right\">\r\n");
      out.write("\t\t\t\t<div class=\"modal fade\">\r\n");
      out.write("  <div class=\"modal-dialog\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("        <h4 class=\"modal-title\">Modal title</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("        <p>One fine body&hellip;</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\">Save changes</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div><!-- /.modal-content -->\r\n");
      out.write("  </div><!-- /.modal-dialog -->\r\n");
      out.write("\t</div><!-- /.modal -->\r\n");
      out.write("\t<!-- Button trigger modal  -->\r\n");
      out.write("\r\n");
      out.write("\t<!---pop-up-box---->  \r\n");
      out.write("\t\t\t\t\t<link href=\"css/popuo-box.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("\t\t\t\t\t<script src=\"js/jquery.magnific-popup.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t\t\t\t<!---//pop-up-box---->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                     <script>\r\n");
      out.write("\t\t\t\t\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t\t\t\t$('.popup-with-zoom-anim').magnificPopup({\r\n");
      out.write("\t\t\t\t\t\t\ttype: 'inline',\r\n");
      out.write("\t\t\t\t\t\t\tfixedContentPos: false,\r\n");
      out.write("\t\t\t\t\t\t\tfixedBgPos: true,\r\n");
      out.write("\t\t\t\t\t\t\toverflowY: 'auto',\r\n");
      out.write("\t\t\t\t\t\t\tcloseBtnInside: true,\r\n");
      out.write("\t\t\t\t\t\t\tpreloader: false,\r\n");
      out.write("\t\t\t\t\t\t\tmidClick: true,\r\n");
      out.write("\t\t\t\t\t\t\tremovalDelay: 300,\r\n");
      out.write("\t\t\t\t\t\t\tmainClass: 'my-mfp-zoom-in'\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t<!-- Large modal -->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                                        \t   \r\n");
      out.write("      \r\n");
      out.write("\t\t\r\n");

    if ((session.getAttribute("username") == null) || (session.getAttribute("username") == "")) {

      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("<button class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#myModal\">\r\n");
      out.write("    Login</button>\r\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myLargeModalLabel\"\r\n");
      out.write("    aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-lg\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">\r\n");
      out.write("                    &times;</button>\r\n");
      out.write("                <h4 class=\"modal-title\" id=\"myModalLabel\">\r\n");
      out.write("                    Don't Wait, Login now!</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");

			String msg=request.getParameter("msg");
			
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-8\" style=\"border-right: 1px dotted #C2C2C2;padding-right: 30px;\">\r\n");
      out.write("                        <!-- Nav tabs -->\r\n");
      out.write("                        <ul class=\"nav nav-tabs\">\r\n");
      out.write("                            <li class=\"active\"><a href=\"#Login\" data-toggle=\"tab\">Login</a></li>\r\n");
      out.write("                            <li><a href=\"#Registration\" data-toggle=\"tab\">Registration</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <!-- Tab panes -->\r\n");
      out.write("                        <div class=\"tab-content\">\r\n");
      out.write("                            <div class=\"tab-pane active\" id=\"Login\">\r\n");
      out.write("                                <form role=\"form\" class=\"form-horizontal\" action=\"loginprocess.jsp\" method=\"post\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"email\" class=\"col-sm-2 control-label\">\r\n");
      out.write("                                        Email</label>\r\n");
      out.write("                                    <div class=\"col-sm-10\">\r\n");
      out.write("                                        <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email1\" placeholder=\"Email\" />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"exampleInputPassword1\" class=\"col-sm-2 control-label\">\r\n");
      out.write("                                        Password</label>\r\n");
      out.write("                                    <div class=\"col-sm-10\">\r\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" name=\"pwd\" placeholder=\"password\" />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-sm-2\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-10\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary btn-sm\">\r\n");
      out.write("                                            Submit</button>\r\n");
      out.write("                                        <a href=\"javascript:;\">Forgot your password?</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("                            <div class=\"tab-pane\" id=\"Registration\">\r\n");
      out.write("                                <form role=\"form\" class=\"form-horizontal\" action=\"registerprocess.jsp\" method=\"post\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"email\" class=\"col-sm-2 control-label\">\r\n");
      out.write("                                        Name</label>\r\n");
      out.write("                                    <div class=\"col-sm-10\">\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-md-3\">\r\n");
      out.write("                                                <select class=\"form-control\">\r\n");
      out.write("                                                    <option>Mr.</option>\r\n");
      out.write("                                                    <option>Ms.</option>\r\n");
      out.write("                                                    <option>Mrs.</option>\r\n");
      out.write("                                                </select>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-md-9\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"Name\" name=\"fname\" />\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"email\" class=\"col-sm-2 control-label\">\r\n");
      out.write("                                        Email</label>\r\n");
      out.write("                                    <div class=\"col-sm-10\">\r\n");
      out.write("                                        <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Email\" name=\"email\"/>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"mobile\" class=\"col-sm-2 control-label\">\r\n");
      out.write("                                        Mobile</label>\r\n");
      out.write("                                    <div class=\"col-sm-10\">\r\n");
      out.write("                                        <input type=\"mobile\" class=\"form-control\" id=\"mobile\" placeholder=\"Mobile\" name=\"mobile\" />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"password\" class=\"col-sm-2 control-label\">\r\n");
      out.write("                                        Password</label>\r\n");
      out.write("                                    <div class=\"col-sm-10\">\r\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" id=\"password\" placeholder=\"Password\" name=\"pwd\" />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-sm-2\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-10\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary btn-sm\">\r\n");
      out.write("                                            Save & Continue</button>\r\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-default btn-sm\">\r\n");
      out.write("                                            Cancel</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id=\"OR\" class=\"hidden-xs\">\r\n");
      out.write("                            OR</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <div class=\"row text-center sign-with\">\r\n");
      out.write("                            <div class=\"col-md-12\">\r\n");
      out.write("                                <h3 class=\"other-nw\">\r\n");
      out.write("                                    Sign in with</h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-12\">\r\n");
      out.write("                                <div class=\"btn-group btn-group-justified\">\r\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-primary\">Facebook</a> <a href=\"#\" class=\"btn btn-danger\">\r\n");
      out.write("                                        Google +</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("$('#myModal').modal('show');\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\t");
}
	
	
	else {

  Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
    
    Statement st = con.createStatement();
    ResultSet rs=st.executeQuery("select * from user where fname='"+session.getAttribute("username")+"'");
    
    while(rs.next())
               {
       
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");

    }}

      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t  <div class=\"main-content\">\r\n");
      out.write("\t\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t<a href=\"index.jsp\"><h1>My Show</h1></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t\t<div class=\"search2\">\r\n");
      out.write("\t\t\t\t\t  <form action=\"searchresult.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-search\"></i>\r\n");
      out.write("\t\t\t\t\t\t <input type=\"text\" name=\"search\" value=\"Search for a movie\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Search for a movie, play, event, sport or more';}\"/>\r\n");
      out.write("\t\t\t\t\t  </form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t<div class=\"bootstrap_container\">\r\n");
      out.write("            <nav class=\"navbar navbar-default w3_megamenu\" role=\"navigation\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("          \t\t\t<button type=\"button\" data-toggle=\"collapse\" data-target=\"#defaultmenu\" class=\"navbar-toggle\"><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span></button><a href=\"index.jsp\" class=\"navbar-brand\"><i class=\"fa fa-home\"></i></a>\r\n");
      out.write("\t\t\t\t</div><!-- end navbar-header -->\r\n");
      out.write("        \r\n");
      out.write("            <div id=\"defaultmenu\" class=\"navbar-collapse collapse\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\t\r\n");
      out.write("                    <!-- Mega Menu -->\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown w3_megamenu-fw\"><a href=\"movies.html\" data-toggle=\"dropdown\" class=\"dropdown-toggle\">Movies<b class=\"caret\"></b></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu fullwidth\">\r\n");
      out.write("                            <li class=\"w3_megamenu-content\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"movies-page\">for movies page - <a href=\"movies.html\">Click here</a> </h5>\r\n");
      out.write("                                    <div class=\"col-sm-4\">\r\n");
      out.write("                                  \t\t<h3 class=\"title\">Now Showing</h3>\r\n");
      out.write("\t\t\t\t\t");

					int count=0;

  Class.forName("com.mysql.jdbc.Driver");
       Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
    
    Statement stt = conn.createStatement();					
				int a;	
	ResultSet rsz=stt.executeQuery("SELECT avg(r.rate)*20 as perc ,m.mname, m.mid,m.mtype FROM review r,movie m where r.mid=m.mid group by mid order by rdate desc");
    
    while(rsz.next())
               {
    				
					
					
					a=rsz.getInt(1);
					
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul class=\"mov_list\">\r\n");
      out.write("\t\t\t\t\t\t<li>");
      out.print(a);
      out.write("%</li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"moviesingle.jsp?mid=");
      out.print(rsz.getString(3));
      out.write('"');
      out.write('>');
      out.print(rsz.getString(2));
      out.write(' ');
      out.write('(');
      out.print(rsz.getString(4));
      out.write(") </a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t   ");

			   
			   count++;
					if(count==5)
					{
						break;
				}
			   
			   
			   }
			   
			   
			   
			   
			   
      out.write("\r\n");
      out.write("                                    </div><!-- end col-4 -->\r\n");
      out.write("                                    <div class=\"col-sm-4 movie-dd\">\r\n");
      out.write("                                  \t\t<h3 class=\"title\">Next Change</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t                                   \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                              ");

                                Date dNown = new Date( );
   SimpleDateFormat ftn = new SimpleDateFormat ("d MMMM");
     SimpleDateFormat vftn= new SimpleDateFormat ("yyyy-MM-dd");
     
										
										ResultSet rch=stt.executeQuery("SELECT mname,DATE_FORMAT(rdate,'%W, %M %d'),mid FROM movie where rdate>'"+vftn.format(dNown)+"' order by rdate asc limit 5");
    
    while(rch.next())
               {
    
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p><a href=\"moviesingle.jsp?mid=");
      out.print(rch.getString("mid"));
      out.write('"');
      out.write('>');
      out.print(rch.getString("mname"));
      out.write("</a><span>... (");
      out.print(rch.getString(2));
      out.write(")</span></p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t   ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   </div><!-- end col-4 -->\r\n");
      out.write("                                    <div class=\"col-sm-4 movie-dd\">\r\n");
      out.write("                                  \t\t<h3 class=\"title\">Comming Soon</h3>\r\n");


ResultSet rchx=stt.executeQuery("SELECT mname,DATE_FORMAT(rdate,'%W, %M %d'),mid FROM movie where rdate>'"+vftn.format(dNown)+"' limit 5");
    
    while(rchx.next())
               {


      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p><a href=\"moviesingle.jsp?mid=");
      out.print(rchx.getString("mid"));
      out.write('"');
      out.write('>');
      out.print(rchx.getString("mname"));
      out.write("</a><span>... (");
      out.print(rchx.getString(2));
      out.write(")</span></p>\r\n");
      out.write("\t\t\t\t");

			   }
				
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div><!-- end col-4 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									
														int f=0;	
	ResultSet rk=stt.executeQuery("SELECT * FROM movie where rdate<'"+vftn.format(dNown)+"' order by rdate desc");
    
									
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"menu-featured-movies\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3 class=\"title\">Featured Trailers</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");


									while(rk.next())
									{
										
																					f++;
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-2 menu-featured-movies-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"moviesingle.jsp?mid=");
      out.print(rk.getString("mid"));
      out.write("\"><img src=\"");
      out.print(rk.getString("poster"));
      out.write("\" style=\"width:100px;height:150px;\"alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");

									
									
									if(f==6)
										{
											break;
											}
									
									}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                </div><!-- end row -->\r\n");
      out.write("                                <hr>\r\n");
      out.write("                    \r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- end dropdown w3_megamenu-fw -->\r\n");
      out.write("                </ul><!-- end nav navbar-nav -->\r\n");
      out.write("                \r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" data-toggle=\"dropdown\" class=\"dropdown-toggle\">Contact Us<b class=\"caret\"></b></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\">\r\n");
      out.write("                            <li>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");

    if ((session.getAttribute("username") == null) || (session.getAttribute("username") == "")) {

      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("                                <form id=\"contact1\" action=\"contactprocess.jsp\" name=\"contactform\" method=\"post\">\r\n");
      out.write("                                    <div class=\"col-lg-6 col-md-6 col-sm-12 col-xs-12\">\r\n");
      out.write("                                        <input type=\"text\" name=\"name\" id=\"name1\" class=\"form-control\" placeholder=\"Name\"> \r\n");
      out.write("                                        <input type=\"text\" name=\"email\" id=\"email1\" class=\"form-control\" placeholder=\"Email\"> \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-lg-6 col-md-6 col-sm-12 col-xs-12\">\r\n");
      out.write("                                        <input type=\"text\" name=\"phone\" id=\"phone1\" class=\"form-control\" placeholder=\"Phone\">\r\n");
      out.write("                                        <input type=\"text\" name=\"subject\" id=\"subject1\" class=\"form-control\" placeholder=\"Subject\"> \r\n");
      out.write("                                    </div>                 \r\n");
      out.write("                                    <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("                                        <textarea class=\"form-control\" name=\"comments\" id=\"comments1\" rows=\"6\" placeholder=\"Your Message ...\"></textarea>\r\n");
      out.write("                                    </div>   \r\n");
      out.write("                                    <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("                                        <div class=\"pull-right\">\r\n");
      out.write("                                            <input type=\"submit\" value=\"SEND\" id=\"submit1\" class=\"btn btn-primary small\">\r\n");
      out.write("                                        </div>  \r\n");
      out.write("                                    </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>  \r\n");
      out.write("                                </form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");

	}
	else{
		
		  Class.forName("com.mysql.jdbc.Driver");
       Connection cont=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
    
    Statement st = cont.createStatement();
    ResultSet ro=st.executeQuery("select * from user where fname='"+session.getAttribute("username")+"'");
		
		
		while(ro.next()){
		
		
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t                                <form id=\"contact1\" action=\"contactprocess.jsp\" name=\"contactform\" method=\"post\">\r\n");
      out.write("                                    <div class=\"col-lg-6 col-md-6 col-sm-12 col-xs-12\">\r\n");
      out.write("                                        <input type=\"text\" name=\"name\" id=\"name1\" value=\"");
      out.print(ro.getString("fname"));
      out.write("\" class=\"form-control\" placeholder=\"Name\"> \r\n");
      out.write("                                        <input type=\"text\" name=\"email\" id=\"email1\" value=\"");
      out.print(ro.getString("email"));
      out.write("\" class=\"form-control\" placeholder=\"Email\"> \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-lg-6 col-md-6 col-sm-12 col-xs-12\">\r\n");
      out.write("                                        <input type=\"text\" name=\"phone\" id=\"phone1\" class=\"form-control\" value=\"");
      out.print(ro.getString("mobile"));
      out.write("\" placeholder=\"Phone\">\r\n");
      out.write("                                        <input type=\"text\" name=\"subject\" id=\"subject1\" class=\"form-control\" placeholder=\"Subject\"> \r\n");
      out.write("                                    </div>                 \r\n");
      out.write("                                    <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("                                        <textarea class=\"form-control\" name=\"comments\" id=\"comments1\" rows=\"6\" placeholder=\"Your Message ...\"></textarea>\r\n");
      out.write("                                    </div>   \r\n");
      out.write("                                    <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("                                        <div class=\"pull-right\">\r\n");
      out.write("                                            <input type=\"submit\" value=\"SEND\" id=\"submit1\" class=\"btn btn-primary small\">\r\n");
      out.write("                                        </div>  \r\n");
      out.write("                                    </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>  \r\n");
      out.write("                                </form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t");
}}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");

    if ((session.getAttribute("username") == null) || (session.getAttribute("username") == "")) {}
	else{

      out.write("\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" data-toggle=\"dropdown\" class=\"dropdown-toggle\">Hi, ");
      out.print(session.getAttribute("username"));
      out.write("<b class=\"caret\"></b></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\">\r\n");
      out.write("                            \t<li><a href=\"about.html\">About</a></li>\r\n");
      out.write("\t<li><a href=\"blog.html\">Blog</a></li>\r\n");
      out.write("\t<li><a href=\"404.html\">404</a></li>\r\n");
      out.write("\t<li><a href=\"bookinghistory.jsp\">Booking History</a></li>\r\n");
      out.write("\t<li><a href=\"editprofile.jsp\">Editprofile</a></li>\r\n");
      out.write("\t<li><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul><!-- end nav navbar-nav navbar-right -->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t");
}
	
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t</div><!-- end #navbar-collapse-1 -->\r\n");
      out.write("            \r\n");
      out.write("\t\t\t</nav><!-- end navbar navbar-default w3_megamenu -->\r\n");
      out.write("\t\t</div><!-- end container -->\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<!-- AddThis Smart Layers END -->\r\n");
      out.write("  \r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"main-banner\">\r\n");
      out.write("\t\t <div class=\"banner col-md-8\">\r\n");
      out.write("\t\t\t<section class=\"slider\">\r\n");
      out.write("\t\t\t\t<div class=\"flexslider\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"slides\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/32-Prabhas-Baahubali-Movie-Wallpapers-Ultra-HD.jpg\" class=\"img-responsive\" style=\"width:666px;height:355px;\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/poster_h1.jpg\" class=\"img-responsive\" style=\"width:666px;height:355px;\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/1280x720-JDw.jpg\" class=\"img-responsive\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/pic4.jpg\" class=\"img-responsive\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t  </ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t <!-- FlexSlider -->\r\n");
      out.write("\t\t\t\t <script defer src=\"js/jquery.flexslider.js\"></script>\r\n");
      out.write("\t\t\t\t <link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\t\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t$(function(){\r\n");
      out.write("\t\t\t\t SyntaxHighlighter.all();\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$(window).load(function(){\r\n");
      out.write("\t\t\t\t  $('.flexslider').flexslider({\r\n");
      out.write("\t\t\t\t\tanimation: \"slide\",\r\n");
      out.write("\t\t\t\t\tstart: function(slider){\r\n");
      out.write("\t\t\t\t\t  $('body').removeClass('loading');\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t });\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t </script>\r\n");
      out.write("         </div>\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t <div class=\"col-md-4 banner-right\">\r\n");
      out.write("\t\t\t<h4>Instant Ticket Booking</h4>\r\n");
      out.write("\t\t\t<div class=\"grid_3 grid_5\">\r\n");
      out.write("\t\t\t\t   <div class=\"bs-example bs-example-tabs\" role=\"tabpanel\" data-example-id=\"togglable-tabs\">\r\n");
      out.write("\t\t\t<ul id=\"myTab\" class=\"nav nav-tabs\" role=\"tablist\">\r\n");
      out.write("\t\t\t  <li role=\"presentation\" class=\"active\"><a href=\"#home\" id=\"home-tab\" role=\"tab\" data-toggle=\"tab\" aria-controls=\"home\" aria-expanded=\"true\">Movies</a></li>\r\n");
      out.write("\t\t\t  <li role=\"presentation\"><a href=\"#profile\" role=\"tab\" id=\"profile-tab\" data-toggle=\"tab\" aria-controls=\"profile\" aria-expanded=\"false\">Cinema</a></li>\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<div id=\"myTabContent\" class=\"tab-content\">\r\n");
      out.write("\t\t\t  <div role=\"tabpanel\" class=\"tab-pane fade in active\" id=\"home\" aria-labelledby=\"home-tab\">\t\t\t\t  \r\n");
      out.write("                    \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t     \t\r\n");

    		
			  	Class.forName("com.mysql.jdbc.Driver");
       Connection cont=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
			   
			    Statement stmt = cont.createStatement();
				    ResultSet rt,rp,rz,rm;
                                    rt=stmt.executeQuery("select DISTINCT lang from movie");
   
   
	
      out.write("\r\n");
      out.write("                                            \r\n");
      out.write("                                        <select class=\"list_of_movies\" name=\"movie\" id=\"movie\">\r\n");
      out.write("\t\t\t\t\t<option>Select Movie</option>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("  \t\t\t\t\t");

					while(rt.next())
                                        {
                                          
             		    Statement stm = cont.createStatement();
          ResultSet ru=stm.executeQuery("select mname,mid from movie where lang='"+rt.getString("lang")+"' and rdate<'"+vftn.format(dNown)+"'");
        
                                            
      out.write("\r\n");
      out.write("                                         \r\n");
      out.write("                                            <optgroup label=\"");
      out.print(rt.getString("lang"));
      out.write("\">\r\n");
      out.write("                                           \t\t\t\t\t");

					while(ru.next())
                                        {
                                            
                                            
                                            
      out.write("\r\n");
      out.write("                                                   <option style=\"padding-left: 10px;\" value=\"");
      out.print(ru.getString("mid"));
      out.write('"');
      out.write('>');
      out.print(ru.getString("mname"));
      out.write("</option>\r\n");
      out.write("                                           ");

                                        }
                                            
      out.write("\r\n");
      out.write("                                            </optgroup>\r\n");
      out.write("                                              ");

                                        }
                                            
      out.write("\r\n");
      out.write("                                         \r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t         \r\n");
      out.write("                                        \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                              ");

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



                                
                                
                                
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<select class=\"list_of_movies\" name=\"mdate\" id=\"mdate\" onchange=\"submit();\">\r\n");
      out.write("                                        <option value=\"\">Select Date</option>\r\n");
      out.write("\t\t\t\t\t<option style=\"padding-left: 10px;\" value=\"");
      out.print(vft.format(dNow));
      out.write("\">Today, ");
      out.print(ft.format(dNow));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t<option style=\"padding-left: 10px;\" value=\"");
      out.print(vftt.format(dNo));
      out.write("\">Tomorrow, ");
      out.print(ftt.format(dNo));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t<option style=\"padding-left: 10px;\" value=\"");
      out.print(vfttd.format(d));
      out.write('"');
      out.write('>');
      out.print(fttd.format(d));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t<option style=\"padding-left: 10px;\" value=\"");
      out.print(vfttu.format(du));
      out.write('"');
      out.write('>');
      out.print(fttu.format(du));
      out.write("</option></select>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<h5 class=\"pre\"><i class=\"fa fa-heart\"></i>Preferred Cinemas :<h5>\r\n");
      out.write("\t\t\t\t\t<h6 class=\"ipre\"><a href=\"#\">Cinemax Cinemas: Malad(W), </a> <a href=\"#\"> INOX Cinemas: Kandivali(E)</a>, <a href=\"#\"></a></h6>\r\n");
      out.write("\t\t\t  </div>\r\n");


 rp=stmt.executeQuery("select tname,area,tid from theatre order by tname");


      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  <div role=\"tabpanel\" class=\"tab-pane fade\" id=\"profile\" aria-labelledby=\"profile-tab\">\r\n");
      out.write("\t\t\t\t  <select class=\"list_of_movies\" onchange=\"cinema();\" name=\"cinema\" id=\"cinema\"><option value=\"\">Select Cinema</option>\r\n");
      out.write("\t\t\t\t  <optgroup label=\"Cinema List\">\r\n");

while(rp.next())
{

      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<option style=\"padding-left: 10px;\" value=\"");
      out.print(rp.getString("tid"));
      out.write('"');
      out.write('>');
      out.print(rp.getString("tname"));
      out.write('(');
      out.print(rp.getString("area"));
      out.write(")</option>\r\n");
      out.write("\r\n");

}

      out.write("\r\n");
      out.write("\t\t\t\t</optgroup>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  \r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t   </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t <div class=\"clearfix\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");

	
	Class.forName("com.mysql.jdbc.Driver");
	  
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cinema","root","");
    
    Statement st = con.createStatement();
	ResultSet rs=st.executeQuery("select mid,mname,DATE_FORMAT(rdate,'%M %d, %Y'),poster from movie where rdate < '"+vft.format(dNow)+"'");
	
	
	
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"review-slider\">\r\n");
      out.write("\t\t\t <ul id=\"flexiselDemo1\">\r\n");
      out.write("\t\t\t");

				while(rs.next())
{

  
      out.write("\r\n");
      out.write("\t  \r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<a href=\"moviesingle.jsp?mid=");
      out.print(rs.getString("mid"));
      out.write("\"><img src=\"");
      out.print(rs.getString("poster"));
      out.write("\" style=\"width:200px;height:250px;\" alt=\"\"/></a>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"date-city\">\r\n");
      out.write("\t\t\t\t\t<h5><center>");
      out.print(rs.getString(3));
      out.write("</center></h5>\r\n");
      out.write("\t\t\t\t\t<h6><center>");
      out.print(rs.getString("mname"));
      out.write("</center></h6>\r\n");
      out.write("\t\t\t\t\t<div class=\"buy-tickets\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"movieselectshow.jsp?mid=");
      out.print(rs.getString("mid"));
      out.write("\">BUY TICKETS</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</li>\r\n");

}

      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(window).load(function() {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t  $(\"#flexiselDemo1\").flexisel({\r\n");
      out.write("\t\t\t\tvisibleItems: 5,\r\n");
      out.write("\t\t\t\tanimationSpeed: 1000,\r\n");
      out.write("\t\t\t\tautoPlay: true,\r\n");
      out.write("\t\t\t\tautoPlaySpeed: 3000,    \t\t\r\n");
      out.write("\t\t\t\tpauseOnHover: false,\r\n");
      out.write("\t\t\t\tenableResponsiveBreakpoints: true,\r\n");
      out.write("\t\t\t\tresponsiveBreakpoints: { \r\n");
      out.write("\t\t\t\t\tportrait: { \r\n");
      out.write("\t\t\t\t\t\tchangePoint:480,\r\n");
      out.write("\t\t\t\t\t\tvisibleItems: 2\r\n");
      out.write("\t\t\t\t\t}, \r\n");
      out.write("\t\t\t\t\tlandscape: { \r\n");
      out.write("\t\t\t\t\t\tchangePoint:640,\r\n");
      out.write("\t\t\t\t\t\tvisibleItems: 3\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\ttablet: { \r\n");
      out.write("\t\t\t\t\t\tchangePoint:800,\r\n");
      out.write("\t\t\t\t\t\tvisibleItems: 4\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"footer-top-grid\">\r\n");
      out.write("\t\t<div class=\"list-of-movies col-md-8\">\r\n");
      out.write("\t\t\t<div class=\"tabs\">\r\n");
      out.write("\t\t\t\t<div class=\"sap_tabs\">\t\r\n");
      out.write("\t\t\t\t\t\t <div id=\"horizontalTab\" style=\"display: block; width: 100%; margin: 0px;\">\r\n");
      out.write("\t\t\t\t\t\t  <ul class=\"resp-tabs-list\">\r\n");
      out.write("\t\t\t\t\t\t  \t  <li class=\"resp-tab-item\" aria-controls=\"tab_item-2\" role=\"tab\"><span>Now Playing</span></li>\r\n");
      out.write("\t\t\t\t\t\t\t  <li class=\"resp-tab-item\" aria-controls=\"tab_item-0\" role=\"tab\"><span>Comming Soon</span></li>\r\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t  </ul>\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");

                                
 rz=stmt.executeQuery("select * from movie where rdate < '"+vft.format(dNow)+"'order by mid desc limit 3");
 
 
 


      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"resp-tabs-container\">\r\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"tab-1 resp-tab-content\" aria-labelledby=\"tab_item-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"tab_img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  ");

									  while(rz.next())
									  {

										  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"view view-first\">\r\n");
      out.write("\t\t\t\t\t   \t\t  \t\t\t  <a href=\"moviesingle.jsp?mid=");
      out.print(rz.getString("mid"));
      out.write("\"> <img src=\"");
      out.print(rz.getString("poster"));
      out.write("\" style=\"width:220px;height:270px;\" class=\"img-responsive\" alt=\"\"/></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   <div class=\"info1\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <div class=\"mask\">\r\n");
      out.write("\t\t\t\t\t\t                     </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t              <div class=\"tab_desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"movieselectshow.jsp?mid=");
      out.print(rz.getString("mid"));
      out.write("\">Book Now</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  ");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t     </div>\t\r\n");
      out.write("\t\t\t\t\t\t\t     \r\n");
      out.write("\t\t\t\t\t\t\t     <div class=\"tab-1 resp-tab-content\" aria-labelledby=\"tab_item-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"tab_img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

										 rm=stmt.executeQuery("select DATE_FORMAT(rdate, '%M %d, %Y'),mid,mname,poster from movie where rdate > '"+vft.format(dNow)+"' limit 3");
										while(rm.next())
										{
										
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <div class=\"view view-first\">\r\n");
      out.write("\t\t\t\t\t   \t\t  \t\t\t  <a href=\"moviesingle.jsp?mid=");
      out.print(rm.getString("mid"));
      out.write("\"> <img src=\"");
      out.print(rm.getString("poster"));
      out.write("\" style=\"width:220px;height:270px;\" class=\"img-responsive\" alt=\"\"/></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <div class=\"mask\">\r\n");
      out.write("\t\t\t\t\t\t                        <div class=\"info1\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t              </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t                <div class=\"tab_desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"moviesingle.jsp?mid=");
      out.print(rm.getString("mid"));
      out.write('"');
      out.write('>');
      out.print(rm.getString(1));
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t     </div>\t\r\n");
      out.write("\t\t\t\t\t\t\t     <div class=\"tab-1 resp-tab-content\" aria-labelledby=\"tab_item-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"tab_img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"view view-first\">\r\n");
      out.write("\t\t\t\t\t   \t\t  \t\t\t  <a href=\"movie-select-show.html\"> <img src=\"images/pic-6.jpg\" class=\"img-responsive\" alt=\"\"/></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <div class=\"mask\">\r\n");
      out.write("\t\t\t\t\t\t                        <div class=\"info1\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t              </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t                <div class=\"tab_desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"movie-select-show.html\">Book Now</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <div class=\"view view-first\">\r\n");
      out.write("\t\t\t\t\t   \t\t  \t\t\t  <a href=\"movie-select-show.html\"> <img src=\"images/pic-1.jpg\" class=\"img-responsive\" alt=\"\"/></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <div class=\"mask\">\r\n");
      out.write("\t\t\t\t\t\t                        <div class=\"info1\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t              </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t                <div class=\"tab_desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"movie-select-show.html\">Book Now</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <div class=\"view view-first\">\r\n");
      out.write("\t\t\t\t\t   \t\t  \t\t\t  <a href=\"movie-select-show.html\"> <img src=\"images/pic-9.jpg\" class=\"img-responsive\" alt=\"\"/></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <div class=\"mask\">\r\n");
      out.write("\t\t\t\t\t\t                        <div class=\"info1\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t              </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t                <div class=\"tab_desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"movie-select-show.html\">Book Now</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t    \t</div>\t\t        \t\t\t\t\t \t        \t\t\t\t\t \r\n");
      out.write("\t\t\t     \t\t    </div>\t\r\n");
      out.write("                        </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"featured\">\r\n");
      out.write("\t\t\t\t\t<h4>Featured</h4>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"f-movie\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"f-movie-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"movies.html\"><img src=\"images/f4.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"f-movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"movies.html\">Lorem Ipsum used since</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Multi city</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"f-buy-tickets\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"movie-select-show.html\">BUY TICKETS</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"f-movie\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"f-movie-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"movies.html\"><img src=\"images/f5.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"f-movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"movies.html\">looked up one of more</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Multi city</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"f-buy-tickets\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"movie-select-show.html\">BUY TICKETS</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"f-movie\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"f-movie-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"movies.html\"><img src=\"images/f6.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"f-movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"movies.html\">The Live Lorem Ipsum </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Mumbai</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"f-buy-tickets\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"movie-select-show.html\">BUY TICKETS</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"f-movie\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"f-movie-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"movies.html\"><img src=\"images/f1.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"f-movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"movies.html\">The standard chunk</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Multi city</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"f-buy-tickets\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"movie-select-show.html\">BUY TICKETS</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"f-movie\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"f-movie-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"movies.html\"><img src=\"images/f2.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"f-movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"movies.html\">There are many 'variations'</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Multi city</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"f-buy-tickets\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"movie-select-show.html\">BUY TICKETS</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"f-movie\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"f-movie-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"movies.html\"><img src=\"images/f3.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"f-movie-name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"movies.html\">The Live Tribute Show</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>Mumbai</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"f-buy-tickets\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"movie-select-show.html\">BUY TICKETS</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t  ");

  	
	ResultSet rsrt=st.executeQuery("SELECT avg(r.rate)*20 as perc ,m.mname, m.mid,m.mtype FROM review r,movie m where r.mid=m.mid group by mid order by perc desc ");
    int rate;

	  
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"right-side-bar\">\r\n");
      out.write("\t\t\t\t<div class=\"top-movies-in-india\">\r\n");
      out.write("\t\t\t\t\t<h4>Top Movies in India</h4>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");




		while(rsrt.next())
		{
			rate=rsrt.getInt(1);
		
			
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul class=\"mov_list\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li><i class=\"fa fa-star\"></i></li>\r\n");
      out.write("\t\t\t\t\t\t<li>");
      out.print(rate);
      out.write("%</li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"moviesingle.jsp?mid=");
      out.print(rsrt.getString(3));
      out.write('"');
      out.write('>');
      out.print(rsrt.getString(2));
      out.write('(');
      out.print(rsrt.getString(4));
      out.write(")</a></li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");

		}
		
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"quick-pay\">\r\n");
      out.write("\t\t\t\t\t<h3>Quick Pay</h3>\r\n");
      out.write("\t\t\t\t\t<p class=\"payText\">Make your online payments a breeze. Save your Credit, Debit card and Netbanking in your MyShow profile.. <a href=\"#\">Read more</a></p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"our-blog\">\r\n");
      out.write("\t\t\t\t\t<h5>Our Blog</h5>\r\n");
      out.write("\t\t\t\t\t<div class=\"post-article\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"blog.html\" class=\"post-title\">Bollywood?s Lesser Known Destinations</a>\r\n");
      out.write("\t\t\t\t\t\t<i>Posted on September 26, 2015</i>\r\n");
      out.write("\t\t\t\t\t\t<p>From shooting films in India alone, filmmakers have gone a long way to explore new destinations. Yash Chopra was known to film at least one romantic s...<br> <a href=\"blog.html\">Read more</a></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"post-article\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"blog.html\" class=\"post-title\">THE INTERN</a>\r\n");
      out.write("\t\t\t\t\t\t<i>Posted on September 25, 2015</i>\r\n");
      out.write("\t\t\t\t\t\t<p>The Intern, starring Robert De Niro and Anne Hathaway, is the sort of breezy, feel-good film that you?d typically stack in the rom-com pile, exc...<br> <a href=\"blog.html\">Read more</a></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t<div class=\"footer-top-strip\">\r\n");
      out.write("\t\t\t<p><span>Next Change <i>(Friday, 19 Jun) </i>: </span><a href=\"movie-single.html\">Disney's ABCD 2 (3D) (U)</a>, <a href=\"movie-single.html\"> 2 Premi Premache</a> , <a href=\"movie-single.html\">Dekh Ke (Bhojpuri)</a> , <a href=\"movie-single.html\">Disney's ABCD 2 (2D) (U)</a>, <a href=\"movie-single.html\">Dekh Ke (Bhojpuri)</a></p>\r\n");
      out.write("\t\t\t<p><span>Coming Soon :</span><a href=\"movie-single.html\"> 2 Premi Premache</a>, <a href=\"movie-single.html\">Acharam, Dekh Ke (Bhojpuri)</a>, <a href=\"movie-single.html\">Entourage</a>, <a href=\"movie-single.html\">Kuttram Kadithal</a></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"footer\">\r\n");
      out.write("\t\t\t<div class=\"col-md-3 footer-left\">\r\n");
      out.write("\t\t\t\t<div class=\"f-mov-list\">\r\n");
      out.write("\t\t\t\t\t<h4>Latest Movies</h4>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"now-showing.html\">Now Showing</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"comming-soon.html\">Coming Soon</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"celebrities.html\">Movie Celebrities</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"f-mov-list\">\r\n");
      out.write("\t\t\t\t\t<h4>Movie Reviews</h4>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"404.html\" target=\"target_blank\">Entertainment News</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"blog.html\" target=\"target_blank\">Rajeev Masand</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"blog.html\" target=\"target_blank\">Film Reviews</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"write-us.html\" target=\"target_blank\">Guest Blogging</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"f-mov-list\">\r\n");
      out.write("\t\t\t\t\t<h4>Movie Trailers</h4>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"trailers-now-showing.html\">Now Showing</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"trailers-comming-soon.html\">Coming Soon</a></li>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3 footer-left\">\r\n");
      out.write("\t\t\t\t<div class=\"f-mov-list\">\r\n");
      out.write("\t\t\t\t\t<h4>Cinemas & Regions</h4>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"regions.html\">All Regions</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"cinema-chain.html\">Cinema Chains</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"cinemas.html\">Cinemas</a></li>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"f-mov-list\">\r\n");
      out.write("\t\t\t\t\t<h4>Movies by Language</h4>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Hindi</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">English</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Marathi</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Bengali</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Tamil</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Telugu</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Malayalam</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Bhojpuri</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Kannada</a></li>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3 footer-left\">\r\n");
      out.write("\t\t\t\t<div class=\"f-mov-list\">\r\n");
      out.write("\t\t\t\t\t<h4>Exclusives</h4>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"donate.html\">Book A Smile</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"vochers.html\">Corporate Vouchers</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"gift-cards.html\">Gift Cards</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t<div class=\"f-mov-list\">\r\n");
      out.write("\t\t\t\t\t<h4>Help</h4>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"site-map.html\">Sitemap</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"feed-back.html\">Feedback</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"faq.html\">FAQs</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"terms-and-conditions.html\">Terms and Conditions</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"privacy-policy.html\">Privacy Policy</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3 footer-left\">\r\n");
      out.write("\t\t\t\t<div class=\"f-mov-list\">\r\n");
      out.write("\t\t\t\t\t<h4>Movies by Genre</h4>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Action</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Romance</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Comedy</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Adult</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Adventure</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Classic</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Crime</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Drama</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Family </a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Fantasy</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Musical</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Mystery</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Suspense</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"movies.html\">Thriller</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t<div class=\"footer-right\">\r\n");
      out.write("\t\t\t\t<div class=\"follow-us\">\r\n");
      out.write("\t\t\t\t\t<h5 class=\"f-head\">Follow us</h5>\r\n");
      out.write("\t\t\t\t\t<ul class=\"social-icons\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-youtube\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-pinterest\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"subscribe\">\r\n");
      out.write("\t\t\t\t\t<h5 class=\"f-head\">Subscribe to our newsletters</h5>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"text\" value=\"Enter Email ID\" onfocus=\"this.value = '';\" onblur=\"if (this.value == 'Enter email...') {this.value = 'Enter Email ID';}\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"submit\">\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"recent_24by7\">\r\n");
      out.write("\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\" href=\"#\"><i class=\"fa fa-calendar-o\"></i>Resend Booking Confirmation</a>\r\n");
      out.write("\t\t\t\t\t<a href=\"support.html\"><i class=\"fa fa-question\"></i>24/7 Customer Care</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"copy-rights text-center\">\r\n");
      out.write("\t\t\t\t<p>© 2015 My Show. All Rights Reserved | Design by <a href=\"http://w3layouts.com/\">W3layouts</a></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t\t\t\t\t/*\r\n");
      out.write("\t\t\t\t\t\t\tvar defaults = {\r\n");
      out.write("\t\t\t\t\t  \t\t\tcontainerID: 'toTop', // fading element id\r\n");
      out.write("\t\t\t\t\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\r\n");
      out.write("\t\t\t\t\t\t\t\tscrollSpeed: 1200,\r\n");
      out.write("\t\t\t\t\t\t\t\teasingType: 'linear' \r\n");
      out.write("\t\t\t\t\t \t\t};\r\n");
      out.write("\t\t\t\t\t\t\t*/\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t<a href=\"#home\" class=\"scroll\" id=\"toTop\" style=\"display: block;\"> <span id=\"toTopHover\" style=\"opacity: 1;\"> </span></a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
