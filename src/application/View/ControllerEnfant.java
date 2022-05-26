package application.View;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import application.Model.Enfant;
import application.Model.ListeEnfant;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

	public class ControllerEnfant implements Initializable{
	    @FXML
	    private ListView<String> listCreationEnfant;

	    @FXML
	    private TextField name;
		private Stage stage;
		private Scene scene;
		private Parent root;
		
		private static ArrayList<String> listeEnfant = new ArrayList<>();
		
		 @FXML
		    private TextField age;

		    @FXML
		    private TextField nom;

		    @FXML
		    private TextField numParent;
		    
		    private static ListeEnfant listeE = new ListeEnfant();
		
		public ControllerEnfant(){
			
		}
		
		
	    @FXML
	    void addEnfant(ActionEvent event) {
	    	listCreationEnfant.getItems().add(name.getText());
	    	listeEnfant.add(name.getText());
	    	
	    	String prenom = name.getText();
	    	String n = nom.getText();
	    	String a = age.getText();
	    	String numP = numParent.getText();
	    	
	    	Enfant enfant = new Enfant(n ,prenom  , a, numP);
	    	
	    	listeE.addEnfant(enfant);

	    }
	      

		public static ListeEnfant getListeE() {
			return listeE;
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
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
			listCreationEnfant.getItems().addAll(listeEnfant);
			
		}

	}