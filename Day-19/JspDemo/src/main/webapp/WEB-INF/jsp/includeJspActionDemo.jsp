<%--
  Created by IntelliJ IDEA.
  User: Jack
  Date: 9/23/2021
  Time: 1:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:include page="toBeIncludedInActionDemo.jsp">
        <jsp:param name="fromIncludingPage" value="Hello from the including page"/>
    </jsp:include>
</body>
</html>
