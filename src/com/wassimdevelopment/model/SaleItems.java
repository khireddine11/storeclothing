/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.model;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
/**
 *
 * @author JARGON
 */
public class SaleItems {
   private IntegerProperty saleId;
   private StringProperty barcode;
   private IntegerProperty qty;
   private DoubleProperty unitPrice;

    public SaleItems() {
        this.saleId= new SimpleIntegerProperty(0);
        this.qty = new SimpleIntegerProperty(0);
        this.unitPrice= new SimpleDoubleProperty(0.0);
        this.barcode= new SimpleStringProperty("");
        
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

    public StringProperty getBarcode() {
        return barcode;
    }

    public void setBarcode(StringProperty barcode) {
        this.barcode = barcode;
    }
    public String getBarcodePrimitive() {
        return barcode.get();
    }

    public void setBarcode(String barcode) {
        this.barcode.set(barcode);
    }

    public IntegerProperty getQty() {
        return qty;
    }

    public void setQty(IntegerProperty qty) {
        this.qty = qty;
    }
    public int getQtyPrimitive() {
        return qty.get();
    }

    public void setQty(int qty) {
        this.qty.set(qty);
    }

    public DoubleProperty getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(DoubleProperty unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getUnitPricePrimitive() {
        return unitPrice.get();
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice .set(unitPrice);
    }
}
