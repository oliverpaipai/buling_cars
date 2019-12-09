<%--
  Created by IntelliJ IDEA.
  User: 乔辉
  Date: 2019/12/8
  Time: 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>

    <title>物品展示</title>

</head>

<body>
<a href="${pageContext.request.contextPath}/car/type?type=1">奔驰</a>
<a href="${pageContext.request.contextPath}/car/type?type=2">宝马</a>
<a href="${pageContext.request.contextPath}/car/type?type=3">雪佛兰</a>
<a href="${pageContext.request.contextPath}/car/type?type=4">奥迪</a>
<a href="${pageContext.request.contextPath}/car/type?type=5">别克</a>
<a href="${pageContext.request.contextPath}/car/type?type=6">大众</a>
<a href="${pageContext.request.contextPath}/car/type?type=7">吉利</a>
<a href="${pageContext.request.contextPath}/car/type?type=8">现代</a>
<a href="${pageContext.request.contextPath}/car/type?type=9">长安</a>
<a href="${pageContext.request.contextPath}/car/type?type=10">传祺</a>


            <c:forEach items="${carlist}" var="car">
                <div>
                <div id="divv">${car.name}</div>
                <div>${car.oldprice}</div>
                <div>${car.newprice}</div>
                <div>${car.createtime}</div>
                <div>${car.mileage}</div>
                <div>${car.displacement}</div>
                <div>${car.gearbox}</div>
                <img src="../../${car.pic}"/>
              <div>  <a href="${pageContext.request.contextPath}/car/info?id=${car.id}">详情</a>
              </div>
                  </c:forEach>
        </div>
</body>

</html>
