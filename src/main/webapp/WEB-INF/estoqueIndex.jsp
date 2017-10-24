<%-- 
    Document   : estoqueIndex.jsp
    Created on : 10/10/2017, 14:34:46
    Author     : Joao Sergio
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
        <jsp:include page="header.jsp"/>
        
        <nav style="transform: translateY(-21px);" class="teal">
            <div class="container">
                <div class="nav-wrapper">
                    <div class="col s12">
                        <a href="${pageContext.request.contextPath}/telaInicial" class="breadcrumb">Inicío</a>
                        <a href="${pageContext.request.contextPath}/estoque" class="breadcrumb">Estoque</a>
                    </div>
                </div>
            </div>
        </nav>

        
        
        <main class="container">
            <table>
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Código</th>
                        <th>Nome</th>
                        <th>Valor</th>
                        <th>Desenvolvedora</th>
                        <th>Plataforma</th>
                        <th>Estoque</th>
                        <th>Editar</th>
                        <th>Excluir</th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach items="${estoque}" var="estoque">
                        <tr>
                            <td><c:out value="${estoque.getId()}" /></td>
                            <td><c:out value="${estoque.getCodigo()}" /></td>
                            <td><c:out value="${estoque.getNome()}" /></td>
                            <td><c:out value="${estoque.getValor()}" /></td>
                            <td><c:out value="${estoque.getDesenvolvedora()}" /></td>
                            <td><c:out value="${estoque.getPlataforma()}" /></td>
                            <td><c:out value="${estoque.getQuantidade()}" /></td>
                            <td><a href="${pageContext.request.contextPath}/estoque/editar?id=${estoque.getId()}" class="waves-effect waves-light btn"><i class="material-icons left">edit</i>Editar</a></td>
                            <td><a data-target="delete" class="waves-effect waves-light btn red modal-trigger" id="${pageContext.request.contextPath}/estoque/excluir?id=${estoque.getId()}"><i class="material-icons left">delete</i>Deletar</a></td>

                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </main>
                    
        <br/>

        <jsp:include page="footer.jsp"/>


        <!--  Scripts-->
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/materialize.js"></script>
        <script src="${pageContext.request.contextPath}/js/init.js"></script>

    </body>
</html>
