package sample.practic6;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Practic6 {
    private final double PI = 3.14;
    private int countArray;
    private double x;
    private double y;
    private double [] arrX = new double[countArray];

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button calculate6;

    @FXML
    private TextField countElements;

    @FXML
    private Button cancel6;

    @FXML
    private TextArea inputElements;

    @FXML
    private TextArea outputElements;

    @FXML
    private Button exit6;

    @FXML
    void initialize() {
        calculate6.setOnAction(event -> {
            countArray = Integer.parseInt(countElements.getText());
            for(int  i = 0; i < countArray; i++){
                arrX[i] = Double.parseDouble(inputElements.getText());
                System.out.println(arrX);
            }
        });


    }

}
