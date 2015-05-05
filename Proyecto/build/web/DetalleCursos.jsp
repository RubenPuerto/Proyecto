<%@page import="java.sql.ResultSet"%>
<%@page import="com.proyecto.conexion.Conexion"%>
<%@page import="com.proyecto.Servlet.ActionServletDescripcion" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Home Proyecto</title>
     
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/url.js" type="text/javascript"></script>
        
        <script type="text/javascript" src="js/jquery.fancybox.js?v=2.1.5"></script>
        <script src="js/playvid.js" type="text/javascript"></script>
        <script src="js/GetDatos.js" type="text/javascript"></script>
        
        <link href="css/bootstrap.min.css" rel="stylesheet" />
        <link href="css/cursos.css" media="screen" rel="stylesheet" type="text/css" />
        <link href="css/acordion.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" type="text/css" href="css/Formulario.css" />
        <link rel="stylesheet" type="text/css" href="css/jquery.fancybox.css?v=2.1.5" media="screen" />
        <link href="css/bootstrap-social.css" rel="stylesheet" type="text/css"/>
        
        <link rel="stylesheet" id="font-awesome-css" href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" type="text/css" media="screen">
	<script type="text/javascript">
		$(document).ready(function() {

			$('.fancybox').fancybox();


			$("#fancybox-manual-c").click(function() {
				$.fancybox.open([
					{
						href : '1_b.jpg',
						title : 'My title'
					}, {
						href : '2_b.jpg',
						title : '2nd title'
					}, {
						href : '3_b.jpg'
					}
				], {
					helpers : {
						thumbs : {
							width: 75,
							height: 50
						}
					}
				});
			});


		});
	</script>
	<style type="text/css">
		.fancybox-custom .fancybox-skin {
			box-shadow: 0 0 20px #222;
		}

	
	</style>
        
        <script>

    $(function(){

            $(document).on( 'scroll', function(){

                    if ($(window).scrollTop() > 100) {
                            $('.scroll-top-wrapper').addClass('show');
                    } else {
                            $('.scroll-top-wrapper').removeClass('show');
                    }
            });

            $('.scroll-top-wrapper').on('click', scrollToTop);
    });

    function scrollToTop() {
            verticalOffset = typeof(verticalOffset) != 'undefined' ? verticalOffset : 0;
            element = $('body');
            offset = element.offset();
            offsetTop = offset.top;
            $('html, body').animate({scrollTop: offsetTop}, 500, 'linear');
    }
    </script>
        
    
        
        
    </head>
    <body>
        <!-- NAVBAR-->
        <div class="container">
            <nav class="navbar navbar-default navbar-fixed-top">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
			</button>
			<a class="logo" href="Home.jsp" title="Pruebas Pagina Proyecto"><img src="img/mslogo.png" class="img-responsive logos" alt="Responsive image"></a>
                    </div>
                    <div id="navbar" class="navbar-collapse collapse">
                        <ul class="nav navbar-nav">
                            <li><a href="/">Home</a></li>
                            <li><a href="#">Cursos</a></li>
                            <li><a href="#">Otros</a></li>
                            <li><a class="fancybox fancybox.iframe" href="NuevoCurso.jsp">formulario</a></li>	
			</ul>
				
                    </div>
                </div>
            </nav>
        </div>
        
        <div class="contentvideo">
            <div class="hero has-background-video hero-vote">
                <%
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
                %>
            </div>
        </div>
    
    <section>
        <div class="container">
            <div class="row">
                <div class="SelectCourse">                    
                    <select name="Cursos" id="Cursos" class="form-control" onchange="LeerIdTema(value);">
                        <option >Seleccione</option>
                            <%
                                IDCurso = request.getParameter("IdCurso");
                                int value=0;


                                rs=c.llenarTema(IDCurso);
                                while (rs.next()){
                                value=rs.getInt("IdTemas");
                                out.println("<option value="+value+" >"+rs.getString("Titulo")+"</option>");
                                }
                            %>
                    </select>
                </div>
                    <hr width=75%"/>
            </div>
            
            <div class="row Cargar">
                        
            </div>
            <div class="row recibo">
                <div class="col-md-12">
                    <div class="reciboImg">
                        <img src="img/Temas/LogoUniagustiniana.png" alt=""/>
                    </div>
                    <div class="TitleRecibo">
                        <h4>Tecnologia en Gastronomia</h4>
                    </div>
                    <div class="contador">
                        Contador de personas
                    </div>
                    <div class="codigoBarras">
                        <img src="img/barcode.gif" alt=""/>
                    </div>
                </div>
            </div>
        
                
            
            <!--<h1 class="infocurso">Si te gusta este curso dejanos tu correo <br> TE CONTACTAREMOS!</h1>-->
            <div class="row ContentMail">
                <hr class="separador" width=75%"/>
                <div class="col-md-6 TitleCorreo">
                    <h4>Si te Gusta este Curso Dejanos Tu Correo</h4>
                </div>
                <div class="col-md-6 correo">
                    <form id="form" action="ActionServletGuardar" method="post" name="fo3">
                        <input type="email" id="mail" class="form-control" name="correo" placeholder="Enter email"><br>
                        <div class="boton">
                            <INPUT class="submit" TYPE="submit" VALUE="Guardar" onclick="abrir_dialog()">
                        </div>
                        
                    </form>
                    <script>
                        function abrir_dialog() {
                            $( "#dialog" ).dialog({
                                show: "blind",
                                hide: "explode"
                            });
                        };
                    </script>
                    <div id="dialog" title="" style="display:none;">
                            <p>Curso Guardado</p>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <div class="scroll-top-wrapper ">
	<span class="scroll-top-inner">
		<i class="fa fa-2x fa-arrow-circle-up"></i>
	</span>
    </div>
    <footer>
        <div class="container">
        <div class="row">
            <div class="col-xs-12 col-md-4 col-sm-6 ListRedSocial">
                <div class="TitleCurso Encabezado">
                    <h4>Encuentranos</h4>
                </div>
            <div class="LinkSociales">
              
              <a class="btn btn-social-icon btn-lg btn-twitter">
                <i class="fa fa-twitter"></i>
              </a>
              <a class="btn btn-social-icon btn-lg btn-facebook">
                <i class="fa fa-facebook"></i>
                
              </a>
              <a class="btn btn-social-icon btn-lg btn-google-plus">
                <i class="fa fa-google-plus"></i>
                
              </a>
          
          </div>
