/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.model;

import java.time.LocalDate;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author JARGON
 */
public class cashsessions {
    private int _userid;
    private int _storeid;
    private double _openingbalance;
    private double _closingbalance;
    private double _expectedbalance;
    private double _defference;
    private String _status;//'open', 'closed') DEFAULT 'open',
    private LocalDate _openedat;
    private LocalDate _closedat;
    
    private IntegerProperty userid;
    private IntegerProperty storeid;
    private DoubleProperty openingbalance;
    private DoubleProperty closingbalance;
    private DoubleProperty expectedbalance;
    private DoubleProperty defference;
    private StringProperty status;
    // ObjectProperty wrapping the modern LocalDate API
    private ObjectProperty<LocalDate> openedat;
    private ObjectProperty<LocalDate> closedat;

    public cashsessions() {
    }

    public int getUserid() {
        return _userid;
    }

    public void setUserid(int _userid) {
        this._userid = _userid;
    }

    public int getStoreid() {
        return _storeid;
    }

    public void setStoreid(int _storeid) {
        this._storeid = _storeid;
    }

    public double getOpeningbalance() {
        return _openingbalance;
    }

    public void setOpeningbalance(double _openingbalance) {
        this._openingbalance = _openingbalance;
    }

    public double getClosingbalance() {
        return _closingbalance;
    }

    public void setClosingbalance(double _closingbalance) {
        this._closingbalance = _closingbalance;
    }

    public double getExpectedbalance() {
        return _expectedbalance;
    }

    public void setExpectedbalance(double _expectedbalance) {
        this._expectedbalance = _expectedbalance;
    }

    public double getDefference() {
        return _defference;
    }

    public void setDefference(double _defference) {
        this._defference = _defference;
    }

    public String getStatus() {
        return _status;
    }

    public void setStatus(String _status) {
        this._status = _status;
    }

    public LocalDate getOpenedat() {
        return _openedat;
    }

    public void setOpenedat(LocalDate _openedat) {
        this._openedat = _openedat;
    }

    public LocalDate getClosedat() {
        return _closedat;
    }

    public void setClosedat(LocalDate _closedat) {
        this._closedat = _closedat;
    }

    public IntegerProperty getUserid_() {
        return userid;
    }

    public void setUserid(IntegerProperty userid) {
        this.userid = userid;
    }

    public IntegerProperty getStoreid_() {
        return storeid;
    }

    public void setStoreid(IntegerProperty storeid) {
        this.storeid = storeid;
    }

    public DoubleProperty getOpeningbalance_() {
        return openingbalance;
    }

    public void setOpeningbalance(DoubleProperty openingbalance) {
        this.openingbalance = openingbalance;
    }

    public DoubleProperty getClosingbalance_() {
        return closingbalance;
    }

    public void setClosingbalance(DoubleProperty closingbalance) {
        this.closingbalance = closingbalance;
    }

    public DoubleProperty getExpectedbalance_() {
        return expectedbalance;
    }

    public void setExpectedbalance(DoubleProperty expectedbalance) {
        this.expectedbalance = expectedbalance;
    }

    public DoubleProperty getDefference_() {
        return defference;
    }

    public void setDefference(DoubleProperty defference) {
        this.defference = defference;
    }

    public StringProperty getStatus_() {
        return status;
    }

    public void setStatus(StringProperty status) {
        this.status = status;
    }

    public ObjectProperty<LocalDate> getOpenedat_() {
        return openedat;
    }

    public void setOpenedat(ObjectProperty<LocalDate> openedat) {
        this.openedat = openedat;
    }

    public ObjectProperty<LocalDate> getClosedat_() {
        return closedat;
    }

    public void setClosedat(ObjectProperty<LocalDate> closedat) {
        this.closedat = closedat;
    }
    
}
