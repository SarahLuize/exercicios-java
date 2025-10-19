package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControleAplicacao {

	@FXML
	private Label lblResultadoCalculado;

	@FXML
	private TextField txtLadoA;

	@FXML
	private TextField txtLadoB;

	@FXML
	void onClickCalcular(ActionEvent event) {
		double ladoA = Double.parseDouble(this.txtLadoA.getText());
		double ladoB = Double.parseDouble(this.txtLadoB.getText());
		double resultado = 0;

		resultado = ladoA * ladoB;

		this.lblResultadoCalculado.setText(String.format("%.2f", resultado));

	}

	@FXML
	void onClickLimpar(ActionEvent event) {
		this.txtLadoA.clear();
		this.txtLadoB.setText("");
		this.txtLadoA.requestFocus();
		this.lblResultadoCalculado.setText("Sem cálculo");
	}

}
