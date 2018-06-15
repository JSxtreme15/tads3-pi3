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
        <script src="https://code.highcharts.com/highcharts.js"></script>
        <script src="https://code.highcharts.com/modules/series-label.js"></script>
        <script src="https://code.highcharts.com/modules/exporting.js"></script>
        <script src="https://code.highcharts.com/modules/export-data.js"></script>


        <!-- CSS  -->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="${pageContext.request.contextPath}/css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    </head>
    <body>
        <%@ include file="header.jsp" %>

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

    <div class="container">
        <h5>Bem vindo <%= session.getAttribute("usuario_nome")%>,</h5>
    </div>
    <br>

    <main class="container" id="tela-inicio">           

        <div class="row">

            <c:if test = "${sessionScope.perfil == 'Comercial' 
                            || sessionScope.perfil == 'Administrador'
                            || sessionScope.perfil == 'Gerente'}">
                <div class="col12 m3 s12">
                   <div id="container"></div>
                   <script>
                       Highcharts.chart('container', {

                    title: {
                      text: 'Venda Mensal de Consoles'
                    },

                    subtitle: {
                      text: ''
                    },

                    yAxis: {
                      title: {
                        text: 'Valor Faturado'
                      }
                    },
                    legend: {
                      layout: 'vertical',
                      align: 'right',
                      verticalAlign: 'middle'
                    },
                    
                    xAxis: {
                        type: 'datetime'
                    },

                    plotOptions: {
                      series: {
                        label: {
                          connectorAllowed: false
                        },
                        pointStart: Date.UTC(2017, 8, 1),
                        pointIntervalUnit: 'month'
                      }
                    },

                    series: [{
                      name: 'Playstation 4',
                      data: [43934.10, 52503, 57177, 69658, 97031, 119931, 137133, 154175]
                    }, {
                      name: 'Xbox One',
                      data: [24916, 24064, 29742, 29851, 32490, 30282, 40434, 45987]
                    }, {
                      name: 'WII U',
                      data: [11744, 17722, 16005, 19771, 20185, 24377, 26945, 31088]
                      }],
                  
                      

                    responsive: {
                      rules: [{
                        condition: {
                          maxWidth: 500
                        },
                        chartOptions: {
                          legend: {
                            layout: 'horizontal',
                            align: 'center',
                            verticalAlign: 'bottom'
                          }
                        }
                      }]
                    }

                  });
                  
                   
                </script>                          
                </div>

            </c:if>
            
            

        </div>
    </div>
    <br>
</div>
</main>

<c:if test="${not empty naoAutorizado}">
    <script>
        alert('Sinto Muito, você não possui permissão para acessar!!')
    </script>
</c:if>
    
<jsp:include page="footer.jsp" />

<!--  Scripts-->
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.mask.min.js"></script>
<script src="${pageContext.request.contextPath}/js/materialize.js"></script>
<script src="${pageContext.request.contextPath}/js/init.js"></script>

</body>
</html>
