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
   