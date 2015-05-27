
function LeerIdTema($valor) {
    $.post('ActionServletDescripcion', {
    id : $valor
    }, function(responseText) {
    $('.Cargar').html(responseText);
    });
    $.post('ContentResibo', {
    id : $valor
    }, function(responseText) {
    $('.Items').html(responseText);
    });
}
$(document).ready(function() {
    // Interceptamos el evento submit
    $('#form').submit(function() {
    // Enviamos el formulario usando AJAX
    var IdItem=$("#Cursos").val();
    var mail	= $("#mail").val();
    var IdCurso = $.get("IdCurso");
    var Nombre = $("#Celular").val();
    var Celular = $("#Nombre").val();
    
    if ( IdItem != "Seleccione"){
    $.ajax({
        type: 'POST',
        url: "ActionServletGuardar",
        data: {IdItem:IdItem,mail:mail,IdCurso:IdCurso,Nombre:Nombre,Celular:Celular},
        // Mostramos un mensaje con la respuesta de servlet
        success: function (data) {
                document.getElementById('mail').value = '';
                document.getElementById('Celular').value = '';
                document.getElementById('Nombre').value = '';
                apprise("Se Guardo")
        }
        })        
        return false;
    }
    else{
        apprise("Seleccione un Curso");
        return false;
    }
    }); 
    
});

 function validarSiNumero(numero){
    if (!/^([0-9])*$/.test(numero)){
      apprise("El valor " + numero + " no es un número");
      document.getElementById('Celular').value = '';
  }}



    

                


