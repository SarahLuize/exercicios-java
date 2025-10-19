package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class ControleAplicacao {

    @FXML
    private TextField txtNum1;

    @FXML
    private TextField txtNum2;

    @FXML
    private Button btnSoma;

    @FXML
    private Button btnSubtrair;

    @FXML
    private Button btnMulti;

    @FXML
    private Button btnLimpar;

    @FXML
    private Label resultado;

    @FXML
    void Limpar(ActionEvent event) {
    	
    	txtNum1.clear();
    	txtNum2.clear();
    	resultado.setText("");	
    }

    @FXML
    void Multiplicar(ActionEvent event) {
    	Double num1 = Double.parseDouble(txtNum1.getText());
    	Double num2 = Double.parseDouble(txtNum2.getText());
    	
    	num1 = num1 * num2;
    	
    	resultado.setTextFill(Color.BLUE);
    	resultado.setText("Total: " + num1);
    	
    }

    @FXML
    void Somar(ActionEvent event) {
    	Double num1 = Double.parseDouble(txtNum1.getText());
    	Double num2 = Double.parseDouble(txtNum2.getText());
    	
    	num1 = num1 + num2;
    	
    	resultado.setTextFill(Color.BLUE);
    	resultado.setText("Total: " + num1);
    }

    @FXML
    void Subtrair(ActionEvent event) {
    	Double num1 = Double.parseDouble(txtNum1.getText());
    	Double num2 = Double.parseDouble(txtNum2.getText());
    	
    	num1 = num1 - num2;
    	
    	resultado.setTextFill(Color.BLUE);
    	resultado.setText("Total: " + num1);

    }

}
