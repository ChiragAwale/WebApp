package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.chirag.project.appartmentManager.entity.Member;
import com.chirag.project.appartmentManager.dao.impl.MemberDAOImpl;
import com.chirag.project.appartmentManager.dao.MemberDAO;

public final class memberInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Member Info</title>\n");
      out.write("        <link href=\"Assets/css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Assets/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Members</h1> \n");
      out.write("            <table class=\"table table-striped table-hover\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Id</th>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Email</th>\n");
      out.write("                    <th>Location</th>\n");
      out.write("                    <th>University Name</th>\n");
      out.write("                    <th>State</th>\n");
      out.write("                    <th>Status</th>\n");
      out.write("                    <th>Joined Date</th>\n");
      out.write("\n");
      out.write("              \n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");

                    MemberDAO memberDAO = new MemberDAOImpl();
                    for (Member m : memberDAO.getAll()) {
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(m.getId());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( m.getFirstName() + m.getLastName());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(m.getEmail_id());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(m.getLocation());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(m.getUniversityName());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(m.getState());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(m.getStatus());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(m.getAdded_date());
      out.write("</td>\n");
      out.write("\n");
      out.write("                   \n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");
}
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>   \n");
      out.write("\n");
      out.write("    </body> \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
