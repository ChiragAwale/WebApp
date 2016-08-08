<%-- 
    Document   : index
    Created on : Jul 21, 2016, 10:02:34 AM
    Author     : chira
--%>

<%@page import="com.chirag.project.appartmentManager.entity.Member"%>
<%@page import="com.chirag.project.appartmentManager.dao.impl.MemberDAOImpl"%>
<%@page import="com.chirag.project.appartmentManager.dao.MemberDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Share Your Rents </title>
        <link href="Assets/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="Assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>


    </head>
    <body>




        <ul class="nav nav-pills">

            <li>  <a href ="" class ="btn btn-default btn-lg">Welcome!!!</a></li>



            <li class="pull-right">
                <div  >
                    <a href ="Admin/Login.jsp" class ="btn btn-default btn-lg">Admin Login</a>
                    <a href ="postInfo.jsp" class ="btn btn-warning btn-lg">View Appartments</a>
                    <a href ="memberInfo.jsp" class="btn btn-success btn-lg">Members <span class="glyphicon glyphicon-list"></span></a>
                    <a href ="add.jsp" class ="btn btn-primary btn-lg">Sign Up For Free!!</a>
                </div>
            </li>
        </ul>
            
                



        <div>
            <img src='images/reason-for-not-sharing.jpg'  class="img-circle" style='width:40%;height:40%' alt='[]' />
        </div>
        <div class ="popover-content pull-right">
            <h2 class="btn btn-danger">Note:</h2> <h3>There are currently a lot of students staying at motels. They have not yet found any appartments. If you can, please 
                help them, if you cant do it for free, charge them, but charge them less. If you can help them even for a few days, it would be awesome .!!</h3>  
            </div>


    </body> 
</html>
