package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.proyecto.conexion.Conexion;
import java.sql.ResultSet;

public final class NuevoCurso_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Formulario.css\" />\r\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"css/apprise.css\" />\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.9.1/themes/base/jquery-ui.css\" />\r\n");
      out.write("     <script src=\"js/apprise.js\"></script>\r\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-1.8.2.js\"></script>\r\n");
      out.write("    <script src=\"/resources/demos/external/jquery.bgiframe-2.1.2.js\"></script>\r\n");
      out.write("    <script src=\"http://code.jquery.com/ui/1.9.1/jquery-ui.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("    function abrir_dialog() {\r\n");
      out.write("      $( \"#dialog\" ).dialog({\r\n");
      out.write("          show: \"blind\",\r\n");
      out.write("          hide: \"explode\"\r\n");
      out.write("          window.close();\r\n");
      out.write("      });\r\n");
      out.write(" \r\n");
      out.write("    };\r\n");
      out.write("    </script>\r\n");
      out.write("    <script>\r\n");
      out.write("  function validarSiNumero(numero){\r\n");
      out.write("    if (!/^([0-9])*$/.test(numero)){\r\n");
      out.write("      apprise(\"El valor \" + numero + \" no es un número\");\r\n");
      out.write("   document.getElementById('cantidad').value = '';\r\n");
      out.write("  }}\r\n");
      out.write("</script>\r\n");
      out.write("        <title>Pedir Un Curso</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <style>\r\n");
      out.write("    .fancybox-inner {\r\n");
      out.write("height: 265px !important;\r\n");
      out.write("}\r\n");
      out.write("        \r\n");
      out.write("    </style>\r\n");
      out.write("        \r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Pedir Un Curso</h1>\r\n");
      out.write("      ");

    Conexion c=new Conexion();
    String nombre = request.getParameter("Nombre"); 
   
    String correo = request.getParameter("correo"); 
 
    String celular= request.getParameter("celular"); 
    String curso= request.getParameter("Curso");
     String categoria= request.getParameter("categoria"); 
    
    
  
    
    
    if (nombre!= null  && correo!=null  && celular!=null) {
            
    ResultSet rs=c.PedirCursos(nombre, correo, celular,curso,categoria);
   
    }
        
      out.write("\r\n");
      out.write("<FORM name=\"insert\" METHOD=post action=\"NuevoCurso.jsp\">\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Nombre Completo</td>\r\n");
      out.write("<td>Correo</td>\r\n");
      out.write(" \r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td><input type=\"text\" name=\"Nombre\" required><br></td>\r\n");
      out.write("<td><input type=\"email\" name=\"correo\"placeholder=\"ejemplo@hotmail.com\" required><br></td>\r\n");
      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Celular</td>\r\n");
      out.write("<td>Nombre Curso Solicitado</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><input type=\"text\" name=\"celular\" required SIZE=10 id=\"cantidad\" onChange=\"validarSiNumero(this.value);\"><br></td>\r\n");
      out.write("<td><input type=\"text\" name=\"Curso\" required><br></td>\r\n");
      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("    <tr >\r\n");
      out.write("    <td colspan=\"2\">Categoria</td>\r\n");
      out.write("   </tr> \r\n");
      out.write("   <tr>\r\n");
      out.write("    <td colspan=\"2\">\r\n");
      out.write("                 ");

                                c=new Conexion();
                                ResultSet rs=c.getCursos();
                                out.println("<select name='categoria' required>");
                                while (rs.next()){
                                    out.println("<option value='"+rs.getString("TituloCurso")+"'>"+rs.getString("TituloCurso")+"</option>");
               }

      out.write(" \r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("        \r\n");
      out.write("      \r\n");
      out.write("</table>\r\n");
      out.write("    <div class=\"boton\">\r\n");
      out.write("        <INPUT class=\"submit\" TYPE=\"submit\" VALUE=\"Enviar\" onclick=\"abrir_dialog()\">\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("      <div id=\"dialog\" title=\"\" style=\"display:none;\">\r\n");
      out.write("          \r\n");
      out.write("    <p>Curso Guardado</p>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("</form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
