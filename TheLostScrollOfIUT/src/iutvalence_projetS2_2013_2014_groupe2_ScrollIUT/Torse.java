package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

/**
 * La sous-classe Torse qui étend de la classe Item
 */
public class Torse extends Item {
	
	/** la valeur de l'armure du torse */
	private int armure;

	/**
	 * Constructeur de Torse
	 *
	 * @param nomItem le nom de l'item
	 * @param type le type de l'item
	 * @param armure la valeur de l'armure
	 */
	public Torse(String nomItem, String type, int armure) 
	{
		
		super(nomItem, type,armure,0);
		
		
		
	}

	/**
	 * Permet d'obtenir la valeur de l'armure du torse
	 *
	 * @return armure la valeur de l'armure du torse
	 */
	public int obtenirArmure() 
	{
		return this.armure;
	}
  
	
	
}
