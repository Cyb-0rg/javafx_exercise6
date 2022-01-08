package soru6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class test extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);

	}
	
	@Override
	public void start(Stage st) throws Exception {
		// TODO Auto-generated method stub
		
		
		Parent root = FXMLLoader.load(getClass().getResource("javafx.fxml"));
		
		st.setScene(new Scene(root,700,400));
		st.setTitle("Soru 6");
		st.show();
		
		
		
	}

}
