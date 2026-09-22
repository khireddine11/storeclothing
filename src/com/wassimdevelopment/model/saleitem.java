/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author JARGON
 */
public class saleitem {
     private int _qty;
    private double _unitprice;
    private String _barcode;
    private int _saleId;

    // JavaFX properties initialized lazily
    private DoubleProperty unitprice;
    private IntegerProperty qty;
    private StringProperty barcode;
    private IntegerProperty saleId;

    public int getQty() {
        return _qty;
    }

    public void setQty(int _qty) {
        this._qty = _qty;
    }

    public double getUnitprice() {
        return _unitprice;
    }

    public void setUnitprice(double _unitprice) {
        this._unitprice = _unitprice;
    }

    public String getBarcode() {
        return _barcode;
    }

    public void setBarcode(String _barcode) {
        this._barcode = _barcode;
    }

    public int getSaleId() {
        return _saleId;
    }

    public void setSaleId(int _saleId) {
        this._saleId = _saleId;
    }

    public DoubleProperty getUnitprice_() {
        return unitprice;
    }

    public void setUnitprice(DoubleProperty unitprice) {
        this.unitprice = unitprice;
    }

    public IntegerProperty getQty_() {
        return qty;
    }

    public void setQty(IntegerProperty qty) {
        this.qty = qty;
    }

    public StringProperty getBarcode_() {
        return barcode;
    }

    public void setBarcode(StringProperty barcode) {
        this.barcode = barcode;
    }

    public IntegerProperty getSaleId_() {
        return saleId;
    }

    public void setSaleId(IntegerProperty saleId) {
        this.saleId = saleId;
    }
}
