package application.View;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class ControllerLogin implements Initializable {
		private Stage stage;
		private Scene scene;
		private Parent root;
		
	    @FXML
	    private Label erreur;
	    
		@FXML
		private PasswordField mdp;
		
	    @FXML
	    private TextField user;
	    private ArrayList Users = new ArrayList<>(Arrays.asList("Maxime", "Togji" , "Souleymane"));

	    @FXML
	    void Display(ActionEvent event) throws IOException {
	    	
	    	if (Users.contains(user.getText())) {
	    		
	    		if ((user.getText().equals("Maxime") && mdp.getText().equals("Maxime")) 
	    				||(user.getText().equals("Togji") && mdp.getText().equals("Togji")) 
	    				|| (user.getText().equals("Souleymane") && mdp.getText().equals("Souleymane"))) {
	    		
	    		root = FXMLLoader.load(getClass().getResource("HoraireAnnonce.fxml"));
	    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    		scene = new Scene(root);
	    		stage.setScene(scene);
	    		stage.show();
	    		
	    		}
	    		
	    		
	    	}
	    	
	    	erreur.setVisible(true);
	    	
	    	/*root = FXMLLoader.load(getClass().getResource("PageRegister.fxml"));
    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		scene = new Scene(root);
    		stage.setScene(scene);
    		stage.show();*/
			
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

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
			 erreur.setVisible(false);
			
		}


}