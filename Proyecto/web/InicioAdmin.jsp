<%-- 
    Document   : inicioAdmin
    Created on : 8/02/2015, 02:01:04 PM
    Author     : alex
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
    <link href="css/AdminHome.css" rel="stylesheet" />
  
  
    

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
                                    <div style="text-align:center;" >
				  <a class="logo" href="Home.jsp" title="Pruebas Pagina Proyecto"><img src="img/mslogo.png" class="img-responsive logos" alt="Responsive image"></a>
                                    </div>
				</div>
                              </nav>
        <div class="itemsPrincipales">
        <h1>Administración Del Sitio</h1>
       
                                <a href="#" class="boton azul">Banner</a>
                                <a href="#" class="boton azul">Programnas</a>
                                <a href="#" class="boton azul">Temas</a>
				
        <hr>
     
       <h1>Generar Reportes</h1>
       
                                <a href="#" class="boton azul">Curso Nuevos</a>
                                <a href="#" class="boton azul">Personas Inscritas</a>
                              <hr>
			
                              </div>
         </div>
                
      


</body>
                               
</html>