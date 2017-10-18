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
                        <div class="financeiro">
                            <i>Financeiro</i>
                            <a class="material-icons" href="${pageContext.request.contextPath}/fornecedores">attach_money</a>

                        </div>
                    </div>
                    <div class="col s3">
                        <div class="comercial">                         
                            <i>Comercial</i>
                            <a class="material-icons" href="${pageContext.request.contextPath}/Comercial">account_balance</a>
                        </div>
                    </div>
                    <div class="col s3">
                        <div class="vendas">
                            <i>Vendas</i>
                            <a class="material-icons" href="${pageContext.request.contextPath}/vendas">shopping_cart</a>
                        </div>
                    </div>

                    <div class="col s3">
                        <div class="TI">
                            <i class="material-icons" >computer</i>
                            <figcaption>TI</figcaption>
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