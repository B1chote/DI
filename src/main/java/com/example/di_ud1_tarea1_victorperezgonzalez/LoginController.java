package com.example.di_ud1_tarea1_victorperezgonzalez;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private Label warningText;
    @FXML
    private TextField userField;
    @FXML
    private PasswordField passwrdField;

    @FXML
    protected void signinButtonClick() {
        if (userField.getText().isEmpty() || passwrdField.getText().isEmpty()){
            warningText.setText("Complete All Fields");
        }
        else {
            warningText.setText("User Unknown");}
    }
}