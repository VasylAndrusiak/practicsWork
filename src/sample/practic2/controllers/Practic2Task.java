package sample.practic2.controllers;

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

public class Practic2Task {
    private final double A = 1.62;
    private final double E = 2.71;
    private double x;
    private double res;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button calculate2Task;

    @FXML
    private TextField arg2Task;

    @FXML
    private Button cancel2Task;

    @FXML
    private TextField result2LTask;

    @FXML
    private Button exit2Task;

    @FXML
    void initialize() {
        exit2Task.setOnAction(event -> {
            exit2Task.getScene().getWindow().hide();

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
        calculate2Task.setOnAction(event -> {
            x = Double.parseDouble(arg2Task.getText());
            if(x == A){
                res = (Math.pow(E, Math.abs(x + A))) * Math.sin(x);
            }else if(x > A && x < Math.pow(A, 2.0)){
                res = Math.pow(x - A, 2.0) * Math.pow(Math.cos(x), 2.0);
            }else{
                res = 0;
            }
            result2LTask.setText(Double.toString(res));
        });
        cancel2Task.setOnAction(event -> {
            arg2Task.setText("");
            result2LTask.setText("");
        });
    }
}
