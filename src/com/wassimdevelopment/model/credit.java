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
public class credit {
    private int _Entityid;//NOT NULL, -- Links to CustomerID or SupplierID based on EntityType
    private String _type;// CHECK (EntityType IN ('Customer', 'Supplier'))
    private String _notes;
    private double _totalprice;
    private double _RemainingAmount;
    
     private IntegerProperty Entityid;//NOT NULL, -- Links to CustomerID or SupplierID based on EntityType
    private StringProperty type;// CHECK (EntityType IN ('Customer', 'Supplier'))
    private StringProperty notes;
    private DoubleProperty totalprice;
    private DoubleProperty RemainingAmount;
    
}
