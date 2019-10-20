package sample.practic4.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class Practic4 {

    private final double E = 2.71;
    private double beginNumber;
    private double endNumber;
    private double step;
    private double countS;
    private double x;
    private double y;
    private double result;
    private String text4;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea output;

    @FXML
    private TextField primaryValue;

    @FXML
    private Pane cancel4;

    @FXML
    private Button exit4;

    @FXML
    private TextField stepSize;

    @FXML
    private TextField count;

    @FXML
    private Button calculate;

    @FXML
    private TextField finallyValue;

    @FXML
    void initialize() {

        calculate.setOnAction(event -> {
            beginNumber = Double.parseDouble(primaryValue.getText());
            endNumber = Double.parseDouble(finallyValue.getText());
            step = Double.parseDouble(stepSize.getText());

            for(double i = beginNumber; i < endNumber;i+=step){
                if(i < 0.6){
                    x = Math.pow(i, 2.0) + i + 1;
                }else if(i >= 1){
                    x = i - 1;
                }else{
                    x = 0;
                }
                countS++;
                result  = Math.sqrt(Math.pow(E, x - 2) + x);
                text4 += ("p = " + result + "             y = " + i + '\n');
                output.setText(text4);
            }
            finallyValue.setText(Double.toString(countS));
        });

    }
}
