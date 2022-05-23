package application.Controller;

import java.awt.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControllerLogin {
	
	  @FXML
	    private Button btnValider;
	  	private Stage stage;
	  	private Scene scene;
	  	private Parent root;
	  
	  	public void switchToScene1(ActionEvent event) throws IOException {
	  		root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
	  		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  		scene = new Scene(root);
	  		stage.setScene(scene);
	  		stage.show();
	  }
	    @FXML
	    	void Validation(ActionEvent event) {

	    }


}
