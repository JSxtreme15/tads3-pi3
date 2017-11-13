<%-- 
    Document   : header
    Created on : 04/10/2017, 17:38:14
    Author     : allan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<style>
    img {
        margin-top:1%; 
        width:30%; 
        height:80%;
    }
</style>

<nav class="white" role="navigation">
    <div class="nav-wrapper container">
        <img id="logo-container" src="http://ap.imagensbrasil.org/images/2017/10/19/astec.png" alt="astec.png"/>
        <ul class="right hide-on-med-and-down">
            <li><a href="${pageContext.request.contextPath}/telaInicial">Início</a></li>
            <li><a href="${pageContext.request.contextPath}/clientes">Clientes</a></li>
            <li><a href="${pageContext.request.contextPath}/fornecedores">Fornecedores</a></li>
            <li><a href="${pageContext.request.contextPath}/estoque">Estoque</a></li>
            <li><a href="${pageContext.request.contextPath}/vendas">Vendas</a></li>
            <li><a href="${pageContext.request.contextPath}/suporte">Suporte</a></li>
        </ul>

        <ul id="nav-mobile" class="side-nav">
            <li><a href="${pageContext.request.contextPath}/telaInicial">Início</a></li>
            <li><a href="${pageContext.request.contextPath}/clientes">Clientes</a></li>
            <li><a href="${pageContext.request.contextPath}/fornecedores">Fornecedores</a></li>
            <li><a href="${pageContext.request.contextPath}/estoque">Estoque</a></li>
            <li><a href="${pageContext.request.contextPath}/vendas">Vendas</a></li>
            <li><a href="${pageContext.request.contextPath}/suporte">Suporte</a></li>
        </ul>
        <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>
    </div>
</nav>

<br/>
