
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.chirag.project.appartmentManager.entity.Post"%>
<%@page import="com.chirag.project.appartmentManager.dao.impl.PostDAOImpl"%>
<%@page import="com.chirag.project.appartmentManager.dao.PostDAO"%>
<%  int id = Integer.parseInt(request.getParameter("id"));
    Post post = new Post();
    if (request.getParameter("id") == null || request.getParameter("id").isEmpty()) {
        response.sendRedirect("../index.jsp?error");
    } else {
        PostDAO postDAO = new PostDAOImpl();

        try {

            if (postDAO.getById(id) == null) {
                response.sendRedirect("adminHome.jsp?id=55433");
            } else {
                post = postDAO.getById(id);
            }
        } catch (Exception e) {
            out.println(e);

        }
    }

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit</title>
        <link href="../Assets/css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
        <link href="../Assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <div class="container">
            <h1>Edit Post Details</h1>
            <form action ="adminUpdatePost.jsp?id=<%=id%>" method="post">
                <div class="form-group">
                    <label>Title</label>
                    <input type ="text" name ="post_heading" required="required" placeholder="Enter Title" class ="form-control" value = "<%=post.getPost_heading()%>">
                    <label>Appartment Description</label>
                    <input type ="text" name ="post_text" required="required" placeholder="Enter Appartment Description " class ="form-control" value = "<%=post.getPost_text()%>">
                    <label>PostedBy</label>
                    <input type ="text" name ="postedBy" required="required"  class ="form-control" value = "<%=post.getPostedBy()%>">
                    <label>Total Cost Per Month(in $)</label>
                    <input type ="number" name ="totalCost" required="required" placeholder="Enter Total Cost Per Month" class ="form-control" value = "<%=post.getTotalCost()%>">
                    <label>No of roommates searching</label>
                    <input type ="number" name ="noSearching" required="required" placeholder="Enter No of Roomates Searching" class ="form-control" value = "<%=post.getNumberOfRoomMatesSearching()%>">
                    <label>Number of roommates present</label>
                    <input type ="number" name ="noPresent" required="required" placeholder="Enter No of Roommates Present" class ="form-control" value = "<%=post.getNumberOfRoomMatesPresent()%>"

                </div>

                <button type="submit" class="btn btn-warning"> Update </button>
                <a href ="adminPostInfo.jsp" class="btn btn-danger"> Cancel</a>
            </form>
        </div>
    </body>
</html>  

