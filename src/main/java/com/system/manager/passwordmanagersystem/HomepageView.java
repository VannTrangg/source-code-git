package com.system.manager.passwordmanagersystem;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class HomepageView extends PasswordLoginView {

    @Override
    public void start(Stage primaryStage) {
        Label welcomeLabel = new Label("Welcome Back!");
        welcomeLabel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #F5F5F5;");
        TableView<PasswordEntryModel> tableView = new TableView<>();
        TableColumn<PasswordEntryModel, String> col1 = new TableColumn<>("STT");
        col1.setPrefWidth(50);
        TableColumn<PasswordEntryModel, String> col2 = new TableColumn<>("Platform");
        col2.setPrefWidth(150);
        TableColumn<PasswordEntryModel, String> col3 = new TableColumn<>("URL");
        col3.setPrefWidth(150);
        TableColumn<PasswordEntryModel, String> col4 = new TableColumn<>("User");
        col4.setPrefWidth(150);
        TableColumn<PasswordEntryModel, String> col5 = new TableColumn<>("Password");
        col5.setPrefWidth(150);
        TableColumn<PasswordEntryModel, String> col6 = new TableColumn<>("Note");
        col6.setPrefWidth(150);
        TableColumn<PasswordEntryModel, Boolean> col7 = new TableColumn<>("Important Account");
        col7.setPrefWidth(150);
        tableView.getColumns().addAll(col1, col2, col3, col4, col5, col6, col7);
        tableView.setPrefSize(955, 400);
        tableView.setMaxSize(955, 400);
        tableView.setStyle("-fx-border-color: #f1f1f1; -fx-border-width: 1px;");

        Button btnAdd = new Button("Add");
        btnAdd.setPrefSize(60, 28);
        btnAdd.setMaxSize(60, 28);
        btnAdd.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 14px; -fx-cursor: hand;");

        Button btnDelete = new Button("Delete");
        btnDelete.setStyle("-fx-background-color: #F44336; -fx-text-fill: white; -fx-font-size: 14px; -fx-cursor: hand;");
        btnAdd.setOnAction(e -> addEntry());
        btnDelete.setOnAction(e -> deleteEntry(tableView));

        HBox buttonBox = new HBox(10, btnAdd, btnDelete);
        buttonBox.setAlignment(Pos.CENTER);

        VBox layout = new VBox(10, welcomeLabel, tableView, buttonBox);
        layout.setStyle("-fx-background-color: #292929;");
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 1000, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Password Manager");
        primaryStage.show();
    }
    private void addEntry() {
        System.out.println("Add Entry clicked.");
    }
    private void deleteEntry(TableView<PasswordEntryModel> tableView) {
        PasswordEntryModel selectedEntry = tableView.getSelectionModel().getSelectedItem();
        if (selectedEntry != null) {
            tableView.getItems().remove(selectedEntry);
            System.out.println("Entry deleted.");
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
