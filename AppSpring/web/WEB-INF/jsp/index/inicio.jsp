<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! soy el inicio</h1>
        <ul>
            <li>ID = <c:out value="${id}" /> </li>
            <li>ID2 = <c:out value="${id2}" /> </li>
        </ul>
    </body>
</html>
