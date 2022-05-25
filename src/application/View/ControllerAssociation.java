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
    private ListView<String> listActivite;
  	   
    private ArrayList Users = new ArrayList<>(Arrays.asList("Maxime", "Todji" , "Souleymane"));
    
    private String[] act = {"foot","tennis"};// mettre la liste des noms des activités de la BD
    	
    
   public void initialize(URL arg0, ResourceBundle arg1) {
	   
	   //listeAct = ControllerActivite.getListeAct(); 
	   //listActivite.getItems().add("Bonjour");
	   //listActivite.getItems().addAll(Users);
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

}
