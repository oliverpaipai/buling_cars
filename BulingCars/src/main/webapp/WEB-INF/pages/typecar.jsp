<%--
  Created by IntelliJ IDEA.
  User: 乔辉
  Date: 2019/12/8
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${car}" var="type">
        <div>
        ${type.name}
        ${type.displacement}
        ${type.mileage}
        ${type.newprice}
        ${type.createtime}
            <img src="../../${type.pic}">
        </div><br>
    </c:forEach>
</body>
</html>
