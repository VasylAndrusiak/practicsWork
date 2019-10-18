package sample.practic1.controllers;

import java.lang.Math;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Practic1Task {
    private double b;
    private double arg;
    private double g = 3;
    private double r = 4.21;
    private double res;
    private double a = 11;
    private double q = 89.52;
    private double y;
    private double d;
    private String text1;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField g1Task;

    @FXML
    private TextField arg1Task;

    @FXML
    private TextField a1Task;

    @FXML
    private TextField r1Task;

    @FXML
    private TextField result;

    @FXML
    private Button cancel1Task;

    @FXML
    private TextField q1Task;

    @FXML
    private Button make1Task;

    @FXML
    private Button exit1Task;

    @FXML
    void initialize() {
        cancel1Task.setOnAction(event -> {
            cancel1Task.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/main.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        exit1Task.setOnAction(event -> {
            exit1Task.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/main.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        make1Task.setOnAction(event -> {
            arg = Double.parseDouble(arg1Task.getText());
            g = Double.parseDouble(g1Task.getText());
            a =  Double.parseDouble(a1Task.getText());
            q =  Double.parseDouble(q1Task.getText());
            r =  Double.parseDouble(r1Task.getText());
            b = arg * g + a;
            y = Math.pow((6 + a), (1.0 / 3));
            d = r * 2;
            res = (b * Math.sqrt(Math.pow(d, 2) + Math.log(y) - 0)) / r;
            text1 = Double.toString(res);
            double s = Math.sqrt(Math.pow(d, 2) + Math.log(y) - r * q);
            System.out.println("arg = " + arg);
            System.out.println("g = " + g);
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("y = " + y);
            System.out.println("r = " + r);
            System.out.println("q = " + q);
            System.out.println("d = " + d);
            System.out.println("s = " + s);
            System.out.println("res = " + res);
            result.setText(text1);
        });
    }
}
