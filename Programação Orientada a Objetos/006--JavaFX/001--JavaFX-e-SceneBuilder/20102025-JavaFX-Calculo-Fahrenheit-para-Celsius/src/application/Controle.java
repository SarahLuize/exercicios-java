package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Controle {

    @FXML
    private Label Resultado;

    @FXML
    private Button btnCalcular;

    @FXML
    private TextField txtFahrenheit;

    @FXML
    void CalcularCelsius(ActionEvent event) {
    	Double fahrenheit = Double.parseDouble(txtFahrenheit.getText());
		Double celsius=(double) 0;
		
		celsius = (fahrenheit - 32) /1.8 ;
    	
    	Resultado.setTextFill(Color.SLATEGRAY);
    	Resultado.setText(" " + celsius);
    }

}