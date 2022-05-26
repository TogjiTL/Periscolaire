package application.Model;

public class Activite {
	
	private String nom;
	private String prix;
	private String capacite;
	
	public Activite(String n, String p, String c) {
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

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public String getCapacite() {
		return capacite;
	}

	public void setCapacite(String capacite) {
		this.capacite = capacite;
	}

}
