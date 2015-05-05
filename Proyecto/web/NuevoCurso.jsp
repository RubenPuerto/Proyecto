<%-- 
    Document   : NuevoCurso
    Created on : 11/11/2014, 02:49:18 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.proyecto.conexion.Conexion"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/Formulario.css" />
     <link rel="stylesheet" href="http://code.jquery.com/ui/1.9.1/themes/base/jquery-ui.css" />
    <script src="http://code.jquery.com/jquery-1.8.2.js"></script>
    <script src="/resources/demos/external/jquery.bgiframe-2.1.2.js"></script>
    <script src="http://code.jquery.com/ui/1.9.1/jquery-ui.js"></script>
    <script>
    function abrir_dialog() {
      $( "#dialog" ).dialog({
          show: "blind",
          hide: "explode"
      });
    };
    </script>
        <title>Pedir Un Curso</title>
    </head>
    <style>
    .fancybox-inner {
height: 265px !important;
}
        
    </style>
        
    <body>
        <h1>Pedir Un Curso</h1>
      <%
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
        %>
<FORM name="insert" METHOD=post action="NuevoCurso.jsp">
<table>
<tr>
<td>Nombre</td>
<td>Valor Que Pagaria</td>
</tr>
<tr>
<td><input type="text" name="Nombre"><br></td>
<td><input type="text" name="valor" placeholder="Valor Numerico" required <br></td>
</tr>
<td>Correo</td>
<td>Jornada De Estudio</td>
</tr>
<tr>
<td><input type="text" name="correo"placeholder="ejemplo@hotmail.com"><br></td>
<td><input type="text" name="jornada"><br></td>
</tr>
<td>Nombre Curso</td>
<td>Sede Para El Curso</td>
</tr>
<tr>
<td><input type="text" name="curso"><br></td>
<td>
   <select name="sede">
   <option value="tagaste">Tagaste</option> 
   <option value="suba">Suba</option> 
</select>
</td>
</tr>
</table>
    <div class="boton">
        <INPUT class="submit" TYPE="submit" VALUE="Guardar" onclick="abrir_dialog()">
        
    </div>
    
      <div id="dialog" title="" style="display:none;">
    <p>Curso Guardado</p>
 
</div>
    
</form>
    </body>
</html>
