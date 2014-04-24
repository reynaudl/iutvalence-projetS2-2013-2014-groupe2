	package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

// TODO: Auto-generated Javadoc
/**
 * The Class Personnage.
 */
public class Personnage {
	
	/** le nom du personnage. */
	public  String nomPersonnage;
	
	/** leur nombre de point de vie associ�. */
	public   int PointDeVie;
	
	/** Repr�sente la puissance d'attaque. */
	public  int Attaque;
	
	/** Repr�sente l'armure du personnage. */
	public  int Armure;
	
	
	/**
	 * Obtenir point de vie permet d'avoir acc�s au nombre de point de vie du personnage.
	 *
	 * @return renvoie son nombre de point de vie
	 */
	public int obtenirPointDeVie() {
		return PointDeVie;
	}
	
	/**
	 * Obtenir attaque permet d'avoir acc�s a la puissance d'attaque du personnage
	 *
	 * @return renvoie sa puissance d'attaque
	 */
	public int obtenirAttaque() {
		return Attaque;
	}
	
	/**
	 * Obtenir armure permet d'avoir acc�s a la caracteristique d'armure que possede le personnage
	 *
	 * @return renvoie l'armure du personnage
	 */
	public int obtenirArmure() {
		return Armure;
	}
	
	
	
	
	
	
	
}
