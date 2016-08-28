<%-- 
    Document   : Home
    Created on : Aug 24, 2016, 10:37:13 AM
    Author     : chira
--%>

<%@page import="java.util.List"%>
<%@page import="com.leapfrog.custommvc.entity.Course"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello There<h1>
                <h2>These are the courses you have taken: </h2>

                <% for (Course c : (List<Course>) request.getAttribute("courses")) {%>
                <p>
                    <%=c.getName()%> with  <%=c.getCredits()%>  credits
                </p>

                <%}
                %>
                </body>
                </html>
