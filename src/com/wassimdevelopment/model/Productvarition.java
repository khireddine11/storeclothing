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
public class Productvarition {

    // Primitive backing fields for memory efficiency
    private int _qty;
    private double _sellingprice;
    private String _size;
    private String _color;
    private String _barcode;
    private int _productId;

    // JavaFX properties initialized lazily
    private DoubleProperty sellingprice;
    private IntegerProperty qty;
    private StringProperty description;
    private StringProperty size;
    private StringProperty barcode;
    private StringProperty color;
    private IntegerProperty productId;

    public int getQty() {
        return _qty;
    }

    public void setQty(int _qty) {
        this._qty = _qty;
    }

    public double getSellingprice() {
        return _sellingprice;
    }

    public void setSellingprice(double _sellingprice) {
        this._sellingprice = _sellingprice;
    }

    public String getSize() {
        return _size;
    }

    public void setSize(String _size) {
        this._size = _size;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String _color) {
        this._color = _color;
    }

    public String getBarcode() {
        return _barcode;
    }

    public void setBarcode(String _barcode) {
        this._barcode = _barcode;
    }

    public int getProductId() {
        return _productId;
    }

    public void setProductId(int _productId) {
        this._productId = _productId;
    }

    public DoubleProperty getSellingprice_() {
        return sellingprice;
    }

    public void setSellingprice(DoubleProperty sellingprice) {
        this.sellingprice = sellingprice;
    }

    public IntegerProperty getQty_() {
        return qty;
    }

    public void setQty(IntegerProperty qty) {
        this.qty = qty;
    }

    public StringProperty getDescription() {
        return description;
    }

    public void setDescription(StringProperty description) {
        this.description = description;
    }

    public StringProperty getSize_() {
        return size;
    }

    public void setSize(StringProperty size) {
        this.size = size;
    }

    public StringProperty getBarcode_() {
        return barcode;
    }

    public void setBarcode(StringProperty barcode) {
        this.barcode = barcode;
    }

    public StringProperty getColor_() {
        return color;
    }

    public void setColor(StringProperty color) {
        this.color = color;
    }

    public IntegerProperty getProductId_() {
        return productId;
    }

    public void setProductId(IntegerProperty productId) {
        this.productId = productId;
    }
}
