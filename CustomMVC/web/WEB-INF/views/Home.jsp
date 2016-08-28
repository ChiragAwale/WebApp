
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Courses</h1>
        <table border = "1">
            <tr>
                <th>Id</th>
                <th>Course Name</th>
                <th>Credits</th>
                <th>Status</th>
            </tr>
            <c:forEach var="courses" items="${requestScope.courses}">
                <tr>

                    <td>${courses.id}</td>
                    <td>${courses.name}</td>
                    <td>${courses.credits}</td>
                    <td><c:choose>

                            <c:when test = "${courses.status ==1}">In Process</c:when>
                            <c:when test = "${courses.status == 2}">Completed</c:when>
                            <c:otherwise>Not Started</c:otherwise>
                        </c:choose>   

                    </td>

                </tr>

            </c:forEach>


    </body>
</html>
