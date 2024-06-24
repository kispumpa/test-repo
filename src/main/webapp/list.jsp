<%@ page import="catalogue.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: hallgato
  Date: 2024. 05. 14.
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%List<Student> studs = (List<Student>) application.getAttribute("StudList");%>
<h1>Jelenlévő hallgatók: </h1>
<table>
    <tr>
        <th>Név</th>
        <th>Neptun</th>
    </tr>
    <%
        for (Student s: studs) { %>
            <tr>
                <%if (s.isPresent() == true) { %>
                    <td><%=s.getName()%></td>
                    <td><%=s.getNeptun()%></td>
                <% } %>
            </tr>
        <% } %>
    <tr>

    </tr>
</table>

</body>
</html>
