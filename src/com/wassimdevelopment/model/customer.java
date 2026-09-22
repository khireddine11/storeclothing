/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author JARGON
 */
public class customer {

    private double _currentbalance;
    private String _fullname;
    private String _phonenumber;
    private String _address;

    // JavaFX properties initialized lazily
    private DoubleProperty currentbalance;
    private StringProperty fullname;
    private StringProperty phonenumber;
    private StringProperty address;

    public double getCurrentbalance() {
        return _currentbalance;
    }

    public void setCurrentbalance(double _currentbalance) {
        this._currentbalance = _currentbalance;
    }

    public String getFullname() {
        return _fullname;
    }

    public void setFullname(String _fullname) {
        this._fullname = _fullname;
    }

    public String getPhonenumber() {
        return _phonenumber;
    }

    public void setPhonenumber(String _phonenumber) {
        this._phonenumber = _phonenumber;
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String _address) {
        this._address = _address;
    }

    public DoubleProperty getCurrentbalance_() {
        return currentbalance;
    }

    public void setCurrentbalance(DoubleProperty currentbalance) {
        this.currentbalance = currentbalance;
    }

    public StringProperty getFullname_() {
        return fullname;
    }

    public void setFullname(StringProperty fullname) {
        this.fullname = fullname;
    }

    public StringProperty getPhonenumber_() {
        return phonenumber;
    }

    public void setPhonenumber(StringProperty phonenumber) {
        this.phonenumber = phonenumber;
    }

    public StringProperty getAddress_() {
        return address;
    }

    public void setAddress(StringProperty address) {
        this.address = address;
    }
}
