/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chirag.project.appartmentManager.dao;

import com.chirag.project.appartmentManager.entity.Member;
import com.chirag.project.appartmentManager.entity.Post;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author chira
 */
public interface PostDAO {

    List<Post> getAll() throws ClassNotFoundException, SQLException;

    int insert(Post p) throws ClassNotFoundException, SQLException;

    List<Post> adminGetAll() throws ClassNotFoundException, SQLException;

    int delete(int id, Post p) throws ClassNotFoundException, SQLException;

    Post getById(int id) throws ClassNotFoundException, SQLException;

    int update(int id, Post p) throws ClassNotFoundException, SQLException;
}
