
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% if (request.getParameter("id") == null || request.getParameter("id").isEmpty()) {
        response.sendRedirect("../index.jsp?error"); }%>
        
<% if (!request.getParameter("id").equalsIgnoreCase("55433")) {
        response.sendRedirect("../index.jsp?invalidentry"); }%>
        
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../Assets/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="../Assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <ul class="nav nav-pills">

            <li>  <a href ="" class ="btn btn-default btn-lg">Welcome Admin</a></li>



            <li class="pull-right">
                
                <div  >
                    <a href ="../index.jsp" class ="btn btn-primary btn-lg">Logout</a>
                </div>
            </li>
        </ul>


        <br>
        <br>


        <a href ="adminPostInfo.jsp" class ="btn btn-warning btn-lg"> Posts</a> <br>


        <a href ="adminMemberInfo.jsp" class="btn btn-success btn-lg">Members <span class="glyphicon glyphicon-list"></span></a>

    </div


</body>
</html>
