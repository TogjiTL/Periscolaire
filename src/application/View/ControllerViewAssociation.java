package application.View;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
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
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class ControllerViewAssociation implements Initializable{
	
    @FXML
    private Stage stage;
	private Scene scene;
	private Parent root;
	
	private static String prenomEnfant;
	
	private static String prenomActivite;
	 @FXML
	    private ListView<String> historique;

	    @FXML
	    private ListView<String> listActivite;

	    @FXML
	    private ListView<String> listeEnfant;
  	   
	public ControllerViewAssociation() {
		// TODO Auto-generated constructor stub
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
    	

    	historique.getItems().add(enfant + " a �t� ajout� � " + activite);
    	
    	ListeEnfant liste = ControllerViewEnfant.getListeE();
		Enfant e = liste.chercheEnfant(enfant);
		
		double cout = e.getCout();
		
		ListeActivite listeAct = ControllerViewActivite.getListeA();
		Activite a = listeAct.chercheActivite(activite);
		
		String p = a.getPrix();
		
		String c = a.getCapacite();
		
		int newCap = Integer. parseInt(c) - 1;
		
		double newCout = cout + Double.parseDouble(p) ;
		
		a.setCapacite(String.valueOf(newCap));
		e.setCout(newCout);
		
		
    }  
    
    @FXML
    public void infoEnfant(ActionEvent event) throws IOException {
    	int selectedId = listeEnfant.getSelectionModel().getSelectedIndex();
    	String name = listeEnfant.getItems().get(selectedId);
    	
    	prenomEnfant = name ;
    	
    	root = FXMLLoader.load(getClass().getResource("InfoEnfant.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

    }  
    
    public static String getPrenomEnfant() {
    	return prenomEnfant;
    }
    
    @FXML
    public void infoActivite(ActionEvent event) throws IOException {
    	int selectedId = listActivite.getSelectionModel().getSelectedIndex();
    	String name = listActivite.getItems().get(selectedId);
    	
    	prenomActivite = name ;
    	
    	root = FXMLLoader.load(getClass().getResource("InfoActivite.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

    }  
    
    public static String getActivite() {
    	return prenomActivite;
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		ArrayList<String> listeAct = ControllerViewActivite.getListeAct(); 	   // mettre la liste des noms des activit�s de la BD
    	listActivite.getItems().addAll(listeAct);
    	
    	ArrayList<String> listeEnf = ControllerViewEnfant.getListeEnfant(); 	   // mettre la liste des noms des enfants de la BD
    	listeEnfant.getItems().addAll(listeEnf);
	   

	}

}
