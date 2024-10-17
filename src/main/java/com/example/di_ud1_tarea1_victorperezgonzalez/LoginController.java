package com.example.di_ud1_tarea1_victorperezgonzalez;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private Label warningText;
    @FXML
    private TextField user;
    @FXML
    private PasswordField passwrd;

    @FXML
    protected void signinButtonClick() {
        if (user.getText().isEmpty() || passwrd.getText().isEmpty()){
            warningText.setText("Complete All Fields");
        }
        else {
            warningText.setText("User Unknown");}
    }
}