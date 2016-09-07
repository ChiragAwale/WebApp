/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practise.filterExample.controller;

import com.practise.filterExample.Dao.UserDao;
import com.practise.filterExample.Dao.impl.UserDaoImpl;
import com.practise.filterExample.entity.User;
import com.practise.filterExample.system.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chira
 */
//Servlet mapping with annotations
@WebServlet(name = "login", urlPatterns = {"/login"})
public class LoginController extends Controller {
//Initiates the interface

    private UserDao userDAO = new UserDaoImpl();
//Get Method

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

    }
//Post Method

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //collects ands stores values of username and password in variables userName and password
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        //Returns user(object) after checkign username and password with database
        User user = userDAO.login(userName, password);

        if (user == null) {
            //redirects invalid logins to login page with error
            response.sendRedirect(request.getContextPath() + "/login?error");
        } else //creates a session for the logged in user and redirects user to admin page
         if (user.isStatus()) {//checks if the user status is active or not and redirects accordingly
                request.getSession(true).setAttribute("loggedIn", user);
                response.sendRedirect(request.getContextPath() + "/admin/dashboard");
            } else {
                response.sendRedirect(request.getContextPath() + "/login?inactiveuser");
            }
    }
}
