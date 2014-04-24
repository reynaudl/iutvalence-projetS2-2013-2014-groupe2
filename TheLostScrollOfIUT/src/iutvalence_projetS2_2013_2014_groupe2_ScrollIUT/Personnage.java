	package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

// TODO: Auto-generated Javadoc
/**
 * The Class Personnage.
 */
public class Personnage {
	
	/** le nom du personnage. */
	public  String nomPersonnage;
	
	/** leur nombre de point de vie associé. */
	public   int PointDeVie;
	
	/** Représente la puissance d'attaque. */
	public  int Attaque;
	
	/** Représente l'armure du personnage. */
	public  int Armure;
	
	
	/**
	 * Obtenir point de vie permet d'avoir accès au nombre de point de vie du personnage.
	 *
	 * @return renvoie son nombre de point de vie
	 */
	public int obtenirPointDeVie() {
		return PointDeVie;
	}
	
	/**
	 * Obtenir attaque permet d'avoir accès a la puissance d'attaque du personnage
	 *
	 * @return renvoie sa puissance d'attaque
	 */
	public int obtenirAttaque() {
		return Attaque;
	}
	
	/**
	 * Obtenir armure permet d'avoir accès a la caracteristique d'armure que possede le personnage
	 *
	 * @return renvoie l'armure du personnage
	 */
	public int obtenirArmure() {
		return Armure;
	}
	
	
	
	
	
	
	
}
