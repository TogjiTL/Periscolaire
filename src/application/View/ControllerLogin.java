package application.View;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class ControllerLogin {
		private Stage stage;
		private Scene scene;
		private Parent root;
		
	    @FXML
	    private TextField user;
	    private ArrayList Users = new ArrayList<>(Arrays.asList("Maxime", "Todji" , "Souleymane"));

	    @FXML
	    void Display(ActionEvent event) throws IOException {
	    	
	    	if (Users.contains(user.getText())) {
	    		
	    		root = FXMLLoader.load(getClass().getResource("HoraireAnnonce.fxml"));
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    		scene = new Scene(root);
	    		stage.setScene(scene);
	    		stage.show();
	    	}
	    	
	    	root = FXMLLoader.load(getClass().getResource("PageRegister.fxml"));
    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		scene = new Scene(root);
    		stage.setScene(scene);
    		stage.show();
			
	    }
	    
	    @FXML
	    void PageAccueil(ActionEvent event) throws IOException {
	    	//mettre une condition pour voir si l'utilisateur est dans la Base
	    		root = FXMLLoader.load(getClass().getResource("HoraireAnnonce.fxml"));
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    		scene = new Scene(root);
	    		stage.setScene(scene);
	    		stage.show();
	    	}


}