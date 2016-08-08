/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chirag.project.appartmentManager.dao.impl;

import com.chirag.project.appartmentManager.dao.PostDAO;
import com.chirag.project.appartmentManager.entity.Member;

import com.chirag.project.appartmentManager.entity.Post;
import com.chirag.project.appartmentManager.utility.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author chira
 */
public class PostDAOImpl implements PostDAO {

    private DbConnection db = new DbConnection();

    List<Post> postList = new ArrayList<>();

    @Override
    public List<Post> getAll() throws ClassNotFoundException, SQLException {

        String sql = "Select * from tbl_posts";
        db.open();
        db.initStatement(sql);
        ResultSet rs = db.executeQuery();
        while (rs.next()) {
            Post p = new Post();
            p.setPost_id(rs.getInt("post_id"));
            p.setPost_heading(rs.getString("Post_heading"));
            p.setPost_text(rs.getString("post_text"));
            p.setPosted_date(rs.getString("posted_date"));
            p.setPostedBy(rs.getString("postedBy"));
            p.setTotalCost(rs.getInt("Total_Cost_Per_Month"));
            p.setNumberOfRoomMatesSearching(rs.getInt("Number_of_roommates_searching"));
            p.setNumberOfRoomMatesPresent(rs.getInt("Number_of_roommates_present"));
            p.setDelete_flag(rs.getBoolean("Delete_Flag"));
            p.setModified_date(rs.getString("Modified_date"));
            p.setEmail(rs.getString("Email"));
            p.setContactNo(rs.getString("Contact_No"));
            postList.add(p);

        }
        return postList;
    }

    @Override
    public int insert(Post p) throws ClassNotFoundException, SQLException {
        db.open();
        String sql = "insert into tbl_posts(post_heading,post_text,postedBy,Total_Cost_Per_Month,Number_of_roommates_searching,Number_of_roommates_present,Delete_Flag,Contact_No,Email) Values (?,?,?,?,?,?,?,?,?) ";
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, p.getPost_heading());
        stmt.setString(2, p.getPost_text());

        stmt.setString(3, p.getPostedBy());
        stmt.setInt(4, p.getTotalCost());
        stmt.setInt(5, p.getNumberOfRoomMatesSearching());
        stmt.setInt(6, p.getNumberOfRoomMatesPresent());
        stmt.setBoolean(7, p.isDelete_flag());
        stmt.setString(9, p.getEmail());
        stmt.setString(8, p.getContactNo());

        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public List<Post> adminGetAll() throws ClassNotFoundException, SQLException {

        String sql = "Select * from tbl_posts";
        db.open();
        db.initStatement(sql);
        ResultSet rs = db.executeQuery();
        while (rs.next()) {
            Post p = new Post();
            p.setPost_id(rs.getInt("post_id"));
            p.setPost_heading(rs.getString("Post_heading"));
            p.setPost_text(rs.getString("post_text"));
            p.setPosted_date(rs.getString("posted_date"));
            p.setPostedBy(rs.getString("postedBy"));
            p.setTotalCost(rs.getInt("Total_Cost_Per_Month"));
            p.setNumberOfRoomMatesSearching(rs.getInt("Number_of_roommates_searching"));
            p.setNumberOfRoomMatesPresent(rs.getInt("Number_of_roommates_present"));
            p.setDelete_flag(rs.getBoolean("Delete_Flag"));
            p.setModified_date(rs.getString("Modified_date"));
            p.setEmail(rs.getString("Email"));
            p.setContactNo(rs.getString("Contact_No"));
            postList.add(p);

        }
        return postList;
    }

    @Override
    public int delete(int id, Post p) throws ClassNotFoundException, SQLException {
        db.open();
        String sql = ("update tbl_posts set Delete_flag=?,modified_date=? where post_id =?");
        PreparedStatement statement = db.initStatement(sql);

        statement.setBoolean(1, p.isDelete_flag());
        statement.setDate(2, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
        statement.setInt(3, id);
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public Post getById(int id) throws ClassNotFoundException, SQLException {
        Post p = null;
        String sql = "Select * from tbl_posts where post_id=?";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);

        ResultSet rs = db.executeQuery();
        while (rs.next()) {
            p = new Post();
            p.setPost_id(rs.getInt("post_id"));
            p.setPost_heading(rs.getString("Post_heading"));
            p.setPost_text(rs.getString("post_text"));
            p.setPosted_date(rs.getString("posted_date"));
            p.setPostedBy(rs.getString("postedBy"));
            p.setTotalCost(rs.getInt("Total_Cost_Per_Month"));
            p.setNumberOfRoomMatesSearching(rs.getInt("Number_of_roommates_searching"));
            p.setNumberOfRoomMatesPresent(rs.getInt("Number_of_roommates_present"));
            p.setDelete_flag(rs.getBoolean("Delete_Flag"));
            p.setModified_date(rs.getString("Modified_date"));
            p.setEmail(rs.getString("Email"));
            p.setContactNo(rs.getString("Contact_No"));

        }
        return p;
    }

    @Override
    public int update(int id, Post p) throws ClassNotFoundException, SQLException {
        db.open();
        String sql = ("update tbl_posts set Post_heading=?,post_text=?,postedBy=?,Total_Cost_Per_Month=?,Number_of_roommates_searching=?,Number_of_roommates_present=?,Delete_Flag=?,modified_date=? where post_id =?");
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, p.getPost_heading());
        stmt.setString(2, p.getPost_text());

        stmt.setString(3, p.getPostedBy());
        stmt.setInt(4, p.getTotalCost());
        stmt.setInt(5, p.getNumberOfRoomMatesSearching());
        stmt.setInt(6, p.getNumberOfRoomMatesPresent());
        stmt.setBoolean(7, p.isDelete_flag());
        stmt.setDate(8, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
        stmt.setInt(9, id);
        int result = db.executeUpdate();
        db.close();
        return result;

    }

}
