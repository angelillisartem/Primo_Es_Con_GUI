package com.first.esgui;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private Label Login;
    @FXML
    private Label Register;
    @FXML
    private ChoiceBox choiceBox;

    @FXML
    protected void onLoginButtonClick() {
        Login.setText("Login non successo!");
        Register.setText(" ");
    }

    @FXML
    protected void onRegisterButtonClick() {
        Register.setText("Registrazione non successa!");
        Login.setText(" ");
    }

    @FXML
    protected void onChoiceBoxClick() {
        choiceBox.getItems().addAll("Anello", "Orecchino", "Bracciale");
    }

}