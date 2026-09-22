/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.model;

import javafx.beans.property.StringProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author JARGON
 */
public class Categories {

//    // Primitive backing fields for memory efficiency
//    private String _description;
//    private String _productName;
//    private int _Id;

    public Categories(int _Id,String _description, String _productName) {
        this.description = new SimpleStringProperty(_description);
        this.productName = new SimpleStringProperty(_productName);
        this.ID =new SimpleIntegerProperty(_Id);
    }
    // JavaFX properties initialized lazily
    private StringProperty description ;
    private StringProperty productName;
    private IntegerProperty ID;

    public Categories(StringProperty description, StringProperty productName, IntegerProperty ID) {
        this.description = description;
        this.productName = productName;
        this.ID = ID;
    }

    public Categories() {
        
    }

    

    public StringProperty getDescription() {
        return description;
    }

    public String getDescriptionPrimitive() {
        return description.get();
    }

    public void setDescriptionPrimitive(String description) {
        this.description.set(description);
    }

    public void setDescription(StringProperty description) {
        this.description = description;
    }

    public StringProperty getProductName() {
        return productName;
    }

    public String getProductNamePrimitive() {
        return productName.get();
    }
    public void setProductName(String productName) {
        this.productName.set(productName);
    }

    public void setProductName(StringProperty productName) {
        this.productName = productName;
    }
    public int getIDPremitive() {
        return ID.get();
    }

    public IntegerProperty getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID.set(ID);
    }

    public void setID(IntegerProperty ID) {
        this.ID = ID;
    }

}
