package com.practise.filterExample.controller.admin;

import com.practise.filterExample.system.Controller;
import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "logout", urlPatterns =  {"/admin/logout"})
public class LogoutController extends Controller {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession(false).invalidate();
        response.sendRedirect(request.getContextPath() + "/login");
    }
}
