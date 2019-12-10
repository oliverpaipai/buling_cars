<%--
  Created by IntelliJ IDEA.
  User: 19656
  Date: 2019/12/9
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>购物车</title>
</head>
<body>
    <table>
        <tr>
            <th>车名</th>
            <th>价格</th>
            <th>图片</th>
        </tr>
        <c:forEach items="cars" var="cars">
            <tr>
                <td>${cars}</td>
                <td></td>
                <td></td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>
