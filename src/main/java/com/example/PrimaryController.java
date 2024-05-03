package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class PrimaryController {

    @FXML
    private GridPane grid;
    private Button btt;


    public void startGame() {
        
    }

    public void setField () {
        for (int i = 1; i <= 11; i++) {
            for (int j = 1; j <= 11; j++) {
                Button btn = new Button("");
                btn.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event){
                        PrimaryController.test();
                    }
                });
                grid.add(btn, i, j);
            }
        }
    }

    public static void test() {

    }
} 
