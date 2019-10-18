package sample.practic3.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Practic3Task {
    private final double A = 21.4;
    private final double B = 19.5;
    private final double PI = 3.14;

    private double begin;
    private double x;
    private int count;
    private double stepV;
    private double res;
    private String text3;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField primaryValue;

    @FXML
    private TextField arg;

    @FXML
    private Button exit3;

    @FXML
    private Button cancel3;

    @FXML
    private TextField countIteration;

    @FXML
    private TextField step;
    @FXML
    private TextArea input;

    @FXML
    private Button calculate;

    @FXML
    private TextField finallyValue;

    @FXML
    void initialize() {
        calculate.setOnAction(event -> {
            begin = Double.parseDouble(primaryValue.getText());
            stepV = Double.parseDouble(step.getText());
            x = Double.parseDouble(arg.getText());
            count = Integer.parseInt(countIteration.getText());

            for(int i = 0; i < count;i++){
                begin += stepV;
                res = (PI - Math.pow(begin, 2.0)) * (Math.sin(Math.sqrt((2.1 * B) + (begin * Math.log(A)))));
                text3 += ("x = " + begin + "     y = " + res + "/n");
                System.out.println("x = " + begin + "    y = " + res);
                input.setText(text3 + "/n");
                //input.setTextFormatter();
            }
            finallyValue.setText(Double.toString(begin));
        });

    }
}
