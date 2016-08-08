/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chirag.project.appartmentManager.dao;

import com.chirag.project.appartmentManager.entity.Member;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chira
 */
public interface MemberDAO {
   List<Member> getAll()throws ClassNotFoundException, SQLException;
   int insert(Member m) throws ClassNotFoundException, SQLException;
   List<Member> adminGetAll()throws ClassNotFoundException, SQLException; 
   int delete(int id, Member m)throws ClassNotFoundException,SQLException;
   Member getById(int id)throws ClassNotFoundException,SQLException;
   int update(int id,Member m)throws ClassNotFoundException,SQLException;
   boolean checkPasswordMatch(String password1,String password2);
    
}
