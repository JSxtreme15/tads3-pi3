<%-- 
    Document   : clienteIndex
    Created on : 03/10/2017, 20:14:36
    Author     : allan
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1"/>
        <title>Parallax Template - Materialize</title>

        <!-- CSS  -->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="../css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="../css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    </head>
    <body>
        <nav class="white" role="navigation">
            <div class="nav-wrapper container">
                <a id="logo-container" href="#" class="brand-logo">Logo</a>
                <ul class="right hide-on-med-and-down">
                    <li><a href="#">Navbar Link</a></li>
                </ul>

                <ul id="nav-mobile" class="side-nav">
                    <li><a href="#">Navbar Link</a></li>
                </ul>
                <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>
            </div>
        </nav>

        <br/>

        <main class="container">
            <p class="flow-text">Cadastro de cliente</p>
            <div class="row">
                <form name="form-clientes" action="#" method="POST" class="col s12">
                    <div class="row">
                        <div class="input-field col s6">
                            <label for="nome">Nome</label>
                            <input id="nome" type="text" class="validate" required="required">
                        </div>

                        <div class="input-field col s6">
                            <label for="email">Email</label>
                            <input id="email" type="email" class="validate" required="required">
                        </div>

                        <div class="input-field col s6">
                            <label for="cpf">Cpf</label>
                            <input id="cpf" type="text" class="validate" required="required">
                        </div>

                        <div class="input-field col s6">
                            <label for="cep">Cep</label>
                            <input id="cep" type="text" class="validate">
                        </div>

                        <div class="input-field col s6">
                            <label for="logradouro">Logradouro</label>
                            <input id="logradouro" type="text" class="validate">
                        </div>

                        <div class="input-field col s6">
                            <label for="numero">Número</label>
                            <input id="numero" type="text" class="validate">
                        </div>

                        <div class="input-field right">
                            <a href="http://localhost:8080/pi3/clientes" class="waves-effect waves-light btn grey lighten-3 black-text"><i class="material-icons left">arrow_back</i>Voltar</a>
                            <button type="submit" class="waves-effect waves-light btn"><i class="material-icons left">send</i> Cadastrar</button>
                        </div>
                    </div>
                </form>
            </div>
        </main>

        <footer class="page-footer teal">
            <div class="container">
                <div class="row">
                    <div class="col l6 s12">
                        <h5 class="white-text">Company Bio</h5>
                        <p class="grey-text text-lighten-4">We are a team of college students working on this project like it's our full time job. Any amount would help support and continue development on this project and is greatly appreciated.</p>


                    </div>
                    <div class="col l3 s12">
                        <h5 class="white-text">Settings</h5>
                        <ul>
                            <li><a class="white-text" href="#!">Link 1</a></li>
                            <li><a class="white-text" href="#!">Link 2</a></li>
                            <li><a class="white-text" href="#!">Link 3</a></li>
                            <li><a class="white-text" href="#!">Link 4</a></li>
                        </ul>
                    </div>
                    <div class="col l3 s12">
                        <h5 class="white-text">Connect</h5>
                        <ul>
                            <li><a class="white-text" href="#!">Link 1</a></li>
                            <li><a class="white-text" href="#!">Link 2</a></li>
                            <li><a class="white-text" href="#!">Link 3</a></li>
                            <li><a class="white-text" href="#!">Link 4</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="footer-copyright">
                <div class="container">
                    Made by <a class="brown-text text-lighten-3" href="http://materializecss.com">Materialize</a>
                </div>
            </div>
        </footer>


        <!--  Scripts-->
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="../js/materialize.js"></script>
        <script src="../js/init.js"></script>

    </body>
</html>