<%-- 
    Document   : header
    Created on : 04/10/2017, 17:38:14
    Author     : allan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<nav class="white" role="navigation">
    <div class="nav-wrapper container">
        <a id="logo-container" href="${pageContext.request.contextPath}" class="brand-logo">TARDIS</a>
        <ul class="right hide-on-med-and-down">
            <li><a href="${pageContext.request.contextPath}/clientes">Clientes</a></li>
            <li><a href="${pageContext.request.contextPath}/fornecedores">Fornecedores</a></li>
            <li><a href="${pageContext.request.contextPath}/estoque">Estoque</a></li>
        </ul>

        <ul id="nav-mobile" class="side-nav">
            <li><a href="./clientes">Clientes</a></li>
            <li><a href="./fornecedores">Fornecedores</a></li>
            <li><a href="./estoque">Estoque</a></li>
        </ul>
        <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>
    </div>
</nav>

<br/>
