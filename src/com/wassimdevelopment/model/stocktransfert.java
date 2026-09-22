/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.model;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author JARGON
 */
public class stocktransfert {
    private int _sourcestoreid;
    private int _destinstoreid;
    private String _status;//'pending', 'in_transit', 'received', 'cancelled') DEFAULT 'pending'
    private int _createdby;
    private LocalDate _createdat;
    
    // ObjectProperty wrapping the modern LocalDate API
    private IntegerProperty sourcestoreid;
    private IntegerProperty destinstoreid;
    private IntegerProperty createdby;
    private StringProperty status;
    private ObjectProperty<LocalDate> createdat;

    public stocktransfert() {
    }

    public int getSourcestoreid() {
        return _sourcestoreid;
    }

    public void setSourcestoreid(int _sourcestoreid) {
        this._sourcestoreid = _sourcestoreid;
    }

    public int getDestinstoreid() {
        return _destinstoreid;
    }

    public void setDestinstoreid(int _destinstoreid) {
        this._destinstoreid = _destinstoreid;
    }

    public String getStatus() {
        return _status;
    }

    public void setStatus(String _status) {
        this._status = _status;
    }

    public int getCreatedby() {
        return _createdby;
    }

    public void setCreatedby(int _createdby) {
        this._createdby = _createdby;
    }

    public LocalDate getCreatedat() {
        return _createdat;
    }

    public void setCreatedat(LocalDate _createdat) {
        this._createdat = _createdat;
    }

    public IntegerProperty getSourcestoreid_() {
        return sourcestoreid;
    }

    public void setSourcestoreid(IntegerProperty sourcestoreid) {
        this.sourcestoreid = sourcestoreid;
    }

    public IntegerProperty getDestinstoreid_() {
        return destinstoreid;
    }

    public void setDestinstoreid(IntegerProperty destinstoreid) {
        this.destinstoreid = destinstoreid;
    }

    public IntegerProperty getCreatedby_() {
        return createdby;
    }

    public void setCreatedby(IntegerProperty createdby) {
        this.createdby = createdby;
    }

    public StringProperty getStatus_() {
        return status;
    }

    public void setStatus(StringProperty status) {
        this.status = status;
    }

    public ObjectProperty<LocalDate> getCreatedat_() {
        return createdat;
    }

    public void setCreatedat(ObjectProperty<LocalDate> createdat) {
        this.createdat = createdat;
    }
}
