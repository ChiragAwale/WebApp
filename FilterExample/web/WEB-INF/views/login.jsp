<%-- 
    Document   : login
    Created on : Sep 7, 2016, 10:52:37 AM
    Author     : chira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <c:choose>
            <c:when test = "${param.inactiveuser != null}">
                <h2>Your account is not active yet.</h2>
            </c:when>

            <c:when test = "${param.error != null}">
                <h2>Invalid username / password</h2>
            </c:when>

        </c:choose>


        <form action ="" method ="post">
            <div>
                <label>User Name</label>
                <input type ="text" name ="userName" required="required"  placeholder="Enter Your UserName">
            </div>
            <div>
                <label>Password</label>
                <input type ="password" name="password" required="required" placeholder="Enter Your Password">
            </div>
            <button type ="submit"> Login </button>
        </form>

    </body>
</html>
