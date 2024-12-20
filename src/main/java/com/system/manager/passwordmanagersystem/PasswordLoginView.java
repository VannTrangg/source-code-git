package com.system.manager.passwordmanagersystem;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class PasswordLoginView extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label welcomeLabel = new Label("Greeting User!");
        welcomeLabel.setTextFill(Color.WHITE);
        welcomeLabel.setFont(Font.font("Arial", 36));
        welcomeLabel.setStyle("-fx-font-weight: bold;");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter your password");
        passwordField.setPrefSize(300, 40);
        passwordField.setMaxSize(300, 40);
        passwordField.setStyle("-fx-background-color: #2C2C2C; -fx-text-fill: white; -fx-prompt-text-fill: gray; -fx-border-color: #4CAF50; -fx-border-radius: 5px;");

        TextField usernameField = new TextField();
        usernameField.setPromptText("Enter your username");
        usernameField.setPrefSize(300, 40);
        usernameField.setMaxSize(300, 40);
        usernameField.setStyle("-fx-background-color: #2C2C2C; -fx-text-fill: white; -fx-prompt-text-fill: gray; -fx-border-color: #4CAF50; -fx-border-radius: 5px;");
        Button loginButton = new Button("Log in");
        loginButton.setPrefSize(95, 40);
        loginButton.setMaxSize(95, 40);
        loginButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 16px; -fx-cursor: hand; -fx-border-radius: 5px;");
        loginButton.setOnAction(e -> {
            String password = passwordField.getText();
            System.out.println("Password entered: " + password);
        });
        Hyperlink signupLink = new Hyperlink("Don't have an account?");
        signupLink.setTextFill(Color.LIGHTBLUE);
        signupLink.setFont(new Font("Arial", 16));
        signupLink.setOnAction(e -> {
            PasswordSignupView signupView = new PasswordSignupView();
            Stage signupStage = new Stage();
            signupView.start(signupStage);
            primaryStage.close();
        });
        VBox root = new VBox(20, welcomeLabel, usernameField, passwordField, loginButton, signupLink);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #292929; -fx-padding: 30px;");
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setTitle("Password Manager - Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
