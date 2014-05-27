package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;
import junit.framework.*;



public class TestApplication extends TestCase{


public TestApplication(String name){
	super(name); //appel du constructeur de TestCase
}





public void verifieEtatPorte(){
	//Porte p1= new Porte(1,4,PORTE,true, true, 1);
	//Porte p1= new Porte(1,4,PORTE,false, true, 1);

	//assertEquals(p1.changerDEtat(true, true));
	//assertEquals(p2.changerDEtat(false, true));
}
	



public void verifieTextureBlocante(){
	//Texture t1= new Texture(true,"porte.png");
	//Texture t2= new Texture(false,"sol.png");

	
	//assertEquals(t1.caseBloquante(true, true));
	//assertEquals(t2.caseBloquante(false, false));



}




	
	/*
	 * exemple
	 * public void methodeTest() throws ExeptionClass {
	try {
	ClassAT c1= new ClassAT();
	ClassAT c2= new ClassAT();
	ClassAT c3= new ClassAT();
	assertEquals(c1.methodeCAT(), false);
	assertEquals(c2.methodeCAT(), false);
	assertEquals(c3.methodeCAT(), true);	
	}
	catch (ExeptionClass e){}
	}*/
	
	
	
	public static TestSuite suite() {
		  TestSuite suite= new TestSuite();
		 
		  suite.addTest(new TestApplication("verifieEtat"));
		  suite.addTest(new TestApplication("verifieTextureBlocante"));

		  return suite;
		}
}



