<%@page import="com.chirag.project.appartmentManager.entity.Member"%>
<%@page import="com.chirag.project.appartmentManager.dao.impl.MemberDAOImpl"%>
<%@page import="com.chirag.project.appartmentManager.dao.MemberDAO"%>
<% try {
        if (request.getMethod().equalsIgnoreCase("post")) {
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");

            if (userName.equals("admin") && password.equals("admin")) {
                response.sendRedirect("adminHome.jsp?id=55433");
            }

            response.sendRedirect("../index.jsp?AccessDenied");

        } else {
            response.sendRedirect("../index.jsp?AccessNotGranted");

        }
    } catch (IllegalStateException ise) {
        out.println("asd");
    }
%>