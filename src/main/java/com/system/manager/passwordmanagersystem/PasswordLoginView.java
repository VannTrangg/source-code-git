package com.system.manager.passwordmanagersystem;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PasswordLoginView extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label welcomeLabel = new Label("Greeting User!");
        welcomeLabel.setTextFill(Color.BLACK);
        welcomeLabel.setFont(new Font("Tahoma", 50));
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter your password");
        passwordField.setPrefWidth(200);
        passwordField.setPrefHeight(30);
        passwordField.setPrefSize(200, 30);
        passwordField.setMaxSize(200, 30);

        Button loginButton = new Button("Đăng nhập");
        loginButton.setOnAction(e -> {
            String password = passwordField.getText();
            System.out.println("Password entered: " + password);
        });

        VBox root = new VBox(20, welcomeLabel, passwordField, loginButton);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #f5f5f5;");
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setTitle("Phần mềm quản lý mật khẩu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}