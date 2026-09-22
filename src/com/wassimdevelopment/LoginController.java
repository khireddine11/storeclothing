/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment;

import com.wassimdevelopment.daoimpl.UserDaoImpl;
import com.wassimdevelopment.model.LoggedUser;
import com.wassimdevelopment.model.User;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author JARGON
 */
public class LoginController implements Initializable {

    @FXML
    private PasswordField passTF;
    @FXML
    private ComboBox<String> nomComboBox;
    @FXML
    private Label loginErrorMsg;
    private final UserDaoImpl db = new UserDaoImpl();
    private User user;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Platform.runLater(this::enterKeyListener);
    }
public void enterKeyListener() {
      Stage stage = (Stage)this.passTF.getScene().getWindow();
      stage.addEventFilter(KeyEvent.KEY_RELEASED, (keyEvent) -> {
         if (keyEvent.getCode() == KeyCode.ENTER) {
             try {
                 this.login();
             } catch (IOException ex) {
                 Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
             }
         }

      });
   }
@FXML
    private void login() throws IOException {
        if (this.checkCredentials()) {
         this.openStage();
      }
    }

    private boolean checkCredentials() {
         this.user = this.db.userCredentialsCheck(this.nomComboBox.getValue(), this.passTF.getText());
      if (this.user != null) {
         LoggedUser loggedUser = LoggedUser.getInstance();
         loggedUser.setLoggedUser(this.user);
         return true;
      } else {
         this.loginErrorMsg.setVisible(true);
         return false;
      }
    }

    private void openStage() throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("fxml/main_app_hbox.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("WD");
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
        this.closeLoginStage();
    }

    private void closeLoginStage() {
         Stage stage = (Stage)this.passTF.getScene().getWindow();
         stage.close();
    }
}
