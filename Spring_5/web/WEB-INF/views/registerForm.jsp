<%--
  Created by IntelliJ IDEA.
  User: dela
  Date: 11/9/17
  Time: 9:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>registerForm</title>
    </head>
    <body>
        <h1>Register</h1>
        <%--当form标签中没有设置action属性时, 该表单将会默认提交到与它展现时相同的URL, 比如当前的URL就是"/spitter/register"--%>
        <form method="post" action="/spitter/register">
            First name:<input type="text" name="firstName" /><br/>
            Last name:<input type="text" name="lastName" /><br/>
            Username:<input type="text" name="username" /><br/>
            Password:<input type="password" name="password" /><br/>
            <input tyep="submit" value="Register" />
        </form>
    </body>
</html>
