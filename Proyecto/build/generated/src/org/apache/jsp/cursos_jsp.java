package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.proyecto.conexion.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public final class cursos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"> \n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Cursospruebas.css\" />\n");
      out.write("\n");
      out.write("    <title>Todos Los Cursos</title>\n");
      out.write("\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <script src=\"js/jquery-1.9.1.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/docs.min.js\"></script>\n");
      out.write("    <script src=\"js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write("    <script src=\"js/modernizr.custom.js\"></script>\n");
      out.write("    <script src=\"js/toucheffects.js\"></script>\n");
      out.write("    <!-- prefix free to deal with vendor prefixes -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- jQuery -->\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.10.1.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Add fancyBox main JS and CSS files -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.fancybox.js?v=2.1.5\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.fancybox.css?v=2.1.5\" media=\"screen\" />\n");
      out.write("         <link href=\"css/bootstrap-social.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link rel=\"stylesheet\" id=\"font-awesome-css\" href=\"//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("         <link href=\"css/AcordioCursos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <script type=\"text/javascript\">\n");
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
      out.write("<script type=\"text/javascript\">\n");
      out.write("/*jQuery time*/\n");
      out.write("$(document).ready(function(){\n");
      out.write("\t$(\"#accordian h3\").click(function(){\n");
      out.write("\t\t//slide up all the link lists\n");
      out.write("\t\t$(\"#accordian ul ul\").slideUp();\n");
      out.write("\t\t//slide down the link list below the h3 clicked - only if its closed\n");
      out.write("\t\tif(!$(this).next().is(\":visible\"))\n");
      out.write("\t\t{\n");
      out.write("\t\t\t$(this).next().slideDown();\n");
      out.write("\t\t}\n");
      out.write("\t})\n");
      out.write("})\n");
      out.write("</script>        \n");
      out.write("        \n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\t.fancybox-custom .fancybox-skin {\n");
      out.write("\t\t\tbox-shadow: 0 0 20px #222;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- NAVBAR\n");
      out.write("    ================================================== -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("            <nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("              <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                  <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                  </button>\n");
      out.write("                  <a class=\"logo\" href=\"Home.jsp\" title=\"Pruebas Pagina Proyecto\"><img src=\"img/mslogo.png\" class=\"img-responsive logos\" alt=\"Responsive image\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                  <ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"AllCursos.html\">Cursos</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#contact\">Otros</a></li>\n");
      out.write("                                        <li><a class=\"fancybox fancybox.iframe\" href=\"NuevoCurso.jsp\">formulario</a></li>\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t  </ul>\n");
      out.write("                \n");
      out.write("                </div><!--/.nav-collapse -->\n");
      out.write("              </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div><!-- /.container -->\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Cursospruebas.css\" />\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("                    <!-- prefix free to deal with vendor prefixes -->\n");
      out.write("<script src=\"http://thecodeplayer.com/uploads/js/prefixfree-1.0.7.js\" type=\"text/javascript\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!-- jQuery -->\n");
      out.write("\n");
      out.write("  <div  id=\"accordian\">\n");
      out.write("\n");
      out.write("            <ul>\n");
      out.write("               \n");
      out.write("             ");

                                String IdCourse;
                                Conexion c=new Conexion();
                                ResultSet rs=c.getCursos();
                                while (rs.next()){
                                    String Curso=rs.getString("IdCurso");
                                    out.println("<li>");
                                    out.println("<h3>"+rs.getString("TituloCurso")+"</h3>");
                                    
                                    out.println("<ul class='grid cs-style-3'>");
                         
                                    ResultSet rs2=c.llenarTema(Curso);
                                    while(rs2.next()){
                                    out.println("<li>");
                                    out.println("<figure>");
                                    //out.println("<img src ="+rs2.getObject("ImgTema")+">");
                                    out.println("<img src='https://s3.amazonaws.com/tuboleta-pilot/uploads/photo/image/156/square_84210943.png' alt='img04'>");
                                    out.println("<figcaption>");
                                    out.println("<h3> "+rs2.getObject("Titulo")+"</h3>");
                                   // out.println("<p>"+rs2.getObject("Descripcion")+"</h3>");
                                    out.println("<a href='DetalleCursos.jsp?IdCurso="+Curso+"&Idtema="+rs2.getString("IdTemas")+"'>Ver Mas </a>");
                                    out.println("</figcaption>");
                                    out.println("</figure>");
                                    out.println("</li>");
                                 
                                  
                                    }  
                                      out.println("</ul>");
                                   
                                    
                                }

      out.write("\n");
      out.write("                \n");
      out.write("</ul>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("               \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-12 col-md-4 col-sm-6 ListRedSocial\">\n");
      out.write("                <div class=\"TitleCurso Encabezado\">\n");
      out.write("                    <h4>Encuentranos</h4>\n");
      out.write("                </div>\n");
      out.write("            <div class=\"LinkSociales\">\n");
      out.write("              \n");
      out.write("              <a class=\"btn btn-social-icon btn-lg btn-twitter\">\n");
      out.write("                <i class=\"fa fa-twitter\"></i>\n");
      out.write("              </a>\n");
      out.write("              <a class=\"btn btn-social-icon btn-lg btn-facebook\">\n");
      out.write("                <i class=\"fa fa-facebook\"></i>\n");
      out.write("                \n");
      out.write("              </a>\n");
      out.write("              <a class=\"btn btn-social-icon btn-lg btn-google-plus\">\n");
      out.write("                <i class=\"fa fa-google-plus\"></i>\n");
      out.write("                \n");
      out.write("              </a>\n");
      out.write("          \n");
      out.write("          </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"col-xs-12 col-md-4 col-sm-6 buttonCurso\">\n");
      out.write("           <div class=\"TitleCurso Encabezado\">\n");
      out.write("             <h4>Link de Interes</h4>\n");
      out.write("           </div>\n");
      out.write("          <div class=\"LinkInteres\">\n");
      out.write("              \n");
      out.write("                <a class=\"btn btn-social-icon btn-lg btn-github\">\n");
      out.write("                    <i class=\"fa fa-github\"></i>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"btn btn-social-icon btn-lg btn-linkedin\">\n");
      out.write("                    <i class=\"fa fa-linkedin\"></i>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"btn btn-social-icon btn-lg btn-dropbox\">\n");
      out.write("                    <i class=\"fa fa-dropbox\"></i>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"btn btn-social-icon btn-lg btn-pinterest\">\n");
      out.write("                    <i class=\"fa fa-pinterest\"></i>\n");
      out.write("                </a>\n");
      out.write("          \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-xs-12 col-md-4 col-sm-6 MapaSite\">\n");
      out.write("         <div class=\"TitleCurso Encabezado\">\n");
      out.write("             <h4>Nuestros Cursos</h4>\n");
      out.write("           </div>\n");
      out.write("          <div class=\"NuestrosCursos\">\n");
      out.write("              <ul>\n");
      out.write("                  <li>Home</li>\n");
      out.write("                  <li>Cursos</li>\n");
      out.write("                  <li>Contactenos</li>\n");
      out.write("                  <li>Enlaces Rapidos</li>\n");
      out.write("                  <li>Pruebas</li>\n");
      out.write("              </ul>\n");
      out.write("          \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("            </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("    \n");
      out.write("</html>\n");
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
