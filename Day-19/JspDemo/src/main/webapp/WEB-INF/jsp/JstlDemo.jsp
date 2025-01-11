<%--
  Created by IntelliJ IDEA.
  User: Jack
  Date: 9/23/2021
  Time: 1:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>There are ${students.size()} students</p>
    <p>There are <c:out value="${students.size()}"/> students</p>
    <c:if test="${students.size() < 10}"><p>This is a small class</p></c:if>
    <table>
        <thead>
            <tr>
                <th>Index</th>
                <th>Name</th>
                <th>Over drinking age?</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${students}" var="item" varStatus="loop">
                <tr>
                    <td>${loop.index}</td>
                    <td>${item.name}</td>
                    <td>
                        <c:choose>
                            <c:when test="${item.age >= 21}">Yes</c:when>
                            <c:otherwise>No</c:otherwise>
                        </c:choose>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
