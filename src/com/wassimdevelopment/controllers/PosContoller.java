package com.wassimdevelopment.controllers;

import com.wassimdevelopment.daoimpl.ProductVariationDaoImpl;
import com.wassimdevelopment.daoimpl.SaleDaoImpl;
import com.wassimdevelopment.daoimpl.SaleItemsDaoimpl;
import com.wassimdevelopment.model.LoggedUser;
import com.wassimdevelopment.model.ProductVariation;
import com.wassimdevelopment.model.SaleItems;
import com.wassimdevelopment.model.Sales;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.control.TableCell;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.IntegerStringConverter;

public class PosContoller implements Initializable {

    @FXML
    private Label Lignes;
    @FXML
    private Label Discount;
    @FXML
    private Label Cashier;
    @FXML
    private TableView<ProductVariation> DailySales;
    @FXML
    private TableColumn<ProductVariation, String> SizeColor;

    @FXML
    private TableColumn<ProductVariation, Double> price;

    @FXML
    private TableColumn<ProductVariation, Number> subtotal;

    @FXML
    private TableColumn<ProductVariation, Integer> qty;
    @FXML
    private TableColumn<ProductVariation, String> delete;
    private final SaleItems saleItems = new SaleItems();
    private final SaleItemsDaoimpl saleItemsDaoimpl = new SaleItemsDaoimpl();
    private final Sales sales = new Sales();
    private final SaleDaoImpl saleDaoImpl = new SaleDaoImpl();
    @FXML
    private Label grandTotalLabel;
    private double totalDiscounts = 0.0;
    ProductVariationDaoImpl productVariationDaoImpl;
    ProductVariation productVariation = new ProductVariation();
    ObservableList<ProductVariation> observableList;
    @FXML
    TextField returnProductTF;

    public PosContoller() {
        this.observableList = FXCollections.observableArrayList();
        // Keeps the list alive to property changes inside the items
        this.observableList = FXCollections.observableArrayList(item -> new Observable[]{item.getSubtotal()});
        this.productVariationDaoImpl = new ProductVariationDaoImpl();
    }

    @Override
    public void initialize(URL url, ResourceBundle bundle) {
        this.Cashier.setText(LoggedUser.getInstance().getLoggedUser().getUsername());
        returnProductTF.requestFocus();
        price.setOnEditCommit(event -> {
            // Get the new value entered by the user
            Double newValue = event.getNewValue();

            // Get the specific object associated with the row being edited
            ProductVariation product = event.getRowValue();
            double sellPricingPrimitive = product.getSellPricingPrimitive();
            if (newValue > sellPricingPrimitive) {
                return;
            }

            Double discountAmount = product.setPriceChanged(sellPricingPrimitive, newValue);
            totalDiscounts += discountAmount;
            String valueOf = String.valueOf(totalDiscounts);
            Discount.setText(valueOf);
            product.setSellPricingPrimitive(newValue);
            System.out.println("Price updated to: " + newValue + " " + observableList.size());
        }
        );
        // Listen for list adjustments and ensure bindings stay updated
        observableList.addListener((ListChangeListener<ProductVariation>) change -> {
            setupTotalBinding();
        });
        initPOSTableView();
        setupTotalBinding();
    }

