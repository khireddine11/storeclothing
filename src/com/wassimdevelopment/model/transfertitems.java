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
public class transfertitems {
     private int _transfertid;
     private int _productid;
    private int _qty;

    // JavaFX properties initialized lazily
    private IntegerProperty transfertid;
    private IntegerProperty productid;
    private IntegerProperty qty;

    public transfertitems() {
    }

    public int getTransfertid() {
        return _transfertid;
    }

    public void setTransfertid(int _transfertid) {
        this._transfertid = _transfertid;
    }

    public int getProductid() {
        return _productid;
    }

    public void setProductid(int _productid) {
        this._productid = _productid;
    }

    public int getQty() {
        return _qty;
    }

    public void setQty(int _qty) {
        this._qty = _qty;
    }

    public IntegerProperty getTransfertid_() {
        return transfertid;
    }

    public void setTransfertid(IntegerProperty transfertid) {
        this.transfertid = transfertid;
    }

    public IntegerProperty getProductid_() {
        return productid;
    }

    public void setProductid(IntegerProperty productid) {
        this.productid = productid;
    }

    public IntegerProperty getQty_() {
        return qty;
    }

    public void setQty(IntegerProperty qty) {
        this.qty = qty;
    }
}
