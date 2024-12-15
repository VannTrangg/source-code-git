package com.system.manager.passwordmanagersystem;

import com.system.manager.passwordmanagersystem.PasswordLoginView;
import com.system.manager.passwordmanagersystem.PasswordEntryModel;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class HomepageView extends PasswordLoginView{
    @Override
    public void start(Stage primaryStage) {
        Label welcomeLabel = new Label("Welcome Back!");
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
        tableView.getColumns().addAll(col1, col2, col3, col4, col5);
        tableView.setPrefSize(655, 300);
        tableView.setMaxSize(655, 300);
        Button btnAdd = new Button("Thêm mới");
        Button btnDelete = new Button("Xoá");

        btnAdd.setOnAction(e -> addEntry());
        btnDelete.setOnAction(e -> deleteEntry(tableView));
        HBox buttonBox = new HBox(10, btnAdd, btnDelete);
        VBox layout = new VBox(10, welcomeLabel, tableView, buttonBox);
        layout.setStyle("-fx-padding: 10; -fx-alignment: center;");
        Scene scene = new Scene(layout, 700, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Password Manager");
        primaryStage.show();
    }
    private void addEntry() {
    }
    private void editEntry(TableView<PasswordEntryModel> tableView) {
        PasswordEntryModel selectedEntry = tableView.getSelectionModel().getSelectedItem();
        if (selectedEntry != null) {
        }
    }
    private void deleteEntry(TableView<PasswordEntryModel> tableView) {
        PasswordEntryModel selectedEntry = tableView.getSelectionModel().getSelectedItem();
        if (selectedEntry != null) {
            tableView.getItems().remove(selectedEntry);
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}