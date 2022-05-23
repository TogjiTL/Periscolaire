package application.View;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class ControllerLogin {
		private Stage stage;
		private Scene scene;
		private Parent root;
	

	    @FXML
	    void Display(ActionEvent event) throws IOException {
	    	root = FXMLLoader.load(getClass().getResource("PageAccueil.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
	    }


}