package application.Controller;
import java.sql.*;
	
import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

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
			Parent root = FXMLLoader.load(getClass().getResource("../View/AccueilLogin.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		Connection con=null;
        String test= "Angel";

    try {
        //etape 1: charger la classe de driver
        Class.forName("com.mysql.jdbc.Driver");

        //etape 2: creer l'objet de connexion
        Connection conn = (Connection) DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/periscolaire?characterEncoding=latin1", "root", "Jmay1994Tahi-ti1");
        System.out.println("connected");

      //étape 3: créer l'objet statement 
        Statement stmt = (Statement) conn.createStatement();
        //étape 4: exécuter la requéte
        /*String sql = "CREATE TABLE MARIAGE " +
                     "(id INTEGER not NULL, " +
                     " nom VARCHAR(255), " + 
                     " age INTEGER, " + 
                     " adresse VARCHAR(255), " + 
                     " PRIMARY KEY ( id ))"; 
        stmt.executeUpdate(sql);
        System.out.println("Table créée avec succés...");*/
        //étape 5: fermez l'objet de connexion
        conn.close();


    } catch (Exception e ) {
        System.out.println("not connected");
        System.out.println(e);

    }
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}