/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.model;

import javafx.beans.property.IntegerProperty;

/**
 *
 * @author JARGON
 */
public class storeinventory {
     private int _storeid;
     private int _productid;
    private int _stockqty;

    // JavaFX properties initialized lazily
    private IntegerProperty storeid;
    private IntegerProperty productid;
    private IntegerProperty stockqty;

    public storeinventory() {
    }

    public int getStoreid() {
        return _storeid;
    }

    public void setStoreid(int _storeid) {
        this._storeid = _storeid;
    }

    public int getProductid() {
        return _productid;
    }

    public void setProductid(int _productid) {
        this._productid = _productid;
    }

    public int getStockqty() {
        return _stockqty;
    }

    public void setStockqty(int _stockqty) {
        this._stockqty = _stockqty;
    }

    public IntegerProperty getStoreid_() {
        return storeid;
    }

    public void setStoreid(IntegerProperty storeid) {
        this.storeid = storeid;
    }

    public IntegerProperty getProductid_() {
        return productid;
    }

    public void setProductid(IntegerProperty productid) {
        this.productid = productid;
    }

    public IntegerProperty getStockqty_() {
        return stockqty;
    }

    public void setStockqty(IntegerProperty stockqty) {
        this.stockqty = stockqty;
    }

}
