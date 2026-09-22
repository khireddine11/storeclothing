/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.controllers;

import com.wassimdevelopment.model.Product;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 *
 * @author JARGON
 */
public class ProductController implements Initializable {

    @FXML
    private TableView<Product> variantTable;
    @FXML
    private TableColumn<Product, String> colSku;
    @FXML
    private TableColumn<Product, String> colname;
    @FXML
    private TableColumn<Product, Double> colStock;
    @FXML
    private TableColumn<Product, String> coldes;
    Product pr = new Product();
    private final ObservableList<Product> variantData = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        // 1. Link columns to Variant properties
//        colSku.setCellValueFactory(cellData -> cellData.getValue().getProductName_());
//        colname.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
//        // colStock.setCellValueFactory(cellData -> cellData.getValue().alertQtyProperty());
//        coldes.setCellValueFactory(cellData -> cellData.getValue().referenceProperty());
//        // 2. Bind the list to the table
//        variantTable.setItems(variantData);
//        // Add some dummy data to start
//        variantData.add(new Product(pr.skuProperty(), pr.nameProperty(), pr.alertQtyProperty(), pr.referenceProperty()));
    }
}
