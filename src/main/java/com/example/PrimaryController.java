package com.example;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class PrimaryController {

    @FXML
    private GridPane grid;


    public void startGame() {
        setField();
    }
    

    public void setField () {
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                Button btn = new Button(" ");
                btn.setMaxHeight(Double.MAX_VALUE);
                btn.setMaxWidth(Double.MAX_VALUE);
                btn.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event){
                        int x = GridPane.getRowIndex(btn);
                        int y = GridPane.getColumnIndex(btn);
                        PrimaryController.test(x,y);
                    }
                });
                grid.add(btn, i, j);
            }
        }
    }

    public static void test(int x, int y) {
        Model.placeButton(x, y);
    }
} 
