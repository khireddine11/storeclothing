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
public class inventory2026 {

    private int _qty;//-- Negative for sales, Positive for Stock-in
    private String _type;// 'INITIAL_STOCK', 'SALE', 'PURCHASE'
    private int _variationId;
    private LocalDate _movedate;

    // JavaFX properties initialized lazily
    private IntegerProperty qty;
    private StringProperty type;
    private IntegerProperty variationId;
    // ObjectProperty wrapping the modern LocalDate API
    private ObjectProperty<LocalDate> movdate;

    public inventory2026() {
    }

    public LocalDate getMovedate() {
        return _movedate;
    }

    public void setMovedate(LocalDate _movedate) {
        this._movedate = _movedate;
    }

    public int getQty() {
        return _qty;
    }

    public void setQty(int _qty) {
        this._qty = _qty;
    }

    public String getType() {
        return _type;
    }

    public void setType(String _type) {
        this._type = _type;
    }

    public int getVariationId() {
        return _variationId;
    }

    public void setVariationId(int _variationId) {
        this._variationId = _variationId;
    }

    public IntegerProperty getQty_() {
        return qty;
    }

    public void setQty(IntegerProperty qty) {
        this.qty = qty;
    }

    public StringProperty getType_() {
        return type;
    }

    public void setType(StringProperty type) {
        this.type = type;
    }

    public IntegerProperty getVariationId_() {
        return variationId;
    }

    public void setVariationId(IntegerProperty variationId) {
        this.variationId = variationId;
    }

    public ObjectProperty<LocalDate> getMovdate() {
        return movdate;
    }

    public void setMovdate(ObjectProperty<LocalDate> movdate) {
        this.movdate = movdate;
    }
}
