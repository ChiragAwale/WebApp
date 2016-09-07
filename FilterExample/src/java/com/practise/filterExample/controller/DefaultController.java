/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practise.filterExample.controller;

import com.practise.filterExample.Dao.UserDao;
import com.practise.filterExample.Dao.impl.UserDaoImpl;
import com.practise.filterExample.system.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chira
 */
public class DefaultController extends Controller {

    UserDao userDAO = new UserDaoImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("Hello world, welcome to Java servlet");

    }
}
