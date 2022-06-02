package application.Model;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/** 
 * Cette classe permet la gestion des données relatives aux activités
 * */

public class Activite {
	
	private String nom;
	private int prix;
	private int capacite;
	
	/**
	 * @param n intitule de l'activité
	 * @param p prix de l'activité
	 * @param c capacité d'accueil de l'activité*/
	public Activite(String n, int p, int c) {
		nom = n ;
		prix = p ;
		capacite = c ;
	}

	/**
	 * @return l'intitulé de l'activité
	 * */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom l'intitulé de l'activité
	 * */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return le prix de l'activité
	 * */
	public int getPrix() {
		return prix;
	}

	/**
	 * @param prix le prix de l'activité
	 * */
	public void setPrix(int prix) {
		this.prix = prix;
	}

	/**
	 * @return la capcité d'accueil de l'activité
	 * */
	public int getCapacite() {
		return capacite;
	}

	/**
	 * @param capacite la capacité d'accueil pour cette activité
	 * */
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
	
	/**
	 * Permet l'ajout des données de l'activité en base de données
	 * */
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
	
	/**
	 * Permet la suppression des données de l'activité en base de données
	 * */
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
	
	@Override
	public String toString() {
		return "Intitulé : " + this.nom + "\nPrix : " + this.prix + "\nCapacite : " + this.capacite;
	}

}
