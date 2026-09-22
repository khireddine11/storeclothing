/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.model;

/**
 *
 * @author JARGON
 */
public class LoggedUser {

    private static LoggedUser instance;
    private User loggedInUser = new User();

    private LoggedUser() {
    }

    public static LoggedUser getInstance() {
        if (instance == null) {
            instance = new LoggedUser();
        }

        return instance;
    }

    public void setLoggedUser(User loggedUser) {
        this.loggedInUser = loggedUser;
    }

    public User getLoggedUser() {
        return this.loggedInUser;
    }
}
