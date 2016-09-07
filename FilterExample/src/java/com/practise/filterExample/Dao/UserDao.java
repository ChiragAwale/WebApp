/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practise.filterExample.Dao;

import com.practise.filterExample.entity.User;
import java.util.List;

/**
 *
 * @author chira
 */
public interface UserDao {
    User login(String username,String password);
    void forgotPassword(String email);
    User getById(int id);
    List<User> getAll();
    
}
