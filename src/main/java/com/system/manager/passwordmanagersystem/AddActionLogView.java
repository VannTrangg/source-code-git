package com.system.manager.passwordmanagersystem;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class AddActionLogView extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label platformLabel = new Label("Platform:");
        platformLabel.setTextFill(Color.WHITE);
        platformLabel.setFont(Font.font("Arial", 13));
        Label urlLabel = new Label("URL:");
        urlLabel.setTextFill(Color.WHITE);
        urlLabel.setFont(Font.font("Arial", 13));
        Label usernameLabel = new Label("Username:");
        usernameLabel.setTextFill(Color.WHITE);
        usernameLabel.setFont(Font.font("Arial", 13));
        Label passwordLabel = new Label("Password:");
        passwordLabel.setTextFill(Color.WHITE);
        passwordLabel.setFont(Font.font("Arial", 13));
        Label noteLabel = new Label("Note:");
        noteLabel.setTextFill(Color.WHITE);
        noteLabel.setFont(Font.font("Arial", 13));
        CheckBox showImportantAccountCheckBox = new CheckBox("This is an important account");
        showImportantAccountCheckBox.setTextFill(Color.WHITE);
        showImportantAccountCheckBox.setFont(Font.font("Arial", 13));

        TextField platformField = new TextField();
        platformField.setPrefSize(200, 40);
        platformField.setMaxSize(200, 40);
        platformField.setStyle("-fx-background-color: #2C2C2C; -fx-text-fill: white; -fx-prompt-text-fill: gray; -fx-border-color: #4CAF50; -fx-border-radius: 5px;");

        TextField urlField = new TextField();
        urlField.setPrefSize(200, 40);
        urlField.setMaxSize(200, 40);
        urlField.setStyle("-fx-background-color: #2C2C2C; -fx-text-fill: white; -fx-prompt-text-fill: gray; -fx-border-color: #4CAF50; -fx-border-radius: 5px;");

        TextField usernameField = new TextField();
        usernameField.setPrefSize(200, 40);
        usernameField.setMaxSize(200, 40);
        usernameField.setStyle("-fx-background-color: #2C2C2C; -fx-text-fill: white; -fx-prompt-text-fill: gray; -fx-border-color: #4CAF50; -fx-border-radius: 5px;");

        PasswordField passwordField = new PasswordField();
        passwordField.setPrefSize(200, 40);
        passwordField.setMaxSize(200, 40);
        passwordField.setStyle("-fx-background-color: #2C2C2C; -fx-text-fill: white; -fx-prompt-text-fill: gray; -fx-border-color: #4CAF50; -fx-border-radius: 5px;");

        TextField noteField = new TextField();
        noteField.setPrefSize(200, 40);
        noteField.setMaxSize(200, 40);
        noteField.setStyle("-fx-background-color: #2C2C2C; -fx-text-fill: white; -fx-prompt-text-fill: gray; -fx-border-color: #4CAF50; -fx-border-radius: 5px;");

        Button addButton = new Button("Add");
        addButton.setPrefSize(70, 30);
        addButton.setMaxSize(70, 30);
        addButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 14px; -fx-border-radius: 5px; -fx-padding: 10px 20px;");
        addButton.setOnAction(e -> {
            String platform = platformField.getText();
            String url = urlField.getText();
            String username = usernameField.getText();
            String password = passwordField.getText();
            String note = noteField.getText();
            boolean isImportantAccountChecked = showImportantAccountCheckBox.isSelected();
            System.out.println("Added new password:");
            System.out.println("Platform: " + platform);
            System.out.println("URL: " + url);
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("Note: " + note);  // Print note as well
            System.out.println("Is Important Account: " + (isImportantAccountChecked ? "Yes" : "No"));
                });
        GridPane gridPane = new GridPane();
        gridPane.setHgap(15);
        gridPane.setVgap(15);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(platformLabel, 0, 0);
        gridPane.add(platformField, 1, 0);
        gridPane.add(urlLabel, 0, 1);
        gridPane.add(urlField, 1, 1);
        gridPane.add(usernameLabel, 0, 2);
        gridPane.add(usernameField, 1, 2);
        gridPane.add(passwordLabel, 0, 3);
        gridPane.add(passwordField, 1, 3);
        gridPane.add(noteLabel, 0, 4);
        gridPane.add(noteField, 1, 4);  // Add the note field to the layout
        gridPane.add(showImportantAccountCheckBox, 0, 5, 2, 1);  // Adding the checkbox
        HBox buttonBox = new HBox(20, addButton);
        buttonBox.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, gridPane, buttonBox);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #292929; -fx-padding: 30px;");
        Scene scene = new Scene(root, 500, 400); // Adjusted height to fit all fields
        primaryStage.setTitle("Password Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

