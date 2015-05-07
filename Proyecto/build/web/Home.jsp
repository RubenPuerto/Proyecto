<%-- 
    Document   : Home
    Created on : 8/02/2015, 02:01:04 PM
    Author     : Ruben P
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.proyecto.conexion.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> 

    <title>Sistema de interacción ciudadana</title>

    <script src="js/jquery-1.9.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/docs.min.js"></script>
    <script src="js/snap.svg-min.js"></script>
    <script src="js/ie10-viewport-bug-workaround.js"></script>
    <script type="text/javascript" src="js/jssor.slider.mini.js"></script>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <script type="text/javascript" src="js/jquery-1.10.1.min.js"></script>
    <script type="text/javascript" src="js/jquery.fancybox.js"></script>
    
    
    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <link href="css/bootstrap-social.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css" href="css/component.css" />
    <link href="css/acordion.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css" href="css/jquery.fancybox.css" media="screen" />
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
	.fancybox-custom     .fancybox-skin {
            box-shadow: 0 0 20px #222;
	}
    </style>
    <script>
        jQuery(document).ready(function ($) {

            var options = {
                $FillMode: 2,                                       //[Optional] The way to fill image in slide, 0 stretch, 1 contain (keep aspect ratio and put all inside slide), 2 cover (keep aspect ratio and cover whole slide), 4 actual size, 5 contain for large image, actual size for small image, default value is 0
                $AutoPlay: true,                                    //[Optional] Whether to auto play, to enable slideshow, this option must be set to true, default value is false
                $AutoPlayInterval: 4000,                            //[Optional] Interval (in milliseconds) to go for next slide since the previous stopped if the slider is auto playing, default value is 3000
                $PauseOnHover: 1,                                   //[Optional] Whether to pause when mouse over if a slider is auto playing, 0 no pause, 1 pause for desktop, 2 pause for touch device, 3 pause for desktop and touch device, 4 freeze for desktop, 8 freeze for touch device, 12 freeze for desktop and touch device, default value is 1

                $ArrowKeyNavigation: true,   			            //[Optional] Allows keyboard (arrow key) navigation or not, default value is false
                $SlideEasing: $JssorEasing$.$EaseOutQuint,          //[Optional] Specifies easing for right to left animation, default value is $JssorEasing$.$EaseOutQuad
                $SlideDuration: 800,                               //[Optional] Specifies default duration (swipe) for slide in milliseconds, default value is 500
                $MinDragOffsetToSlide: 20,                          //[Optional] Minimum drag offset to trigger slide , default value is 20
                //$SlideWidth: 600,                                 //[Optional] Width of every slide in pixels, default value is width of 'slides' container
                //$SlideHeight: 300,                                //[Optional] Height of every slide in pixels, default value is height of 'slides' container
                $SlideSpacing: 0, 					                //[Optional] Space between each slide in pixels, default value is 0
                $DisplayPieces: 1,                                  //[Optional] Number of pieces to display (the slideshow would be disabled if the value is set to greater than 1), the default value is 1
                $ParkingPosition: 0,                                //[Optional] The offset position to park slide (this options applys only when slideshow disabled), default value is 0.
                $UISearchMode: 1,                                   //[Optional] The way (0 parellel, 1 recursive, default value is 1) to search UI components (slides container, loading screen, navigator container, arrow navigator container, thumbnail navigator container etc).
                $PlayOrientation: 1,                                //[Optional] Orientation to play slide (for auto play, navigation), 1 horizental, 2 vertical, 5 horizental reverse, 6 vertical reverse, default value is 1
                $DragOrientation: 1,                                //[Optional] Orientation to drag slide, 0 no drag, 1 horizental, 2 vertical, 3 either, default value is 1 (Note that the $DragOrientation should be the same as $PlayOrientation when $DisplayPieces is greater than 1, or parking position is not 0)
              
                $BulletNavigatorOptions: {                          //[Optional] Options to specify and enable navigator or not
                    $Class: $JssorBulletNavigator$,                 //[Required] Class to create navigator instance
                    $ChanceToShow: 2,                               //[Required] 0 Never, 1 Mouse Over, 2 Always
                    $AutoCenter: 1,                                 //[Optional] Auto center navigator in parent container, 0 None, 1 Horizontal, 2 Vertical, 3 Both, default value is 0
                    $Steps: 1,                                      //[Optional] Steps to go for each navigation request, default value is 1
                    $Lanes: 1,                                      //[Optional] Specify lanes to arrange items, default value is 1
                    $SpacingX: 8,                                   //[Optional] Horizontal space between each item in pixel, default value is 0
                    $SpacingY: 8,                                   //[Optional] Vertical space between each item in pixel, default value is 0
                    $Orientation: 1,                                //[Optional] The orientation of the navigator, 1 horizontal, 2 vertical, default value is 1
                    $Scale: false                                   //Scales bullets navigator or not while slider scale
                },

                $ArrowNavigatorOptions: {                           //[Optional] Options to specify and enable arrow navigator or not
                    $Class: $JssorArrowNavigator$,                  //[Requried] Class to create arrow navigator instance
                    $ChanceToShow: 1,                               //[Required] 0 Never, 1 Mouse Over, 2 Always
                    $AutoCenter: 2,                                 //[Optional] Auto center arrows in parent container, 0 No, 1 Horizontal, 2 Vertical, 3 Both, default value is 0
                    $Steps: 1                                       //[Optional] Steps to go for each navigation request, default value is 1
                }
            };

            //Make the element 'slider1_container' visible before initialize jssor slider.
            $("#slider1_container").css("display", "block");
            var jssor_slider1 = new $JssorSlider$("slider1_container", options);

            //responsive code begin
            //you can remove responsive code if you don't want the slider scales while window resizes
            function ScaleSlider() {
                var bodyWidth = document.body.clientWidth;
                if (bodyWidth)
                    jssor_slider1.$ScaleWidth(Math.min(bodyWidth, 1920));
                else
                    window.setTimeout(ScaleSlider, 30);
            }
            ScaleSlider();

            $(window).bind("load", ScaleSlider);
            $(window).bind("resize", ScaleSlider);
            $(window).bind("orientationchange", ScaleSlider);
            //responsive code end
        });
    </script>
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
    <!-- NAVBAR -->
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
					<li class="active"><a href="">Home</a></li>
					<li><a href="cursos.jsp">Cursos</a></li>
                                        <li><a class="fancybox fancybox.iframe" href="NuevoCurso.jsp">formulario</a></li>	
					
				  </ul>
				
				</div><!--/.nav-collapse -->
			  </div>
			</nav>

    </div>

        <div id="slider1_container" style=" position: relative; margin: 0 auto;
        top: 0px; left: 0px; width: 1300px; height: 500px; overflow: hidden;">
            <!-- Loading Screen -->
            <div u="loading" style="position: absolute; top: 0px; left: 0px;">
                <div style="filter: alpha(opacity=70); opacity: 0.7; position: absolute; display: block;
                top: 0px; left: 0px; width: 100%; height: 100%;">
                </div>
                <div style="position: absolute; display: block; background: url(img/loading.gif) no-repeat center center;
                top: 0px; left: 0px; width: 100%; height: 100%;">
                </div>
            </div>
            <!-- Slides Container -->
            <div u="slides" style="cursor: move; position: absolute; left: 0px; top: 0px; width: 1300px; height: 500px; overflow: hidden;">
                <div>
                    
                    <img u="image" src="img/home/01.jpg" alt=""/>
                </div>
                <div>
                    <img u="image" src2="img/home/02.jpg" alt=""/>
                </div>
                <div>
                    <img u="image" src2="img/home/03.jpg" alt=""/>
                </div>
            </div>

            <!-- Bullet Navigator Skin Begin -->
            <style>
                /* jssor slider bullet navigator skin 21 css */
                /*
                .jssorb21 div           (normal)
                .jssorb21 div:hover     (normal mouseover)
                .jssorb21 .av           (active)
                .jssorb21 .av:hover     (active mouseover)
                .jssorb21 .dn           (mousedown)
                */
                .jssorb21 div, .jssorb21 div:hover, .jssorb21 .av {
                    background: url(img/Banner/b05.png) no-repeat;
                    overflow: hidden;
                    cursor: pointer;
                }

                .jssorb21 div {
                    background-position: -5px -5px;
                }

                    .jssorb21 div:hover, .jssorb21 .av:hover {
                        background-position: -35px -5px;
                    }

                .jssorb21 .av {
                    background-position: -65px -5px;
                }

                .jssorb21 .dn, .jssorb21 .dn:hover {
                    background-position: -95px -5px;
                }
            </style>
            <!-- bullet navigator container -->
            <div u="navigator" class="jssorb21" style="position: absolute; bottom: 26px; left: 6px;">
                <!-- bullet navigator item prototype -->
                <div u="prototype" style="POSITION: absolute; WIDTH: 19px; HEIGHT: 19px; text-align:center; line-height:19px; color:White; font-size:12px;"></div>
            </div>
            <!-- Bullet Navigator Skin End -->
            <!-- Arrow Navigator Skin Begin -->
            <style>
                /* jssor slider arrow navigator skin 21 css */
                /*
                .jssora21l              (normal)
                .jssora21r              (normal)
                .jssora21l:hover        (normal mouseover)
                .jssora21r:hover        (normal mouseover)
                .jssora21ldn            (mousedown)
                .jssora21rdn            (mousedown)
                */
                .jssora21l, .jssora21r, .jssora21ldn, .jssora21rdn {
                    position: absolute;
                    cursor: pointer;
                    display: block;
                    background: url(img/Banner/a11.png) center center no-repeat;
                    overflow: hidden;
                }

                .jssora21l {
                    background-position: -3px -33px;
                }

                .jssora21r {
                    background-position: -63px -33px;
                }

                .jssora21l:hover {
                    background-position: -123px -33px;
                }

                .jssora21r:hover {
                    background-position: -183px -33px;
                }

                .jssora21ldn {
                    background-position: -243px -33px;
                }

                .jssora21rdn {
                    background-position: -303px -33px;
                }
            </style>
            <!-- Arrow Left -->
            <span u="arrowleft" class="jssora21l" style="width: 55px; height: 55px; top: 123px; left: 8px;">
            </span>
            <!-- Arrow Right -->
            <span u="arrowright" class="jssora21r" style="width: 55px; height: 55px; top: 123px; right: 8px">
            </span>
            <!-- Arrow Navigator Skin End -->
            <a style="display: none" href="http://www.jssor.com">jQuery Slider</a>
        </div>
	
      
                <div class="title">
                    <h1>Que Quieres Estudiar</h1>
                </div>


        <div id="grid" class="grid clearfix hidden-xs">
                
                <%
                    Conexion c=new Conexion();
                    ResultSet rs=c.getCursos();
                    while(rs.next()){
                        out.println("<a href='DetalleCursos.jsp?IdCurso="+rs.getString("IdCurso")+"' data-path-hover='m 180,34.57627 -180,0 L 0,0 180,0 z'>");
                        out.println("<figure>");
                        out.println("<img src="+rs.getString("ImgCursosInicio")+" />");
                        out.println("<svg viewBox='170 0 1 330' preserveAspectRatio='none'><path d='M 180,160 0,218 0,0 180,0 z'/></svg>");
                        out.println("<figcaption>");
                        out.println("<h2>"+rs.getString("TituloCurso")+"</h2>");
                        out.println("<p>"+rs.getString("DescripcionCurso")+"</p>");
                        out.println("<input type='submit' value='Ver Mas' onclick = location='DetalleCursos.jsp?IdCurso="+rs.getString("IdCurso")+"'  class='Button'/>");
                        out.println("</figcaption>");
                        out.println("</figure>");
                        out.println("</a>");
                    }
                %>
        </div>  
        
        <div id="slider1_container" style="display: none; position: relative; margin: 0 auto; width: 980px;
        height: 380px; overflow: hidden;">

            <!-- Loading Screen -->
            <div u="loading" style="position: absolute; top: 0px; left: 0px;">
                <div style="filter: alpha(opacity=70); opacity:0.7; position: absolute; display: block;

                background-color: #000; top: 0px; left: 0px;width: 100%; height:100%;">
                </div>
                <div style="position: absolute; display: block; background: url(img/loading.gif) no-repeat center center;

                top: 0px; left: 0px;width: 100%;height:100%;">
                </div>
            </div>

            <!-- Slides Container -->
            <div u="slides" style="cursor: move; position: absolute; left: 0px; top: 0px; width: 1140px; height: 442px;
            overflow: hidden;">
                <div>
                    <img u="image" src2="img/home/01.jpg" />
                </div>
                <div>
                    <img u="image" src2="img/home/02.jpg" />
                </div>
                <div>
                    <img u="image" src2="img/home/03.jpg" />
                </div>
                <div>
                    <img u="image" src2="img/home/04.jpg" />
                </div>
            </div>
            <!-- Bullet Navigator Skin Begin -->
            <style>
                /* jssor slider bullet navigator skin 05 css */
                /*
                .jssorb05 div           (normal)
                .jssorb05 div:hover     (normal mouseover)
                .jssorb05 .av           (active)
                .jssorb05 .av:hover     (active mouseover)
                .jssorb05 .dn           (mousedown)
                */
                .jssorb05 div, .jssorb05 div:hover, .jssorb05 .av {
                    background: url(img/b05.png) no-repeat;
                    overflow: hidden;
                    cursor: pointer;
                }

                .jssorb05 div {
                    background-position: -7px -7px;
                }

                    .jssorb05 div:hover, .jssorb05 .av:hover {
                        background-position: -37px -7px;
                    }

                .jssorb05 .av {
                    background-position: -67px -7px;
                }

                .jssorb05 .dn, .jssorb05 .dn:hover {
                    background-position: -97px -7px;
                }
            </style>
            <!-- bullet navigator container -->
            <div u="navigator" class="jssorb05" style="position: absolute; bottom: 16px; right: 6px;">
                <!-- bullet navigator item prototype -->
                <div u="prototype" style="POSITION: absolute; WIDTH: 16px; HEIGHT: 16px;"></div>
            </div>
            <!-- Bullet Navigator Skin End -->
            <!-- Arrow Navigator Skin Begin -->
            <style>
                /* jssor slider arrow navigator skin 11 css */
                /*
                .jssora11l              (normal)
                .jssora11r              (normal)
                .jssora11l:hover        (normal mouseover)
                .jssora11r:hover        (normal mouseover)
                .jssora11ldn            (mousedown)
                .jssora11rdn            (mousedown)
                */
                .jssora11l, .jssora11r, .jssora11ldn, .jssora11rdn {
                    position: absolute;
                    cursor: pointer;
                    display: block;
                    background: url(img/a11.png) no-repeat;
                    overflow: hidden;
                }

                .jssora11l {
                    background-position: -11px -41px;
                }

                .jssora11r {
                    background-position: -71px -41px;
                }

                .jssora11l:hover {
                    background-position: -131px -41px;
                }

                .jssora11r:hover {
                    background-position: -191px -41px;
                }

                .jssora11ldn {
                    background-position: -251px -41px;
                }

                .jssora11rdn {
                    background-position: -311px -41px;
                }
            </style>
            <!-- Arrow Left -->
            <span u="arrowleft" class="jssora11l" style="width: 37px; height: 37px; top: 123px; left: 8px;">
            </span>
            <!-- Arrow Right -->
            <span u="arrowright" class="jssora11r" style="width: 37px; height: 37px; top: 123px; right: 8px">
            </span>
            <!-- Arrow Navigator Skin End -->
            <a style="display: none" href="http://www.jssor.com">jQuery Slider</a>
        </div>
        <!-- Jssor Slider End -->

	

    
        
    
                
                
 

      <div class="scroll-top-wrapper ">
	<span class="scroll-top-inner">
		<i class="fa fa-2x fa-arrow-circle-up"></i>
	</span>
</div>
    

	

	    <footer>
        <div class="row">
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
        <script>
            (function() {
    
                function init() {
                    var speed = 250,
                        easing = mina.easeinout;

                    [].slice.call ( document.querySelectorAll( '#grid > a' ) ).forEach( function( el ) {
                        var s = Snap( el.querySelector( 'svg' ) ), path = s.select( 'path' ),
                            pathConfig = {
                                from : path.attr( 'd' ),
                                to : el.getAttribute( 'data-path-hover' )
                            };

                        el.addEventListener( 'mouseenter', function() {
                            path.animate( { 'path' : pathConfig.to }, speed, easing );
                        } );

                        el.addEventListener( 'mouseleave', function() {
                            path.animate( { 'path' : pathConfig.from }, speed, easing );
                        } );
                    } );
                }

                init();

            })();
        </script>
	


</body>
</html>