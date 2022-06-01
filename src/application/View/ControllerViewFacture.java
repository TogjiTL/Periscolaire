package application.View;

	import java.io.IOException;

import application.Model.Enfant;
import application.Model.ListeEnfant;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

	public class ControllerViewFacture implements Observable {
		
	    @FXML
	    private Stage stage;
		private Scene scene;
		private Parent root;

		 @FXML
		    private TextField prenom;

		    @FXML
		    private Label total;
	  	   

	    @FXML
	    void retourAccueil(ActionEvent event) throws IOException {
	    	root = FXMLLoader.load(getClass().getResource("HoraireAnnonce.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
	    }
	    

	    @FXML
	    void createAct(ActionEvent event) throws IOException {
	    	root = FXMLLoader.load(getClass().getResource("CreationActivite.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	scene = new Scene(root);
			stage.setScene(scene);
			stage.show();

	    }
	    
	    @FXML
	    void asso(ActionEvent event) throws IOException {
	    	
	    root = FXMLLoader.load(getClass().getResource("Association.fxml"));
  		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  		scene = new Scene(root);
  		stage.setScene(scene);
  		stage.show();

	    }

	    
	    @FXML
	    void createEnfant(ActionEvent event) throws IOException {
	    	root = FXMLLoader.load(getClass().getResource("CreationEnfant.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
	    }
	    
	    
	    @FXML
	    void calcule(ActionEvent event) {
	    	
	    	String enfant = prenom.getText();
	    	
	    	ListeEnfant liste = ControllerViewEnfant.getListeE();
			Enfant e = liste.chercheEnfant(enfant);
			
			double total = e.getCout();
			
			this.total.setText("Total de Facturation :         " + total +" €");
	   
	    }


		@Override
		public void addListener(InvalidationListener arg0) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void removeListener(InvalidationListener arg0) {
			// TODO Auto-generated method stub
			
		}
	    
	}
	    