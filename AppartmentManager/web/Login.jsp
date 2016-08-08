<%-- 
    Document   : add
    Created on : Jul 25, 2016, 3:40:25 PM
    Author     : chira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="Assets/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="Assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <div class="container">
            <h1>Login:</h1>
            <form action ="loginCheck.jsp" method="post">
                <div class="form-group">
                    <label>Username</label>
                    <input type ="text" name ="userName" required="required" placeholder="Enter Your User Name" class ="form-control">
                    <label>Password</label>
                    <input type ="password"  name ="password" required="required" placeholder="Enter Password" class ="form-control">
                    
                    
                </div>

                <button type="submit" class="btn btn-success"> Sign In</button>
                <a href ="index.jsp" class="btn btn-danger"> Cancel</a>
            </form>
        </div>
    </body>
</html>  

