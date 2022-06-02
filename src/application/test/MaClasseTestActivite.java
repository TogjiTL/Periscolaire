package application.test;

import org.junit.Before;
import org.junit.Test;

import application.Model.Activite;
import application.Model.ListeActivite;
import junit.framework.TestCase;

public class MaClasseTestActivite extends TestCase {
		
		private Activite a ;
		private ListeActivite la;
		
		@Before
		public void setUp() {
			
			String nom = "Tennis";
			int prix = 10;
			int capacite = 4;
			
			a = new Activite(nom,prix,capacite);
			
			la = new ListeActivite();
			la.addActivite(a);
			
		}
		
		@Test
		public void testActivite() {
			
	        assertEquals(a.getNom(),"Tennis");
	        assertEquals(a.getPrix(),"10");
	        assertEquals(a.getCapacite(),"4");
	        
	        
	  }
		
		@Test
		public void testListeActivite() {
			
			Activite activite = la.chercheActivite("Tennis");
			
			assertEquals(activite, a);
		}

}