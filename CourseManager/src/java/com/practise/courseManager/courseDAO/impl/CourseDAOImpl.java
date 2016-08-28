/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practise.courseManager.courseDAO.impl;

import com.practise.courseManager.constant.DBConstant;
import com.practise.courseManager.constant.SQLConstant;
import com.practise.courseManager.courseDAO.CourseDAO;
import com.practise.courseManager.entity.Course;
import com.practise.courseManager.utility.DbConnection;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chira
 */
public class CourseDAOImpl implements CourseDAO {

    private DbConnection db = new DbConnection();

    @Override
    public List<Course> getAll() throws IOException, SQLException {

        List<Course> courseList = new ArrayList<>();

        try {
            db.open();
            db.initStatement(SQLConstant.GETALL);
            ResultSet rs = db.executeQuery();
            while (rs.next()) {
                Course c = new Course();
                c.setId(rs.getInt("course_id"));
                c.setName(rs.getString("course_name"));
                c.setDescription(rs.getString("course_description"));
                c.setCode(rs.getInt("course_code"));
                c.setStatus(rs.getInt("course_status"));
                courseList.add(c);
            }
            db.close();

        } catch (ClassNotFoundException ex) {
        }
        return courseList;
    }

    @Override
    public int insert(Course c) throws IOException, SQLException, ClassNotFoundException {

        db.open();
        PreparedStatement stmt = db.initStatement(SQLConstant.INSERT);
        stmt.setString(1, c.getName());
        stmt.setString(2, c.getDescription());
        stmt.setInt(3, c.getCode());
        stmt.setInt(4, c.getStatus());
        int result = db.executeUpdate();

        db.close();

        return result;
    }

}