    public void initPOSTableView() {
        SizeColor.setCellValueFactory(cellData -> cellData.getValue().getSize());
        price.setCellValueFactory(cellData -> cellData.getValue().getSellPricing().asObject());
        qty.setCellValueFactory(cellData -> cellData.getValue().getQtyStock().asObject());
        subtotal.setCellValueFactory(cellData -> cellData.getValue().getSubtotal());

        DailySales.setEditable(true);

        // Editable Quantity Column
        this.qty.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));

        // Editable Price Column with clean decimal formatting handled safely
        this.price.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));

        // Delete Column Button Factory
        this.delete.setCellFactory(param -> new DeleteButtonCell());

        this.DailySales.setItems(this.observableList);
        
        
    }

    @FXML
    void returnProduct(KeyEvent keyEvent) {
        if (keyEvent.getCode().equals(KeyCode.ENTER)) {
            String barcode = this.returnProductTF.getText().trim().replaceAll(" ", "");

            if (!barcode.isEmpty()) {
                ProductVariation scannedProduct = productVariationDaoImpl.getProduct(barcode);

                if (scannedProduct != null && scannedProduct.getQtyStockPrimitive() > 0 && scannedProduct.getSellPricingPrimitive() != 0) {
                    updatePosItemObject(barcode);
                } else {
                    showStockAlert(scannedProduct, barcode);
                }
            }
            this.returnProductTF.clear();
        }
    }
    // CHECK TOMORROW

    public void updatePosItemObject(String barecode) {
        if (this.checkItemExists(barecode)) {
            Iterator var2 = this.observableList.iterator();

            while (var2.hasNext()) {
                productVariation = (ProductVariation) var2.next();
                if (productVariation.getBarcodePrimitive().equals(barecode)) {
                    ProductVariation qtyDataBase = productVariationDaoImpl.getProduct(barecode);
                    int qtyStockPrimitive = qtyDataBase.getQtyStockPrimitive();
                    if (productVariation.getQtyStockPrimitive() + 1 <= qtyStockPrimitive) {
                        System.out.println("aty.getQtyStockPrimitive();" + qtyStockPrimitive);
                        productVariation.setQtyStockPrimitive(productVariation.getQtyStockPrimitive() + 1);
                        nbrofLigne();
                    } else {
                        Alert existsAlert = new Alert(AlertType.INFORMATION);
                        existsAlert.setTitle("Notification");
                        existsAlert.setHeaderText("The stock is low and we can’t add another item!");
                        existsAlert.setContentText(" Please verify the inventory and try again!");
                        existsAlert.show();
                    }
                }
            }
        } else {
            ProductVariation newItem = productVariationDaoImpl.getProduct(barecode);
            newItem.setSizePrimitive(newItem.getSizePrimitive());
            newItem.setBarcodePrimitive(barecode);
            newItem.setSellPricingPrimitive(newItem.getSellPricingPrimitive());
            newItem.setQtyStockPrimitive(1);
            this.observableList.add(newItem);
            DailySales.setItems(observableList);
            nbrofLigne();
            System.out.println("NEW list de product Class" + productVariation.toString());
        }

    }

    /**
     * This methode offer the help for check an existing item in observablelist
     *
     * @param barCode
     * @return boolean
     */
    public boolean checkItemExists(String barCode) {
        boolean exists = false;
        Iterator var3 = this.observableList.iterator();

        while (var3.hasNext()) {
            ProductVariation p = (ProductVariation) var3.next();
            if (p.getBarcodePrimitive().equals(barCode)) {
                exists = true;
                break;
            }
        }

        return exists;
    }

    private void showAlert(String title, String header, String content) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.show();
    }

    private void showStockAlert(ProductVariation product, String barcode) {
        if (product == null || product.getBarcodePrimitive() == null) {
            showAlert("Alert", "Product '" + barcode + "' is not available", "Please verify the inventory and try again!");
        } else {
            showAlert("Notification", "Stock épuisé pour : " + product.getSizePrimitive(), "Please verify the inventory and try again!");
        }
    }

    @FXML
    void addtoCard(ActionEvent event) {
        // 1. Construct a simulated JavaFX KeyEvent for the ENTER key

        KeyEvent simulatedEnterKey = new KeyEvent(
                KeyEvent.KEY_PRESSED, // Event Type
                "", // Character text string (empty is fine)
                "", // Text description
                KeyCode.ENTER, // The precise KeyCode your getProduct method looks for
                false, false, false, false // Modifier flags (Shift, Ctrl, Alt, Meta set to false)
        );

        // 2. Pass the simulated event straight into your original method manually
        returnProduct(simulatedEnterKey);
    }

    //  Inner Class for Delete Action
    private class DeleteButtonCell extends TableCell<ProductVariation, String> {

        private final Button deleteButton = new Button("Delete");

        public DeleteButtonCell() {
            deleteButton.setStyle("-fx-background-color: #d9534f; -fx-text-fill: white; -fx-font-weight: bold;");
            deleteButton.setOnAction(event -> {
                ProductVariation item = getTableView().getItems().get(getIndex());
                observableList.remove(item); // Targets list context directly
                nbrofLigne();
            });
        }

        @Override
        protected void updateItem(String item, boolean empty) {
            super.updateItem(item, empty);
            setGraphic(empty ? null : deleteButton);
        }
    }

    public void setupTotalBinding() {
        DoubleBinding grandTotalBinding = Bindings.createDoubleBinding(
                () -> observableList.stream().mapToDouble(ProductVariation::getSubtotalPrimitive).sum(),
                observableList // Re-evaluate whenever the cartData list fires an update
        );

        // Bind the label text directly to the math expression
        grandTotalLabel.textProperty().bind(
                Bindings.concat(grandTotalBinding.get())
        //                Bindings.concat(String.format("%.2f", grandTotalBinding.get()))
        );
    }

    @FXML
    private void addRecieptItems(ActionEvent event) {

        if (!observableList.isEmpty()) {
            sales.setCashierId(1);
            sales.setTotalAmount(Double.parseDouble(grandTotalLabel.getText()));
            saleDaoImpl.addRecieptItems(sales);
            Iterator itera = this.observableList.iterator();

            while (itera.hasNext()) {
                ProductVariation p = (ProductVariation) itera.next();
                this.saleItems.setSaleId(sales.getSaleIdPrimitive());
                this.saleItems.setBarcode(p.getBarcodePrimitive());
                this.saleItems.setQty(p.getQtyStockPrimitive());
                this.saleItems.setUnitPrice(p.getSellPricingPrimitive());
                this.saleItemsDaoimpl.addRecieptItems(this.saleItems);
                
            }
            observableList.clear();
            Discount.setText("0.0");
            Lignes.setText("0");
            returnProductTF.requestFocus();
        }

    }
    private void nbrofLigne(){
        int size = observableList.size();
            String valueOf1 = String.valueOf(size);
            Lignes.setText(valueOf1);
    }

}
/*
------------------------------------------------------------------------------get value ----------------------------------------------------------------------------------
To capture the new value after a user edits a cell in a JavaFX `TableView`, you need to attach an **`setOnEditCommit`** event handler to your `TableColumn`.

When a user finishes editing a `TextFieldTableCell`, the table column fires an edit commit event. If you don't handle this event, the internal data model
 (your underlying list) won't actually update.

Here is how you can implement it:

### The Solution

Assuming your table uses a custom class (let's call it `Product`), you need to update that specific item's property when the edit is committed.

```java
// 1. Set up your cell factory as you already have
this.price.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));

// 2. Handle the value change
this.price.setOnEditCommit(event -> {
    // Get the new value entered by the user
    Double newValue = event.getNewValue();
    
    // Get the specific object associated with the row being edited
    Product product = event.getRowValue();
    
    // Update your data model
    product.setPrice(newValue);
    
    System.out.println("Price updated to: " + newValue);
});

```

---

### ⚠️ Crucial Step: Make the Table Editable

For any of this to work, ensure you have explicitly made both the `TableView` and the column editable somewhere in your setup code:

```java
myTableView.setEditable(true);
price.setEditable(true);

```

### How It Works Behind the Scenes

* `event.getNewValue()`: Automatically parses the string from the text field back into a `Double` using the `DoubleStringConverter` you provided.
* `event.getRowValue()`: Grabs the actual object backing that specific row, so you don't have to hunt down index numbers manually.
 */
