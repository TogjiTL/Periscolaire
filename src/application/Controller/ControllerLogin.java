package application.Controller;

import java.awt.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;

public class ControllerLogin {
	
	  @FXML
	    private Button btnValider;
	  	private Stage stage;
	  	private Scene scene;
	  	private Parent root;
	  
	  	public void Validation(ActionEvent event) throws IOException {
	  		root = FXMLLoader.load(getClass().getResource("../View/PageAcceuil.fxml"));
	  		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  		scene = new Scene(root);
	  		stage.setScene(scene);
	  		stage.show();
	  }
	 

}
