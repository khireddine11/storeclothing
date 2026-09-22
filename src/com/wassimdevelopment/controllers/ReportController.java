/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wassimdevelopment.controllers;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.util.Duration;

/**
 *
 * @author JARGON
 */
public class ReportController implements Initializable {

//    @FXML
//    private Label dateLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        // Get the current date
//        //LocalDate today = LocalDate.now();
//
//        // Define a pattern (e.g., "dd/MM/yyyy" or "MMMM dd, yyyy")
//        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
//            dateLabel.setText("Daily Sales Report"+LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//        }), new KeyFrame(Duration.seconds(1)));
//
//        clock.setCycleCount(Timeline.INDEFINITE);
//        clock.play();
    }

}
