package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.proyecto.conexion.Conexion;
import java.sql.ResultSet;

public final class Pruebas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <script src=\"http://code.jquery.com/jquery-latest.js\">\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("                $(document).ready(function() {\n");
      out.write("                        $('#submit').click(function(event) {\n");
      out.write("                                var nombreVar = $('#Curso').val();\n");
      out.write("                                var apellidoVar = $('#Descripcion').val();\n");
      out.write("                               \n");
      out.write("                                // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get\n");
      out.write("                                $.post('pruebas', {\n");
      out.write("                                        nombre : nombreVar,\n");
      out.write("                                        apellido: apellidoVar,\n");
      out.write("                                        \n");
      out.write("                                }, function(responseText) {\n");
      out.write("                                        $('#tabla').html(responseText);\n");
      out.write("                                });\n");
      out.write("                        });\n");
      out.write("                });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"max-width: 1030px; margin: 0 auto;\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <form style=\"margin: 0 auto;\" action=\"pruebas\" method=\"post\">\n");
      out.write("            <label>Curso</label>\n");
      out.write("            <input type=\"text\"  id=\"Curso\">\n");
      out.write("            <br>\n");
      out.write("            <label>Descripcion</label>\n");
      out.write("            <input type=\"Text\"  id=\"Descripcion\">\n");
      out.write("            <br>\n");
      out.write("            <input type=\"button\" id=\"submit\" value=\"Añadir\" /> \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        <table class=\"table table-condensed\" id=\"tabla\" style=\"margin: 0 auto;\">\n");
      out.write("            \n");
      out.write("        \n");
      out.write("       </table>\n");
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
