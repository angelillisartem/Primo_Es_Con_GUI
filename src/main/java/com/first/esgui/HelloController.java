package com.first.esgui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label number1;
    @FXML
    private Label number2;

    @FXML
    protected void onNumber1ButtonClick() {
        number1.setText("Si!");
    }

    @FXML
    protected void onNumber2ButtonCLick() {
        number2.setText("No!");
    }
}