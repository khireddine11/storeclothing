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
public class versement {

    private int _creditid;
    private double _AmountPaid;
    String _PaymentMethod;//-- e.g., 'Cash', 'Check', 'Transfer

    // JavaFX properties initialized lazily
    private DoubleProperty AmountPaid;
    private IntegerProperty creditid;
    private StringProperty PaymentMethod;//-- e.g., 'Cash', 'Check', 'Transfer

}
