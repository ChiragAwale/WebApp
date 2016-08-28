/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practise.courseManager.constant;

/**
 *
 * @author chira
 */
public class SQLConstant {
    public static final String INSERT = "INSERT_INTO "+ TableConstant.TABLE_NAME +"(course_name,course_description,course_code,course_status) VALUES (?,?,?,?) ";
    public static final String GETALL = "SELECT * FROM "+ TableConstant.TABLE_NAME;
}
