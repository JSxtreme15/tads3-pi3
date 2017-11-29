<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!doctype html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1"/>

        <title>Astec Games</title>
        <link rel="icon" type="imagem/png" href="http://ap.imagensbrasil.org/images/2017/10/19/astec.png" /> 


        <!-- CSS  -->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="${pageContext.request.contextPath}/css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/trianglify/0.4.0/trianglify.min.js"></script>

    </head>
    <body>
        <script>
            var pattern = Trianglify({
                width: window.innerWidth,
                height: window.innerHeight,
                x_colors: 'Spectral'
            });
            document.body.appendChild(pattern.canvas())
        </script>
        <div class="section"></div>


        <main>
            <center>
                <div class="container">
                    <div class="z-depth-1 row container-login animated bounceIn">

                        <form action="${pageContext.request.contextPath}/login" method="post" style="padding: 1px; width: 100%">

                            <div class="row">
                                <div class="input-field col s12 center">
                                    <h4>Astec Games</h4>
                                </div>
                            </div>

                            <div class='row'>
                                <div class='input-field col s12'>
                                    <label>Username</label>
                                    <input type="text" name="username" />
                                </div>
                            </div>
                            <div class='row'>
                                <div class='input-field col s12'>
                                    <label>Senha</label>
                                    <input type="password" name="senha" />

                                </div>
                                <label style='float: right;opacity: 0'>
                                    <a class='extend-login'><b>Forgot Password?</b></a>
                                </label>
                            </div>

                            <center>
                                <div class='row'>
                                    <button type='submit' name='btn_login' class='col s12 btn btn-large waves-effect green darken-4'>Login</button>
                                </div>

                                <br>
                                <br>
                            </center>
                        </form>
                    </div>
                </div>
            </center>

            <div class="section"></div>
            <div class="section"></div>
        </main>
        <hr>
        <footer>
            <div class="center">
                <p>&copy; 2017 - Tardis</p>
            </div>
        </footer>
        <c:if test="${not empty mensagemErro}">
            <script>
                alert("${mensagemErro}");
            </script>
        </c:if>
        <script>
            document.addEventListener('load', function () {
                // the "href" attribute of .modal-trigger must specify the modal ID that wants to be triggered
                $('.modal-trigger').leanModal();
                var height = $(document).height();
                $('canvas').css('height', height);
            });
        </script>

        <!--  Scripts-->
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery.mask.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/materialize.js"></script>
        <script src="${pageContext.request.contextPath}/js/init.js"></script>
    </body>
</html>