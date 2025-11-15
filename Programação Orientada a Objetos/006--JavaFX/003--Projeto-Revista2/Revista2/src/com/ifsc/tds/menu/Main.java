package com.ifsc.tds.menu;

import com.ifsc.tds.controller.TipoColecaoListaController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// carregado o loader
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/ifsc/tds/view/TipoColecaoLista.fxml"));

			Parent tipoColecaoListaXML = loader.load();

			// carregando o controller e a scene
			TipoColecaoListaController tipoColecaoListaController = loader.getController();
			Scene tipoColecaoListaLayout = new Scene(tipoColecaoListaXML);

			primaryStage.setScene(tipoColecaoListaLayout);
			primaryStage.setTitle("Cadastro de tipo de colecao");

			primaryStage.setOnCloseRequest(e -> {
				if (tipoColecaoListaController.onCloseQuery()) {
					primaryStage.close();
				} else {
					e.consume();
				}
			});

			
			primaryStage.resizableProperty().setValue(Boolean.FALSE);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
