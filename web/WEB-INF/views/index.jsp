<%--
  Created by IntelliJ IDEA.
  User: VanTT
  Date: 12/22/19
  Time: 8:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Spring MVC Login</title>
</head>
<body>
<form action="/login" method="post">
  Username: <input name="username" placeholder="enter your username"/>
  <br/>
  Password: <input name="password" type="password" placeholder="enter your password"/>
  <br/>
  <input type="submit" value="Login"/>
</form>
</body>
</html>
