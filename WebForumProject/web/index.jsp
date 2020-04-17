<%@ page import="entity.User" %><%--
  Created by IntelliJ IDEA.
  entity.User: andrej
  Date: 2/19/2018
  Time: 10:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  User loggedUser = null;
  if (session.getAttribute(User.USER_KEY) != null) {
      loggedUser = (User) session.getAttribute(User.USER_KEY);
  }
%>
<html>
  <head>
    <title>Forum - Index</title>
  </head>
  <body>
  <h1> Welcome to my Web Forum! </h1>

  <%
    if (loggedUser != null) { %>
      <span> Your name is: <%= loggedUser.getUsername()%> </span>
      <div> You can logout: <a href="logout.jsp">here </a></div>
    <% } else { %>
      <div> You can login: <a href="login.jsp">here</a></div>
      <div> You can register: <a href="register.jsp">here</a></div>
    <% } %>
  <br>
  <br>
  <br>
  <div> You can add topic: <a href="addtopics.jsp">here</a></div>

  </body>

</html>
