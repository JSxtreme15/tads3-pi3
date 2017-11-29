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

        <title>Astec Games</title>
        <link rel="icon" type="imagem/png" href="http://ap.imagensbrasil.org/images/2017/10/19/astec.png" /> 

    
    <h2><c:out value="${sessionScope.usuario.nomeCompleto}" /></h2>
    <h3><c:out value="${sessionScope.usuario.hashSenha}" /></h3>
    
   
    
    <!-- CSS  -->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    <link href="${pageContext.request.contextPath}/css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
</head>
<body >

    <jsp:include page="header.jsp" />

        <jsp:include page="header.jsp" />

        <nav style="transform: translateY(-21px);" class="teal">
            <div class="container">
                <div class="nav-wrapper">
                    <div class="col s12">
                        <a href="${pageContext.request.contextPath}/protegido/telaInicial" class="breadcrumb">Inicío</a>
                    </div>
                </div>
            </div>
        </div>
    </nav>

    <br>

    <main class="container" id="tela-inicio">           

        <div class="row">


                <div class="col s3">
                    <div class="provider">
                        <i>Fornecedores</i>

                        <a name="icones" class="material-icons darken-text"  id="fornecedor" href="${pageContext.request.contextPath}/protegido/fornecedores">local_shipping</a>

                    </div>
                </div>
            </div>


                <div class="col s3">
                    <div class="storage">                         
                        <i>Estoque</i>
                        <a name="icones" class="material-icons" id="estoque" href="${pageContext.request.contextPath}/protegido/estoque">storage</a>
                    </div>
                </div>

                <div class="col s3">
                    <div class="client">
                        <i>Clientes</i>
                        <a name="icones" class="material-icons" id="cliente" href="${pageContext.request.contextPath}/protegido/clientes">group</a>
                    </div>
                </div>
            </div>

                <div class="col s3">
                    <div class="TI">
                        <i>TI</i>
                        <a name="icones" class="material-icons" id="ti" href="${pageContext.request.contextPath}/suporte">computer</a>
                    </div>
                </div>
            </div>

        </div>

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
