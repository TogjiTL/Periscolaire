package application.View;

	import java.io.IOException;
	import java.net.URL;
	import java.util.ResourceBundle;

import application.Model.Activite;
import application.Model.Enfant;
import application.Model.ListeActivite;
import application.Model.ListeEnfant;
	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.fxml.FXMLLoader;
	import javafx.fxml.Initializable;
	import javafx.scene.Node;
	import javafx.scene.Parent;
	import javafx.scene.Scene;
	import javafx.scene.control.Label;
	import javafx.stage.Stage;

	public class ControllerInfoActivite implements Initializable{
		
	    @FXML
	    private Stage stage;
		private Scene scene;
		private Parent root;
		
		  @FXML
		    private Label nom;

		    @FXML
		    private Label prix ;

		    @FXML
		    private Label capacite;

		    @FXML
		    void asso(ActionEvent event) throws IOException {
		    	
		    	
			    root = FXMLLoader.load(getClass().getResource("Association.fxml"));
		  		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  		scene = new Scene(root);
		  		stage.setScene(scene);
		  		stage.show();

		    }


			@Override
			public void initialize(URL arg0, ResourceBundle arg1) {
				// TODO Auto-generated method stub
				
				String n = ControllerAssociation.getActivite();
				ListeActivite liste = ControllerActivite.getListeA();
				
				
				Activite a = liste.chercheActivite(n);
				
				nom.setText(a.getNom());
				prix.setText(a.getPrix());
				capacite.setText(a.getCapacite());
				
				
			}

	}
