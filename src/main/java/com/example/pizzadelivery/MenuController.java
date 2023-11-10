package com.example.pizzadelivery;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
   public static double price = 0;
  public static int pizza399 = 0;
  public static int pizza489 = 0;
  public static int pizza449 = 0;
  public static int pizza450 = 0;
  public static int pizza479 = 0;
    public Button buttonToShoppingCart;
    public Label CounterPizza399;
    public Label CounterPizza489;
    public Label CounterPizza449;
    public Label CounterPizza450;
    public Label CounterPizza479;

    public void onClickButton399(ActionEvent actionEvent) {
        pizza399 += 1;
        price+= 399;
        CounterPizza399.setText(String.valueOf(pizza399));
    }

    public void onClickButton489(ActionEvent actionEvent) {
        pizza489 += 1;
        price+= 489;
        CounterPizza489.setText(String.valueOf(pizza489));
    }

    public void onClickButton449(ActionEvent actionEvent) {
        pizza449 += 1;
        price+= 449;
        CounterPizza449.setText(String.valueOf(pizza449));
    }

    public void onClickButton450(ActionEvent actionEvent) {
        pizza450 += 1;
        price+= 450;
        CounterPizza450.setText(String.valueOf(pizza450));
    }

    public void onClickButton479(ActionEvent actionEvent) {
        pizza479 += 1;
        price+= 479;
        CounterPizza479.setText(String.valueOf(pizza479));
    }

    public void shoppingСart(ActionEvent actionEvent) throws IOException {
        Stage shoppingCart = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("cart.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        shoppingCart.setTitle("Hello!");
        shoppingCart.setScene(scene);
        shoppingCart.show();

    }

    public void onClickButtonDel399(ActionEvent actionEvent) {
        if (price >= 399 && pizza399 > 0) {
            price -= 399;
            pizza399 -= 1;
            CounterPizza399.setText(String.valueOf(pizza399));
        }
    }

    public void onClickButtonDel489(ActionEvent actionEvent) {
        if (price >= 489 && pizza489 > 0) {
            price -= 489;
            pizza489 -= 1;
            CounterPizza489.setText(String.valueOf(pizza489));
        }
    }

    public void onClickButtonDel449(ActionEvent actionEvent) {
        if (price >= 449 && pizza449 > 0) {
            price -= 449;
            pizza449 -= 1;
            CounterPizza449.setText(String.valueOf(pizza449));
        }
    }

    public void onClickButtonDel450(ActionEvent actionEvent) {
        if (price >= 450 && pizza450 > 0) {
            price -= 450;
            pizza450 -= 1;
            CounterPizza450.setText(String.valueOf(pizza450));
        }
    }

    public void onClickButtonDel479(ActionEvent actionEvent) {
        if (price >= 479 && pizza479 > 0) {
            price -= 479;
            pizza479 -= 1;
            CounterPizza479.setText(String.valueOf(pizza479));
        }
    }
}
