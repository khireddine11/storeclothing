/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.database;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JARGON
 */
public class db {

    public static Connection getConnection() throws SQLException, UnknownHostException {
//          String host = InetAddress.getLocalHost().getHostName();
//          String url = "jdbc:mysql://" + host + ":3306/employee";
//          String user = "root";
//          String pwd = "";
        String host = InetAddress.getLocalHost().getHostName();
        String url = "jdbc:postgresql://" + host + ":5432/anes";
//        String url = "jdbc:postgresql://CUSTOMER/storeclothing";
        String user = "postgres";
        String pwd = "0000";
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, pwd);
            System.out.println("Server :"+con.getMetaData().getURL());
        } catch (SQLException ex) {
            Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (con != null){
            System.out.println("Connection to postgresql successfully");
        }
        return con;
    }
}
