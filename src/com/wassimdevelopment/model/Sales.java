/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author JARGON
 */
public class Sales {

    private DoubleProperty totalAmount;
    private IntegerProperty cashierId;
    private IntegerProperty saleId;

    public Sales() {
        
        this.saleId= new SimpleIntegerProperty(0);
        this.cashierId = new SimpleIntegerProperty(0);
        this.totalAmount= new SimpleDoubleProperty(0.0);
    }

    public DoubleProperty getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(DoubleProperty totalAmount) {
        this.totalAmount = totalAmount;
    }
    public double getTotalAmountPrimitive() {
        return totalAmount.get();
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount.set(totalAmount);
    }

    public IntegerProperty getCashierId() {
        return cashierId;
    }

    public void setCashierId(IntegerProperty cashierId) {
        this.cashierId = cashierId;
    }
    public int getCashierIdPrimitive() {
        return cashierId.get();
    }

    public void setCashierId(int cashierId) {
        this.cashierId.set(cashierId);
    }

    public IntegerProperty getSaleId() {
        return saleId;
    }

    public void setSaleId(IntegerProperty saleId) {
        this.saleId = saleId;
    }
    public int getSaleIdPrimitive() {
        return saleId.get();
    }

    public void setSaleId(int saleId) {
        this.saleId.set(saleId);
    }
}
