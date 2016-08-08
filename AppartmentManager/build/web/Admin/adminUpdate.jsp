<%@page import="com.chirag.project.appartmentManager.entity.Member"%>
<%@page import="com.chirag.project.appartmentManager.dao.impl.MemberDAOImpl"%>
<%@page import="com.chirag.project.appartmentManager.dao.MemberDAO"%>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        MemberDAO memberDAO = new MemberDAOImpl();
        Member m = new Member();
        m.setFirstName(request.getParameter("first_name"));
        m.setLastName(request.getParameter("last_name"));
        m.setEmail_id(request.getParameter("email_id"));
        m.setLocation(request.getParameter("location"));
        m.setUniversityName(request.getParameter("university_name"));
        m.setState(request.getParameter("state"));
        m.setStatus(request.getParameter("status"));
        m.setPassword(request.getParameter("password1"));

        try {
            if (memberDAO.update(Integer.parseInt(
                    request.getParameter("id")), m) > 0) {
                response.sendRedirect("adminMemberInfo.jsp?success");
            } else {
                response.sendRedirect("adminEdit.jsp?error");
            }
        } catch (Exception e) {
            out.println(e.getMessage());
        }

    } else {
        response.sendRedirect("../index.jsp?error");

    }
%>