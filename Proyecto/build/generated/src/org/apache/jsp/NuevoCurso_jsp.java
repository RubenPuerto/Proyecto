package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.proyecto.conexion.Conexion;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Formulario.css\" />\n");
      out.write("     <link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.9.1/themes/base/jquery-ui.css\" />\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-1.8.2.js\"></script>\n");
      out.write("    <script src=\"/resources/demos/external/jquery.bgiframe-2.1.2.js\"></script>\n");
      out.write("    <script src=\"http://code.jquery.com/ui/1.9.1/jquery-ui.js\"></script>\n");
      out.write("           <script>\n");
      out.write("    function abrir_dialog() {\n");
      out.write("      $( \"#dialog\" ).dialog({\n");
      out.write("          show: \"blind\",\n");
      out.write("          hide: \"explode\"\n");
      out.write("      });\n");
      out.write("    };\n");
      out.write("    </script>\n");
      out.write("        <title>Pedir Un Curso</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("    .fancybox-inner {\n");
      out.write("height: 265px !important;\n");
      out.write("}\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("        \n");
      out.write("    <body>\n");
      out.write("        <h1>Pedir Un Curso</h1>\n");
      out.write("      ");

    Conexion c=new Conexion();
    String nombre = request.getParameter("Nombre"); 
    String valor= request.getParameter("valor"); 
    String correo = request.getParameter("correo"); 
    String jornada = request.getParameter("jornada"); 
    String curso= request.getParameter("curso"); 
    String sede = request.getParameter("sede"); 
    
    
    if (nombre!= null && valor!=null && correo!=null && jornada !=null && curso!=null && sede!=null) {
            
        
    String qry="insert into cursonuevos(Nombre,Valor_Pagado,correo,jornada,Nombre_Curso,sede)values('"+nombre+"','"+valor+"','"+correo+"','"+jornada+"','"+curso+"','"+sede+"');";
    c.sql.executeUpdate(qry);
    out.print("");
    }
        
      out.write("\n");
      out.write("<FORM name=\"insert\" METHOD=post action=\"NuevoCurso.jsp\">\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("<td>Nombre</td>\n");
      out.write("<td>Valor Que Pagaria</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><input type=\"text\" name=\"Nombre\"><br></td>\n");
      out.write("<td><input type=\"text\" name=\"valor\" placeholder=\"Valor Numerico\" required <br></td>\n");
      out.write("</tr>\n");
      out.write("<td>Correo</td>\n");
      out.write("<td>Jornada De Estudio</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><input type=\"text\" name=\"correo\"placeholder=\"ejemplo@hotmail.com\"><br></td>\n");
      out.write("<td><input type=\"text\" name=\"jornada\"><br></td>\n");
      out.write("</tr>\n");
      out.write("<td>Nombre Curso</td>\n");
      out.write("<td>Sede Para El Curso</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><input type=\"text\" name=\"curso\"><br></td>\n");
      out.write("<td>\n");
      out.write("   <select name=\"sede\">\n");
      out.write("   <option value=\"tagaste\">Tagaste</option> \n");
      out.write("   <option value=\"suba\">Suba</option> \n");
      out.write("</select>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("    <div class=\"boton\">\n");
      out.write("        <INPUT class=\"submit\" TYPE=\"submit\" VALUE=\"Guardar\" onclick=\"abrir_dialog()\">\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("      <div id=\"dialog\" title=\"\" style=\"display:none;\">\n");
      out.write("    <p>Curso Guardado</p>\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("</form>\n");
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
