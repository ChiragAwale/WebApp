/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practise.courseManager.entity;

/**
 *
 * @author chira
 */
public class Course {

    int id;
    String name, description;
    int code, status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Course() {
    }

    public Course(int id, String name, String description, int code, int status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.code = code;
        this.status = status;
    }

}
