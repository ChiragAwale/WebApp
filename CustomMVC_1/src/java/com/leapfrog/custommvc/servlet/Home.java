/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.custommvc.servlet;

import com.leapfrog.custommvc.DAO.CourseDAO;
import com.leapfrog.custommvc.DAO.impl.CourseDAOImpl;
import com.leapfrog.custommvc.entity.Course;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chira
 */
public class Home extends HttpServlet {

    private CourseDAO courseDAO;

    @Override
    public void init() throws ServletException {
        courseDAO = new CourseDAOImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("courses", courseDAO.getALL());
        request.getRequestDispatcher("/WEB-INF/views/Home.jsp").forward(request, response);

    }
}