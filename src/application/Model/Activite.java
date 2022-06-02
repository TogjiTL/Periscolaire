package application.Model;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/** 
 * Cette classe permet la gestion des donn�es relatives aux activit�s
 * */

public class Activite {
	
	private String nom;
	private int prix;
	private int capacite;
	
	/**
	 * @param n intitule de l'activit�
	 * @param p prix de l'activit�
	 * @param c capacit� d'accueil de l'activit�*/
	public Activite(String n, int p, int c) {
		nom = n ;
		prix = p ;
		capacite = c ;
	}

	/**
	 * @return l'intitul� de l'activit�
	 * */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom l'intitul� de l'activit�
	 * */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return le prix de l'activit�
	 * */
	public int getPrix() {
		return prix;
	}

	/**
	 * @param prix le prix de l'activit�
	 * */
	public void setPrix(int prix) {
		this.prix = prix;
	}

	/**
	 * @return la capcit� d'accueil de l'activit�
	 * */
	public int getCapacite() {
		return capacite;
	}

	/**
	 * @param capacite la capacit� d'accueil pour cette activit�
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
	 * Permet l'ajout des donn�es de l'activit� en base de donn�es
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
            System.out.println("Activite " + this.nom + " ajout�e");
            System.out.println();
            
            conn.close();
            
    	} catch (Exception e ) {
            System.out.println("Activite : " + e);

        }
	}
	
	/**
	 * Permet la suppression des donn�es de l'activit� en base de donn�es
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
            System.out.println("Activite " + this.nom + " supprim�e");
            System.out.println();
            
            conn.close();
            
    	} catch (Exception e ) {
            System.out.println("Activite : " + e);

        }
	}
	
	@Override
	public String toString() {
		return "Intitul� : " + this.nom + "\nPrix : " + this.prix + "\nCapacite : " + this.capacite;
	}

}
