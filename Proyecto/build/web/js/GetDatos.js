
function LeerIdTema($valor) {
    $.post('ActionServletDescripcion', {
    id : $valor
    }, function(responseText) {
    $('.Cargar').html(responseText);
    });
}
$(document).ready(function() {
    // Interceptamos el evento submit
    $('#form').submit(function() {
    // Enviamos el formulario usando AJAX
    var IdItem=$("#Cursos").val();
    var mail	= $("#mail").val();
    var IdCurso = $.get("IdCurso");
    
    
    $.ajax({
        type: 'POST',
        url: $(this).attr('action'),
        data: {IdItem:IdItem,mail:mail,IdCurso:IdCurso},
        // Mostramos un mensaje con la respuesta de PHP
        success: function (data) {
                alert('Guardado');
        }
        })        
        return false;
    }); 
});


    

                


