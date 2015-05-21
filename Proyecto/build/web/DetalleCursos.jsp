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
        
        <link href="css/bootstrap.min.css" rel="stylesheet" />
        <link href="css/cursos.css" media="screen" rel="stylesheet" type="text/css" />
        <link href="css/acordion.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" type="text/css" href="css/Formulario.css" />
        <link rel="stylesheet" type="text/css" href="css/jquery.fancybox.css?v=2.1.5" media="screen" />
        <link href="css/bootstrap-social.css" rel="stylesheet" type="text/css"/>
        
        <link rel="stylesheet" id="font-awesome-css" href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" type="text/css" media="screen">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/url.js" type="text/javascript"></script>
        <script type="text/javascript" src="js/jquery.fancybox.js?v=2.1.5"></script>
        <script src="js/playvid.js" type="text/javascript"></script>
        <script src="js/GetDatos.js" type="text/javascript"></script>
        <script src="js/gototop.js" type="text/javascript"></script>
        
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
                            <li><a href="Home.jsp">Inicio</a></li>
                            <li class="active"><a href="#">Cursos</a></li>
			</ul>
                        <ul class="nav navbar-nav navbar-right">
                            <li><a class="fancybox fancybox.iframe" href="NuevoCurso.jsp">Pedir Un Curso</a></li>	
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
                        out.println("<div class='background' style='background-image: url(VerImagenDetalle?IdCurso="+rs.getInt("IdCurso")+");'>");
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
                        <img src="img/Recursos/barcode.gif" alt=""/>
                    </div>
                </div>
            </div>
            <div class="row ContentMail">
                <hr class="separador" width=75%"/>
                <div class="col-md-6 TitleCorreo">
                    <h4>Si te Gusta este Curso Dejanos Tu Correo</h4>
                </div>
                <div class="col-md-6 correo">
                    <form id="form" action="ActionServletGuardar" method="post" name="fo3">
                        <input type="email" id="mail" class="form-control" name="correo" placeholder="Enter email"><br>
                        <div class="boton">
                            <INPUT class="submit" TYPE="submit" VALUE="Enviar" onclick="abrir_dialog()">
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
            <div class="ListRedSocial">
                <div class="LinkSociales">
                    <a class="btn btn-social-icon btn-lg btn-facebook" href="https://www.facebook.com/uniagustiniana">
                        <i class="fa fa-facebook"></i>
                    </a>
                    <a class="btn btn-social-icon btn-lg btn-youtube" href="https://www.youtube.com/user/Uniagustiniana">
                        <i class="fa fa-youtube"></i>
                    </a>
                    <a class="btn btn-social-icon btn-lg btn-twitter" href="https://twitter.com/UniagustOficial">
                        <i class="fa fa-twitter"></i>
                    </a>
                    <a class="btn btn-social-icon btn-lg btn-instagram" href="https://instagram.com/">
                        <i class="fa fa-instagram"></i>
                    </a>
                </div>
                <br>
                <div class="contacto">
                    <p>
                        Contacto: 4193200 Ext 1087. <br>
                        comercial@uniagustiniana.edu.co<br>
                        Dirección: Av Ciudad de Cali No 11b-95 Campus Tagaste / Sede Suba: Cll 147 No 89-39
                    </p>
                </div>
                <div id="info">
                    INSTITUCIÓN DE EDUCACIÓN SUPERIOR SUJETA A INSPECCIÓN Y VIGILANCIA POR EL M.E.N.
                </div>
            </div>
        </div>
    </footer>
    </body>
</html>
