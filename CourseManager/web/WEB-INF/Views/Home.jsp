<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
</head>
<body>
    <h1>Courses</h1>
    <table border = "1">
        <tr>
            <th>Id</th>
            <th>Course Name</th>
            <th>Course Code</th>
            <th>Description</th>
            <th>Status</th>
        </tr>
        <c:forEach var="courses" items="${requestScope.courses}">
            <tr>

                <td>${courses.id}</td>
                <td>${courses.name}</td>
                <td>${courses.code}</td>
                <td>${courses.description}</td>

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