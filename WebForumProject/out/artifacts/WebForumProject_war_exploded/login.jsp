<%--
  Created by IntelliJ IDEA.
  User: andrej
  Date: 2/19/2018
  Time: 11:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Forum - Login</title>
</head>
<body>
<h1> Welcome to my Web Forum! </h1>
<div> You can login here.</div>
<form action="login.servlet" method = "post">

    <label for = "email">Email: </label>
    <input type="text" name="email" id="email"/>
    <br>
    <br>
    <br>
    <label for = "password">Password: </label>
    <input type="password" name="password" id="password"/>
    <br>
    <br>
    <br>
    <input type="submit" name="submit" value="Login">
    <input type="reset" name="reset" value="Reset!">

</form>

</body>
</html>
