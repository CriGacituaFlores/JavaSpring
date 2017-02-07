<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>JSP Page</title>
        <!-- Permite generar ruta absoluta (HACEN LO MISMO)-->
        <!--<link rel="stylesheet" href="${pageContext.request.contextPath}/public/css/styles.css"/> -->
        <link rel="stylesheet" href="<c:url value="public/css/styles.css" /> " />
        <script src="<c:url value="public/js/funciones.js" />"></script>
    </head>
    <body>
        <h1 class="clase">Home</h1>
        <hr />
        <a href="javascript:void(0);" onclick="saludo();">haz click</a>
        <img src="<c:url value="public/images/metal-gear-solid-art.jpg" />"
    </body>
</html>
