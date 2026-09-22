/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author JARGON
 */
public class User {

    private final SimpleIntegerProperty id = new SimpleIntegerProperty();
    private final SimpleStringProperty username = new SimpleStringProperty();
    private final SimpleStringProperty password = new SimpleStringProperty();
/////////////////////////////////////////////////////////

    public int getId() {
        return this.id.get();
    }

    public SimpleIntegerProperty idProperty() {
        return this.id;
    }

    public void setId(int id) {
        this.id.set(id);
    }
////////////////////////////////////////////////////////

    public String getUsername() {
        return this.username.get();
    }

    public SimpleStringProperty usernameProperty() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username.set(username);
    }
///////////////////////////////////////////////////////

    public String getPassword() {
        return this.password.get();
    }

    public SimpleStringProperty passwordProperty() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    @Override
    public String toString() {
        return "User{username=" + this.username + ", password=" + this.password + "}";
    }
}
