<%@page import="com.chirag.project.appartmentManager.entity.Member"%>
<%@page import="com.chirag.project.appartmentManager.dao.impl.MemberDAOImpl"%>
<%@page import="com.chirag.project.appartmentManager.dao.MemberDAO"%>
<%
    if (request.getParameter("id") == null || request.getParameter("id").isEmpty()) {
        response.sendRedirect("../index.jsp?error");
    } else {
        MemberDAO memberDAO = new MemberDAOImpl();
        Member m = new Member();
        
        m.setDeleteFlag(false);

        try {
            if (memberDAO.delete(Integer.parseInt(
                    request.getParameter("id")), m) > 0) {
                response.sendRedirect("adminMemberInfo.jsp?success");
            } else {
                response.sendRedirect("adminEdit.jsp?error");
            }
        } catch (Exception e) {
            out.println(e.getMessage());
        }

    }
%>