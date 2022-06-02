package application.Model;

import java.sql.DriverManager;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class ListeActivite {
	
	private  ArrayList<Activite> listeAct = new ArrayList<>();
	
	public ListeActivite() {
		try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = (Connection) DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/periscolaire?characterEncoding=latin1", "root", "Jmay1994Tahi-ti1");
            System.out.println("Activite : connected");

            Statement stmt = (Statement) conn.createStatement();
            String sql = "SELECT intitule, prix, capacite FROM ACTIVITE";
            
            ResultSet res = (ResultSet) stmt.executeQuery(sql);
            
            while(res.next()){
                //Récupérer par nom de colonne
                String nom = res.getString("intitule");
                int prix = res.getInt("prix");
                int capacite = res.getInt("capacite");
                
                this.listeAct.add(new Activite(nom, prix, capacite));
                
                //Afficher les valeurs
                System.out.print("Intitule : " + nom);
                System.out.print(", Prix : " + prix);
                System.out.println(", Capacite: " + capacite);
             }  
            
            conn.close();
            
    	} catch (Exception e ) {
            System.out.println("Activite : " + e);

        }

	}
	
	
	public void addActivite(Activite e) {
		listeAct.add(e);
	}
	
	public Activite chercheActivite(String n) {
		for ( Activite e : listeAct ) {
			if( e.getNom().equals(n)) return e;
		}
		return null;
	}


	public ArrayList<Activite> getListeActivite() {
		return listeAct;
	}
	

}
