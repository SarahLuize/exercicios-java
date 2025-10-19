package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Cálculo da área de um quadrado");
			
			GridPane grid  = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25,25,25,25));
			
			Scene scene = new Scene(grid,400,200);
			primaryStage.setScene(scene);
			
			Text scenetitle = new Text ("Área do quadrado");
			scenetitle.setFont(Font.font("tahoma", FontWeight.NORMAL, 20));
			grid.add(scenetitle, 0, 0,2,1);
			
			
			Label lblNum1 = new Label("Lado 1: ");
			grid.add(lblNum1,0,1);
			
			TextField txtLado1 = new TextField();
			grid.add(txtLado1, 1, 1);
			
			
			Label lblNum2 = new Label("Lado 2: ");
			grid.add(lblNum2,0,2);
			
			TextField txtLado2 = new TextField();
			grid.add(txtLado2, 1, 2);
			
			Button btnCalcular = new Button("Calcular");
			Button btnLimpar = new Button("Limpar");
			HBox caixaBtn = new  HBox(10);
			caixaBtn.setAlignment(Pos.BASELINE_RIGHT);
			caixaBtn.getChildren().add(btnCalcular);
			caixaBtn.getChildren().add(btnLimpar);
			grid.add(caixaBtn, 1, 4);
			
			final Text resultado = new Text();
			grid.add(resultado, 1, 6);
			
			btnCalcular.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					Double lado1 = Double.parseDouble(txtLado1.getText());
					Double lado2 = Double.parseDouble(txtLado2.getText());
					Double area=(double) 0;
					
					area = lado1 * lado2 ;
					
					resultado.setFill(Color.BLUE);
					resultado.setText("Total: "+ area);
					
				}

				
			});
			
			btnLimpar.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent clear) {
					txtLado1.clear();
					txtLado2.clear();
					
			resultado.setText("");
					
			txtLado1.requestFocus();
				}
			});
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
