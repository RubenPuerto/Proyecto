<%-- 
    Document   : Pruebas
    Created on : 19-abr-2015, 20:46:35
    Author     : RUBEN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.proyecto.conexion.Conexion"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        
        <script src="http://code.jquery.com/jquery-latest.js">

        </script>
        <script>
                $(document).ready(function() {
                        $('#submit').click(function(event) {
                                var nombreVar = $('#Curso').val();
                                var apellidoVar = $('#Descripcion').val();
                               
                                // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
                                $.post('pruebas', {
                                        nombre : nombreVar,
                                        apellido: apellidoVar,
                                        
                                }, function(responseText) {
                                        $('#tabla').html(responseText);
                                });
                        });
                });
        </script>
    <script type="text/javascript" >
     $(document).ready(function(){
      $("table button").click(function(){
        var button = $(this);
        var userId = button.attr("data");
        var tr = button.parent().parent().get(0);
        var tr = $(tr);
        
      });
    });
    </script>
        
            
        
    </head>
    
    <body style="max-width: 1030px; margin: 0 auto;">
        <div id="container">
            <form style="margin: 0 auto;" action="pruebas" method="post">
            <label>Curso</label>
            <input type="text"  id="Curso">
            <br>
            <label>Descripcion</label>
            <input type="Text"  id="Descripcion">
            <br>
            <input type="button" id="submit" value="Añadir" /> 
            
        </form>
        </div>
        <table class="table table-condensed" id="tabla" style="margin: 0 auto;">
            
            <%
            out.println("<tr>");
            out.println("<td>IdCurso</td>");
            out.println("<td>Curso</td>");
            out.println("<td>Descripcion</td>");
            out.println("</tr>");
            Conexion c=new Conexion();
            ResultSet rs2=c.getCursos();
            while(rs2.next())
            {   
                
                
                out.println("<tr style='cursor:pointer' class='desmarcado'>");
                out.println("<td>"+rs2.getInt("IdCurso")+"</td>");
                out.println("<td>"+rs2.getString("TituloCurso")+"</td>");
                out.println("<td>"+rs2.getString("DescripcionCurso") +"</td>");
                out.println("<td><input type='button' id='submit2' value='Añadir' /></td>");
                out.println("</tr>");
             
            }
            
            
            
            %>
        
       </table>
           
    </body>
</html>
