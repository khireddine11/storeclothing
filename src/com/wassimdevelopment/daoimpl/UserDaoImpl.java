/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.daoimpl;

import com.wassimdevelopment.dao.UserDAO;
import com.wassimdevelopment.database.db;
import com.wassimdevelopment.model.User;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JARGON
 */
public class UserDaoImpl implements UserDAO {
    
    private Connection connection;
    private ResultSet rs;
    private PreparedStatement pr;
    
    @Override
    public void addUser(User var1) {
        String insert = "INSERT into users(id,username,pass ) VALUES (?,?,?)";
        try {
            this.connection = db.getConnection();
            String[] generatedColumns = new String[]{"id"};
            this.pr = this.connection.prepareStatement(insert, generatedColumns);
            this.pr.setInt(1, var1.getId());
            this.pr.setString(2, var1.getUsername());
            this.pr.setString(3, var1.getPassword());
            this.pr.execute();
            this.rs = this.pr.getGeneratedKeys();
            if (this.rs.next()) {
                var1.setId(this.rs.getInt(1));
                
            }
        } catch (UnknownHostException e) {
        } catch (SQLException e) {
        }
    }
    
    @Override
    public List<User> getUsers() {
        return null;
        
    }
    
    @Override
    public void updateUser(User var1) {
        
    }
    
    @Override
    public void deleteUser(User var1) {
        
    }
    
    /**
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public User userCredentialsCheck(String username, String password) {
        String query = "SELECT * from users where username = ? and pass = ?";
//String query = "SELECT * from admin where username = ? and pass = ?";
        User var5 = null;
      try {
         this.connection = db.getConnection();
         this.pr = this.connection.prepareStatement(query);
         this.pr.setString(1, username);
         this.pr.setString(2, password);
         this.rs = this.pr.executeQuery();
         if (!this.rs.next()) {
        return null;
         }
          User User = new User();
         User.setId(this.rs.getInt(1));
         User.setUsername(this.rs.getString(2));
         User.setPassword(this.rs.getString(3));
          var5 = User;
    }   catch (SQLException | UnknownHostException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return var5;
    }
}

