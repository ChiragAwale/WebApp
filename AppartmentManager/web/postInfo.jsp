<%-- 
    Document   : postInfo
  
    Author     : chirag
--%>
<%@page import="com.chirag.project.appartmentManager.entity.Post"%>
<%@page import="com.chirag.project.appartmentManager.dao.impl.PostDAOImpl"%>
<%@page import="com.chirag.project.appartmentManager.dao.PostDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Posts </title>
        <link href="Assets/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="Assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <h1>Posts</h1> 
            <div> <h4>To add posts here, please register first!</h4></div>

            <div class="pull-right"><a href="Login.jsp" class="btn btn-default "><span class ="glyphicon glyphicon-plus"></span> Add Appartment</a></div>
            <table class="table table-striped table-hover table-condensed">
                <tr>

                    <th>Title</th>
                    <th>Description</th>
                    <th>Posted Date</th>
                    <th>Posted By</th>
                    <th>Contact no:  </th>
                    <th>Email:  </th>
                    <th>Total Cost Per Month(in $)</th>
                    <th>Roommates Searching</th>
                    <th>Roommates Present</th>
                    <th>Last Updated After Post</th>


                </tr>

                <%
                    PostDAO postDAO = new PostDAOImpl();
                    for (Post p : postDAO.getAll()) {%>
                <% if (!p.isDelete_flag()) {%>
                <tr>


                    <td><%=p.getPost_heading()%></td>
                    <td><%=p.getPost_text()%></td>
                    <td><%=p.getPosted_date()%></td>
                    <td><%=p.getPostedBy()%></td>

                    <td><%=p.getContactNo()%></td>
                    <td><%=p.getEmail()%></td
                    <td><%=p.getTotalCost()%></td>
                    <td><%=p.getNumberOfRoomMatesSearching()%></td>
                    <td><%=p.getNumberOfRoomMatesPresent()%></td>
                    <td><%=p.getModified_date()%></td>


                </tr>


                <%} else {
                    }%>
                <%}%>

            </table>

            <div class="pull-left">
                <a href="index.jsp">  <button class ="btn btn-primary">Back</button></a>
            </div>

        </div>   

    </body> 
</html>
