package application.View;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import application.Model.Activite;
import application.Model.ListeActivite;
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

	public class ControllerActivite implements Initializable{
	    @FXML
	    private ListView<String> listCreationActivite;

	    @FXML
	    private TextField name;
		private Stage stage;
		private Scene scene;
		private Parent root;
		
		@FXML
		private TextField capacite;

		@FXML
		private TextField prix;
		
		private static ArrayList<String> listeAct = new ArrayList<>(); // liste activité 
		
		private static ListeActivite listeA = new ListeActivite();
		
		
		public ControllerActivite(){
			
		}
		
		
	    @FXML
	    void addActivite(ActionEvent event) {
	    	listCreationActivite.getItems().add(name.getText());
	    	listeAct.add(name.getText());
	    	
	    	String nom = name.getText();
	    	String c = capacite.getText();
	    	String p = prix.getText();
	    	
	    	Activite act = new Activite(nom ,p , c);
	    	
	    	listeA.addActivite(act);

	    }
	    
	    public static ListeActivite getListeA() {
			return listeA;
		}

	    @FXML
	    void removeAct(ActionEvent event) {
	    	int selectedId = listCreationActivite.getSelectionModel().getSelectedIndex();
	    	String name = listCreationActivite.getItems().get(selectedId);
	    	listCreationActivite.getItems().remove(selectedId);
	    	listeAct.remove(name);
	    	

	    }    

	    
	    @FXML
	    void PageEnfant(ActionEvent event) throws IOException {
	    	root = FXMLLoader.load(getClass().getResource("CreationEnfant.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
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
	    void facture(ActionEvent event) throws IOException {
	    	
	    	root = FXMLLoader.load(getClass().getResource("Facture.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	scene = new Scene(root);
			stage.setScene(scene);
			stage.show();

	    }
	    public static ArrayList<String> getListeAct() {
	    	return listeAct;
	    }



		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
			listCreationActivite.getItems().addAll(listeAct);
			
		}

	}