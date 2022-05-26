package application.Controller;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;


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
		
		 try
	        {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con=DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/periscolaire?characterEncoding=latin1","root","Jmay1994Tahi-ti1");
	            Statement stmt=con.createStatement();
	            ResultSet rs=stmt.executeQuery("show databases;");
	            
	         // create a Statement from the connection
	            Statement statement = con.createStatement();

	            // insert the data
	            statement.executeUpdate("INSERT INTO Customers " + "VALUES (1001, 'Simpson', 'Mr.', 'Springfield', 2001)");
	            System.out.println("Connected");
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}