package application.View;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class ControllerHoraireAnnonce implements Initializable {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
    @FXML
    private ListView<String> Horaire;
    String[] Heure = {
    		"10h - 12h  /  14h - 16h",
    		"10h - 12h  /  14h - 16h",
    		"10h - 12h",
    		"10h - 12h  /  14h - 16h",
    		"10h - 12h  /  14h - 16h",
    		"10h - 12h",
    		"Fermé",};

    @FXML
    private ListView<String> listAnnonce;
    
    String[] Annonce = { " Activité Foot complète"};
    
    @FXML
    private Button publier;
    @FXML
    private TextField heure;
    @FXML
    private TextField annonce;

    @FXML
    private Button modifier;
	
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
	    void createEnfant(ActionEvent event) throws IOException {
	    	
	    	root = FXMLLoader.load(getClass().getResource("CreationEnfant.fxml"));
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
	    
	    @FXML
	    void modifHeure(ActionEvent event) {
	    	int selectedId = Horaire.getSelectionModel().getSelectedIndex();
	    	Horaire.getItems().remove(selectedId);
	    	Horaire.getItems().add(selectedId,heure.getText());

	    }    
	    
	    @FXML
	    void addAnnonce(ActionEvent event) {
	    	listAnnonce.getItems().add(annonce.getText());

	    }   

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			Horaire.getItems().addAll(Heure);
			listAnnonce.getItems().addAll(Annonce);
		}


}
