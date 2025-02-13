package lk.acpt_maneth.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {

    public Label resultLbl;
    @FXML
    private TextField txtNum01;

    @FXML
    private TextField txtNum02;

    String calculate;

    @FXML
    void addBtn(ActionEvent event) {
        calculate = "addition";
    }

    @FXML
    void divBtn(ActionEvent event) {
        calculate = "divition";
    }

    @FXML
    void mulBtn(ActionEvent event) {
        calculate = "multiplication";
    }

    @FXML
    void subBtn(ActionEvent event) {
        calculate ="substraction";
    }

    @FXML
    void equalBtn(ActionEvent event) {
        int num1 = Integer.parseInt(txtNum01.getText());
        int num2 = Integer.parseInt(txtNum02.getText());
        int result = 0;
        switch (calculate){
            case "addition": result = num1 + num2; break;
            case "divition": result = num1 / num2; break;
            case "multiplication": result = num1 * num2; break;
            case "substraction": result = num1 - num2; break;
        }
        resultLbl.setText(String.valueOf(result));
    }



}