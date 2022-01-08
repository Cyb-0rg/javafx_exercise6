package soru2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class degistir {
	
	@FXML
    private Button button;

    @FXML
    private TextField textfield1;

    @FXML
    private TextField textfield2;

    @FXML
    void degistir(ActionEvent event) {

    	
    	
    	
		/*
		 * int a = 5; int b = 7; int temp;
		 * 
		 * temp=b; b-a ; a=temp;
		 */
    	
    	String temp;
    	
    	temp  = textfield1.getText();
    	
    	textfield1.setText(textfield2.getText());
    	textfield2.setText(temp);
    	
    	
    }


}
