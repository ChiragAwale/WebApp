<%-- 
    Document   : login
    Created on : Sep 7, 2016, 10:52:37 AM
    Author     : chira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        
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
