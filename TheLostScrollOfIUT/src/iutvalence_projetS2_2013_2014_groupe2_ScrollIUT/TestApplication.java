package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;
import junit.framework.*;



public class TestApplication extends TestCase{


public TestApplication(String name){
	super(name); //appel du constructeur de TestCase
}


public void verifieEtatCoffre() {
	

	Coffre c1= new Coffre(true, false);
	Coffre c2= new Coffre(false, false);
	
	assertEquals(c1.obtenirBesoinCle(),(true));
	assertEquals(c2.obtenirBesoinCle(),(false));

}



	
public void verifieItemObtenuDifferent() {
	

	Item ib = new Item("Botte en laine", "Bottes", 1, 0);
	Item i2 = new Item("Botte en Diamand", "Bottes", 10, 0);
	Item i3 = new Item("Botte en Diamand", "Bottes", 10, 0);
	
	
	assertNotSame(ib,i2);
	assertNotSame(i2,i3);
	assertNotSame(ib,null);
	
}




//Erreur dans le test non résolue.
public void verifieMajItem() {
	
	Personnage p1 = new Guerrier("Test1");

	
	Item ib = new Item("Botte en laine", "Bottes", 1, 0);
	Item i2 = new Item("Botte en Diamand", "Bottes", 10, 0);
	
	p1.miseAJourDeLEquipement(i2, null);
	assertNotSame("Y a-t-il changement d'item ?",p1.itemCourant[0],i2);
	
}



	
	
	public static TestSuite suite() {
		  TestSuite suite= new TestSuite();
		 
		  suite.addTest(new TestApplication("verifieEtatCoffre"));
		  suite.addTest(new TestApplication("verifieItemObtenuDifferent"));
		  suite.addTest(new TestApplication("verifieMajItem"));




		  

		  return suite;
		}
}



