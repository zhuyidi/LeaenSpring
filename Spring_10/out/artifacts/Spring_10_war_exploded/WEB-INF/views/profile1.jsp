<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dela
  Date: 11/14/17
  Time: 10:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Profile</title>
    </head>
    <body>
        <h1>Your Profile</h1>
        <c:out value="${spitter1.username}" /><br/>
        <c:out value="${spitter1.firstName}" />
        <c:out value="${spitter1.lastName}" /><br/>
    </body>
</html>
