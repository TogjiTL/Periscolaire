package application.View;


import java.io.IOException;
import java.util.ArrayList;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

	public class ControllerEnfant implements Observable{
	    @FXML
	    private ListView<String> listCreationEnfant;

	    @FXML
	    private TextField name;
		private Stage stage;
		private Scene scene;
		private Parent root;
		
		private static ArrayList<String> listeEnfant = new ArrayList<>();
		
		
		public ControllerEnfant(){
			
		}
		
		
	    @FXML
	    void addEnfant(ActionEvent event) {
	    	listCreationEnfant.getItems().add(name.getText());
	    	listeEnfant.add(name.getText());

	    }

	    @FXML
	    void removeEnfant(ActionEvent event) {
	    	int selectedId = listCreationEnfant.getSelectionModel().getSelectedIndex();
	    	String name = listCreationEnfant.getItems().get(selectedId);
	    	listCreationEnfant.getItems().remove(selectedId);
	    	listeEnfant.remove(name);

	    }    

	    @FXML
	    void retourAccueil(ActionEvent event) throws IOException {
	    	root = FXMLLoader.load(getClass().getResource("HoraireAnnonce.fxml"));
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
	    void createAct(ActionEvent event) throws IOException {
	    	root = FXMLLoader.load(getClass().getResource("CreationActivite.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	scene = new Scene(root);
			stage.setScene(scene);
			stage.show();

	    }


	    @FXML
	    void facture(ActionEvent event) throws IOException {
	    	
	    	root = FXMLLoader.load(getClass().getResource("Facture.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	scene = new Scene(root);
			stage.setScene(scene);
			stage.show();

	    }
	    
	    
	    
	    public static ArrayList<String> getListeEnfant() {
	    	return listeEnfant;
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