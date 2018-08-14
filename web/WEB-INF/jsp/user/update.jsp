<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 2018/8/14
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>delete</title>
</head>
<body>
<form:form method="post" modelAttribute="user">
    Username: <form:input path="username" />
    Password: <form:input path="password" />
    Nickname: <form:input path="nickname" />
    Email: <form:input path="email" />
    <input type="submit" value = "修改用户">
</form:form>
</body>
</html>
