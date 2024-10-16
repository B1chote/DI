package com.example.di_ud1_tarea1_victorperezgonzalez;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginApplication.class.getResource("LoginView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 616, 396);
        stage.setTitle("Log In");
        stage.setScene(scene);
        stage.setMinWidth(500);
        stage.setMinHeight(350);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}