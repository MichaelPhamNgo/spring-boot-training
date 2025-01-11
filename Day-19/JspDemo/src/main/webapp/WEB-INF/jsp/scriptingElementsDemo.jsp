<%--
  Created by IntelliJ IDEA.
  User: Jack
  Date: 9/23/2021
  Time: 12:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%!
        int num = 4;
    %>

    <%
        out.println("<p>The variable declared in jsp declaration is: " + num + "</p>");
        out.println("<p>The value of the model attribute is: " + request.getAttribute("name") + "</p>");
    %>

<%--    <p>--%>
<%--        num * 10 =--%>
<%--        <%=--%>
<%--            num * 10--%>
<%--        %>--%>
<%--    </p>--%>
</body>
</html>
