package application.Model;

import java.util.ArrayList;

public class ListeActivite {
	
	private  ArrayList<Activite> listeAct = new ArrayList<>();
	
	public ListeActivite() {
		
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


	public ArrayList<Activite> getListeEnfant() {
		return listeAct;
	}
	

}
