(function ($) {
    $(function () {
        $('.button-collapse').sideNav();
        $('.parallax').parallax();
        $('.modal').modal();

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
        
        $("a[data-target='delete']").click((event) => {
            let url = $(event)[0].currentTarget.id;
            $("#delete #btn-delete").attr("href", url);
        });

    }); // end of document ready
})(jQuery); // end of jQuery name space