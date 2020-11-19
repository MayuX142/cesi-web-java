<%--
  Created by IntelliJ IDEA.
  User: Mayu
  Date: 19/11/2020
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>Ma JSP</h1>
    <p>
        <%
            String abc = request.getContextPath();
            System.out.println("Je suis dans JSP");
            String bryan = (String) request.getAttribute("machainedecaractere");
        %>
        <%=
            bryan
        %>
    </p>

</body>
</html>
