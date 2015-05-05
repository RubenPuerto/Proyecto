package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.proyecto.conexion.Conexion;

public final class DetalleCursos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Home Proyecto</title>\n");
      out.write("     \n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/url.js\" type=\"text/javascript\"></script>\n");
      out.write("       <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("       <link href=\"css/cursos.css\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Formulario.css\" />\n");
      out.write("        \n");
      out.write("       \n");
      out.write("      <script type=\"text/javascript\">\n");
      out.write("                  \n");
      out.write("                  var Host = $(location).attr('hostname');\n");
      out.write("                  var Path = $(location).attr('pathname');\n");
      out.write("                  var IdCurso = $.get(\"IdCurso\");\n");
      out.write("                  function LeerIdTema($valor)\n");
      out.write("                  {\n");
      out.write("                  location.href=Path+\"?IdCurso=\"+IdCurso+\"&IdTema=\"+$valor+\"\";\n");
      out.write("                  }\n");
      out.write("      </script>\n");
      out.write("         <script type=\"text/javascript\" src=\"js/jquery-1.10.1.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Add fancyBox main JS and CSS files -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.fancybox.js?v=2.1.5\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.fancybox.css?v=2.1.5\" media=\"screen\" />\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\n");
      out.write("\t\t\t$('.fancybox').fancybox();\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t$(\"#fancybox-manual-c\").click(function() {\n");
      out.write("\t\t\t\t$.fancybox.open([\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\thref : '1_b.jpg',\n");
      out.write("\t\t\t\t\t\ttitle : 'My title'\n");
      out.write("\t\t\t\t\t}, {\n");
      out.write("\t\t\t\t\t\thref : '2_b.jpg',\n");
      out.write("\t\t\t\t\t\ttitle : '2nd title'\n");
      out.write("\t\t\t\t\t}, {\n");
      out.write("\t\t\t\t\t\thref : '3_b.jpg'\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t], {\n");
      out.write("\t\t\t\t\thelpers : {\n");
      out.write("\t\t\t\t\t\tthumbs : {\n");
      out.write("\t\t\t\t\t\t\twidth: 75,\n");
      out.write("\t\t\t\t\t\t\theight: 50\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\t.fancybox-custom .fancybox-skin {\n");
      out.write("\t\t\tbox-shadow: 0 0 20px #222;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <!-- NAVBAR\n");
      out.write("    ================================================== -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("                      <nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("\t\t\t  <div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t  <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t  </button>\n");
      out.write("\t\t\t\t  <a class=\"logo\" href=\"Home.jsp\" title=\"Pruebas Pagina Proyecto\"><img src=\"img/mslogo.png\" class=\"img-responsive logos\" alt=\"Responsive image\"></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("\t\t\t\t  <ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"AllCursos.html\">Cursos</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#contact\">Otros</a></li>\n");
      out.write("                                        <li><a class=\"fancybox fancybox.iframe\" href=\"NuevoCurso.jsp\">formulario</a></li>\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t  </ul>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</div><!--/.nav-collapse -->\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <section>\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("<div class=\"hero has-background-video hero-vote\">\n");
      out.write("  <div class=\"content\">\n");
      out.write("\n");
      out.write("      <div id=\"all-steps-cont\" class=\"clearfix vote-cont\">\n");
      out.write("\n");
      out.write("            <div id=\"step1\" class=\"step\">\n");
      out.write("              <div class=\"vote\">\n");
      out.write("                <h1>Desarrollo De Software <span></span></h1>\n");
      out.write("                <button class=\"play-btn\" style =\"background-image: url(/img/play.jpg);\"></button>\n");
      out.write("\n");
      out.write("                  <div class=\"not-voted\">\n");
      out.write("                    <a href=\"/events/71/join.json\" class=\"button red1 large arrow vote-now-button\" data-event-id=\"71\" data-remote=\"true\">Click Si Te Gusta Este Curso</a>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <div class=\"background\" style=\"background-image: url(http://www.avanzit-tecnologia.cl/imagenes/foto.png); background-size: inherit;background-repeat: repeat;\">\n");
      out.write("    <div class=\"video\">\n");
      out.write("      <span id=\"video-cont\" data-video-id=\"w-tFdreZB94\" data-video-title=\"Paramore\"></span>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("             <h1 class=\"infocurso\">Informacion del Curso</h1>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div  class=\"col-md-6 descripcion\" >\n");
      out.write("                    <label for=\"Tema\">Seleccione Curso</label>\n");
      out.write("                    <select name=\"paises\" id=\"paises\" class=\"form-control\" onchange=\"LeerIdTema(value);\">\n");
      out.write("                        <option >Seleccione</option>\n");
      out.write("                        ");

                            String ID = request.getParameter("IdCurso");
                            int value=0;

                            Conexion c=new Conexion();
                            ResultSet rs=c.llenarTema(ID);
                            while (rs.next()){
                            value=rs.getInt("IdTemas");
                            out.println("<option value="+value+" >"+rs.getString("Titulo")+"</option>");
                            }
                        
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                     <div id=\"nCuenta\" >\n");
      out.write("                             \n");
      out.write("                         \n");
      out.write("                     </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 descripcion\">\n");
      out.write("                  Descripcion Tema: \n");
      out.write("                     ");
 
                            String IdTemas = request.getParameter("IdTema");
                            rs=c.llenarDescripcion(IdTemas);
                            while (rs.next()){
                            out.println(rs.getString("Descripcion"));
                            }
                     
      out.write("     \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("                   <div>\n");
      out.write("                    \n");
      out.write("                    Contador de personas:\n");
      out.write("                    ");
 
                            IdTemas = request.getParameter("IdTema");
                            rs=c.ContadorInscritos(IdTemas);
                            while (rs.next()){
                             out.println(rs.getInt("personas"));
                             }
                             
                     
      out.write("  \n");
      out.write("                </div>\n");
      out.write("                <h1 class=\"infocurso\">Si te gusta este curso dejanos tu correo <br> TE CONTACTAREMOS!</h1>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("       \n");
      out.write("                    <form action=\"\" method=\"post\" name=\"insert\">\n");
      out.write("                        <h2>Correo Electronico</h2>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"Correo_Participante\" placeholder=\"Enter email\"><br>\n");
      out.write("                      <div class=\"boton\">\n");
      out.write("                        <INPUT class=\"submit\" TYPE=\"submit\" VALUE=\"Guardar\">\n");
      out.write("        \n");
      out.write("    </div><br>\n");
      out.write("                    </form>\n");
      out.write("                    ");

                      String email;
                      email=request.getParameter("txtcod");
                    
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("    \t    <footer>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"col-md-4 col-sm-4 ListRedSocial\">\n");
      out.write("          <h4>Encuentranos en</h4>\n");
      out.write("          <ul>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <img src=\"img\\facebook.png\" alt=\"\">\n");
      out.write("                \n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <img src=\"img\\twitter.png\" alt=\"\">\n");
      out.write("                \n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <img src=\"img\\google.png\" alt=\"\">\n");
      out.write("                \n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <img src=\"img\\youtube.jpg\" alt=\"\">\n");
      out.write("                \n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"col-md-4 col-sm-4 buttonCurso\">\n");
      out.write("          <h4>¿No Encuentras el Curso?</h4>\n");
      out.write("          <button>Perdir un Curso</button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-4 col-sm-4 MapaSite\">\n");
      out.write("          <h4>Nuestros Cursos</h4>\n");
      out.write("          <ul class=\"MapaSite\">\n");
      out.write("            <li>Inicio</li>\n");
      out.write("            <li>Cursos</li>\n");
      out.write("            <li>Calendarios</li>\n");
      out.write("            <li>Pruebas</li>\n");
      out.write("            <li>Contactenos</li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("          <script src=\"js/playvid.js\" type=\"text/javascript\"></script>\n");
      out.write("</footer>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
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
