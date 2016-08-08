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
        <title>Add Post</title>
        <link href="../Assets/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="../Assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <div class="container">
            <h1>Add Post</h1>
            <form action ="adminSavePost.jsp" method="post">
                <div class="form-group">
                    <label>Appartment Name/Title</label>
                    <input type ="text" name ="post_heading" required="required" placeholder="Enter Title" class ="form-control">
                    <label>Description</label>
                    <input type ="text"  name ="post_text" required="required" placeholder="Enter Details of Appartment" class ="form-control">
                    <label>Posted By: </label>
                    <input type ="text"  name ="postedBy" required="required"  placeholder="Enter Your Name" class ="form-control" value="Admin">
                    <label>Total Cost Per Month(in $)</label>
                    <input type ="text"  name ="totalCost" required="required" placeholder="Enter Total Cost Per Month" class ="form-control"  >
                    <label>Number of Roommates Searching</label>
                    <input type ="number" name ="noSearching" required="required" placeholder="Enter number of Searching roommates" class ="form-control" >
                    <label>Number of Roommates Present</label>
                    <input type ="number" name ="noPresent" required="required" placeholder="Enter number of Present roommates " class ="form-control">
                    
                </div>

                <button type="submit" class="btn btn-success"> Add</button>
                <a href ="adminHome.jsp?id=55433" class="btn btn-danger"> Cancel</a>
            </form>
        </div>
    </body>                

</html>  

