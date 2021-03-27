package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Controller {

    @FXML
    private TextField text1, text2, text3, text4;

    @FXML
    private Button button;

    public void calculate() throws IOException{
        String num1;
        String num2;
        char operator;
        double answer = 0.0;

        num1 = text1.getText();
        num2 = text2.getText();
        operator = text3.getText().charAt(0);

        double num3 = Double.valueOf(num1);
        double num4 = Double.valueOf(num2);

        switch (operator) {
            case '+':
                answer = num3 + num4;
                break;
            case '-':
                answer = num3 - num4;
                break;
            case '*':
                answer = num3 * num4;
                break;
            case '/':
                answer = num3 / num4;
                break;
            case '%':
                answer = num3 % num4;
                break;
            default:
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setAlertType(Alert.AlertType.WARNING);
                alert.setContentText("Invalid Operator");
                alert.show();
                break;
        }

        text4.setText(String.valueOf(answer));
        /*text1.clear();
        text2.clear();
        text3.clear();*/

    }
}
