package com.first.esgui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class HelloController {
    @FXML
    private Label Login;

    @FXML
    protected void onNumber1ButtonClick() {
        Login.setText("Login non successo!");
    }

}