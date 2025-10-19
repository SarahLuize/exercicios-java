package application;
	
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			URL arquivoFXML = getClass().getResource("./TelaPrincipal3operacoes.fxml");
			Parent fxmlParent = (Parent) FXMLLoader.load(arquivoFXML);
			
			primaryStage.setScene(new Scene(fxmlParent, 359, 210));
			primaryStage.setTitle("Calculadora");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
