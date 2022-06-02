package application.View;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

import application.Model.Anonce;
import application.Model.Horaire;
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

public class ControllerViewHoraireAnnonce implements Initializable {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
    @FXML
    private ListView<String> Horaire;
    

    @FXML
    private ListView<String> listAnnonce;

    
    @FXML
    private Button publier;
    @FXML
    private TextField heure;
    @FXML
    private TextField annonce;

    @FXML
    private Button modifier;
    
    public static Horaire h = new Horaire();
    public static Anonce a = new Anonce();
	
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
	    	
	    	h.change(heure.getText(), selectedId);

	    }    
	    
	    @FXML
	    void addAnnonce(ActionEvent event) {
	    	listAnnonce.getItems().add(annonce.getText());
	    	
	    	a.add(annonce.getText());

	    }   

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			Horaire.getItems().addAll(h.getHeure());
			listAnnonce.getItems().addAll(a.getAnonce());
		}


}
