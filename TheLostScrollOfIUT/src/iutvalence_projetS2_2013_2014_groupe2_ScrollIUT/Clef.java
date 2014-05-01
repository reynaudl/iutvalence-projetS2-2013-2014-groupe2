package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

/**
 * La sous-classe Clef qui étends de la classe Item
 */
public class Clef extends Item {
	
	/** Le compteur de clefs */
	private int compteurDeClef;

	/** La couleur de la clef */
	private Couleur couleurClef;
	
	/**
	 * Constructeur de Clef.
	 *
	 * @param nomItem le nom de l'item
	 * @param type la type de l'item
	 * @param couleurClef la couleur de la clef
	 * @param compteurClef le compteur de clef
	 */
	public Clef(String nomItem,Couleur couleurClef,int compteurClef) 
	{
		super(nomItem, "clé",0,0);
		this.couleurClef = couleurClef;
		this.compteurDeClef = compteurClef;
	}
	
	/**
	 * Permet d'obtenir le compteur de clef
	 *
	 * @return compteurDeClef le nombre de clefs
	 */
	public int obtenirCompteurDeClef() 
	{
		return this.compteurDeClef;
	}

	/**
	 * Permet d'obtenir la couleur de la clef
	 *
	 * @return couleurClef la couleur de la clef
	 */
	public Couleur obtenirCouleurClef() 
	{
		return this.couleurClef;
	}

}
