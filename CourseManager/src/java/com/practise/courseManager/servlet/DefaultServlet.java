/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practise.courseManager.servlet;

import com.practise.courseManager.courseDAO.CourseDAO;
import com.practise.courseManager.courseDAO.impl.CourseDAOImpl;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chira
 */
@WebServlet(name = "home", urlPatterns = {"/home","/"})

public class DefaultServlet extends HttpServlet {

    CourseDAO courseDAO = new CourseDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            request.setAttribute("courses", courseDAO.getAll());
            request.getRequestDispatcher("/WEB-INF/Views/Home.jsp").forward(request, response);
        } catch (SQLException ex) {
        }

    }

}
