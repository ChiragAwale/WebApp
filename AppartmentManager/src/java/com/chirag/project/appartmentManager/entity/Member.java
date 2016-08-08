/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chirag.project.appartmentManager.entity;

/**
 *
 * @author chira
 */
public class Member {
    private int id;
    private String firstName,lastName,email_id,location,universityName,state,status,added_date,modified_date,password;
    private boolean deleteFlag;

    public Member() {
    }

    public Member(int id, String firstName, String lastName, String email_id, String location, String universityName, String state, String status, String added_date, String modified_date, String password, boolean deleteFlag) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email_id = email_id;
        this.location = location;
        this.universityName = universityName;
        this.state = state;
        this.status = status;
        this.added_date = added_date;
        this.modified_date = modified_date;
        this.password = password;
        this.deleteFlag = deleteFlag;
    }

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

 

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAdded_date() {
        return added_date;
    }

    public void setAdded_date(String added_date) {
        this.added_date = added_date;
    }

    public String getModified_date() {
        return modified_date;
    }

    public void setModified_date(String modified_date) {
        this.modified_date = modified_date;
    }

    @Override
    public String toString() {
        return "Member{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email_id=" + email_id + ", location=" + location + ", universityName=" + universityName + ", state=" + state + ", status=" + status + ", added_date=" + added_date + ", modified_date=" + modified_date + ", password=" + password + ", deleteFlag=" + deleteFlag + '}';
    }

  


}