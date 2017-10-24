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
        <link href="${pageContext.request.contextPath}/css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="${pageContext.request.contextPath}/css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    </head>
    <body>
        <jsp:include page="header.jsp" />

        <nav style="transform: translateY(-21px);" class="teal">
            <div class="container">
                <div class="nav-wrapper">

                </div>
            </div>
        </nav>

        <main class="container">           
            <form name="inicial" action="#" method="POST" class="col s12">
                <div class="row">


                    <div class="col s3">
                        <div class="provider">
                            <i>Fornecedor</i>
                            <a name="icones" class="material-icons darken-text" id="fornecedor" href="${pageContext.request.contextPath}/fornecedores">local_shipping</a>

                        </div>
                    </div>
                    <div class="col s3">
                        <div class="storage">                         
                            <i>Estoque</i>
                            <a name="icones" class="material-icons" id="estoque" href="${pageContext.request.contextPath}/estoque">storage</a>
                        </div>
                    </div>
                    <div class="col s3">
                        <div class="client">
                            <i>Cliente</i>
                            <a name="icones" class="material-icons" id="cliente" href="${pageContext.request.contextPath}/clientes">group</a>
                        </div>
                    </div>

                    <div class="col s3">
                        <div class="TI">
                            <i>TI</i>
                            <a name="icones" class="material-icons" id="ti" href="${pageContext.request.contextPath}/ti">computer</a>
                        </div>
                    </div>

                </div>
            </form>
        </div>
    </main>

    <jsp:include page="footer.jsp" />

    <!--  Scripts-->
    <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.mask.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/materialize.js"></script>
    <script src="${pageContext.request.contextPath}/js/init.js"></script>

</body>
</html>