package application.Controller;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
<<<<<<< HEAD
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("../application.css").toExternalForm());
			primaryStage.setTitle("Hello JavaFx");
=======
			Parent root = FXMLLoader.load(getClass().getResource("../View/Accueil.fxml"));
			Scene scene = new Scene(root);
>>>>>>> 85a3ff24cc2a1778531dcd99d8aa4fc5fb4f6462
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}