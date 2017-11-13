<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dela
  Date: 11/2/17
  Time: 9:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Spittr</title>
    </head>
    <body>
        <h1>Welcome to Spittr</h1>
        <%--这里的"/spittles"对应了一个Controller的URL, 但是前提是, --%>
        <%--这个Controller里面必须有一个返回视图名的方法, 并且这个方法还要添加@RequestMapping注解--%>
        <a href="<c:url value="/spittles" />">Spittles</a>|
        <a href="<c:url value="/spitter/register" />">Register</a>
    </body>
</html>
