package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_002dform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Event Details Form</title>\n");
      out.write("    <!-- Link to Bootstrap CSS -->\n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-image: url('../photo2.jpg');\n");
      out.write("            background-size: cover; \n");
      out.write("            background-position: center; /* Centers the image */\n");
      out.write("            background-attachment: fixed; \n");
      out.write("            background-color: #f8f9fa;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("        }\n");
      out.write("        .form-container {\n");
      out.write("            max-width: 700px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            background-color: #fff;\n");
      out.write("            padding: 30px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        .form-group label {\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        h2 {\n");
      out.write("            margin-bottom: 30px;\n");
      out.write("        }\n");
      out.write("        .subevent-form {\n");
      out.write("            display: none; /* Hide subevent form by default */\n");
      out.write("            margin-top: 30px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"form-container\">\n");
      out.write("        <h2 class=\"text-center\">Event Details Form</h2>\n");
      out.write("        <form action=\"UserSignup\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("            <!-- Main Event Form Fields -->\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"event_name\">Event Name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"event_name\" name=\"event_name\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"event_details\">Event Details</label>\n");
      out.write("                <textarea class=\"form-control\" id=\"event_details\" name=\"event_details\" rows=\"4\" required></textarea>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"event_venue\">Event Venue</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"event_venue\" name=\"event_venue\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"event_date\">Event Date</label>\n");
      out.write("                <input type=\"date\" class=\"form-control\" id=\"event_date\" name=\"event_date\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"event_time\">Event Start Time</label>\n");
      out.write("                <input type=\"time\" class=\"form-control\" id=\"event_time\" name=\"event_time\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"event_time\">Event End Time</label>\n");
      out.write("                <input type=\"time\" class=\"form-control\" id=\"event_time\" name=\"event_time\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"event_location\">Event Location</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"event_location\" name=\"event_location\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"event_background\">Event Background</label>\n");
      out.write("                <textarea class=\"form-control\" id=\"event_background\" name=\"event_background\" rows=\"4\"></textarea>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"event_images\">Upload Images</label>\n");
      out.write("                <input type=\"file\" class=\"form-control-file\" id=\"event_images\" name=\"event_images\" accept=\"\" multiple>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"event_videos\">Upload Videos</label>\n");
      out.write("                <input type=\"file\" class=\"form-control-file\" id=\"event_videos\" name=\"event_videos[]\" accept=\"video/*\" multiple>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("           \n");
      out.write("\n");
      out.write("            <!-- Subevent Form (hidden initially) -->\n");
      out.write("            <div class=\"subevent-form\" id=\"subevent_form\">\n");
      out.write("                <h4>Subevent Details</h4>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"subevent_name\">Subevent Name</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"subevent_name\" name=\"subevent_name\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"subevent_details\">Subevent Details</label>\n");
      out.write("                    <textarea class=\"form-control\" id=\"subevent_details\" name=\"subevent_details\" rows=\"4\"></textarea>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"subevent_venue\">Subevent Venue</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"subevent_venue\" name=\"subevent_venue\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"subevent_date\">Subevent Date</label>\n");
      out.write("                    <input type=\"date\" class=\"form-control\" id=\"subevent_date\" name=\"subevent_date\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"subevent_time\">Subevent Time</label>\n");
      out.write("                    <input type=\"time\" class=\"form-control\" id=\"subevent_time\" name=\"subevent_time\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"subevent_location\">Subevent Location</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"subevent_location\" name=\"subevent_location\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"subevent_images\">Upload Subevent Images</label>\n");
      out.write("                    <input type=\"file\" class=\"form-control-file\" id=\"subevent_images\" name=\"subevent_images[]\" accept=\"image/*\" multiple>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"subevent_videos\">Upload Subevent Videos</label>\n");
      out.write("                    <input type=\"file\" class=\"form-control-file\" id=\"subevent_videos\" name=\"subevent_videos[]\" accept=\"video/*\" multiple>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary btn-block\">Submit</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap JS and dependencies -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.n\n");
      out.write("\n");
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
