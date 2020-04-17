<%--
  Created by IntelliJ IDEA.
  User: andrej
  Date: 2/19/2018
  Time: 11:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Forum - Registered</title>
</head>
<body>
<h1> Welcome to my Web Forum! </h1>
<div> You can register here.</div>
<br>
<br>
<br>
<form action="register.servlet" method="post">
    <label for="username">Username: </label>
    <input type="text" name="username" id="username"/>
    <br>
    <br>
    <label for="email">Email: </label>
    <input type="text" name="email" id="email"/>
    <br>
    <br>
    <label for="password">Password: </label>
    <input type="password" name="password" id="password"/>
    <br>
    <br>
    <label for="gender">Gender: </label>
    <input type="text" name="gender" id="gender"/>
    <br>
    <br>
    <label for="age">Age: </label>
    <input type="number" name="age" id="age"/>
    <br>
    <br>
    <label for="date registered">Data Registered: </label>
    <input type="date" name="date registered" id="date registered"/>
    <br>
    <br>
    <label for="date manipulated ">Date manipulated: </label>
    <input type="date" name="date manipulated" id="date manipulated "/>
    <br>
    <br>
    <input type="submit" name="submit" value="Registered">
    <input type="reset" name="reset" value="Reset!">

</form>
</body>
</html>
