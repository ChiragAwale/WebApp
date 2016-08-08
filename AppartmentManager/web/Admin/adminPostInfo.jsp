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
        <link href="../Assets/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="../Assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <div class="container">
            <h1>Posts</h1> 
            <div class="pull-right"><a href="adminAddPost.jsp" class="btn btn-default "><span class ="glyphicon glyphicon-plus"></span> Add Appartment</a></div>
            <table class="table table-striped table-hover table-condensed">
                <tr>
                    <th>Id</th>
                    <th>Title</th>
                    <th>Description</th>
                    <th>Posted Date</th>
                    <th>Posted By</th>
                    <th>Total Cost Per Month(in $)</th>
                    <th>Roommates Searching</th>
                    <th>Roommates Present</th>

                    <th>Delete Flag</th>
                    <th>Last Updated After Post</th>
                    <th>Action</th>


                </tr>

                <%
                    PostDAO postDAO = new PostDAOImpl();
                    for (Post p : postDAO.adminGetAll()) {%>
              
                <tr>

                    <td><%=p.getPost_id()%></td>
                    <td><%=p.getPost_heading()%></td>
                    <td><%=p.getPost_text()%></td>
                    <td><%=p.getPosted_date()%></td>
                    <td><%=p.getPostedBy()%></td>

                    <td><%=p.getTotalCost()%></td>
                    <td><%=p.getNumberOfRoomMatesSearching()%></td>
                    <td><%=p.getNumberOfRoomMatesPresent()%></td>
                  
                    
                    <% boolean dF = p.isDelete_flag();%>
                    <td><%= dF%></td>
                    <td><%=p.getModified_date()%></td>
                    <td><a href="adminEditPost.jsp?id=<%=p.getPost_id()%>" class ="btn btn-success btn-sm"> <span class = "glyphicon glyphicon-pencil"></span></a> <a href="<% if(dF){out.println("adminReAddPost.jsp");}%><% else{out.println("adminDeletePost.jsp");}%>?id=<%=p.getPost_id()%>" class="btn btn-danger btn-sm"> <span class = "<% if(dF){out.println("glyphicon glyphicon-repeat");}%><% else{out.println("glyphicon glyphicon-trash");}%>"></span></a></td>



                </tr>


               
                <%}%>

            </table>

            <div class="pull-left">
                <a href="adminHome.jsp?id=55433">  <button class ="btn btn-primary">Back</button></a>
            </div>

        </div>   

    </body> 
</html>
