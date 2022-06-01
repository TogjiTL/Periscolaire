package application.test;

import org.junit.Before;
import org.junit.Test;

import application.Model.Enfant;
import application.Model.ListeEnfant;
import junit.framework.TestCase;

public class MaClasseTestEnfant extends TestCase {
	
	private Enfant e ;
	private ListeEnfant le;
	
	@Before
	public void setUp() {
		
		String nom = "Commaret";
		String prenom = "Maxime";
		String age = "21";
		String numParent = "0654585996";
		
		e = new Enfant(nom,prenom,age,numParent);
		
		
		le = new ListeEnfant();
		le.addEnfant(e);
		
	}
	
	@Test
	public void testEnfant() {
		
        assertEquals(0.0,e.getCout());
        assertEquals(e.getNom(),"Commaret");
        assertEquals(e.getPrenom(),"Maxime");
        assertEquals(e.getAge(),"21");
        assertEquals(e.getNumParent(),"0654585996");
        
        
  }
	
	@Test
	public void testListeEnfant() {
		
		Enfant enfant = le.chercheEnfant("Maxime");
		
		assertEquals(enfant, e);
	}


}
