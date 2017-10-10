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
        <jsp:include page="header.jsp" />
        
        <nav style="transform: translateY(-21px);" class="teal">
            <div class="container">
                <div class="nav-wrapper">
                    <div class="col s12">
                        <a href="${pageContext.request.contextPath}" class="breadcrumb">Inicío</a>
                        <a href="${pageContext.request.contextPath}/clientes" class="breadcrumb">Clientes</a>
                        <a href="${pageContext.request.contextPath}/cadastro" class="breadcrumb">Cadastro de Clientes</a>
                    </div>
                </div>
            </div>
        </nav>
        
        <main class="container">
            <div class="row">
                <form name="form-clientes" action="#" method="POST" class="col s12">
                    <div class="row">
                        <div class="input-field col s12 m12 l4">
                            <label for="nome">Nome</label>
                            <input id="nome" type="text" class="validate" required="required">
                        </div>

                        <div class="input-field col s12 m12 l4">
                            <label for="email">Email</label>
                            <input id="email" type="email" class="validate" required="required">
                        </div>
                        
                        <div class="input-field col s12 m12 l4">
                            <label for="email">Telefone</label>
                            <input id="telefone" type="text" class="validate" required="required" data-mask="(00) 00000-0000">
                        </div>

                        <div class="input-field col s12 m6 l6">
                            <label for="cpf">Cpf</label>
                            <input id="cpf" type="text" class="validate" required="required" data-mask="000.000.000-00">
                        </div>

                        <div class="input-field col s12 m6 l6">
                            <label for="cep">Cep</label>
                            <input id="cep" type="text" class="validate col s11" data-mask="00000-000">
                            <i class="material-icons col s1" id="search-cep" style="transform: translateY(21px);cursor: pointer;">search</i>
                        </div>

                        <div class="input-field col s12 m6 l6">
                            <label for="logradouro">Logradouro</label>
                            <input id="logradouro" type="text" class="validate">
                        </div>

                        <div class="input-field col s12 m6 l6">
                            <label for="numero">Número</label>
                            <input id="numero" type="number" class="validate">
                        </div>

                        <div class="input-field right">
                            <a href="${pageContext.request.contextPath}/clientes" class="waves-effect waves-light btn grey lighten-3 black-text"><i class="material-icons left">arrow_back</i>Voltar</a>
                            <button type="submit" class="waves-effect waves-light btn"><i class="material-icons left">send</i> Cadastrar</button>
                        </div>
                    </div>
                </form>
            </div>
        </main>

        <jsp:include page="footer.jsp" />
        
        <!--  Scripts-->
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="../js/jquery.mask.min.js"></script>
        <script src="../js/materialize.js"></script>
        <script src="../js/init.js"></script>

    </body>
</html>