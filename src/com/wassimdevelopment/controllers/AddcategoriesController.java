/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.controllers;

import com.wassimdevelopment.daoimpl.CategoriesDaoImpl;
import com.wassimdevelopment.model.Categories;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

/**
 * FXML Controller class
 *
 * @author JARGON
 */
public class AddcategoriesController implements Initializable {

    @FXML
    private TableColumn<Categories, String> tbname;
    @FXML
    private TableColumn<Categories, String> tbdescription;
    @FXML
    private TableView<Categories> tbcategories;
    @FXML
    private TableColumn<Categories, Number> tbid;
    @FXML
    private TextField inputdes;

    @FXML
    private TextField inputname;
    
    CategoriesDaoImpl da = new CategoriesDaoImpl();
    ObservableList<Categories> category = FXCollections.observableArrayList();

    @FXML
    void addcategories(ActionEvent event) {
        Categories ca = new Categories(1,inputdes.getText().trim().toUpperCase(),inputname.getText().trim().toUpperCase());
        da.addCategories(ca);
        Alert al = new Alert(Alert.AlertType.CONFIRMATION, "Succes", ButtonType.NEXT);
        al.showAndWait();
        loadCategories();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        tbid.setCellValueFactory(new PropertyValueFactory<>("ID"));
//        tbname.setCellValueFactory(new PropertyValueFactory<>("productName"));
//        tbdescription.setCellValueFactory(new PropertyValueFactory<>("description"));
        tbid.setCellValueFactory(cellData -> cellData.getValue().getID());
        tbname.setCellValueFactory(cellData -> cellData.getValue().getProductName());
        tbdescription.setCellValueFactory(cellData -> cellData.getValue().getDescription());
        loadCategories();

    }

    public void loadCategories() {
        category.clear();
        tbcategories.setItems(this.category);
        category.addAll(da.getAllCategories());
    }

}
