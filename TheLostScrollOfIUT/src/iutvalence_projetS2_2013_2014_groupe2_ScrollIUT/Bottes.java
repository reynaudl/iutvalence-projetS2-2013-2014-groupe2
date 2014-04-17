package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;


/**
 * La sous-classe Botte qui �tends la classe Item
 */
public class Bottes extends Item 
{

	/** La valeur de l'armure des bottes. */
	private int armure;
	
	/**
	 * Constructeur des bottes
	 *
	 * @param nomItem le nom de item
	 * @param type le type de l'item
	 * @param armure la valeur de l'armure des bottes
	 */
	public Bottes(String nomItem, String type, int armure) 
	{
		super(nomItem, type);
		this.armure = armure;
	}

	
	/**
	 * Permet d'obtenir l'armure des bottes
	 *
	 * @return armure la valeur de l'armure des bottes
	 */
	public int obtenirArmure() 
	{
		return this.armure;
	}
	
}
