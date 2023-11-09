package com.example.pizzadelivery;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CartController implements Initializable {
    public Label sumOfOrder;
    public Button backToMenu;
    public Label orderStatus;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sumOfOrder.setText(String.valueOf(MenuController.price));
    }

    public void onButtonPayForTheOrder(ActionEvent actionEvent) {
        orderStatus.setText("Оплачено!");

    }

    public void onButtonBackToMenu(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) backToMenu.getScene().getWindow();
        stage.close();
    }
}
