package soru3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class commands {
	

    @FXML
    private Button button_down;

    @FXML
    private Button button_reset;

    @FXML
    private Button button_up;

    @FXML
    private TextField textField;

    @FXML
    void countDown(ActionEvent event) {
    	
    	//textField.setText(""+0);
    	int sayi = Integer.parseInt(textField.getText());
    	sayi--;
    	textField.setText("" + sayi); 
    }

    
 
    @FXML
    void countUp(ActionEvent event) {
    	
    	 
    	int sayi = Integer.parseInt(textField.getText());
    	sayi++;
    	textField.setText("" + sayi);
    	
    }

    @FXML
    void reset(ActionEvent event) {
    	
    	textField.setText(""+0);

    }

}
