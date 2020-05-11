package org.apache.jsp.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import java.text.*;
import java.io.*;
import java.util.Date;
import javax.servlet.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog1\">Select a Region</a>\r\n");
      out.write("\t<!---pop-up-box---->  \r\n");
      out.write("\t\t\t\t\t<link href=\"css/popuo-box.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("\t\t\t\t\t<script src=\"js/jquery.magnific-popup.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t\t\t\t<!---//pop-up-box---->\r\n");
      out.write("\t\t\t\t\t<div id=\"small-dialog1\" class=\"mfp-hide\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"select-city\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Select Your City</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<select class=\"list_of_cities\"><option value=\"\">Select Your City</option><optgroup label=\"Andhra Pradesh\"><option style=\"padding-left: 10px;\" value=\"ANAN\">Anantapur</option><option style=\"padding-left: 10px;\" value=\"CHDM\">Chinnamandem</option><option style=\"padding-left: 10px;\" value=\"GUDR\">Gudur</option><option style=\"padding-left: 10px;\" value=\"GUNT\">Guntur</option><option style=\"padding-left: 10px;\" value=\"JANG\">Jangareddy Gudem</option><option style=\"padding-left: 10px;\" value=\"KAKI\">Kakinada</option><option style=\"padding-left: 10px;\" value=\"KURN\">Kurnool</option><option style=\"padding-left: 10px;\" value=\"MART\">Martur</option><option style=\"padding-left: 10px;\" value=\"PRVT\">Parvathipuram</option><option style=\"padding-left: 10px;\" value=\"RAJA\">Rajahmundry</option><option style=\"padding-left: 10px;\" value=\"TENA\">Tenali</option><option style=\"padding-left: 10px;\" value=\"TIRU\">Tirupati</option><option style=\"padding-left: 10px;\" value=\"VIJA\">Vijayawada</option><option style=\"padding-left: 10px;\" value=\"VIZA\">Vizag</option><option style=\"padding-left: 10px;\" value=\"VIZI\">Vizianagaram</option></optgroup><optgroup label=\"Arunachal Pradesh\"><option style=\"padding-left: 10px;\" value=\"TAWA\">Tawang</option><option style=\"padding-left: 10px;\" value=\"ZIRO\">Ziro</option></optgroup><optgroup label=\"Assam\"><option style=\"padding-left: 10px;\" value=\"DIB\">Dibrugarh</option><option style=\"padding-left: 10px;\" value=\"GUW\">Guwahati</option><option style=\"padding-left: 10px;\" value=\"JORT\">Jorhat</option><option style=\"padding-left: 10px;\" value=\"SIL\">Silchar</option><option style=\"padding-left: 10px;\" value=\"TINS\">Tinsukia</option></optgroup><optgroup label=\"Bihar\"><option style=\"padding-left: 10px;\" value=\"HAJI\">Hajipur</option><option style=\"padding-left: 10px;\" value=\"PATN\">Patna</option></optgroup><optgroup label=\"Chhattisgarh\"><option style=\"padding-left: 10px;\" value=\"BHILAI\">Bhilai</option><option style=\"padding-left: 10px;\" value=\"BILA\">Bilaspur</option><option style=\"padding-left: 10px;\" value=\"CHAM\">Champa</option><option style=\"padding-left: 10px;\" value=\"DHMT\">Dhamtari</option><option style=\"padding-left: 10px;\" value=\"DURG\">Durg</option><option style=\"padding-left: 10px;\" value=\"JAGD\">Jagdalpur</option><option style=\"padding-left: 10px;\" value=\"KAWA\">Kawardha</option><option style=\"padding-left: 10px;\" value=\"KNGN\">Kondagaon</option><option style=\"padding-left: 10px;\" value=\"KRBA\">Korba</option><option style=\"padding-left: 10px;\" value=\"RAIG\">Raigarh</option><option style=\"padding-left: 10px;\" value=\"RAIPUR\">Raipur</option><option style=\"padding-left: 10px;\" value=\"TNO\">Tilda Neora</option></optgroup><optgroup label=\"Croatia\"><option style=\"padding-left: 10px;\" value=\"DBRV\">Dubrovnik</option></optgroup><optgroup label=\"Goa\"><option style=\"padding-left: 10px;\" value=\"GOA\">Goa</option></optgroup><optgroup label=\"Gujarat\"><option style=\"padding-left: 10px;\" value=\"ADPR\">Adipur</option><option style=\"padding-left: 10px;\" value=\"AHD\">Ahmedabad</option><option style=\"padding-left: 10px;\" value=\"AND\">Anand</option><option style=\"padding-left: 10px;\" value=\"ANKL\">Ankleshwar</option><option style=\"padding-left: 10px;\" value=\"BHAR\">Bharuch</option><option style=\"padding-left: 10px;\" value=\"BHNG\">Bhavnagar</option><option style=\"padding-left: 10px;\" value=\"DAMA\">Daman</option><option style=\"padding-left: 10px;\" value=\"GDHAM\">Gandhidham</option><option style=\"padding-left: 10px;\" value=\"GNAGAR\">Gandhinagar</option><option style=\"padding-left: 10px;\" value=\"HIMM\">Himmatnagar</option><option style=\"padding-left: 10px;\" value=\"IDAR\">Idar</option><option style=\"padding-left: 10px;\" value=\"JAM\">Jamnagar</option><option style=\"padding-left: 10px;\" value=\"JETP\">Jetpur</option><option style=\"padding-left: 10px;\" value=\"JUGH\">Junagadh</option><option style=\"padding-left: 10px;\" value=\"KTCH\">Kutch</option><option style=\"padding-left: 10px;\" value=\"NADI\">Nadiad</option><option style=\"padding-left: 10px;\" value=\"NVSR\">Navsari</option><option style=\"padding-left: 10px;\" value=\"PALN\">Palanpur</option><option style=\"padding-left: 10px;\" value=\"PATA\">Patan</option><option style=\"padding-left: 10px;\" value=\"RAJK\">Rajkot</option><option style=\"padding-left: 10px;\" value=\"SANA\">Sanand</option><option style=\"padding-left: 10px;\" value=\"SILV\">Silvassa</option><option style=\"padding-left: 10px;\" value=\"SURT\">Surat</option><option style=\"padding-left: 10px;\" value=\"VAD\">Vadodara</option><option style=\"padding-left: 10px;\" value=\"VLSD\">Valsad</option><option style=\"padding-left: 10px;\" value=\"VAPI\">Vapi</option></optgroup><optgroup label=\"Haryana\"><option style=\"padding-left: 10px;\" value=\"AMB\">Ambala</option><option style=\"padding-left: 10px;\" value=\"DHRA\">Dharuhera</option><option style=\"padding-left: 10px;\" value=\"FARI\">Faridabad</option><option style=\"padding-left: 10px;\" value=\"HISR\">Hisar</option><option style=\"padding-left: 10px;\" value=\"JHAJ\">Jhajjar</option><option style=\"padding-left: 10px;\" value=\"JIND\">Jind</option><option style=\"padding-left: 10px;\" value=\"KAIT\">Kaithal</option><option style=\"padding-left: 10px;\" value=\"KARN\">Karnal</option><option style=\"padding-left: 10px;\" value=\"KUND\">Kundli</option><option style=\"padding-left: 10px;\" value=\"KURU\">Kurukshetra</option><option style=\"padding-left: 10px;\" value=\"PNCH\">Panchkula</option><option style=\"padding-left: 10px;\" value=\"PAN\">Panipat</option><option style=\"padding-left: 10px;\" value=\"REWA\">Rewari</option><option style=\"padding-left: 10px;\" value=\"ROH\">Rohtak</option><option style=\"padding-left: 10px;\" value=\"SISA\">Sirsa</option><option style=\"padding-left: 10px;\" value=\"RAIH\">Sonipat</option><option style=\"padding-left: 10px;\" value=\"YAMU\">Yamunanagar</option></optgroup><optgroup label=\"Himachal Pradesh\"><option style=\"padding-left: 10px;\" value=\"BADD\">Baddi</option><option style=\"padding-left: 10px;\" value=\"DMSL\">Dharamsala</option><option style=\"padding-left: 10px;\" value=\"HAMI\">Hamirpur (HP)</option><option style=\"padding-left: 10px;\" value=\"KANG\">Kangra</option><option style=\"padding-left: 10px;\" value=\"KULU\">Kullu</option><option style=\"padding-left: 10px;\" value=\"MANA\">Manali</option><option style=\"padding-left: 10px;\" value=\"SMLA\">Shimla</option><option style=\"padding-left: 10px;\" value=\"SCO\">Solan</option></optgroup><optgroup label=\"Jammu and Kashmir\"><option style=\"padding-left: 10px;\" value=\"JAMM\">Jammu</option><option style=\"padding-left: 10px;\" value=\"KATH\">Kathua</option><option style=\"padding-left: 10px;\" value=\"KATR\">Katra</option><option style=\"padding-left: 10px;\" value=\"LEHA\">Ladakh</option></optgroup><optgroup label=\"Jharkhand\"><option style=\"padding-left: 10px;\" value=\"BOKA\">Bokaro</option><option style=\"padding-left: 10px;\" value=\"DOGH\">Deoghar</option><option style=\"padding-left: 10px;\" value=\"DHAN\">Dhanbad(Jharkhand)</option><option style=\"padding-left: 10px;\" value=\"JMDP\">Jamshedpur</option><option style=\"padding-left: 10px;\" value=\"RANC\">Ranchi</option></optgroup><optgroup label=\"Karnataka\"><option style=\"padding-left: 10px;\" value=\"BELG\">Belgaum</option><option style=\"padding-left: 10px;\" value=\"BANG\">Bengaluru</option><option style=\"padding-left: 10px;\" value=\"BIDR\">Bidar</option><option style=\"padding-left: 10px;\" value=\"COOR\">Coorg</option><option style=\"padding-left: 10px;\" value=\"DAVA\">Davangere</option><option style=\"padding-left: 10px;\" value=\"GULB\">Gulbarga</option><option style=\"padding-left: 10px;\" value=\"HUBL\">Hubli</option><option style=\"padding-left: 10px;\" value=\"KWAR\">Karwar</option><option style=\"padding-left: 10px;\" value=\"MLR\">Mangalore</option><option style=\"padding-left: 10px;\" value=\"MANI\">Manipal</option><option style=\"padding-left: 10px;\" value=\"MYS\">Mysore</option><option style=\"padding-left: 10px;\" value=\"TUMK\">Tumkur</option><option style=\"padding-left: 10px;\" value=\"UDUP\">Udupi</option></optgroup><optgroup label=\"Kerala\"><option style=\"padding-left: 10px;\" value=\"99\">Alappuzha</option><option style=\"padding-left: 10px;\" value=\"ANHL\">Anchal</option><option style=\"padding-left: 10px;\" value=\"ANGA\">Angamaly</option><option style=\"padding-left: 10px;\" value=\"ERNK\">Ernakulam</option><option style=\"padding-left: 10px;\" value=\"KANN\">Kannur</option><option style=\"padding-left: 10px;\" value=\"KARG\">Karunagapally</option><option style=\"padding-left: 10px;\" value=\"KOCH\">Kochi</option><option style=\"padding-left: 10px;\" value=\"KOLM\">Kollam</option><option style=\"padding-left: 10px;\" value=\"KTYM\">Kottayam</option><option style=\"padding-left: 10px;\" value=\"MVLR\">Mavellikara</option><option style=\"padding-left: 10px;\" value=\"THAL\">Thalayolaparambu</option><option style=\"padding-left: 10px;\" value=\"THSR\">Thrissur</option><option style=\"padding-left: 10px;\" value=\"TRIV\">Trivandrum</option></optgroup><optgroup label=\"Madhya Pradesh\"><option style=\"padding-left: 10px;\" value=\"BLGT\">Balaghat</option><option style=\"padding-left: 10px;\" value=\"BETU\">Betul</option><option style=\"padding-left: 10px;\" value=\"BHOP\">Bhopal</option><option style=\"padding-left: 10px;\" value=\"CHIN\">Chhindwara</option><option style=\"padding-left: 10px;\" value=\"DEWAS\">Dewas</option><option style=\"padding-left: 10px;\" value=\"GWAL\">Gwalior</option><option style=\"padding-left: 10px;\" value=\"HRDA\">Harda</option><option style=\"padding-left: 10px;\" value=\"IND\">Indore</option><option style=\"padding-left: 10px;\" value=\"JABL\">Jabalpur</option><option style=\"padding-left: 10px;\" value=\"KHDW\">Khandwa</option><option style=\"padding-left: 10px;\" value=\"NMCH\">Neemuch</option><option style=\"padding-left: 10px;\" value=\"RATL\">Ratlam</option><option style=\"padding-left: 10px;\" value=\"SAMP\">Sagar</option><option style=\"padding-left: 10px;\" value=\"SARN\">Sarni</option><option style=\"padding-left: 10px;\" value=\"SEHO\">Sehore</option><option style=\"padding-left: 10px;\" value=\"SEON\">Seoni</option><option style=\"padding-left: 10px;\" value=\"SHIV\">Shivpuri</option><option style=\"padding-left: 10px;\" value=\"UJJN\">Ujjain</option></optgroup><optgroup label=\"Maharashtra\"><option style=\"padding-left: 10px;\" value=\"AHMED\">Ahmednagar</option><option style=\"padding-left: 10px;\" value=\"AKOL\">Akola</option><option style=\"padding-left: 10px;\" value=\"ALBG\">Alibaug</option><option style=\"padding-left: 10px;\" value=\"AMRA\">Amravati</option><option style=\"padding-left: 10px;\" value=\"AURA\">Aurangabad</option><option style=\"padding-left: 10px;\" value=\"BARA\">Baramati</option><option style=\"padding-left: 10px;\" value=\"BEED\">Beed</option><option style=\"padding-left: 10px;\" value=\"BHIW\">Bhiwandi</option><option style=\"padding-left: 10px;\" value=\"BOIS\">Boisar</option><option style=\"padding-left: 10px;\" value=\"BULD\">Buldana</option><option style=\"padding-left: 10px;\" value=\"CHAN\">Chandrapur</option><option style=\"padding-left: 10px;\" value=\"DHLE\">Dhule</option><option style=\"padding-left: 10px;\" value=\"DHUL\">Dhulia</option><option style=\"padding-left: 10px;\" value=\"INDA\">Indapur</option><option style=\"padding-left: 10px;\" value=\"JALG\">Jalgaon</option><option style=\"padding-left: 10px;\" value=\"KHED\">Khed</option><option style=\"padding-left: 10px;\" value=\"KHOP\">Khopoli</option><option style=\"padding-left: 10px;\" value=\"KOLH\">Kolhapur</option><option style=\"padding-left: 10px;\" value=\"LAT\">Latur</option><option style=\"padding-left: 10px;\" value=\"LAVA\">Lavasa</option><option style=\"padding-left: 10px;\" value=\"LNVL\">Lonavala</option><option style=\"padding-left: 10px;\" value=\"MHAD\">Mahad</option><option style=\"padding-left: 10px;\" value=\"MALE\">Malegaon</option><option style=\"padding-left: 10px;\" value=\"MUMBAI\">Mumbai</option><option style=\"padding-left: 10px;\" value=\"NAGP\">Nagpur</option><option style=\"padding-left: 10px;\" value=\"NAND\">Nanded</option><option style=\"padding-left: 10px;\" value=\"NASK\">Nashik</option><option style=\"padding-left: 10px;\" value=\"PALG\">Palghar</option><option style=\"padding-left: 10px;\" value=\"PANC\">Panchgani</option><option style=\"padding-left: 10px;\" value=\"PARB\">Parbhani</option><option style=\"padding-left: 10px;\" value=\"PEN\">Pen</option><option style=\"padding-left: 10px;\" value=\"PHAL\">Phaltan</option><option style=\"padding-left: 10px;\" value=\"PIMP\">Pimpri</option><option style=\"padding-left: 10px;\" value=\"PUNE\">Pune</option><option style=\"padding-left: 10px;\" value=\"RAI\">Raigad</option><option style=\"padding-left: 10px;\" value=\"SANG\">Sangli</option><option style=\"padding-left: 10px;\" value=\"SATA\">Satara</option><option style=\"padding-left: 10px;\" value=\"SOLA\">Solapur</option><option style=\"padding-left: 10px;\" value=\"TMB\">Tembhode</option><option style=\"padding-left: 10px;\" value=\"UDGR\">Udgir</option><option style=\"padding-left: 10px;\" value=\"WARD\">Wardha</option></optgroup><optgroup label=\"Meghalaya\"><option style=\"padding-left: 10px;\" value=\"RNG\">Rongjeng</option><option style=\"padding-left: 10px;\" value=\"SHLG\">Shillong</option></optgroup><optgroup label=\"Nagaland\"><option style=\"padding-left: 10px;\" value=\"DMPR\">Dimapur</option></optgroup><optgroup label=\"NCR\"><option style=\"padding-left: 10px;\" value=\"NCR\">National Capital Region (NCR)</option></optgroup><optgroup label=\"Orissa\"><option style=\"padding-left: 10px;\" value=\"BLSR\">Balasore</option><option style=\"padding-left: 10px;\" value=\"BHUB\">Bhubaneshwar</option><option style=\"padding-left: 10px;\" value=\"PURI\">Puri</option><option style=\"padding-left: 10px;\" value=\"SAMB\">Sambalpur</option></optgroup><optgroup label=\"Punjab\"><option style=\"padding-left: 10px;\" value=\"ABOR\">Abohar</option><option style=\"padding-left: 10px;\" value=\"AHMG\">Ahmedgarh</option><option style=\"padding-left: 10px;\" value=\"AMRI\">Amritsar</option><option style=\"padding-left: 10px;\" value=\"BNGA\">Banga</option><option style=\"padding-left: 10px;\" value=\"BAR\">Barnala</option><option style=\"padding-left: 10px;\" value=\"BHAT\">Bathinda</option><option style=\"padding-left: 10px;\" value=\"CHD\">Chandigarh</option><option style=\"padding-left: 10px;\" value=\"HOSH\">Hoshiarpur</option><option style=\"padding-left: 10px;\" value=\"JALA\">Jalandhar</option><option style=\"padding-left: 10px;\" value=\"KHAN\">Khanna</option><option style=\"padding-left: 10px;\" value=\"KOTK\">Kotkapura</option><option style=\"padding-left: 10px;\" value=\"LUDH\">Ludhiana</option><option style=\"padding-left: 10px;\" value=\"MNSA\">Mansa</option><option style=\"padding-left: 10px;\" value=\"MOGA\">Moga</option><option style=\"padding-left: 10px;\" value=\"MOHL\">Mohali</option><option style=\"padding-left: 10px;\" value=\"NAVN\">Nawanshahr</option><option style=\"padding-left: 10px;\" value=\"PATH\">Pathankot</option><option style=\"padding-left: 10px;\" value=\"PATI\">Patiala</option><option style=\"padding-left: 10px;\" value=\"PATR\">Patran</option><option style=\"padding-left: 10px;\" value=\"RUPN\">Rupnagar</option><option style=\"padding-left: 10px;\" value=\"SANR\">Sangrur</option><option style=\"padding-left: 10px;\" value=\"ZIRK\">Zirakpur</option></optgroup><optgroup label=\"Rajasthan\"><option style=\"padding-left: 10px;\" value=\"ABRD\">Abu Road</option><option style=\"padding-left: 10px;\" value=\"AJMER\">Ajmer</option><option style=\"padding-left: 10px;\" value=\"ALSR\">Alsisar (Rajasthan)</option><option style=\"padding-left: 10px;\" value=\"ALWR\">Alwar</option><option style=\"padding-left: 10px;\" value=\"BANS\">Banswara</option><option style=\"padding-left: 10px;\" value=\"BEAW\">Beawar</option><option style=\"padding-left: 10px;\" value=\"BHIL\">Bhilwara</option><option style=\"padding-left: 10px;\" value=\"BHWD\">Bhiwadi</option><option style=\"padding-left: 10px;\" value=\"BIK\">Bikaner</option><option style=\"padding-left: 10px;\" value=\"DAUS\">Dausa</option><option style=\"padding-left: 10px;\" value=\"JAIP\">Jaipur</option><option style=\"padding-left: 10px;\" value=\"JSMR\">Jaisalmer</option><option style=\"padding-left: 10px;\" value=\"JODH\">Jodhpur</option><option style=\"padding-left: 10px;\" value=\"KISH\">Kishangarh</option><option style=\"padding-left: 10px;\" value=\"KOTA\">Kota</option><option style=\"padding-left: 10px;\" value=\"NEEM\">Neemrana</option><option style=\"padding-left: 10px;\" value=\"SIKR\">Sikar</option><option style=\"padding-left: 10px;\" value=\"SRIG\">Sri Ganganagar</option><option style=\"padding-left: 10px;\" value=\"UDAI\">Udaipur</option></optgroup><optgroup label=\"Singapore\"><option style=\"padding-left: 10px;\" value=\"SING\">Singapore</option></optgroup><optgroup label=\"Tamil Nadu\"><option style=\"padding-left: 10px;\" value=\"ARIY\">Ariyalur</option><option style=\"padding-left: 10px;\" value=\"ARNI\">Arni</option><option style=\"padding-left: 10px;\" value=\"ARUP\">Aruppukottai</option><option style=\"padding-left: 10px;\" value=\"CHEN\">Chennai</option><option style=\"padding-left: 10px;\" value=\"COIM\">Coimbatore</option><option style=\"padding-left: 10px;\" value=\"CUDD\">Cuddalore</option><option style=\"padding-left: 10px;\" value=\"DHAR\">Dharapuram</option><option style=\"padding-left: 10px;\" value=\"DMPI\">Dharmapuri</option><option style=\"padding-left: 10px;\" value=\"DIND\">Dindigul</option><option style=\"padding-left: 10px;\" value=\"EROD\">Erode</option><option style=\"padding-left: 10px;\" value=\"KNPM\">Kanchipuram</option><option style=\"padding-left: 10px;\" value=\"KUMB\">Kumbakonam</option><option style=\"padding-left: 10px;\" value=\"MADU\">Madurai</option><option style=\"padding-left: 10px;\" value=\"MTPM\">Mettuppalayam</option><option style=\"padding-left: 10px;\" value=\"OOTY\">Ooty</option><option style=\"padding-left: 10px;\" value=\"POND\">Pondicherry</option><option style=\"padding-left: 10px;\" value=\"PUDH\">Pudhukottai</option><option style=\"padding-left: 10px;\" value=\"SALM\">Salem</option><option style=\"padding-left: 10px;\" value=\"SIV\">Sivakasi</option><option style=\"padding-left: 10px;\" value=\"TAJO\">Tanjore</option><option style=\"padding-left: 10px;\" value=\"TENK\">Tenkasi</option><option style=\"padding-left: 10px;\" value=\"TIRV\">Tirunelveli</option><option style=\"padding-left: 10px;\" value=\"TIRP\">Tirupur</option><option style=\"padding-left: 10px;\" value=\"TRIC\">Trichy</option><option style=\"padding-left: 10px;\" value=\"VELL\">Vellore</option></optgroup><optgroup label=\"Telangana\"><option style=\"padding-left: 10px;\" value=\"ADIL\">Adilabad</option><option style=\"padding-left: 10px;\" value=\"AMAN\">Amangal</option><option style=\"padding-left: 10px;\" value=\"HYD\">Hyderabad</option><option style=\"padding-left: 10px;\" value=\"KARIM\">Karimnagar</option><option style=\"padding-left: 10px;\" value=\"KHAM\">Khammam</option><option style=\"padding-left: 10px;\" value=\"MRGD\">Miryalaguda</option><option style=\"padding-left: 10px;\" value=\"NIZA\">Nizamabad</option><option style=\"padding-left: 10px;\" value=\"PEDA\">Peddapalli</option><option style=\"padding-left: 10px;\" value=\"POCH\">Pochampally</option><option style=\"padding-left: 10px;\" value=\"SDDP\">Siddipet</option><option style=\"padding-left: 10px;\" value=\"SURY\">Suryapet</option><option style=\"padding-left: 10px;\" value=\"UPPA\">Uppal</option><option style=\"padding-left: 10px;\" value=\"WAR\">Warangal</option></optgroup><optgroup label=\"Tripura \"><option style=\"padding-left: 10px;\" value=\"AGAR\">Agartala</option></optgroup><optgroup label=\"Uttar Pradesh\"><option style=\"padding-left: 10px;\" value=\"AGRA\">Agra</option><option style=\"padding-left: 10px;\" value=\"ALI\">Aligarh</option><option style=\"padding-left: 10px;\" value=\"ALLH\">Allahabad</option><option style=\"padding-left: 10px;\" value=\"BARE\">Bareilly</option><option style=\"padding-left: 10px;\" value=\"BIJ\">Bijnor</option><option style=\"padding-left: 10px;\" value=\"GHAR\">Ghazipur</option><option style=\"padding-left: 10px;\" value=\"GRKP\">Gorakhpur</option><option style=\"padding-left: 10px;\" value=\"KANP\">Kanpur</option><option style=\"padding-left: 10px;\" value=\"LUCK\">Lucknow</option><option style=\"padding-left: 10px;\" value=\"MATH\">Mathura</option><option style=\"padding-left: 10px;\" value=\"MERT\">Meerut</option><option style=\"padding-left: 10px;\" value=\"MORA\">Moradabad</option><option style=\"padding-left: 10px;\" value=\"MUZ\">Muzaffarnagar</option><option style=\"padding-left: 10px;\" value=\"RENU\">Renukoot</option><option style=\"padding-left: 10px;\" value=\"SAHA\">Saharanpur</option><option style=\"padding-left: 10px;\" value=\"VAR\">Varanasi</option></optgroup><optgroup label=\"Uttarakhand\"><option style=\"padding-left: 10px;\" value=\"DEH\">Dehradun</option><option style=\"padding-left: 10px;\" value=\"HRDR\">Haridwar</option><option style=\"padding-left: 10px;\" value=\"MSS\">Mussoorie</option><option style=\"padding-left: 10px;\" value=\"NAIN\">Nainital</option><option style=\"padding-left: 10px;\" value=\"RAMN\">Ramnagar</option><option style=\"padding-left: 10px;\" value=\"RKES\">Rishikesh</option><option style=\"padding-left: 10px;\" value=\"ROOR\">Roorkee</option><option style=\"padding-left: 10px;\" value=\"RUDP\">Rudrapur</option></optgroup><optgroup label=\"West Bengal\"><option style=\"padding-left: 10px;\" value=\"ASANSOL\">Asansol</option><option style=\"padding-left: 10px;\" value=\"BEHA\">Berhampore</option><option style=\"padding-left: 10px;\" value=\"BLPR\">Bolpur</option><option style=\"padding-left: 10px;\" value=\"BURD\">Burdwan</option><option style=\"padding-left: 10px;\" value=\"COBE\">Cooch Behar</option><option style=\"padding-left: 10px;\" value=\"DARJ\">Darjeeling</option><option style=\"padding-left: 10px;\" value=\"DURGA\">Durgapur</option><option style=\"padding-left: 10px;\" value=\"HALD\">Haldia</option><option style=\"padding-left: 10px;\" value=\"HOOG\">Hooghly</option><option style=\"padding-left: 10px;\" value=\"HWRH\">Howrah</option><option style=\"padding-left: 10px;\" value=\"JPG\">Jalpaiguri</option><option style=\"padding-left: 10px;\" value=\"KOLK\">Kolkata</option><option style=\"padding-left: 10px;\" value=\"RANA\">Ranaghat</option><option style=\"padding-left: 10px;\" value=\"SILI\">Siliguri</option></optgroup></select>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\r\n");
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
      out.write("\t\t\t\t\t\t <input type=\"text\" name=\"search\" value=\"Search for a movie, play, event, sport or more\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Search for a movie, play, event, sport or more';}\"/>\r\n");
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
      out.write("\t\t\t\t\t<li class=\"dropdown w3_megamenu-fw\"><a href=\"#\" data-toggle=\"dropdown\" class=\"dropdown-toggle\">Events<b class=\"caret\"></b></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu half\">\r\n");
      out.write("                            <li class=\"w3_megamenu-content withdesc\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<h5 class=\"movies-page\">for events page - <a href=\"events.html\">Click here</a> </h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"title\">Featured Events</h3>\r\n");
      out.write("                                    <div class=\"col-sm-3\">\r\n");
      out.write("                                    \t<div class=\"e-movie\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-movie-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"events.html\"><img src=\"images/f2.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-buy-tickets\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"event-payment.html\">BUY TICKETS</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-3\">\r\n");
      out.write("                                    \t<div class=\"e-movie\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-movie-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"events.html\"><img src=\"images/f3.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-buy-tickets\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"event-payment.html\">BUY TICKETS</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-3\">\r\n");
      out.write("                                    \t<div class=\"e-movie\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-movie-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"events.html\"><img src=\"images/f4.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-buy-tickets\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"event-payment.html\">BUY TICKETS</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-3\">\r\n");
      out.write("                                    \t<div class=\"e-movie\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-movie-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"events.html\"><img src=\"images/f1.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-buy-tickets\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"event-payment.html\">BUY TICKETS</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown w3_megamenu-fw\"><a href=\"#\" data-toggle=\"dropdown\" class=\"dropdown-toggle\">Plays<b class=\"caret\"></b></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu half3\">\r\n");
      out.write("                            <li class=\"w3_megamenu-content withoutdesc\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"movies-page\">for plays page - <a href=\"plays.html\">Click here</a> </h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"title\">Featured Events</h3>\r\n");
      out.write("                                    <div class=\"col-sm-3\">\r\n");
      out.write("                                    \t<div class=\"e-movie\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-movie-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"plays.html\"><img src=\"images/f2.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-buy-tickets\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"event-payment.html\">BUY TICKETS</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-3\">\r\n");
      out.write("                                    \t<div class=\"e-movie\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-movie-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"plays.html\"><img src=\"images/f3.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-buy-tickets\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"event-payment.html\">BUY TICKETS</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-3\">\r\n");
      out.write("                                    \t<div class=\"e-movie\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-movie-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"plays.html\"><img src=\"images/f4.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-buy-tickets\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"event-payment.html\">BUY TICKETS</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-3\">\r\n");
      out.write("                                    \t<div class=\"e-movie\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-movie-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"plays.html\"><img src=\"images/f1.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-buy-tickets\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"event-payment.html\">BUY TICKETS</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" data-toggle=\"dropdown\" class=\"dropdown-toggle\">Sports<b class=\"caret\"></b></a>\r\n");
      out.write("\t\t\t\t\t\t\t <ul class=\"dropdown-menu half3\">\r\n");
      out.write("                            <li class=\"w3_megamenu-content withoutdesc\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"movies-page\">for sports page - <a href=\"sports.html\">Click here</a> </h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"title\">Featured Sports</h3>\r\n");
      out.write("                                    <div class=\"col-sm-3\">\r\n");
      out.write("                                    \t<div class=\"e-movie\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-movie-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"sports.html\"><img src=\"images/me1.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"plays-go\" href=\"#\">Volleyball is a team sport</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-3\">\r\n");
      out.write("                                    \t<div class=\"e-movie\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-movie-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"sports.html\"><img src=\"images/me2.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"plays-go\" href=\"#\">Chase, we're going to win races.</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-3\">\r\n");
      out.write("                                    \t<div class=\"e-movie\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-movie-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"sports.html\"><img src=\"images/me3.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"plays-go\" href=\"#\">2015 The action or activity of skating on ice skates</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-sm-3\">\r\n");
      out.write("                                    \t<div class=\"e-movie\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-movie-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"sports.html\"><img src=\"images/me4.jpg\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"plays-go\" href=\"#\">SVM Bowling & Gaming</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                       <!-- end dropdown-menu -->\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" data-toggle=\"dropdown\" class=\"dropdown-toggle\">Pages<b class=\"caret\"></b></a>\r\n");
      out.write("\t\t\t\t\t\t\t <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("\r\n");
      out.write("\t<li><a href=\"about.html\">About</a></li>\r\n");
      out.write("\t<li><a href=\"blog.html\">Blog</a></li>\r\n");
      out.write("\t<li><a href=\"404.html\">404</a></li>\r\n");
      out.write("\t<li><a href=\"contact.html\">Contact us</a></li>\r\n");
      out.write("\t<li><a href=\"faq.html\">FAQs</a></li>\r\n");
      out.write("\t<li><a href=\"about.html\">Current Openings</a></li>\r\n");
      out.write("                            <li class=\"dropdown-submenu\">\r\n");
      out.write("                                <a href=\"#\">News</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"press.html\">Press Release</a></li>\r\n");
      out.write("\t<li><a href=\"public-relations.html\">Public Relations</a></li>\r\n");
      out.write("\t<li><a href=\"press.html\">Press Coverage</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul><!-- end dropdown-menu -->\r\n");
      out.write("                            </li><!-- end dropdown-submenu -->\r\n");
      out.write("                        </ul>\r\n");
      out.write("                       <!-- end dropdown-menu -->\r\n");
      out.write("\t\t\t\t\t</li><!-- end standard drop down -->\r\n");
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
