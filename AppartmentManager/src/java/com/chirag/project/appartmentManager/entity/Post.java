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
public class Post {
    private String post_heading,post_text,posted_date,postedBy,modified_date;
    private int post_id,totalCost,numberOfRoomMatesSearching,numberOfRoomMatesPresent;
    private boolean delete_flag;
    private String contactNo,email;

    public Post() {
    }

    public Post(String post_heading, String post_text, String posted_date, String postedBy, String modified_date, int post_id, int totalCost, int numberOfRoomMatesSearching, int numberOfRoomMatesPresent, boolean delete_flag, String contactNo, String email) {
        this.post_heading = post_heading;
        this.post_text = post_text;
        this.posted_date = posted_date;
        this.postedBy = postedBy;
        this.modified_date = modified_date;
        this.post_id = post_id;
        this.totalCost = totalCost;
        this.numberOfRoomMatesSearching = numberOfRoomMatesSearching;
        this.numberOfRoomMatesPresent = numberOfRoomMatesPresent;
        this.delete_flag = delete_flag;
        this.contactNo = contactNo;
        this.email = email;
    }

    public String getPost_heading() {
        return post_heading;
    }

    public void setPost_heading(String post_heading) {
        this.post_heading = post_heading;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
  

    public String getPost_text() {
        return post_text;
    }

    public void setPost_text(String post_text) {
        this.post_text = post_text;
    }

    public String getPosted_date() {
        return posted_date;
    }

    public void setPosted_date(String posted_date) {
        this.posted_date = posted_date;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }

    public String getModified_date() {
        return modified_date;
    }

    public void setModified_date(String modified_date) {
        this.modified_date = modified_date;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getNumberOfRoomMatesSearching() {
        return numberOfRoomMatesSearching;
    }

    public void setNumberOfRoomMatesSearching(int numberOfRoomMatesSearching) {
        this.numberOfRoomMatesSearching = numberOfRoomMatesSearching;
    }

    public int getNumberOfRoomMatesPresent() {
        return numberOfRoomMatesPresent;
    }

    public void setNumberOfRoomMatesPresent(int numberOfRoomMatesPresent) {
        this.numberOfRoomMatesPresent = numberOfRoomMatesPresent;
    }

    public boolean isDelete_flag() {
        return delete_flag;
    }

    public void setDelete_flag(boolean delete_flag) {
        this.delete_flag = delete_flag;
    }

    @Override
    public String toString() {
        return "Post{" + "post_heading=" + post_heading + ", post_text=" + post_text + ", posted_date=" + posted_date + ", postedBy=" + postedBy + ", modified_date=" + modified_date + ", post_id=" + post_id + ", totalCost=" + totalCost + ", numberOfRoomMatesSearching=" + numberOfRoomMatesSearching + ", numberOfRoomMatesPresent=" + numberOfRoomMatesPresent + ", delete_flag=" + delete_flag + ", contactNo=" + contactNo + ", email=" + email + '}';
    }


  


}
