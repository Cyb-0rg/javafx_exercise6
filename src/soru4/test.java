package soru4;

 

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class test extends Application{
	
	/*
	 * // launch the application public void start(Stage s) { // set title for the
	 * stage s.setTitle("soru 4");
	 * 
	 * // create a button Button b = new Button("button"); TextField t = new
	 * TextField();
	 * 
	 * // create a stack pane StackPane r = new StackPane();
	 * 
	 * // add button & text field r.getChildren().addAll(t,b);
	 * 
	 * //add text field // r.getChildren().add(t);
	 * 
	 * // create a scene Scene sc = new Scene(r, 600, 700);
	 * 
	 * // set the scene s.setScene(sc);
	 * 
	 * s.show(); }
	 */
  
	
	private Parent createContent() {
		
		VBox root = new VBox();
		root.setPrefSize(300, 300);
		TextField text= new TextField();
		Button button = new Button("button");
		Label label = new Label("label");
		
		
		root.getChildren().addAll(label,text,button);
		 
		
		
		return root;
		
		
	} 
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		arg0.setScene(new Scene(createContent()));
		arg0.show();
		
	}

	public static void main(String[] you) {
		// TODO Auto-generated method stub

		launch(you);
		
		
	}

}
