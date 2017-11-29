<%-- 
    Document   : fornecedorIndex
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

        <!-- CSS  -->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="${pageContext.request.contextPath}/css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    </head>
    <body>
        <jsp:include page="header.jsp"/>
        
        <nav style="transform: translateY(-21px);" class="teal">
            <div class="container">
                <div class="nav-wrapper">
                    <div class="col s12">
                        <a href="${pageContext.request.contextPath}/protegido/telaInicial" class="breadcrumb">Inicío</a>
                        <a href="${pageContext.request.contextPath}/protegido/fornecedores" class="breadcrumb">Fornecedores</a>
                    </div>
                </div>
            </div>
        </nav>

        <main class="container-fluid">
            <table class="striped responsive-table">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>CNPJ</th>
                        <th>E-mail</th>
                        <th>Telefone</th>
                        <th>Ação</th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach items="${fornecedores}" var="fornecedor">
                        <tr>
                            <td><c:out value="${fornecedor.getNome()}" /></td>
                            <td><c:out value="${fornecedor.getCnpj()}" /></td>
                            <td><c:out value="${forncecedor.getEmail()}" /></td>
                            <td><c:out value="${forncecedor.getTelefone()}" /></td>
                            <td><a href="${pageContext.request.contextPath}/protegido/fornecedores/editar?id=${fornecedor.getId()}" class="waves-effect waves-light btn"><i class="material-icons left">edit</i>Editar</a>
                            <a data-target="delete" class="waves-effect waves-light btn red modal-trigger" id="${pageContext.request.contextPath}/protegido/fornecedores/excluir?id=${fornecedor.getId()}"><i class="material-icons left">delete</i>Deletar</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </main>

        <br /> 
        
        <div class="fixed-action-btn">
            <a class="btn-floating btn-large tooltipped" data-position="left" data-delay="50" data-tooltip="Novo Fornecedor" href="${pageContext.request.contextPath}/protegido/fornecedores/cadastro">
                <i class="large material-icons">add</i>
            </a>
        </div>
        
        <jsp:include page="footer.jsp"/>


        <!--  Scripts-->
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/materialize.js"></script>
        <script src="${pageContext.request.contextPath}/js/init.js"></script>

    </body>
</html>
