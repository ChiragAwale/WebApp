/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practise.filterExample.controller.admin;

import com.practise.filterExample.system.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "dashboard", urlPatterns = {"/admin", "/admin/dashboard"})
public class DashboardController extends Controller {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("Hello admin, welcome to Secured Side of this website");

    }
}
