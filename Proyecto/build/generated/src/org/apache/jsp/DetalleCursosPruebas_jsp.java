package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.proyecto.conexion.Conexion;
import com.proyecto.Servlet.ActionServletDescripcion;

public final class DetalleCursosPruebas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.fancybox.js?v=2.1.5\"></script>\n");
      out.write("        <script src=\"js/playvid.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/GetDatos.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/cursos.css\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"css/acordion.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Formulario.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.fancybox.css?v=2.1.5\" media=\"screen\" />\n");
      out.write("        <link href=\"css/bootstrap-social.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" id=\"font-awesome-css\" href=\"//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\" type=\"text/css\" media=\"screen\">\n");
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
      out.write("        \n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("    $(function(){\n");
      out.write("\n");
      out.write("            $(document).on( 'scroll', function(){\n");
      out.write("\n");
      out.write("                    if ($(window).scrollTop() > 100) {\n");
      out.write("                            $('.scroll-top-wrapper').addClass('show');\n");
      out.write("                    } else {\n");
      out.write("                            $('.scroll-top-wrapper').removeClass('show');\n");
      out.write("                    }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('.scroll-top-wrapper').on('click', scrollToTop);\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    function scrollToTop() {\n");
      out.write("            verticalOffset = typeof(verticalOffset) != 'undefined' ? verticalOffset : 0;\n");
      out.write("            element = $('body');\n");
      out.write("            offset = element.offset();\n");
      out.write("            offsetTop = offset.top;\n");
      out.write("            $('html, body').animate({scrollTop: offsetTop}, 500, 'linear');\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- NAVBAR-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<a class=\"logo\" href=\"Home.jsp\" title=\"Pruebas Pagina Proyecto\"><img src=\"img/mslogo.png\" class=\"img-responsive logos\" alt=\"Responsive image\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li class=\"active\"><a href=\"\">Home</a></li>\n");
      out.write("                            <li><a href=\"https://www.youtube.com/embed/qdySinddDHw?iv_load_policy=3&controls=0&enablejsapi=1&origin=http%3A%2F%2Flocalhost%3A8080\">Cursos</a></li>\n");
      out.write("                            <li><a href=\"DetalleCursosPruebas.jsp\">Otros</a></li>\n");
      out.write("                            <li><a class=\"fancybox fancybox.iframe\" href=\"NuevoCurso.jsp\">formulario</a></li>\t\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t\t\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"contentvideo\">\n");
      out.write("            <div class=\"hero has-background-video hero-vote\">\n");
      out.write("                ");

                    String IDCurso = request.getParameter("IdCurso");
                    Conexion c=new Conexion();
                    ResultSet rs=c.llenarcurso(IDCurso);
                    while(rs.next()){
                        String img=rs.getString("ImagenCurso");
                        out.println("<div class='vote'>");
                        out.println(" <h1>"+rs.getString("TituloCurso")+"<span></span></h1>");
                        out.println("<button class='play-btn'></button>");
                        out.println("</div>");
                        out.println("<div class='background' style='background-image: url("+rs.getString("ImagenCurso")+");'>");
                        out.println("<div class='video'>");
                        out.println("<span id='video-cont' data-video-id="+rs.getString("IdVideo")+" ></span>");
                        out.println("</div></div>");
                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    <section>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"SelectCourse\">                    \n");
      out.write("                    <select name=\"Cursos\" id=\"Cursos\" class=\"form-control\" onchange=\"LeerIdTema(value);\">\n");
      out.write("                        <option >Seleccione</option>\n");
      out.write("                            ");

                                IDCurso = request.getParameter("IdCurso");
                                int value=0;


                                rs=c.llenarTema(IDCurso);
                                while (rs.next()){
                                value=rs.getInt("IdTemas");
                                out.println("<option value="+value+" >"+rs.getString("Titulo")+"</option>");
                                }
                            
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>       \n");
      out.write("                    <div class=\"row Cargar\">\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("        \n");
      out.write("                \n");
      out.write("            \n");
      out.write("            <!--<h1 class=\"infocurso\">Si te gusta este curso dejanos tu correo <br> TE CONTACTAREMOS!</h1>-->\n");
      out.write("            <div class=\"row ContentMail\">\n");
      out.write("                <div class=\"col-md-6 TitleCorreo\"><h4>Si te Gusta este Curso Dejanos Tu Correo</h4></div>\n");
      out.write("                <div class=\"col-md-6 correo\">\n");
      out.write("                    <form id=\"form\" action=\"Enviar\" method=\"post\" name=\"fo3\">\n");
      out.write("                        <input type=\"email\" class=\"form-control\" name=\"correo\" placeholder=\"Enter email\"><br>\n");
      out.write("                        <div class=\"boton\">\n");
      out.write("                            <INPUT class=\"submit\" TYPE=\"submit\" VALUE=\"Guardar\">\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <div class=\"scroll-top-wrapper \">\n");
      out.write("\t<span class=\"scroll-top-inner\">\n");
      out.write("\t\t<i class=\"fa fa-2x fa-arrow-circle-up\"></i>\n");
      out.write("\t</span>\n");
      out.write("    </div>\n");
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
