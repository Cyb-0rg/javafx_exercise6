package soru6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class commands {
	
	@FXML
    private Button downButton;

    @FXML
    private Button leftButton;

    @FXML
    private Button rightButton;

    @FXML
    private TextField textField;

    @FXML
    private Button upButton;

    @FXML
    void moveLeft(ActionEvent event) {
    	textField.setLayoutX(textField.getLayoutX()-10);
    	

    }

    @FXML
    void moveDown(ActionEvent event) {

    	textField.setLayoutY(textField.getLayoutY()+10);
    }

    @FXML
    void moveRight(ActionEvent event) {
    	textField.setLayoutX(textField.getLayoutX()+10);

    }

    @FXML
    void moveUp(ActionEvent event) {
    	textField.setLayoutY(textField.getLayoutY()-10);

    }

}
