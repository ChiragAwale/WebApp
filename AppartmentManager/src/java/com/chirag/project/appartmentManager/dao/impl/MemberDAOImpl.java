/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chirag.project.appartmentManager.dao.impl;

import com.chirag.project.appartmentManager.dao.MemberDAO;
import com.chirag.project.appartmentManager.entity.Member;
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
public class MemberDAOImpl implements MemberDAO {

    private DbConnection db = new DbConnection();

    List<Member> memberList = new ArrayList<>();

    @Override
    public List<Member> getAll() throws ClassNotFoundException, SQLException {
        String sql = "Select * from tbl_members";
        db.open();
        db.initStatement(sql);
        ResultSet rs = db.executeQuery();
        while (rs.next()) {
            Member m = new Member();

            m.setFirstName(rs.getString("first_name"));
            m.setLastName(rs.getString("last_name"));
            m.setEmail_id(rs.getString("email_id"));
            m.setLocation(rs.getString("Location"));
            m.setUniversityName(rs.getString("University_name"));
            m.setState(rs.getString("State"));
            m.setStatus(rs.getString("Status"));
            m.setAdded_date(rs.getString("Added_Date"));
            m.setDeleteFlag(rs.getBoolean("Delete_flag"));
            memberList.add(m);

        }
        return memberList;
    }

    @Override
    public List<Member> adminGetAll() throws ClassNotFoundException, SQLException {
        String sql = "Select * from tbl_members";
        db.open();
        db.initStatement(sql);
        ResultSet rs = db.executeQuery();
        while (rs.next()) {
            Member m = new Member();
            m.setId(rs.getInt("member_id"));
            m.setFirstName(rs.getString("first_name"));
            m.setLastName(rs.getString("last_name"));
            m.setEmail_id(rs.getString("email_id"));
            m.setLocation(rs.getString("Location"));
            m.setUniversityName(rs.getString("University_name"));
            m.setState(rs.getString("State"));
            m.setStatus(rs.getString("Status"));
            m.setAdded_date(rs.getString("Added_Date"));
            m.setModified_date(rs.getString("Modified_date"));
            m.setPassword(rs.getString("Password"));
            m.setDeleteFlag(rs.getBoolean("Delete_flag"));
            memberList.add(m);

        }

        return memberList;
    }

    @Override
    public int insert(Member m) throws ClassNotFoundException, SQLException {
        db.open();
        String sql = "insert into tbl_members(first_name,last_name,email_id,Location,University_Name,State,status,password) Values (?,?,?,?,?,?,?,?) ";
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, m.getFirstName());
        stmt.setString(2, m.getLastName());
        stmt.setString(3, m.getEmail_id());
        stmt.setString(4, m.getLocation());
        stmt.setString(5, m.getUniversityName());
        stmt.setString(6, m.getState());
        stmt.setString(7, m.getStatus());
        stmt.setString(8, m.getPassword());
        int result = db.executeUpdate();
        db.close();
        return result;

    }

    @Override
    public int delete(int id, Member m) throws ClassNotFoundException, SQLException {

        db.open();
        String sql = ("update tbl_members set Delete_flag=?,modified_date=? where member_id =?");
        PreparedStatement statement = db.initStatement(sql);

        statement.setBoolean(1, m.isDeleteFlag());
        statement.setDate(2, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
        statement.setInt(3, id);
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public Member getById(int id) throws ClassNotFoundException, SQLException {
        Member m = null;
        String sql = "Select * from tbl_members where member_id=?";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);

        ResultSet rs = db.executeQuery();
        while (rs.next()) {
            m = new Member();
            m.setId(rs.getInt("member_id"));
            m.setFirstName(rs.getString("first_name"));
            m.setLastName(rs.getString("last_name"));
            m.setEmail_id(rs.getString("email_id"));
            m.setLocation(rs.getString("Location"));
            m.setUniversityName(rs.getString("University_name"));
            m.setState(rs.getString("State"));
            m.setStatus(rs.getString("Status"));
            m.setAdded_date(rs.getString("Added_Date"));
            m.setModified_date(rs.getString("Modified_date"));
            m.setPassword(rs.getString("Password"));
            m.setDeleteFlag(rs.getBoolean("Delete_Flag"));

        }
        return m;

    }

    @Override
    public int update(int id, Member m) throws ClassNotFoundException, SQLException {
        db.open();
        String sql = ("update tbl_members set First_Name=?,Last_Name=?,Email_id=?,Location=?,University_name=?,State=?,Status=?,modified_date=?,password=? where member_id =?");
        PreparedStatement statement = db.initStatement(sql);

        statement.setString(1, m.getFirstName());
        statement.setString(2, m.getLastName());
        statement.setString(3, m.getEmail_id());
        statement.setString(4, m.getLocation());
        statement.setString(5, m.getUniversityName());
        statement.setString(6, m.getState());
        statement.setString(7, m.getStatus());
        statement.setDate(8, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
        statement.setString(9, m.getPassword());
        statement.setInt(10, id);
        int result = db.executeUpdate();
        db.close();
        return result;

    }

    @Override
    public boolean checkPasswordMatch(String password1, String password2) {
        if (password1.equalsIgnoreCase(password2)) {
            return true;
        } else {
            return false;
        }

    }

}
