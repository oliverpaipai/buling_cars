<%--
  Created by IntelliJ IDEA.
  User: 乔辉
  Date: 2019/12/8
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>车辆详情</title>
</head>
<body>
        <img src="../../${car.pic}">
       <div> ${car.name}</div>
        <div> ${car.gearbox}</div>
        <div>  ${car.oldprice}</div>
        <div>  ${car.newprice}</div>
        <div>  ${car.mileage}</div>
        <div>  ${car.displacement}</div>
</body>
</html>
