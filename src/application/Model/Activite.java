package application.Model;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Activite {
	
	private String nom;
	private int prix;
	private int capacite;
	
	public Activite(String n, int p, int c) {
		nom = n ;
		prix = p ;
		capacite = c ;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	
	public Activite getActivite() {
		return this;
	}
	
	public void setActivite(String nom, int prix, int capacite) {
		this.nom = nom;
		this.prix = prix;
		this.capacite = capacite; 
	}
	
	public void addToDataBase() {
		try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = (Connection) DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/periscolaire?characterEncoding=latin1", "root", "Jmay1994Tahi-ti1");
            System.out.println("Activite : connected");

            Statement stmt = (Statement) conn.createStatement();
            String sql = "INSERT INTO ACTIVITE " +
                     "(intitule,prix,capacite) values('" + this.getNom() + "', '" + this.getPrix() + "', '" + this.getCapacite() + "')";
            
            stmt.executeUpdate(sql);
            
            // Test
            System.out.println("Activite " + this.nom + " ajoutée");
            System.out.println();
            
            conn.close();
            
    	} catch (Exception e ) {
            System.out.println("Activite : " + e);

        }
	}
	
	public void removeFromDataBase() {
		try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = (Connection) DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/periscolaire?characterEncoding=latin1", "root", "Jmay1994Tahi-ti1");
            System.out.println("Activite : connected");

            Statement stmt = (Statement) conn.createStatement();
            String sql = "DELETE FROM ACTIVITE WHERE intitule='" + this.getNom() + "'";
            
            stmt.executeUpdate(sql);
            
            // Test
            System.out.println("Activite " + this.nom + " supprimée");
            System.out.println();
            
            conn.close();
            
    	} catch (Exception e ) {
            System.out.println("Activite : " + e);

        }
	}
	
	public String toString() {
		return "Intitulé : " + this.nom + "\nPrix : " + this.prix + "\nCapacite : " + this.capacite;
	}

}
