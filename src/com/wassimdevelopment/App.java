/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wassimdevelopment;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author JARGON
 */
public class App extends Application {
   private static Scene scene;

    static void main(String[] args) {
       launch(args);
    }

   @Override
   public void start(Stage stage) throws IOException {
      Parent root = FXMLLoader.load(getClass().getResource("fxml/login.fxml"));
      stage.initStyle(StageStyle.UTILITY);
      scene = new Scene(root, 600.0D, 400.0D);
      stage.setScene(scene);
      stage.show();
   } 
}
