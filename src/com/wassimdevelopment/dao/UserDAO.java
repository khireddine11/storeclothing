/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wassimdevelopment.dao;

import com.wassimdevelopment.model.User;
import java.util.List;

/**
 *
 * @author JARGON
 */
public interface UserDAO {
     void addUser(User var1);

   List<User> getUsers();

   void updateUser(User var1);

   void deleteUser(User var1);

   User userCredentialsCheck(String var1, String var2);
}
