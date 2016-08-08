
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.chirag.project.appartmentManager.entity.Member"%>
<%@page import="com.chirag.project.appartmentManager.dao.impl.MemberDAOImpl"%>
<%@page import="com.chirag.project.appartmentManager.dao.MemberDAO"%>
<%  int id = Integer.parseInt(request.getParameter("id"));
    Member member = new Member();
    if (request.getParameter("id") == null || request.getParameter("id").isEmpty()) {
        response.sendRedirect("../index.jsp?error");
    } else {
        MemberDAO memberDAO = new MemberDAOImpl();

        try {
           
        

            if (memberDAO.getById(id) == null) {
                 response.sendRedirect("../index.jsp?error");
            }else{
                member = memberDAO.getById(id);
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
            <h1>Edit Member Details</h1>
            <form action ="adminUpdate.jsp?id=<%=id %>" method="post">
                <div class="form-group">
                    <label>First Name</label>
                    <input type ="text" name ="first_name" required="required" placeholder="Enter First Name" class ="form-control" value = "<%=member.getFirstName()%>">
                    <label>Last Name</label>
                    <input type ="text" name ="last_name" required="required" placeholder="Enter Last Name" class ="form-control" value = "<%=member.getLastName()%>">
                    <label>Password</label>
                    <input type ="password" name ="password1" required="required" placeholder="Enter Password" class ="form-control" value = "<%=member.getPassword()%>">
                    <label>Confirm Password</label>
                    <input type ="password" name ="password2" required="required" placeholder="Enter Password" class ="form-control" value = "<%=member.getPassword()%>">
                    <label>Email Address</label>
                    <input type ="email" name ="email_id" required="required" placeholder="Enter Email Address" class ="form-control" value = "<%=member.getEmail_id()%>">
                    <label>Address</label>
                    <input type ="text" name ="location" required="required" placeholder="Enter Address" class ="form-control" value = "<%=member.getLocation()%>"
                           <label>University Name</label>
                    <input type ="text" name ="university_name" required="required" placeholder="Enter University Name" class ="form-control"  value = "<%=member.getUniversityName()%>"
                           <label>State</label>
                    <input type ="text" name ="state" required="required" placeholder="Enter State" class ="form-control"  value = "<%=member.getState()%>"
                           <label>Status</label>
                    <input type ="text" name ="status" required="required" placeholder="Enter Status(eg. Student,Teacher..etc)" class ="form-control"  value = "<%=member.getStatus()%>"
                </div>

                <button type="submit" class="btn btn-warning"> Update </button>
                <a href ="adminMemberInfo.jsp" class="btn btn-danger"> Cancel</a>
            </form>
        </div>
    </body>
</html>  

