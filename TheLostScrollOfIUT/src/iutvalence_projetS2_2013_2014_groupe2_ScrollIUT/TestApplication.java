package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;
import junit.framework.*;



public class TestApplication extends TestCase{


public TestApplication(String name){
	super(name); //appel du constructeur de TestCase
}





public void verifieEtatCoffre(){
	Coffre c1= new Coffre(true, false);
	Coffre c2= new Coffre(false, false);
	

	

	assertEquals(c1.obtenirBesoinCle(),(true));
	assertEquals(c2.obtenirBesoinCle(),(false));


}
	
public void verifieEnigme(){
	
	
}


	

	
	
	public static TestSuite suite() {
		  TestSuite suite= new TestSuite();
		 
		  suite.addTest(new TestApplication("verifieEtatCoffre"));
		  

		  return suite;
		}
}



