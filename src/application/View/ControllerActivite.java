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

	public class ControllerActivite implements Observable{
	    @FXML
	    private ListView<String> listCreationActivite;

	    @FXML
	    private TextField name;
		private Stage stage;
		private Scene scene;
		private Parent root;
		
		private static ArrayList<String> listeAct = new ArrayList<>();
		
		
		public ControllerActivite(){
			
		}
		
		
	    @FXML
	    void addActivite(ActionEvent event) {
	    	listCreationActivite.getItems().add(name.getText());
	    	listeAct.add(name.getText());

	    }

	    @FXML
	    void removeAct(ActionEvent event) {
	    	int selectedId = listCreationActivite.getSelectionModel().getSelectedIndex();
	    	listCreationActivite.getItems().remove(selectedId);
	    	listeAct.remove(selectedId);

	    }    

	    @FXML
	    void retourAccueil(ActionEvent event) throws IOException {
	    	root = FXMLLoader.load(getClass().getResource("PageAccueil.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    	scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
	    }
	    
	    public static ArrayList<String> getListeAct() {
	    	return listeAct;
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