package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class event_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\"/>\r\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\"/>\r\n");
      out.write("  <title>\r\n");
      out.write("   REL-EVENT\r\n");
      out.write("  </title>\r\n");
      out.write("  <script src=\"https://cdn.tailwindcss.com\">\r\n");
      out.write("  </script>\r\n");
      out.write("  <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\" rel=\"stylesheet\"/>\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&amp;display=swap\" rel=\"stylesheet\"/>\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\" integrity=\"sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js\" integrity=\"sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V\" crossorigin=\"anonymous\"></script>\r\n");
      out.write(" </head>\r\n");
      out.write(" <body class=\"font-roboto bg-gray-100\">\r\n");
      out.write("\r\n");
      out.write("<section class=\"py-20 bg-gray-100\">\r\n");
      out.write(" <div class=\"container mx-auto px-4\">\r\n");
      out.write("  <div class=\"text-center mb-12\">\r\n");
      out.write("   <h2 class=\"text-3xl font-bold\">\r\n");
      out.write("    Upcoming Events\r\n");
      out.write("   </h2>\r\n");
      out.write("   <p class=\"text-gray-600\">\r\n");
      out.write("    Browse and RSVP to upcoming events.\r\n");
      out.write("   </p>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-8\">\r\n");
      out.write("   <div class=\"bg-white p-6 rounded-lg shadow-md\">\r\n");
      out.write("       <img alt=\"Event image showing a tech conference with people attending\" src=\"./assets/tech conference.jpg\"/>\r\n");
      out.write("    <h3 class=\"text-xl font-semibold mt-4\">\r\n");
      out.write("     Tech Conference 2023\r\n");
      out.write("    </h3>\r\n");
      out.write("    <p class=\"text-gray-600\">\r\n");
      out.write("     Date: March 15, 2023\r\n");
      out.write("    </p>\r\n");
      out.write("    <p class=\"text-gray-600\">\r\n");
      out.write("     Location: San Francisco, CA\r\n");
      out.write("    </p>\r\n");
      out.write("    <p class=\"text-gray-600 mt-2\">\r\n");
      out.write("     Join us for a day of insightful talks and networking with industry leaders.\r\n");
      out.write("    </p>\r\n");
      out.write("    <a class=\"text-blue-600 mt-4 inline-block\" href=\"#\">\r\n");
      out.write("     RSVP Now\r\n");
      out.write("    </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("    <a class=\"text-blue-600 mt-4\" href=\"imap.html\">\r\n");
      out.write("        <button>Location</button>\r\n");
      out.write("    </a>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"bg-white p-6 rounded-lg shadow-md\">\r\n");
      out.write("       <img alt=\"Event image showing a music festival with a large crowd\" src=\"./assets/summer-event.jpg\"/>\r\n");
      out.write("    <h3 class=\"text-xl font-semibold mt-4\">\r\n");
      out.write("     Summer Music Festival\r\n");
      out.write("    </h3>\r\n");
      out.write("    <p class=\"text-gray-600\">\r\n");
      out.write("     Date: June 20, 2023\r\n");
      out.write("    </p>\r\n");
      out.write("    <p class=\"text-gray-600\">\r\n");
      out.write("     Location: Austin, TX\r\n");
      out.write("    </p>\r\n");
      out.write("    <p class=\"text-gray-600 mt-2\">\r\n");
      out.write("     Experience live performances from top artists in a vibrant outdoor setting.\r\n");
      out.write("    </p>\r\n");
      out.write("    <a class=\"text-blue-600 mt-4 inline-block\" href=\"#\">\r\n");
      out.write("     RSVP Now\r\n");
      out.write("    </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("    <a class=\"text-blue-600 mt-4\" href=\"imap.html\">\r\n");
      out.write("        <button>Location</button>\r\n");
      out.write("    </a>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"bg-white p-6 rounded-lg shadow-md\">\r\n");
      out.write("       <img alt=\"Event image showing a sports event with athletes competing\" src=\"./assets/Outdoor Yoga Session.jpg\"/>\r\n");
      out.write("    <h3 class=\"text-xl font-semibold mt-4\">\r\n");
      out.write("     City Marathon 2023\r\n");
      out.write("    </h3>\r\n");
      out.write("    <p class=\"text-gray-600\">\r\n");
      out.write("     Date: September 10, 2023\r\n");
      out.write("    </p>\r\n");
      out.write("    <p class=\"text-gray-600\">\r\n");
      out.write("     Location: New York, NY\r\n");
      out.write("    </p>\r\n");
      out.write("    <p class=\"text-gray-600 mt-2\">\r\n");
      out.write("     Join thousands of runners in this iconic marathon through the streets of NYC.\r\n");
      out.write("    </p>\r\n");
      out.write("    <a class=\"text-blue-600 mt-4 inline-block\" href=\"#\">\r\n");
      out.write("     RSVP Now\r\n");
      out.write("    </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("    <a class=\"text-blue-600 mt-4\" href=\"imap.html\">\r\n");
      out.write("        <button>Location</button>\r\n");
      out.write("    </a>\r\n");
      out.write("   </div>\r\n");
      out.write("  </div>\r\n");
      out.write(" </div>\r\n");
      out.write("</section>\r\n");
      out.write("<!-- Organizer Portal -->\r\n");
      out.write("<section class=\"py-20\">\r\n");
      out.write(" <div class=\"container mx-auto px-4 \">\r\n");
      out.write("  <div class=\"text-center mb-12\">\r\n");
      out.write("   <h2 class=\"text-3xl font-bold\">\r\n");
      out.write("    Organizer Portal\r\n");
      out.write("   </h2>\r\n");
      out.write("   <p class=\"text-gray-600\">\r\n");
      out.write("    Manage your events with ease.\r\n");
      out.write("   </p>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-8\">\r\n");
      out.write("   <div class=\"bg-white p-6 rounded-lg shadow-md\">\r\n");
      out.write("    <div class=\"flex items-center mb-4\">\r\n");
      out.write("     <i class=\"fas fa-user-lock text-blue-600 text-3xl\">\r\n");
      out.write("     </i>\r\n");
      out.write("     <h3 class=\"text-xl font-semibold ml-4\">\r\n");
      out.write("      Secure Login\r\n");
      out.write("     </h3>\r\n");
      out.write("    </div>\r\n");
      out.write("    <p class=\"text-gray-600\">\r\n");
      out.write("     Ensure only authorized event organizers can create and modify event details.\r\n");
      out.write("    </p>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"bg-white p-6 rounded-lg shadow-md\">\r\n");
      out.write("    <div class=\"flex items-center mb-4\">\r\n");
      out.write("     <i class=\"fas fa-tachometer-alt text-blue-600 text-3xl\">\r\n");
      out.write("     </i>\r\n");
      out.write("     <h3 class=\"text-xl font-semibold ml-4\">\r\n");
      out.write("      Event Management Dashboard\r\n");
      out.write("     </h3>\r\n");
      out.write("    </div>\r\n");
      out.write("    <p class=\"text-gray-600\">\r\n");
      out.write("     Add, update, and track event information and RSVP statistics.\r\n");
      out.write("    </p>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"bg-white p-6 rounded-lg shadow-md\">\r\n");
      out.write("    <div class=\"flex items-center mb-4\">\r\n");
      out.write("     <i class=\"fas fa-paint-brush text-blue-600 text-3xl\">\r\n");
      out.write("     </i>\r\n");
      out.write("     <h3 class=\"text-xl font-semibold ml-4\">\r\n");
      out.write("      Template Management\r\n");
      out.write("     </h3>\r\n");
      out.write("    </div>\r\n");
      out.write("    <p class=\"text-gray-600\">\r\n");
      out.write("     Select and customize design templates for your event pages.\r\n");
      out.write("    </p>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"bg-white p-6 rounded-lg shadow-md\">\r\n");
      out.write("    <div class=\"flex items-center mb-4\">\r\n");
      out.write("     <i class=\"fas fa-file-upload text-blue-600 text-3xl\">\r\n");
      out.write("     </i>\r\n");
      out.write("     <h3 class=\"text-xl font-semibold ml-4\">\r\n");
      out.write("      Data Import\r\n");
      out.write("     </h3>\r\n");
      out.write("    </div>\r\n");
      out.write("    <p class=\"text-gray-600\">\r\n");
      out.write("     Enable bulk upload of event details (e.g., via CSV) to facilitate rapid event creation.\r\n");
      out.write("    </p>\r\n");
      out.write("   </div>\r\n");
      out.write("  </div>\r\n");
      out.write(" </div>\r\n");
      out.write("</section>\r\n");
      out.write("<!-- Attendee Portal -->\r\n");
      out.write("<section class=\"py-20 bg-gray-100\">\r\n");
      out.write(" <div class=\"container mx-auto px-4\">\r\n");
      out.write("  <div class=\"text-center mb-12\">\r\n");
      out.write("   <h2 class=\"text-3xl font-bold\">\r\n");
      out.write("    Attendee Portal\r\n");
      out.write("   </h2>\r\n");
      out.write("   <p class=\"text-gray-600\">\r\n");
      out.write("    Discover and RSVP to events.\r\n");
      out.write("   </p>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-8\">\r\n");
      out.write("   <div class=\"bg-white p-6 rounded-lg shadow-md\">\r\n");
      out.write("    <div class=\"flex items-center mb-4\">\r\n");
      out.write("     <i class=\"fas fa-search text-blue-600 text-3xl\">\r\n");
      out.write("     </i>\r\n");
      out.write("     <h3 class=\"text-xl font-semibold ml-4\">\r\n");
      out.write("      Event Discovery\r\n");
      out.write("     </h3>\r\n");
      out.write("    </div>\r\n");
      out.write("    <p class=\"text-gray-600\">\r\n");
      out.write("     Browse events via a dynamic search and filter mechanism based on location, category, and date.\r\n");
      out.write("    </p>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"bg-white p-6 rounded-lg shadow-md\">\r\n");
      out.write("    <div class=\"flex items-center mb-4\">\r\n");
      out.write("     <i class=\"fas fa-check-circle text-blue-600 text-3xl\">\r\n");
      out.write("     </i>\r\n");
      out.write("     <h3 class=\"text-xl font-semibold ml-4\">\r\n");
      out.write("      RSVP Functionality\r\n");
      out.write("     </h3>\r\n");
      out.write("    </div>\r\n");
      out.write("    <p class=\"text-gray-600\">\r\n");
      out.write("     Confirm or decline attendance and receive real-time notifications regarding event updates.\r\n");
      out.write("    </p>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"bg-white p-6 rounded-lg shadow-md\">\r\n");
      out.write("    <div class=\"flex items-center mb-4\">\r\n");
      out.write("     <i class=\"fas fa-calendar-plus text-blue-600 text-3xl\">\r\n");
      out.write("     </i>\r\n");
      out.write("     <h3 class=\"text-xl font-semibold ml-4\">\r\n");
      out.write("      Calendar Sync\r\n");
      out.write("     </h3>\r\n");
      out.write("    </div>\r\n");
      out.write("    <p class=\"text-gray-600\">\r\n");
      out.write("     Provide a direct link or downloadable .ics file for easy addition of events to personal calendars.\r\n");
      out.write("    </p>\r\n");
      out.write("   </div>\r\n");
      out.write("  </div>\r\n");
      out.write(" </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
