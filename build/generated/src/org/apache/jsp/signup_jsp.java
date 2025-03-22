package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/navbar.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      out.write(" <body class=\"font-roboto bg-gray-100\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"bg-white shadow-md\">\n");
      out.write(" <div class=\"container mx-auto px-4 py-2 flex justify-between items-center\">\n");
      out.write("  <a class=\"text-2xl font-bold text-blue-600\" href=\"#\">\n");
      out.write("   Eventify\n");
      out.write("  </a>\n");
      out.write("  <div class=\"space-x-4\">\n");
      out.write("   <a class=\"text-gray-700 hover:text-blue-600\" href=\"index.jsp\">\n");
      out.write("    Home\n");
      out.write("   </a>\n");
      out.write("   <a class=\"text-gray-700 hover:text-blue-600\" href=\"#\">\n");
      out.write("    Events\n");
      out.write("   </a>\n");
      out.write(" \n");
      out.write("   <a class=\"text-gray-700 hover:text-blue-600\" href=\"login.jsp\">\n");
      out.write("    <button type=\"button\" class=\"btn btn-primary\">Login</button>\n");
      out.write("   </a>\n");
      out.write("   <a class=\"text-gray-700 hover:text-blue-600\" href=\"signup.jsp\">\n");
      out.write("    <button type=\"button\" class=\"btn btn-primary\">Signup</button>\n");
      out.write("   </a>\n");
      out.write("   \n");
      out.write("  </div>\n");
      out.write(" </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("</body>");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>Sign Up Form</title>\n");
      out.write("  <!-- Include Bootstrap CSS -->\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <style>\n");
      out.write("    /* Center the form vertically and horizontally */\n");
      out.write("    .container2 {\n");
      out.write("      height: 100%;\n");
      out.write("      margin: 0;\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: center;\n");
      out.write("      align-items: center;\n");
      out.write("      background-color: #f8f9fa;\n");
      out.write("    }\n");
      out.write("    .form-container {\n");
      out.write("      width: 100%;\n");
      out.write("      max-width: 450px;\n");
      out.write("      padding: 20px;\n");
      out.write("      border: 1px solid black;\n");
      out.write("      border-radius: 8px;\n");
      out.write("      background-color: white;\n");
      out.write("    }\n");
      out.write("    .form-control{\n");
      out.write("        width: 400px;\n");
      out.write("    }\n");
      out.write("    .dropdown{\n");
      out.write("        width: 400px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("  </style>\n");
      out.write("<!--  <script>\n");
      out.write("\n");
      out.write("    function updateButtonText(value) {\n");
      out.write("      document.getElementById('dropdownMenuButton').textContent = value;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // JavaScript function to generate OTP\n");
      out.write("    function generateOTP() {\n");
      out.write("//        var xhr=new XMLHttpRequest();\n");
      out.write("//        xhr.open(\"POST\",\"UserSignup1\", true);\n");
      out.write("//        xhr.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("//\n");
      out.write("//       xhr.onreadystatechange = function() {\n");
      out.write("//        if (xhr.readyState == 4 && xhr.status == 200) {\n");
      out.write("//          // This will update the content of the div with the servlet response\n");
      out.write("//          document.getElementById(\"response\").innerHTML = xhr.responseText;\n");
      out.write("//        }\n");
      out.write("//      };\n");
      out.write("//\n");
      out.write("//      xhr.send();  // Sending a POST request to the servlet\n");
      out.write("        alert(\"OTP is 1234\")\n");
      out.write("    \n");
      out.write("    }\n");
      out.write("  </script>-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container2\">\n");
      out.write("    <div class=\"form-container\">\n");
      out.write("    <h3 class=\"text-center mb-4\">Sign Up</h3>\n");
      out.write("    <form action=\"UserSignup\">\n");
      out.write("      <!-- Name Field -->\n");
      out.write("      <div class=\"mb-3\">\n");
      out.write("        <label for=\"name\" class=\"form-label\">Full Name</label>\n");
      out.write("        <input type=\"text\" name=\"userName\" class=\"form-control\" id=\"name\" placeholder=\"Enter your name\" required>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div class=\"mb-3\">\n");
      out.write("        <label for=\"emailId\" class=\"form-label\">Email ID</label>\n");
      out.write("        <input type=\"email\" name=\"userEmail\" class=\"form-control\" id=\"mobileNumber\" placeholder=\"Enter your Email ID\" required>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <!-- Mobile Number Field -->\n");
      out.write("      <div class=\"mb-3\">\n");
      out.write("        <label for=\"mobileNumber\" class=\"form-label\">Mobile Number</label>\n");
      out.write("        <input type=\"tel\" name=\"userNumber\" class=\"form-control\" id=\"mobileNumber\" placeholder=\"Enter your mobile number\" required>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("      <!-- Password Field -->\n");
      out.write("      <div class=\"mb-3\">\n");
      out.write("        <label for=\"password\" class=\"form-label\">Password</label>\n");
      out.write("        <input type=\"password\" name=\"userPassword\" class=\"form-control\" id=\"password\" placeholder=\"Enter your password\" required>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"container mt-2\">\n");
      out.write("        <!-- Dropdown button -->\n");
      out.write("        <div class=\"dropdown\">\n");
      out.write("<!--          <button class=\"btn btn-outlint-primary dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("            User Type\n");
      out.write("          </button>-->\n");
      out.write("            User Type\n");
      out.write("            <select name=\"userType\" id=\"type\">\n");
      out.write("                <option value=\"Admin\">Admin</option>\n");
      out.write("                <option value=\"Host\">Host</option>\n");
      out.write("                <option value=\"Attendee\">Attendee</option>\n");
      out.write("            </select>\n");
      out.write("  <!--<option value=\"audi\">Audi</option>-->\n");
      out.write("<!--          <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("            <li><a class=\"dropdown-item\" name=\"Admin\" onclick=\"updateButtonText('Admin')\">Admin</a></li>\n");
      out.write("            <li><a class=\"dropdown-item\" name=\"Host\" onclick=\"updateButtonText('Host')\">Host</a></li>\n");
      out.write("            <li><a class=\"dropdown-item\" name=\"Attendee\" onclick=\"updateButtonText('Attendee')\">Attendee</a></li>\n");
      out.write("          </ul>-->\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\n");
      out.write("<!--       OTP Generation Section \n");
      out.write("      <form action=\"UserSignup1\">\n");
      out.write("      <div class=\"mb-3\">\n");
      out.write("        <label for=\"otp\" class=\"form-label\">OTP</label>\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("            \n");
      out.write("                \n");
      out.write("                <input type=\"text\" name=\"userOtp\" class=\"form-control\" id=\"otp\" placeholder=\"Enter OTP\" readonly required>\n");
      out.write("        <button type=\"button\" class=\"btn btn-outline-primary\" id=\"generateOTP\" onclick=\"location.href='UserSignup'\">Generate OTP</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <small id=\"otpHelp\" class=\"form-text text-muted\">Click the button to generate OTP</small>\n");
      out.write("      </div>\n");
      out.write("        </form>-->\n");
      out.write("\n");
      out.write("      <!-- Submit Button -->\n");
      out.write("      <div class=\"d-grid gap-2\">\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\" >Sign Up</button>\n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  <!-- Include Bootstrap JS -->\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
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
      out.write(" <body class=\"font-roboto bg-gray-100\">\n");
      out.write("<footer class=\"bg-white py-8\">\n");
      out.write(" <div class=\"container mx-auto px-4 text-center\">\n");
      out.write("  <p class=\"text-gray-600\">\n");
      out.write("   © 2023 Eventify. All rights reserved.\n");
      out.write("  </p>\n");
      out.write(" </div>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
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
