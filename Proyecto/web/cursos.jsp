

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.proyecto.conexion.Conexion"%>
<%@ page import = "java.sql.Connection"%>
<%@ page import = "java.sql.DriverManager"%> 
<%@ page import = "java.sql.ResultSet"%> 
<%@ page import = "java.sql.Statement"%> 

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
    
    <link rel="stylesheet" type="text/css" href="css/Cursospruebas.css" />

    <title>Todos Los Cursos</title>

    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <script src="js/jquery-1.9.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/docs.min.js"></script>
    <script src="js/ie10-viewport-bug-workaround.js"></script>
    <script src="js/modernizr.custom.js"></script>
    <script src="js/toucheffects.js"></script>
    <!-- prefix free to deal with vendor prefixes -->


<!-- jQuery -->

    
    <script type="text/javascript" src="js/jquery-1.10.1.min.js"></script>

	<!-- Add fancyBox main JS and CSS files -->
	<script type="text/javascript" src="js/jquery.fancybox.js?v=2.1.5"></script>
	<link rel="stylesheet" type="text/css" href="css/jquery.fancybox.css?v=2.1.5" media="screen" />
         <link href="css/bootstrap-social.css" rel="stylesheet" type="text/css"/>
         <link rel="stylesheet" id="font-awesome-css" href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" type="text/css" media="screen">
         <link href="css/AcordioCursos.css" rel="stylesheet" type="text/css"/>
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
<script type="text/javascript">
/*jQuery time*/
$(document).ready(function(){
	$("#accordian h3").click(function(){
		//slide up all the link lists
		$("#accordian ul ul").slideUp();
		//slide down the link list below the h3 clicked - only if its closed
		if(!$(this).next().is(":visible"))
		{
			$(this).next().slideDown();
		}
	})
})
</script>        
        
	<style type="text/css">
		.fancybox-custom .fancybox-skin {
			box-shadow: 0 0 20px #222;
		}

	
	</style>

</head>
<body>
    <!-- NAVBAR
    ================================================== -->
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
					<li class="active"><a href="Home.jsp">Home</a></li>
					<li><a href="cursos.jsp">Cursos</a></li>
                                        <li><a class="fancybox fancybox.iframe" href="NuevoCurso.jsp">formulario</a></li>	
					
				  </ul>
                
                </div><!--/.nav-collapse -->
              </div>
            </nav>

    </div>


    </div><!-- /.container -->
    
    <link rel="stylesheet" type="text/css" href="css/Cursospruebas.css" />
        
        
    
    <div class="container">
                    <!-- prefix free to deal with vendor prefixes -->
<script src="http://thecodeplayer.com/uploads/js/prefixfree-1.0.7.js" type="text/javascript" type="text/javascript"></script>

<!-- jQuery -->

  <div  id="accordian">

            <ul>
               
             <%
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
%>
                
</ul>
            </div>
            
            
               
    </div>

    <footer>
        <div class="container">
        <div class="ListRedSocial">
   
          
          <div class="LinkSociales">
              
            
              <a class="btn btn-social-icon btn-lg btn-facebook">
                <i class="fa fa-facebook"></i>
                
              </a>
              <a class="btn btn-social-icon btn-lg btn-youtube">
                <i class="fa fa-youtube"></i>
                
                  
              </a>
              <a class="btn btn-social-icon btn-lg btn-twitter">
                <i class="fa fa-twitter"></i>
              </a>
              <a class="btn btn-social-icon btn-lg btn-instagram">
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

