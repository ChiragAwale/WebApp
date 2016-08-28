/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practise.courseManager.courseDAO;

import com.practise.courseManager.entity.Course;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author chira
 */
public interface CourseDAO {
    List<Course> getAll() throws IOException, SQLException;
    int insert(Course c) throws IOException, SQLException, ClassNotFoundException;
    
    
}
