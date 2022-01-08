package soru1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class test extends Application {

	@Override
	public void start(Stage st) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("butondemo.fxml"));
			
		st.setScene(new Scene(root,600,400));
		st.setTitle("Deneme");
		st.show();
		  
	}
	
	public static void main(String[] a) {
		launch(a);
	}

	
}
