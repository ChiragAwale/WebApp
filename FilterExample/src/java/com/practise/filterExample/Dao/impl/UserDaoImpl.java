/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practise.filterExample.Dao.impl;

import com.practise.filterExample.Dao.UserDao;
import com.practise.filterExample.entity.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author chira
 */
public class UserDaoImpl implements UserDao {

    @Override
    public User login(String username, String password) {
        for (User user : getAll()) {
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                return user;

            }
        }
        return null;
    }

    @Override
    public void forgotPassword(String email) {
    // Recipient's email ID needs to be mentioned.
      String to =email;

      // Sender's email ID needs to be mentioned
      String from = "chiragawale@yahoo.com";

      // Assuming you are sending email from localhost
      String host = "smtp.att.com";

      // Get system properties
      Properties properties = System.getProperties();

      // Setup mail server
      properties.setProperty("mail.smtp.host", host);

      // Get the default Session object.
       Session session = Session.getDefaultInstance(properties);

      try{
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

         // Set Subject: header field
         message.setSubject(" Your Password Request!");

         // Now set the actual message
         message.setText("This is actual message");

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      }catch (MessagingException mex) {
         mex.printStackTrace();
      }
    }

    @Override
    public User getById(int id) {
        for (User user : getAll()) {
            if (id == user.getId()) {
                return user;

            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(0, "chirag", "chirag123", "chiragawale777@gmail.com", true));
        userList.add(new User(1, "ramesh", "ramesh123", "ramesh@gmail.com", false));
        return userList;
    }

}
