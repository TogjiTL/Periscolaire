package application.View;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Model.Enfant;
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

public class ControllerViewInfoEnfant implements Initializable{
	
    @FXML
    private Stage stage;
	private Scene scene;
	private Parent root;
	
	  @FXML
	    private Label age;

	    @FXML
	    private Label name ;

	    @FXML
	    private Label nom;

	    @FXML
	    private Label numParent;

	    @FXML
	    void asso(ActionEvent event) throws IOException {
	    	
	    	
		    root = FXMLLoader.load(getClass().getResource("Association.fxml"));
	  		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  		scene = new Scene(root);
	  		stage.setScene(scene);
	  		stage.show();

	    }

	   /* @FXML
	    void modifEnfant(ActionEvent event) {
 	
	    	String prenom = name.getText();
	    	String n = nom.getText();
	    	String a = age.getText();
	    	String numP = numParent.getText();
	    	
	    	Enfant enfant = new Enfant(prenom, n , a, numP);


	    }*/

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
			String prenom = ControllerViewAssociation.getPrenomEnfant();
			ListeEnfant liste = ControllerViewEnfant.getListeE();
			
			
			Enfant e = liste.chercheEnfant(prenom);
			
			name.setText(e.getPrenom());
			nom.setText(e.getNom());
			age.setText(e.getAge());
			numParent.setText(e.getNumParent());
			
			
		}

}
