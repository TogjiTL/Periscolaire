package application.View;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class ControllerAccueil implements Initializable{
	

    @FXML
    private ListView<String> listActivite;
    String[] activite = { "tennis", "foot"}; // mettre la liste des noms des activités de la BD
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
    	listActivite.getItems().addAll(activite);
    	
    }


}
