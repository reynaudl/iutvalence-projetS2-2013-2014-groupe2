package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

public class Chasseur extends Personnage {
	 public Chasseur(String nom) {
	    	super(nom);
	    	this.multiplicateur=1.75;
	    }

	 public void attaqueSpecial()
	    {
	        esquive=50;
	    }
}
