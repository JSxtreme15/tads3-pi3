<%-- 
    Document   : header
    Created on : 04/10/2017, 17:38:14
    Author     : allan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<style>
    img {
        margin-top: 1%;
        width: 21%;
        height: 80%;
    }
</style>

<ul id="dropdown1" class="dropdown-content">
    <li><a href="${pageContext.request.contextPath}/logout">Sair</a></li>
</ul>
<ul id="dropdown1Estoque" class="dropdown-content">
    <li><a href="${pageContext.request.contextPath}/protegido/estoque">Produtos</a></li>
    <li><a href="${pageContext.request.contextPath}/protegido/estoque/cadastro">Cadastro Produto</a></li>
</ul>

<ul id="dropdown1Vendas" class="dropdown-content">
    <li><a href="${pageContext.request.contextPath}/protegido/vendas">Lista de Vendas</a></li>
    <li><a href="${pageContext.request.contextPath}/protegido/vendas/cadastro">Nova Venda</a></li>
</ul>

<ul id="dropdown1Pessoas" class="dropdown-content">
    <c:if test = "${sessionScope.perfil == 'Comercial' 
                    || sessionScope.perfil == 'Administrador'
                    || sessionScope.perfil == 'Gerente'}">
        <li><a href="${pageContext.request.contextPath}/protegido/fornecedores">Fornecedores</a></li>
        <li><a href="${pageContext.request.contextPath}/protegido/fornecedores/cadastro">Cadastro Fornecedores</a></li>
    </c:if>
    <c:if test = "${sessionScope.perfil == 'Caixa' 
                    || sessionScope.perfil == 'Administrador'
                    || sessionScope.perfil == 'Gerente'}">
        <li><a href="${pageContext.request.contextPath}/protegido/clientes">Clientes</a></li>
        <li><a href="${pageContext.request.contextPath}/protegido/clientes/cadastro">Cadastro de Clientes</a></li>
    </c:if>
    <c:if test = "${sessionScope.perfil == 'Gerente' 
                    || sessionScope.perfil == 'Administrador'}">
        <li><a href="${pageContext.request.contextPath}/protegido/usuarios">Usuários</a></li>
        <li><a href="${pageContext.request.contextPath}/protegido/usuarios/cadastro">Cadastro de Usuários</a></li>
    </c:if>
    
</ul>


<nav class="white" role="navigation">
    <div class="nav-wrapper container-fluid">
        <img id="logo-container" src="http://ap.imagensbrasil.org/images/2017/10/19/astec.png" alt="astec.png"/>
        <ul class="right hide-on-med-and-down">
            <li><a href="${pageContext.request.contextPath}/protegido/telaInicial">Início</a></li>
            
            <li><a class="dropdown-button" href="" data-activates="dropdown1Pessoas" data-beloworigin="true" data-hover="true">Pessoas<i class="material-icons right">arrow_drop_down</i></a></li>

            <c:if test = "${sessionScope.perfil == 'Comercial' 
                            || sessionScope.perfil == 'Administrador'
                            || sessionScope.perfil == 'Gerente'}">             
                <li><a class="dropdown-button" href="" data-activates="dropdown1Estoque" data-beloworigin="true" data-hover="true">Estoque<i class="material-icons right">arrow_drop_down</i></a></li>
            </c:if>

            <c:if test = "${sessionScope.perfil == 'Comercial' 
                            || sessionScope.perfil == 'Administrador'
                            || sessionScope.perfil == 'Gerente'
                            || sessionScope.perfil == 'Caixa'}">
                <li><a class="dropdown-button" href="" data-activates="dropdown1Vendas" data-beloworigin="true" data-hover="true">Vendas<i class="material-icons right">arrow_drop_down</i></a></li>
            </c:if>

            <li><a class="dropdown-button" href="" data-activates="dropdown1" data-beloworigin="true" data-hover="true"><%= session.getAttribute("usuario_nome")%><i class="material-icons right">arrow_drop_down</i></a></li>
        </ul>


        <ul id="nav-mobile" class="side-nav">
            <li><a href="${pageContext.request.contextPath}/protegido/telaInicial">Início</a></li>

            <c:if test = "${sessionScope.perfil == 'Caixa' 
                            || sessionScope.perfil == 'Administrador'
                            || sessionScope.perfil == 'Gerente'}">
                <li><a href="${pageContext.request.contextPath}/protegido/clientes">Clientes</a></li>
            </c:if>

            <c:if test = "${sessionScope.perfil == 'Comercial' 
                            || sessionScope.perfil == 'Administrador'
                            || sessionScope.perfil == 'Gerente'}">
                <li><a href="${pageContext.request.contextPath}/protegido/fornecedores">Fornecedores</a></li>
            </c:if>

            <c:if test = "${sessionScope.perfil == 'Comercial' 
                            || sessionScope.perfil == 'Administrador'
                            || sessionScope.perfil == 'Gerente'}">
                <li><a href="${pageContext.request.contextPath}/protegido/estoque">Estoque</a></li>
            </c:if>

            <c:if test = "${sessionScope.perfil == 'Comercial' 
                            || sessionScope.perfil == 'Administrador'
                            || sessionScope.perfil == 'Gerente'
                            || sessionScope.perfil == 'Caixa'}">
                <li><a href="${pageContext.request.contextPath}/protegido/vendas">Vendas</a></li>
            </c:if>

            <c:if test = "${sessionScope.perfil == 'Gerente' 
                            || sessionScope.perfil == 'Administrador'}">
                <li><a href="${pageContext.request.contextPath}/protegido/usuarios">Usuários</a></li>
            </c:if>

            <li class="divider"></li>
            <li><a href="${pageContext.request.contextPath}/logout">Sair</a></li>
        </ul>
        <a href="" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>
    </div>
</nav>

<br/>
