<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="Spittr.Spittle" %>
<%@ page import="java.util.List" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: dela
  Date: 11/2/17
  Time: 9:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>SpittleList</title>
    </head>

    <%
        List<Spittle> spittle = (List<Spittle>) request.getAttribute("spittleList");
        System.out.println(spittle==null);

    %>

    <body>
        <%--这里的spittleList就是通过SpittleController的Model传递过来的, 通过${}取出模型的值--%>
        <%--使用c:forEach循环遍历spittleList, 并给每一次遍历到的元素取名spittle, --%>
        <%--然后在后面通过spittle获取它的各种属性值--%>
        <c:forEach items="${spittleList}" var="spittle">
            <li id="spittle_<c:out value="spittle.id" />">
                <div class="spittleMessage">
                    <c:out value="${spittle.message}" />
                </div>

                <div>
                    <span class="spittleTime"><c:out value="${spittle.time}" /></span>
                    <span class="spittleLocation">
                        (<c:out value="${spittle.latitude}" />,
                        <c:out value="${spittle.longitude}" />)
                    </span>
                </div>
        </c:forEach>
    </body>
</html>
