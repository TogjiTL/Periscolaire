package application.Model;


public class Enfant {
	
	private String nom;
	private String prenom;
	private String age;
	private String numParent;
	
	private double cout = 0;
	
	
	public Enfant(String n, String p, String a, String num) {
		nom = n ;
		prenom = p ;
		age = a ;
		numParent = num ;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getNumParent() {
		return numParent;
	}

	public void setNumParent(String numParent) {
		this.numParent = numParent;
	}

	public double getCout() {
		return cout;
	}

	public void setCout(double cout) {
		this.cout = cout;
	}
	

}
