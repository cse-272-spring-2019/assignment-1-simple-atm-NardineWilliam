package atm;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.lang.ClassNotFoundException;

public class GUI extends Application {

	public static void main(String[] args) {
		launch (args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("ATM");
		
		Label cardnum = new Label("Card Number");
		PasswordField cardNumber = new PasswordField();
		Button Enter = new Button("Enter");
		Label ValidationLabel = new Label();
		
		GridPane grid = new GridPane();
		grid.add(cardnum,0,0);
		grid.add(cardNumber,0,1);
		grid.add(Enter,0,2);
		grid.add(ValidationLabel,0,3);

		
		Enter.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				String Card = cardNumber.getText();
				
			}
			
		});
		
		
		Scene scene = new Scene(grid,400,400);
		primaryStage.setScene(scene);
		primaryStage.show();	

		
	}

}
