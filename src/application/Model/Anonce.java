package application.Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Anonce {
	
	static ArrayList anonce = new ArrayList<>(Arrays.asList("Activité Foot complète"));
	   
	   public Anonce(){
		   
	   }

	public static ArrayList<String> getAnonce() {
		return anonce;
	}


	public void add(String d) {
		anonce.add(d);
	}
	   
	   

}