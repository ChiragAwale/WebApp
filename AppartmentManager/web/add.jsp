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
        <title>Register</title>
        <link href="Assets/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="Assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <div class="container">
            <h1>Register</h1>
            <form action ="save.jsp" method="post">
                <div class="form-group">
                    <label>First Name</label>
                    <input type ="text" name ="first_name" required="required" placeholder="Enter First Name" class ="form-control">
                    <label>Last Name</label>
                    <input type ="text"  name ="last_name" required="required" placeholder="Enter Last Name" class ="form-control">
                    <label>Password</label>
                    <input type ="password" id = "password1" name ="password1" required="required" placeholder="Enter Password" class ="form-control">
                    <label>Confirm Password</label>
                    <input type ="password" id ="password2" name ="password2" required="required" placeholder="Enter Password" class ="form-control"  onChange="checkPasswordMatch();">
                    <label>Email Address</label>
                    <input type ="email" name ="email_id" required="required" placeholder="Enter Email Address" class ="form-control" >
                    <label>Address</label>
                    <input type ="text" name ="location" required="required" placeholder="Enter Address" class ="form-control">
                    <label>University Name</label>
                    <input type ="text" name ="university_name" required="required" placeholder="Enter University Name" class ="form-control">
                    <label>State</label>
                    <input type ="text" name ="state" required="required" placeholder="Enter State" class ="form-control">
                    <label>Status</label>
                    <input type ="text" name ="status" required="required" placeholder="Enter Status(eg. Student,Teacher..etc)" class ="form-control">
                </div>

                <button type="submit" class="btn btn-success"> Register</button>
                <a href ="index.jsp" class="btn btn-danger"> Cancel</a>
            </form>
        </div>
    </body>
</html>  
