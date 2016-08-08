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
        <link href="../Assets/css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
        <link href="../Assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
      
        <div class="container">
            <h1>Members</h1>    
            <div class="pull-right" > <a href="adminAdd.jsp" class="btn btn-warning btn-sm"><span class = "glyphicon glyphicon-plus"></span></a></div>
            <table class="table table-striped table-hover table-condensed">
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Location</th>
                    <th>University Name</th>
                    <th>State</th>
                    <th>Status</th>
                    <th>Joined Date</th>
                    <th>Modified Date</th>
                    <th>Password</th>
                    <th>Deleted Flag</th>
                    <th>Action</th>

                </tr>

                <%
                    MemberDAO memberDAO = new MemberDAOImpl();
                    for (Member m : memberDAO.adminGetAll()) {%>
                <tr>
                    <td><%=m.getId()%></td>
                    <td><%= m.getFirstName() + " " + m.getLastName()%></td>
                    <td><%=m.getEmail_id()%></td>
                    <td><%=m.getLocation()%></td>
                    <td><%=m.getUniversityName()%></td>
                    <td><%=m.getState()%></td>
                    <td><%=m.getStatus()%></td>
                    <td><%=m.getAdded_date()%></td>
                    <td><%= m.getModified_date()%></td>
                    <td><%= m.getPassword()%></td>
                    <% boolean dF = m.isDeleteFlag();%>
                    <td><%= dF%></td>
                    <td><a href="adminEdit.jsp?id=<%=m.getId()%>" class ="btn btn-success btn-sm"> <span class = "glyphicon glyphicon-pencil"></span></a> <a href="<% if(dF){out.println("adminReAdd.jsp");}%><% else{out.println("adminDelete.jsp");}%>?id=<%=m.getId()%>" class="btn btn-danger btn-sm"> <span class = "<% if(dF){out.println("glyphicon glyphicon-repeat");}%><% else{out.println("glyphicon glyphicon-trash");}%>"></span></a></td>

                </tr>


                <%}%>

            </table>

            <div class="pull-left">
                <a href="adminHome.jsp?id=55433">  <button class ="btn btn-primary">Back</button></a>
            </div>

        </div>   

    </body> 
</html>

