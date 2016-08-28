/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.custommvc.DAO.impl;

import com.leapfrog.custommvc.DAO.CourseDAO;
import com.leapfrog.custommvc.entity.Course;
import com.leapfrog.custommvc.utility.DbConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chira
 */
public class CourseDAOImpl implements CourseDAO {

    DbConnection db = new DbConnection();

    @Override
    public List<Course> getALL() throws ClassNotFoundException, SQLException {
        List<Course> courseList = new ArrayList<>();

        db.open();
        String sql = "Select * from tbl_course";
        db.initStatement(sql);
        ResultSet rs = db.executeQuery();
        while (rs.next()) {
            Course course = new Course();
            course.setId(rs.getInt("course_id"));
            course.setName(rs.getString("course_name"));
            course.setCredits(rs.getInt("course_credits"));
            course.setStatus(rs.getInt("course_status"));
            courseList.add(course);
        }
        db.close();

        return courseList;

    }

}
