package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

/**
 * La classe Item qui représente un objet dans l'application.
 */
public class Item {

	/** Le nom de l'item. */
	private String nomItem;

	private int armure;

	protected int attaque;

	private String type;

	/**
	 * Constructeur de l'item
	 * 
	 * @param nomItem
	 *            le nom de l'item
	 * @param type
	 *            le type de l'item
	 * @param attaque
	 *            la puissance d'attaque de l'item
	 */
	public Item(String nomItem, String type, int armure, int attaque) {
		this.nomItem = nomItem;
		this.armure = armure;
		this.attaque = attaque;
		this.type = type;
	}

	/**
	 * Permet d'obtenir le nom de l'item.
	 * 
	 * @return nomItem le nom de l'item
	 */
	public String obtenirNomItem() {
		return this.nomItem;
	}

	/**
	 * Permet d'obtenir le type de l'item.
	 * 
	 * @return type le type de l'item
	 */
	public String obtenirType() {
		return this.type;
	}

	/**
	 * Permet d'obtenir l'armure de l'item.
	 * 
	 * @return l'armure de l'item
	 */
	public int obtenirArmure() {
		return this.armure;
	}

	/**
	 * Permet d'obtenir l'attaque de l'item.
	 * 
	 * @return l'attaque de l'item
	 */
	public int obtenirAttaque() {
		return this.attaque;
	}

}
