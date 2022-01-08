package soru2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class test extends Application{
	
	

	public static void main(String[] args) {
		
		launch(args);
		

	}

	@Override
	public void start(Stage st) throws Exception {
		// TODO Auto-generated method stub
		
		
		Parent root = FXMLLoader.load(getClass().getResource("javafxMe.fxml"));
		
		st.setScene(new Scene(root,720,480));
		st.setTitle("Soru 2");
		st.show();
		
		
		
	}

}
