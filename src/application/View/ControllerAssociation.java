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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class ControllerAssociation implements Initializable{
	
    @FXML
    private Stage stage;
	private Scene scene;
	private Parent root;
	 @FXML
	    private ListView<String> historique;

	    @FXML
	    private ListView<String> listActivite;

	    @FXML
	    private ListView<String> listeEnfant;
  	   
	

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
    void facture(ActionEvent event) throws IOException {
    	
    	root = FXMLLoader.load(getClass().getResource("Facture.fxml"));
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
    void history(ActionEvent event) {
    	int selectedId = listActivite.getSelectionModel().getSelectedIndex();
    	String activite = listActivite.getItems().get(selectedId);
    	
    	int selectedIdd = listeEnfant.getSelectionModel().getSelectedIndex();
    	String enfant = listeEnfant.getItems().get(selectedIdd);
    	

    	historique.getItems().add(enfant + " a été ajouté à " + activite);
    }  

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		ArrayList<String> listeAct = ControllerActivite.getListeAct(); 	   // mettre la liste des noms des activités de la BD
    	listActivite.getItems().addAll(listeAct);
    	
    	ArrayList<String> listeEnf = ControllerEnfant.getListeEnfant(); 	   // mettre la liste des noms des enfants de la BD
    	listeEnfant.getItems().addAll(listeEnf);
	   

	}

}
