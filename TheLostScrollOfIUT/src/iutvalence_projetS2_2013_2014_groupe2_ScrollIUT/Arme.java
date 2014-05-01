package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

/**
 * La sous-classe Arme qui étends de la classe Item
 */
public class Arme extends Item {
		
	/**
	 * Constructeur de l'arme
	 *
	 * @param nomItem le nom de item
	 * @param type le type de l'item
	 * @param attaque la valeur de l'attaque de l'arme
	 */
		
	public Arme(String nomItem, int attaque) 
	{	
		super(nomItem,"Arme",0,attaque);	
	}

}
