package sample.practic1.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Practic1 {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cancel1Task;

    @FXML
    private Button ok1Task;

    @FXML
    void initialize() {
        assert cancel1Task != null : "fx:id=\"cancel1Task\" was not injected: check your FXML file 'practic1.fxml'.";
        assert ok1Task != null : "fx:id=\"ok1Task\" was not injected: check your FXML file 'practic1.fxml'.";

    }
}
