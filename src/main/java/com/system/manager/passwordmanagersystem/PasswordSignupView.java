package com.system.manager.passwordmanagersystem;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class PasswordSignupView extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label welcomeLabel = new Label("Create Your New Account");
        welcomeLabel.setTextFill(Color.WHITE);
        welcomeLabel.setFont(new Font("Arial Bold", 26));

        TextField usernameField = new TextField();
        usernameField.setPromptText("Enter your username");
        usernameField.setPrefSize(350, 40);
        usernameField.setMaxSize(350, 40);
        usernameField.setStyle("-fx-background-color: #2C2C2C; -fx-text-fill: white; -fx-prompt-text-fill: gray; -fx-border-color: #4CAF50; -fx-border-radius: 5px;");

        TextField emailField = new TextField();
        emailField.setPromptText("Enter your email");
        emailField.setPrefSize(350, 40);
        emailField.setMaxSize(350, 40);
        emailField.setStyle("-fx-background-color: #2C2C2C; -fx-text-fill: white; -fx-prompt-text-fill: gray; -fx-border-color: #4CAF50; -fx-border-radius: 5px;");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter your password");
        passwordField.setPrefSize(350, 40);
        passwordField.setMaxSize(350, 40);
        passwordField.setStyle("-fx-background-color: #2C2C2C; -fx-text-fill: white; -fx-prompt-text-fill: gray; -fx-border-color: #4CAF50; -fx-border-radius: 5px;");

        PasswordField confirmPasswordField = new PasswordField();
        confirmPasswordField.setPromptText("Confirm your password");
        confirmPasswordField.setPrefSize(350, 40);
        confirmPasswordField.setMaxSize(350, 40);
        confirmPasswordField.setStyle("-fx-background-color: #2C2C2C; -fx-text-fill: white; -fx-prompt-text-fill: gray; -fx-border-color: #4CAF50; -fx-border-radius: 5px;");

        Button signUpButton = new Button("Sign up");
        signUpButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 16px; -fx-cursor: hand; -fx-border-radius: 5px;");
        signUpButton.setPrefSize(100, 40);
        signUpButton.setMaxSize(100, 40);

        Label feedbackLabel = new Label();
        feedbackLabel.setTextFill(Color.RED);
        feedbackLabel.setStyle("-fx-font-size: 14px;");
        Hyperlink loginLink = new Hyperlink("Already have an account?");
        loginLink.setTextFill(Color.LIGHTBLUE);
        loginLink.setFont(new Font("Arial", 16));
        loginLink.setOnAction(e -> {
            PasswordLoginView loginView = new PasswordLoginView();
            Stage loginStage = new Stage();
            loginView.start(loginStage);
            primaryStage.close(); // Close current signup window
        });
        signUpButton.setOnAction(e -> {
            String username = usernameField.getText();
            String email = emailField.getText();
            String password = passwordField.getText();
            String confirmPassword = confirmPasswordField.getText();
            if (username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                feedbackLabel.setText("All fields are required!");
            } else if (!password.equals(confirmPassword)) {
                feedbackLabel.setText("Passwords do not match!");
            } else {
                feedbackLabel.setTextFill(Color.GREEN);
                feedbackLabel.setText("Sign-up successful!");
                System.out.println("Username: " + username);
                System.out.println("Email: " + email);
                System.out.println("Password: " + password);
            }
        });
        VBox root = new VBox(15, welcomeLabel, usernameField, emailField, passwordField, confirmPasswordField, signUpButton, feedbackLabel, loginLink);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #292929; -fx-padding: 30;");
        Scene scene = new Scene(root, 650, 500);
        primaryStage.setTitle("Password Manager - Sign up");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
