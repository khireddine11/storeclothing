/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.model;

import java.time.LocalDate;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author JARGON
 */
public class Product {

    // Primitive backing fields for memory efficiency
    private int _categoryid;
    private String _productName;
    private boolean _isactive;
    private LocalDate _datecreated;
    private LocalDate _datemodified;

    // JavaFX properties initialized lazily
    private IntegerProperty categoryid;
    private StringProperty productName;
    private BooleanProperty isactive;
    // ObjectProperty wrapping the modern LocalDate API
    private ObjectProperty<LocalDate> datecreated;
    private ObjectProperty<LocalDate> datemodified;

    public Product() {
    }

    public int getId() {
        return _categoryid;
    }

    public void setId(int _id) {
        this._categoryid = _id;
    }

    public String getProductName() {
        return _productName;
    }

    public void setProductName(String _productName) {
        this._productName = _productName;
    }

    public IntegerProperty getId_() {
        return categoryid;
    }

    public void setId(IntegerProperty id) {
        this.categoryid = id;
    }

    public StringProperty getProductName_() {
        return productName;
    }

    public void setProductName(StringProperty productName) {
        this.productName = productName;
    }

    public boolean isIsactive() {
        return _isactive;
    }

    public void setIsactive(boolean _isactive) {
        this._isactive = _isactive;
    }

    public LocalDate getDatecreated() {
        return _datecreated;
    }

    public void setDatecreated(LocalDate _datecreated) {
        this._datecreated = _datecreated;
    }

    public LocalDate getDatemodified() {
        return _datemodified;
    }

    public void setDatemodified(LocalDate _datemodified) {
        this._datemodified = _datemodified;
    }

    public int getCategoryid() {
        return _categoryid;
    }

    public void setCategoryid(int _categoryid) {
        this._categoryid = _categoryid;
    }

    public IntegerProperty getCategoryid_() {
        return categoryid;
    }

    public void setCategoryid(IntegerProperty categoryid) {
        this.categoryid = categoryid;
    }

    public BooleanProperty getIsactive() {
        return isactive;
    }

    public void setIsactive(BooleanProperty isactive) {
        this.isactive = isactive;
    }

    public ObjectProperty<LocalDate> getDatecreated_() {
        return datecreated;
    }

    public void setDatecreated(ObjectProperty<LocalDate> datecreated) {
        this.datecreated = datecreated;
    }

    public ObjectProperty<LocalDate> getDatemodified_() {
        return datemodified;
    }

    public void setDatemodified(ObjectProperty<LocalDate> datemodified) {
        this.datemodified = datemodified;
    }

}
