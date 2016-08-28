/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.custommvc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chira
 */
public class DefaultServlet extends HttpServlet {
    
    
    //Web content of /Contact-us containing Form for submitting name of the user
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
   
        response.setHeader("Content-Type", "text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1> Contact us </h1>");
        out.println("<form method = 'post'>");
        out.println("<input type = 'text' name='contactForm'>");
        out.println("<button type= 'submit'>Send</button>");
        out.print("</form>");
        
    }
    
    //Allows the user to post, Generates responses
      protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
   
        response.setHeader("Content-Type", "text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1> Thankyou </h1>");
        out.println(request.getParameter("contactForm"));
    }
}
