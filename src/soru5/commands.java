package soru5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class commands {
	
	

    @FXML
    private ToggleButton hideButton;

    @FXML
    private ToggleButton showButton;

    @FXML
    private TextArea textField;

    @FXML
    private ToggleGroup toggleBros;

    @FXML
    void hideNseek(ActionEvent event) {
    	
		
		  if (event.getSource() == hideButton) {
			  textField.setVisible(false);
		  }
		  
		  else if(event.getSource() == showButton) {
			  textField.setVisible(true);
		  }
		 

    }
	
	

}
