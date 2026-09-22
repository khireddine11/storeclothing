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
public class supplier {
    private double _currentbalance;
    private String _companyname;
    private String _contactperson;
    private String _phonenumber;

    // JavaFX properties initialized lazily
    private DoubleProperty currentbalance;
    private StringProperty companyname;
    private StringProperty phonenumber;
    private StringProperty contactperson;

    public double getCurrentbalance() {
        return _currentbalance;
    }

    public void setCurrentbalance(double _currentbalance) {
        this._currentbalance = _currentbalance;
    }

    public String getCompanyname() {
        return _companyname;
    }

    public void setCompanyname(String _companyname) {
        this._companyname = _companyname;
    }

    public String getContactperson() {
        return _contactperson;
    }

    public void setContactperson(String _contactperson) {
        this._contactperson = _contactperson;
    }

    public String getPhonenumber() {
        return _phonenumber;
    }

    public void setPhonenumber(String _phonenumber) {
        this._phonenumber = _phonenumber;
    }

    public DoubleProperty getCurrentbalance_() {
        return currentbalance;
    }

    public void setCurrentbalance(DoubleProperty currentbalance) {
        this.currentbalance = currentbalance;
    }

    public StringProperty getCompanyname_() {
        return companyname;
    }

    public void setCompanyname(StringProperty companyname) {
        this.companyname = companyname;
    }

    public StringProperty getPhonenumber_() {
        return phonenumber;
    }

    public void setPhonenumber(StringProperty phonenumber) {
        this.phonenumber = phonenumber;
    }

    public StringProperty getContactperson_() {
        return contactperson;
    }

    public void setContactperson(StringProperty contactperson) {
        this.contactperson = contactperson;
    }

}
