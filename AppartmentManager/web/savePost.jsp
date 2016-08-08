<%@page import="com.chirag.project.appartmentManager.entity.Post"%>
<%@page import="com.chirag.project.appartmentManager.dao.impl.PostDAOImpl"%>
<%@page import="com.chirag.project.appartmentManager.dao.PostDAO"%>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        PostDAO postDAO = new PostDAOImpl();
        Post p = new Post();
        p.setPost_heading(request.getParameter("post_heading"));
        p.setPost_text(request.getParameter("post_text"));
        p.setPostedBy(request.getParameter("postedBy"));
        p.setTotalCost(Integer.parseInt(request.getParameter("totalCost")));
        p.setNumberOfRoomMatesSearching(Integer.parseInt(request.getParameter("noSearching")));
        p.setNumberOfRoomMatesPresent(Integer.parseInt(request.getParameter("noPresent")));
        p.setContactNo(request.getParameter("contactNo"));
        p.setEmail(request.getParameter("email"));
   

        try {
            if (postDAO.insert(p) > 0) {
                response.sendRedirect("index.jsp?success");
            } else {
                response.sendRedirect("add.jsp?error");
            }
        } catch (Exception e) {
            out.println(e.getMessage());
        }

    } else {
        out.println("Hero palteko bro>?");

    }
%>