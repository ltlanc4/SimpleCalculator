package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calculator_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Basic Calculator</title>\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("              integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <h1>\n");
      out.write("                    <b>CALCULATOR</b>\n");
      out.write("                </h1>\n");
      out.write("                <form action=\"/homework/calculator\">\n");
      out.write("                    <a href=\"./themath.jsp\" class=\"return\">←</a>\n");
      out.write("                    <div class=\"basic-position-input\">\n");
      out.write("                        Number 1:\n");
      out.write("                        <input class=\"basic-calculator-input\" type=\"number\" name=\"num1\" />\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        Number 2:\n");
      out.write("                        <input class=\"basic-calculator-input\" type=\"number\" name=\"num2\" />\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <p class=\"position-result\">Result:</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"basic-position-button\">\n");
      out.write("                        <input class=\"basic-calculator\" type=\"submit\" name=\"cal\" value=\"Add\" />\n");
      out.write("                        <input class=\"basic-calculator\" type=\"submit\" name=\"cal\" value=\"Sub\" />\n");
      out.write("                        <input class=\"basic-calculator\" type=\"submit\" name=\"cal\" value=\"Mul\" />\n");
      out.write("                        <input class=\"basic-calculator\" type=\"submit\" name=\"cal\" value=\"Div\" />\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
