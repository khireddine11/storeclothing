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

/**
 *
 * @author JARGON
 */
public class sales2026 {

    private int _cashierid;
    private int _customerid;
    private double _totalprice;
    private LocalDate _saledate;
    // JavaFX properties initialized lazily
    private DoubleProperty totalprice;
    private IntegerProperty cashierid;
    private IntegerProperty customerid;
    // ObjectProperty wrapping the modern LocalDate API
    private ObjectProperty<LocalDate> saledate;

    public sales2026() {
    }

    public LocalDate getSaledate() {
        return _saledate;
    }

    public void setSaledate(LocalDate _saledate) {
        this._saledate = _saledate;
    }

    public int getCashierid() {
        return _cashierid;
    }

    public void setCashierid(int _cashierid) {
        this._cashierid = _cashierid;
    }

    public int getCustomerid() {
        return _customerid;
    }

    public void setCustomerid(int _customerid) {
        this._customerid = _customerid;
    }

    public double getTotalprice() {
        return _totalprice;
    }

    public void setTotalprice(double _totalprice) {
        this._totalprice = _totalprice;
    }

    public DoubleProperty getTotalprice_() {
        return totalprice;
    }

    public void setTotalprice(DoubleProperty totalprice) {
        this.totalprice = totalprice;
    }

    public IntegerProperty getCashierid_() {
        return cashierid;
    }

    public void setCashierid(IntegerProperty cashierid) {
        this.cashierid = cashierid;
    }

    public IntegerProperty getCustomerid_() {
        return customerid;
    }

    public void setCustomerid(IntegerProperty customerid) {
        this.customerid = customerid;
    }

    public ObjectProperty<LocalDate> getSaledate_() {
        return saledate;
    }

    public void setSaledate(ObjectProperty<LocalDate> saledate) {
        this.saledate = saledate;
    }

}
