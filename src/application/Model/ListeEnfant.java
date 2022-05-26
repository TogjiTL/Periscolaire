package application.Model;


import java.util.ArrayList;

public class ListeEnfant {
	
	private  ArrayList<Enfant> listeEnfant = new ArrayList<>();
	
	public ListeEnfant() {
		
	}
	
	
	public void addEnfant(Enfant e) {
		listeEnfant.add(e);
	}
	
	public Enfant chercheEnfant(String n) {
		for ( Enfant e : listeEnfant ) {
			if( e.getPrenom().equals(n)) return e;
		}
		return null;
	}


	public ArrayList<Enfant> getListeEnfant() {
		return listeEnfant;
	}
	

}
