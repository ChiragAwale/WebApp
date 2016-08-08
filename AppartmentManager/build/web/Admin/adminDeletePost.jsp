
<%@page import="com.chirag.project.appartmentManager.entity.Post"%>
<%@page import="com.chirag.project.appartmentManager.dao.impl.PostDAOImpl"%>
<%@page import="com.chirag.project.appartmentManager.dao.PostDAO"%>
<%
    if (request.getParameter("id") == null || request.getParameter("id").isEmpty()) {
        response.sendRedirect("../index.jsp?error");
    } else {
        PostDAO postDAO = new PostDAOImpl();
        Post p = new Post();
        
        p.setDelete_flag(true);

        try {
            if (postDAO.delete(Integer.parseInt(
                    request.getParameter("id")), p) > 0) {
                response.sendRedirect("adminPostInfo.jsp?success");
            } else {
                response.sendRedirect("adminPostInfo.jsp?error");
            }
        } catch (Exception e) {
            out.println(e.getMessage());
        }

    }
%>