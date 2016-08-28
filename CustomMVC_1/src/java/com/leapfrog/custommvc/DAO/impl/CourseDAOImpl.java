/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.custommvc.DAO.impl;

import com.leapfrog.custommvc.DAO.CourseDAO;
import com.leapfrog.custommvc.entity.Course;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chira
 */
public class CourseDAOImpl implements CourseDAO {

    @Override
    public List<Course> getALL() {
        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1, "CS 2250", 3));
        courseList.add(new Course(2, "Math 1125", 4));
         courseList.add(new Course(3, "FRN 1101", 3));
          courseList.add(new Course(4, "ENG 1103", 3));
           courseList.add(new Course(5, "HON 1101", 3));
        return courseList;

    }

}
