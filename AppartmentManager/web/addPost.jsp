<%-- 
    Document   : add
    Created on : Jul 25, 2016, 3:40:25 PM
    Author     : chira
--%>
<%@page import="com.chirag.project.appartmentManager.entity.Member"%>
<%@page import="com.chirag.project.appartmentManager.dao.impl.MemberDAOImpl"%>
<%@page import="com.chirag.project.appartmentManager.dao.MemberDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (request.getParameter("username").isEmpty() || request.getParameter("username") == null) {
        response.sendRedirect("index.jsp?invalidentry");
    }%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Share Apparment</title>
        <link href="Assets/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="Assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <% MemberDAO memberDAO = new MemberDAOImpl();


        %>
    </head>
    <body>

        <div class="container">
            <h1>Share Your Appartment & Share your Rent</h1>
            <form action ="savePost.jsp" method="post">
                <div class="form-group">
                    <label>Appartment Name/Title</label>
                    <input type ="text" name ="post_heading" required="required" placeholder="Enter Title" class ="form-control">
                    <label>Description</label>
                    <input type ="text"  name ="post_text" required="required" placeholder="Enter Details of Appartment" class ="form-control">
                    <label>Posted By: </label>
                    <input type ="text"  name ="postedBy" required="required"  placeholder="Enter Your Name" class ="form-control" value="<%=request.getParameter("username")%>">
                    <label>Total Cost Per Month(in $)</label>
                    <input type ="text"  name ="totalCost" required="required" placeholder="Enter Total Cost Per Month" class ="form-control"  >
                    <label>Number of Roommates Searching</label>
                    <input type ="number" name ="noSearching" required="required" placeholder="Enter number of Searching roommates" class ="form-control" >
                    <label>Number of Roommates Present</label>
                    <input type ="number" name ="noPresent" required="required" placeholder="Enter number of Present roommates " class ="form-control">
                    <label>Contact No: </label>
                    <input type ="text"  name ="contactNo" required="required"  placeholder="Enter Your Contact No" class ="form-control" value="<%

                        for (Member m : memberDAO.getAll()) {
                            String email = m.getEmail_id();
                            if (email.equalsIgnoreCase(request.getParameter("username"))) {
                                out.println(m.getLocation());
                            }

                        }


                           %>">
                    <label>Email: </label>
                    <input type ="text"  name ="email" required="required"  placeholder="Enter Your Email" class ="form-control" value="<%=request.getParameter("username")%>">
                </div>

                <button type="submit" class="btn btn-success"> Add</button>
                <a href ="index.jsp" class="btn btn-danger"> Cancel</a>
            </form>
        </div>
    </body>
</html>  