</div>


        
        <div class="col-xs-12 col-md-4 col-sm-6 buttonCurso">
           <div class="TitleCurso Encabezado">
             <h4>Link de Interes</h4>
           </div>
          <div class="LinkInteres">
              
                <a class="btn btn-social-icon btn-lg btn-github">
                    <i class="fa fa-github"></i>
                </a>
                <a class="btn btn-social-icon btn-lg btn-linkedin">
                    <i class="fa fa-linkedin"></i>
                </a>
                <a class="btn btn-social-icon btn-lg btn-dropbox">
                    <i class="fa fa-dropbox"></i>
                </a>
                <a class="btn btn-social-icon btn-lg btn-pinterest">
                    <i class="fa fa-pinterest"></i>
                </a>
          
          </div>
        </div>
        <div class="col-xs-12 col-md-4 col-sm-6 MapaSite">
         <div class="TitleCurso Encabezado">
             <h4>Nuestros Cursos</h4>
           </div>
          <div class="NuestrosCursos">
              <ul>
                  <li>Home</li>
                  <li>Cursos</li>
                  <li>Contactenos</li>
                  <li>Enlaces Rapidos</li>
                  <li>Pruebas</li>
              </ul>
          
          </div>
        </div>
        
    </div>
            </div>
</footer>
    </body>
</html>
