package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControleAplicacao {

    @FXML
    private TextField txNome;
    
    @FXML
    private Label lblMensagem;

    @FXML
    void atualizaMensagem(ActionEvent event) {

    	lblMensagem.setText("Olá, " + this.txNome.getText() + ". Bem-vindo!");
    	
    }

}
