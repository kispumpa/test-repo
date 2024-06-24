<%@ page import="catalogue.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: hallgato
  Date: 2024. 05. 14.
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<%boolean success = (boolean)session.getAttribute("success");

boolean presented = false;
if (success == true) {
    presented = (boolean)session.getAttribute("presented");
}
if (success == false) { %>
    <h1>A megadott neptun kód nem található!</h1>
<% }
else if (success == true && presented == false) { %>
    <h1>Sikeres bejelentkezés!</h1>
<%Student found = (Student) session.getAttribute("stud");
    List<Student> studs = (List<Student>) application.getAttribute("StudList");
    for (Student s: studs) {
        if (found.getName().equals(s.getName())) {
            s.setPresent(true);
        }
    }%>
<a href="list.jsp">List</a>
<% }
else { %>
    <h1>Korábban már bejelentkezett!</h1>
    <a href="list.jsp">List</a>
<% } %>

</body>
</html>
