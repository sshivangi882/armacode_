package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class feature_002dsection_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <meta charset=\"utf-8\"/>\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\"/>\n");
      out.write("  <title>\n");
      out.write("   Event Management Platform\n");
      out.write("  </title>\n");
      out.write("  <script src=\"https://cdn.tailwindcss.com\">\n");
      out.write("  </script>\n");
      out.write("  <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\" rel=\"stylesheet\"/>\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&amp;display=swap\" rel=\"stylesheet\"/>\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\" integrity=\"sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js\" integrity=\"sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V\" crossorigin=\"anonymous\"></script>\n");
      out.write(" </head>\n");
      out.write("\n");
      out.write("\n");
      out.write(" <body class=\"font-roboto bg-gray-100\">\n");
      out.write("  <section class=\"py-20\">\n");
      out.write("   <div class=\"container mx-auto px-4\">\n");
      out.write("    <div class=\"text-center mb-12\">\n");
      out.write("     <h2 class=\"text-3xl font-bold\">\n");
      out.write("      Features\n");
      out.write("     </h2>\n");
      out.write("     <p class=\"text-gray-600\">\n");
      out.write("      Everything you need to manage your events efficiently.\n");
      out.write("     </p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-8\">\n");
      out.write("     <div class=\"bg-white p-6 rounded-lg shadow-md\">\n");
      out.write("      <div class=\"flex items-center mb-4\">\n");
      out.write("       <i class=\"fas fa-calendar-alt text-blue-600 text-3xl\">\n");
      out.write("       </i>\n");
      out.write("       <h3 class=\"text-xl font-semibold ml-4\">\n");
      out.write("        Event Creation\n");
      out.write("       </h3>\n");
      out.write("      </div>\n");
      out.write("      <p class=\"text-gray-600\">\n");
      out.write("       Create event pages with essential information like name, date, time, location, and description.\n");
      out.write("      </p>\n");
      out.write("     </div>\n");
      out.write("     <div class=\"bg-white p-6 rounded-lg shadow-md\">\n");
      out.write("      <div class=\"flex items-center mb-4\">\n");
      out.write("       <i class=\"fas fa-bell text-blue-600 text-3xl\">\n");
      out.write("       </i>\n");
      out.write("       <h3 class=\"text-xl font-semibold ml-4\">\n");
      out.write("        RSVP &amp; Notifications\n");
      out.write("       </h3>\n");
      out.write("      </div>\n");
      out.write("      <p class=\"text-gray-600\">\n");
      out.write("       Track RSVPs and send automated reminders to attendees.\n");
      out.write("      </p>\n");
      out.write("     </div>\n");
      out.write("     <div class=\"bg-white p-6 rounded-lg shadow-md\">\n");
      out.write("      <div class=\"flex items-center mb-4\">\n");
      out.write("       <i class=\"fas fa-calendar-check text-blue-600 text-3xl\">\n");
      out.write("       </i>\n");
      out.write("       <h3 class=\"text-xl font-semibold ml-4\">\n");
      out.write("        Calendar Integration\n");
      out.write("       </h3>\n");
      out.write("      </div>\n");
      out.write("      <p class=\"text-gray-600\">\n");
      out.write("       Sync events with Google Calendar, Outlook, and more.\n");
      out.write("      </p>\n");
      out.write("     </div>\n");
      out.write("     <div class=\"bg-white p-6 rounded-lg shadow-md\">\n");
      out.write("      <div class=\"flex items-center mb-4\">\n");
      out.write("       <i class=\"fas fa-map-marker-alt text-blue-600 text-3xl\">\n");
      out.write("       </i>\n");
      out.write("       <h3 class=\"text-xl font-semibold ml-4\">\n");
      out.write("        Nearby Events\n");
      out.write("       </h3>\n");
      out.write("      </div>\n");
      out.write("      <p class=\"text-gray-600\">\n");
      out.write("       Discover events near you based on your preferences.\n");
      out.write("      </p>\n");
      out.write("     </div>\n");
      out.write("<!--     <div class=\"bg-white p-6 rounded-lg shadow-md\">\n");
      out.write("      <div class=\"flex items-center mb-4\">\n");
      out.write("       <i class=\"fas fa-lock text-blue-600 text-3xl\">\n");
      out.write("       </i>\n");
      out.write("       <h3 class=\"text-xl font-semibold ml-4\">\n");
      out.write("        Secure Login\n");
      out.write("       </h3>\n");
      out.write("      </div>\n");
      out.write("      <p class=\"text-gray-600\">\n");
      out.write("       Ensure only authorized organizers can manage events.\n");
      out.write("      </p>\n");
      out.write("     </div>-->\n");
      out.write("     <div class=\"bg-white p-6 rounded-lg shadow-md\">\n");
      out.write("      <div class=\"flex items-center mb-4\">\n");
      out.write("       <i class=\"fas fa-chart-line text-blue-600 text-3xl\">\n");
      out.write("       </i>\n");
      out.write("       <h3 class=\"text-xl font-semibold ml-4\">\n");
      out.write("        Event Analytics\n");
      out.write("       </h3>\n");
      out.write("      </div>\n");
      out.write("      <p class=\"text-gray-600\">\n");
      out.write("       Get detailed analytics on event engagement and attendance.\n");
      out.write("      </p>\n");
      out.write("     </div>\n");
      out.write("    </div>\n");
      out.write("   </div>\n");
      out.write("  </section>\n");
      out.write(" </body>\n");
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
