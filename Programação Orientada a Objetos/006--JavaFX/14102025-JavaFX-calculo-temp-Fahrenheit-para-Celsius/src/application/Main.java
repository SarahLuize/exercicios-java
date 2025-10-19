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
			primaryStage.setTitle("Cálculo Fahrenheit para Celsius");
			
			GridPane grid  = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25,25,25,25));
			
			Scene scene = new Scene(grid,400,400);
			primaryStage.setScene(scene);
			
			Text scenetitle = new Text ("Fahrenheit para Celsius");
			scenetitle.setFont(Font.font("tahoma", FontWeight.NORMAL, 20));
			grid.add(scenetitle, 0, 0,2,1);
			
			
			Label lblNum1 = new Label("Fahrenheit: ");
			grid.add(lblNum1,0,1);
			
			TextField txtNum1 = new TextField();
			grid.add(txtNum1, 1, 1);
			
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
					Double fahrenheit = Double.parseDouble(txtNum1.getText());
					Double celsius=(double) 0;
					
					celsius = (fahrenheit-32) /1.8 ;
					
					resultado.setFill(Color.BLUE);
					resultado.setText("Total: "+ celsius);
					
				}

				
			});
			
			btnLimpar.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent clear) {
					txtNum1.clear();					
			resultado.setText("");
					
			txtNum1.requestFocus();
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
