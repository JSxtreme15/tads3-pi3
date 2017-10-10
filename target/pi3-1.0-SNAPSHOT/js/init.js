(function ($) {
    $(function () {
        $('.button-collapse').sideNav();
        $('.parallax').parallax();

        $('#search-cep').click(() => {
            let cep = $("#cep").val();
            if (cep == "") {
                alert("Campo CEP vazio");
            }
            
            let url = 'https://viacep.com.br/ws/';
            url += cep + '/json/';
            
            $.get(url, (response) => {
                $('#logradouro').val(response.logradouro);
                $('#logradouro').change();
                $('#numero').focus();
            });
        });

    }); // end of document ready
})(jQuery); // end of jQuery name space