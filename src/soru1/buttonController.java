package soru1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class buttonController implements Initializable {

	  @FXML
	    private Button ekleBtn;

	    @FXML
	    private Button tmzleBttn;
	    
	    @FXML
	    TextField field;
	    
	    @FXML
	    void ekle(ActionEvent event) {
	    	field.setText(field.getText() + "a");
	    }

	    @FXML
	    void temizle(ActionEvent event) {
	    	field.setText("");
	    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}
