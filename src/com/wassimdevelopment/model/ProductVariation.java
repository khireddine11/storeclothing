/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.model;

import javafx.beans.binding.Bindings;
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
public class ProductVariation {
    // Primitive backing fields for memory efficiency
//    private int _productid;
//    private String _size;
//    private String _color;
//    private String _barcode;
//    private double _sellPricing;
//    private int _qtyStock;
//    private double _subtotal;

    // JavaFX properties initialized lazily
    private IntegerProperty productid;
    private StringProperty size;
    private StringProperty color;
    private StringProperty barcode;
    private DoubleProperty sellPricing;
    private IntegerProperty qtyStock;
    private DoubleProperty subtotal;

    public ProductVariation() {
        this.size = new SimpleStringProperty("");
        this.barcode = new SimpleStringProperty();
        this.sellPricing = new SimpleDoubleProperty(0.0);
        this.qtyStock = new SimpleIntegerProperty(1);
        this.subtotal = new SimpleDoubleProperty(0.0);
        // Bind subtotal automatically: subtotal = qty * currentPrice
        subtotal.bind(Bindings.multiply(sellPricing, qtyStock));
    }

    public IntegerProperty getProductid() {
        return productid;
    }

    public void setProductid(IntegerProperty productid) {
        this.productid = productid;
    }

    public StringProperty getSize() {
        return size;
    }

    public String getSizePrimitive() {
        return size.get();
    }

    public void setSizePrimitive(String sizePrimitive) {
        this.size.set(sizePrimitive);
    }

    public void setSize(StringProperty size) {
        this.size = size;
    }

    public StringProperty getColor() {
        return color;
    }

    public void setColor(StringProperty color) {
        this.color = color;
    }

    public StringProperty getBarcode() {
        return barcode;
    }

    public String getBarcodePrimitive() {
        return barcode.get();
    }

    public void setBarcodePrimitive(String barcodePrimitive) {
        this.barcode.set(barcodePrimitive);
    }

    public void setBarcode(StringProperty barcode) {
        this.barcode = barcode;
    }

    public DoubleProperty getSellPricing() {
        return sellPricing;
    }

    public double getSellPricingPrimitive() {
        return sellPricing.get();
    }

    public void setSellPricingPrimitive(double sellPricingPrimitive) {
        this.sellPricing.set(sellPricingPrimitive);
    }

    public void setSellPricing(DoubleProperty sellPricing) {
        this.sellPricing = sellPricing;
    }

    public int getQtyStockPrimitive() {
        return qtyStock.get();
    }

    public void setQtyStockPrimitive(int qtyStock) {
        this.qtyStock.set(qtyStock);
    }

    public IntegerProperty getQtyStock() {
        return qtyStock;
    }

    public void setQtyStock(IntegerProperty qtyStock) {
        this.qtyStock = qtyStock;
    }

    public DoubleProperty getSubtotal() {
        return subtotal;
    }

    public double getSubtotalPrimitive() {
        return subtotal.get();
    }

    public void setSubtotalPremitive(double subtotal) {
        this.subtotal.set(subtotal);
    }

    public void setSubtotal(DoubleProperty subtotal) {
        this.subtotal = subtotal;
    }
    public double setPriceChanged (double oldValue,double newValue){
        if (newValue >= oldValue) {
            
            return 0;
        }
        return oldValue-newValue;
    }
    

    @Override
    public String toString() {
        return "ProductVariation{" +  ", size=" + getSizePrimitive() +  ", barcode=" + getBarcodePrimitive() + 
                ", sellPricing=" + getSellPricingPrimitive() + ", qtyStock=" + getQtyStockPrimitive() + ", subtotal=" + getSubtotalPrimitive() + '}';
    }

    

}
