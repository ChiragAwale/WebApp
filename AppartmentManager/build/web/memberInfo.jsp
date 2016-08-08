<%-- 
    Document   : memberInfo
    Created on : Jul 25, 2016, 3:22:12 PM
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
        <title>Member Info</title>
        <link href="Assets/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="Assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <div class="container">
            <h1>Members</h1> 
            <table class="table table-striped table-hover">
                <tr>

                    <th>Name</th>
                    <th>Email</th>
                    <th>Contact No</th>
                    <th>University Name</th>
                    <th>State</th>
                    <th>Status</th>
                    <th>Joined Date</th>


                </tr>

                <%
                    MemberDAO memberDAO = new MemberDAOImpl();
                    for (Member m : memberDAO.getAll()) {%>
                <% if (!m.isDeleteFlag()) {%>
                <tr>


                    <td><%= m.getFirstName() + " " + m.getLastName()%></td>
                    <td><%=m.getEmail_id()%></td>
                    <td><%=m.getLocation()%></td>
                    <td><%=m.getUniversityName()%></td>
                    <td><%=m.getState()%></td>
                    <td><%=m.getStatus()%></td>
                    <td><%=m.getAdded_date()%></td>

                    
                </tr>


                <%}else{}%>
                <%}%>

            </table>

            <div class="pull-left">
                <a href="index.jsp">  <button class ="btn btn-primary">Back</button></a>
            </div>

        </div>   

    </body> 
</html>
