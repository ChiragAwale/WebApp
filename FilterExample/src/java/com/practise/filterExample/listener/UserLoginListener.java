/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practise.filterExample.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author chira
 */
@WebListener
public class UserLoginListener implements ServletRequestListener{

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
     HttpServletRequest req = (HttpServletRequest)sre.getServletRequest();
        System.out.println("Request from " + req.getRemoteAddr() + "page : " + req.getRequestURI());
        
    }
    
}
