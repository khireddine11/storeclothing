/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.model;

import javafx.beans.property.StringProperty;

/**
 *
 * @author JARGON
 */
public class stores {
     private String _phone;
    private String _adress;
    private String _storename;

    // JavaFX properties initialized lazily
    private StringProperty phone;
    private StringProperty adress;
    private StringProperty storename;

    public stores() {
    }

    public String getStorename() {
        return _storename;
    }

    public void setStorename(String _storename) {
        this._storename = _storename;
    }

    public String getPhone() {
        return _phone;
    }

    public void setPhone(String _phone) {
        this._phone = _phone;
    }

    public String getAdress() {
        return _adress;
    }

    public void setAdress(String _adress) {
        this._adress = _adress;
    }

    public StringProperty getPhone_() {
        return phone;
    }

    public void setPhone(StringProperty phone) {
        this.phone = phone;
    }

    public StringProperty getAdress_() {
        return adress;
    }

    public void setAdress(StringProperty adress) {
        this.adress = adress;
    }

    public StringProperty getStorename_() {
        return storename;
    }

    public void setStorename(StringProperty storename) {
        this.storename = storename;
    }

}
