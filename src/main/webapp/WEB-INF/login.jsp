<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1"/>
        <title>Parallax Template - Materialize</title>
                  <!-- CSS  -->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="${pageContext.request.contextPath}/css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    </head>
    <body>
        <h1>Login</h1>
        <c:if test="${not empty mensagemErro}">
            <p><c:out value="${mensagemErro}" /></p>
        </c:if>
        <div>
            <form action="${pageContext.request.contextPath}/login" method="post">
                <div>
                    <label>Username</label>
                    <input type="text" name="username" />
                </div>
                <div>
                    <label>Senha</label>
                    <input type="password" name="senha" />
                </div>
                <div>
                    <input type="submit" value="Enviar" />
                </div>
            </form>
        </div>
        <jsp:include page="footer.jsp" />

        <!--  Scripts-->
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery.mask.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/materialize.js"></script>
        <script src="${pageContext.request.contextPath}/js/init.js"></script>

    </body>
</html>