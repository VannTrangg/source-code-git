package com.system.manager.passwordmanagersystem;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PasswordSignupView extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label welcomeLabel = new Label("Sign up for new account!");
        welcomeLabel.setTextFill(Color.BLACK);
        welcomeLabel.setFont(new Font("Tahoma", 40));

        TextField usernameField = new TextField();
        usernameField.setPromptText("Enter your username");
        usernameField.setPrefWidth(200);
        usernameField.setMaxSize(200, 30);

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter your password");
        passwordField.setPrefWidth(200);
        passwordField.setMaxSize(200, 30);

        Button signUpButton = new Button("Đăng ký");
        signUpButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            System.out.println("Username entered: " + username);
            System.out.println("Password entered: " + password);
        });
        VBox root = new VBox(20, welcomeLabel, usernameField, passwordField, signUpButton);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #f5f5f5;");
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setTitle("Phần mềm quản lí mật khẩu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
