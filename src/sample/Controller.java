package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller{


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button practic19; // 9

    @FXML
    private Button practic17;

    @FXML
    private Button practic18;

    @FXML
    private Button practic3;

    @FXML
    private Button practic2;

    @FXML
    private Button practic5;

    @FXML
    private Button practic4;

    @FXML
    private Button practic7;

    @FXML
    private Button practic6;

    @FXML
    private Button practic8;

    @FXML
    private Button practic15;

    @FXML
    private Button practic16;

    @FXML
    private Button practic13;

    @FXML
    private Button practic14;

    @FXML
    private Button practic11;

    @FXML
    private Button practic12;

    @FXML
    private Button practic1;

    @FXML
    private Button practic10;

    @FXML
    void initialize() {
        practic1.setOnAction(event -> {
            practic1.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/practic1/view/practic1.fxml"));

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
        practic2.setOnAction(event -> {
            practic2.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/practic2/view/practic2.fxml"));

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
        practic3.setOnAction(event -> {
            practic3.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/practic3/view/practic3.fxml"));

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
    }
}
