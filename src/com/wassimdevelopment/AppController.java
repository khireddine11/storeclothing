/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment;

import com.wassimdevelopment.model.LoggedUser;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Parent;

/**
 *
 * @author JARGON
 */
public class AppController implements Initializable {
    @FXML
    private Label dateLabel;
    @FXML
    private Label usernameLB;
    @FXML
    private Label reportsMenuLabel;

    @FXML
    private Label inventoryMenuLabel;

    @FXML
    private VBox saleMenu;

    @FXML
    private Label purchaseMenuLabel;

    @FXML
    private Label settingsMenuLabel;

    @FXML
    private VBox inventoryMenu;

    @FXML
    private VBox reportsMenu;

    @FXML
    private Label homeMenuLabel;

    @FXML
    private VBox posMenu;

    @FXML
    private VBox purchaseMenu;

    @FXML
    private Label saleMenuLabel;

//    @FXML
//    private VBox inventoryMenu1;

    @FXML
    private VBox settingsMenu;

    @FXML
    private VBox sideBar;

    @FXML
    private BorderPane appBorderPane;

    @FXML
    private AnchorPane animatedPane;

//    @FXML
//    private Label incomeMenuLabel;

    @FXML
    private HBox header;

    @FXML
    private Label posMenuLabel;

    @FXML
    private VBox homeMenu;
    @FXML
    private BorderPane border;

    @FXML
    void openPOS(MouseEvent event) throws IOException {
//        FXMLLoader root = new FXMLLoader(App.class.getResource("fxml/pos.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("fxml/pos.fxml"));
//        Scene scene = new Scene(root.load());
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
//        stage.setTitle("WD");
//        stage.setMaximized(true);
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openDashboard(MouseEvent event) {
        unfocusAllMenus();
        animateMenuFocus(160.0D, this.homeMenu, this.homeMenuLabel);
    }

    @FXML
    void openInventoryMenu(MouseEvent event) throws IOException {
         unfocusAllMenus();
         animateMenuFocus(160.0D, this.inventoryMenu, this.inventoryMenuLabel);
//         AnchorPane root = FXMLLoader.load(getClass().getResource("fxml/pos.fxml"));
//         border.setCenter(root);
         
    }

//    @FXML
//    void openIncomeMenu(MouseEvent event) throws IOException {
//        unfocusAllMenus();
//        animateMenuFocus(160.0D, this.inventoryMenu1, this.incomeMenuLabel);
//        Parent root = FXMLLoader.load(getClass().getResource("fxml/addcategories.fxml"));
//        Scene scene = new Scene(root);
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.show();
//    }

    @FXML
    void openSaleMenu(MouseEvent event) {
        unfocusAllMenus();
        animateMenuFocus(160.0D, this.saleMenu, this.saleMenuLabel);
    }

    @FXML
    void openPurchaseMenu(MouseEvent event) {
        unfocusAllMenus();
        animateMenuFocus(160.0D, this.purchaseMenu, this.purchaseMenuLabel);
    }

    @FXML
    void openReportsMenu(MouseEvent event) throws IOException {
        unfocusAllMenus();
        animateMenuFocus(505.0D, this.reportsMenu, this.reportsMenuLabel);
//        BorderPane root = FXMLLoader.load(getClass().getResource("fxml/income_menu.fxml"));
//        border.setCenter(root);
//        view.getChildren().add(root);
//        Scene scene = new Scene(root);
//        Stage stage = new Stage(StageStyle.UTILITY);
//        stage.initModality(Modality.APPLICATION_MODAL);
//        stage.setTitle("WD");
//        stage.setMaximized(true);
//        stage.setScene(scene);
//        stage.show();
    }

    @FXML
    void openSettingsMenu(MouseEvent event) {
        unfocusAllMenus();
        animateMenuFocus(595.0D, this.settingsMenu, this.settingsMenuLabel);
    }

    @FXML
    private Label aPayerValueLB_id;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.usernameLB.setText(LoggedUser.getInstance().getLoggedUser().getUsername());
        // Get the current date
        //LocalDate today = LocalDate.now();

        // Define a pattern (e.g., "dd/MM/yyyy" or "MMMM dd, yyyy")
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            dateLabel.setText("Daily Sales Report "+LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        }), new KeyFrame(Duration.seconds(1)));

        clock.setCycleCount(Timeline.INDEFINITE);
        clock.play();

    }

    public void unfocusAllMenus() {
        this.homeMenu.setStyle("-fx-background-color: transparent; -fx-background-radius: 8;");
        this.homeMenuLabel.setStyle("-fx-text-fill: #545454");
        this.inventoryMenu.setStyle("-fx-background-color: transparent; -fx-background-radius: 8;");
        this.inventoryMenuLabel.setStyle("-fx-text-fill: #545454");
        this.saleMenu.setStyle("-fx-background-color: transparent; -fx-background-radius: 8;");
        this.saleMenuLabel.setStyle("-fx-text-fill: #545454");
        this.purchaseMenu.setStyle("-fx-background-color: transparent; -fx-background-radius: 8;");
        this.purchaseMenuLabel.setStyle("-fx-text-fill: #545454");
//        this.inventoryMenu1.setStyle("-fx-background-color: transparent; -fx-background-radius: 8;");
//        this.incomeMenuLabel.setStyle("-fx-text-fill: #545454");
        this.reportsMenu.setStyle("-fx-background-color: transparent; -fx-background-radius: 8;");
        this.reportsMenuLabel.setStyle("-fx-text-fill: #545454");
        this.settingsMenu.setStyle("-fx-background-color: transparent; -fx-background-radius: 8;");
        this.settingsMenuLabel.setStyle("-fx-text-fill: #545454");
    }

    public void animateMenuFocus(double position, VBox menu, Label menuLabel) {
//        this.animatedPane.setVisible(true);
        Timeline timeline = new Timeline();
        KeyFrame end = new KeyFrame(Duration.seconds(0.25D), new KeyValue[]{new KeyValue(this.animatedPane.layoutYProperty(), position)});
        timeline.getKeyFrames().add(end);
        timeline.setOnFinished(event -> {
//            this.animatedPane.setVisible(false);
            menu.setStyle("-fx-background-color: #660ef4; -fx-background-radius: 8");
            menuLabel.setStyle("-fx-text-fill: #f8f3f3");
        });
        timeline.play();
    }

}
