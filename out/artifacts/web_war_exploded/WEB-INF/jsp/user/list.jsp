<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 2018/8/14
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list name</title>
</head>
<body>
<a href="add">添加</a>
    <br>
    <c:forEach items="${users}" var="um">
        ${um.value.username}
        ----<a href="${um.value.username}">${um.value.password}</a>
        ----${um.value.nickname}
        ----${um.value.email}<a href="${um.value.username}/update">修改</a> <br/>
    </c:forEach>
</body>
</html>
