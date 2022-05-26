package application.Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Horairee {
	
	static ArrayList Heure = new ArrayList<>(Arrays.asList(
	    		"10h - 12h  /  14h - 16h",
	    		"10h - 12h  /  14h - 16h",
	    		"10h - 12h",
	    		"10h - 12h  /  14h - 16h",
	    		"10h - 12h  /  14h - 16h",
	    		"10h - 12h",
	    		"Fermé"));
	   
	   public Horairee(){
		   
	   }

	public static ArrayList<String> getHeure() {
		return Heure;
	}


	public void change(String d, int i) {
		Heure.remove(i);
		Heure.add(i, d);
	}
	   
	   

}
