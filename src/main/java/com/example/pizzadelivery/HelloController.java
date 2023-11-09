package com.example.pizzadelivery;

import data.User;
import data.Users;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    public TextField loginFiled;
    @FXML
    public PasswordField passwordFiled;
    public Button loginButton;
    public Label wrongData;
    public Label Enter;

    @FXML
    public void onLoginButtonClick(ActionEvent actionEvent) throws IOException {
        if (checkData()) {
            showMenu();
            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.close();
        } else {
            Enter.setVisible(false);
            wrongData.setVisible(true);
            System.out.println("Неверные данные");
        }
    }

    private void showMenu() throws IOException {
        Stage menuStage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        menuStage.setTitle("Hello!");
        menuStage.setScene(scene);
        menuStage.show();

    }

    private boolean checkData() {
        Users usersList = new Users();
        for (User user : usersList.users) {
            if (user.getPhoneNumber().equals(loginFiled.getText()) && user.getPassword().equals(passwordFiled.getText())) {
                return true;
            }
        }
        return false;
    }
}