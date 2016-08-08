<%@page import="com.chirag.project.appartmentManager.entity.Member"%>
<%@page import="com.chirag.project.appartmentManager.dao.impl.MemberDAOImpl"%>
<%@page import="com.chirag.project.appartmentManager.dao.MemberDAO"%>
<% try{
    if (request.getMethod().equalsIgnoreCase("post")) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        MemberDAO memberDAO = new MemberDAOImpl();
        for (Member m : memberDAO.adminGetAll()) {
        
            
            if (m.getEmail_id().equalsIgnoreCase(userName) && m.getPassword().equals(password)) {
                response.sendRedirect("addPost.jsp?username="+m.getEmail_id());
                
            }
            if(userName.equals("admin33") && password.equals("admin334")){
                response.sendRedirect("Admin/adminMemberInfo.jsp");
            }

        

        }
        response.sendRedirect("index.jsp?AccessDenied");

    } else {
        response.sendRedirect("index.jsp?AccessNotGranted");

    }
}catch(IllegalStateException ise){out.println("asd");
}
%>