package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.awt.event.KeyEvent;

/**
 * La Classe Personnage.
 */
public abstract class Personnage
{
	/** Ensemble de constantes. */
	private static final int ATTAQUE_DE_BASE = 1;

	private static final int ARMURE_DE_BASE = 0;

	private static final int MULTIPLICATEUR_DEGAT_DE_BASE = 1;

	private static final int ESQUIVE_DE_BASE = 10;

	private static final int PV = 50;

	/** le nom du personnage. */
	public String nomPersonnage;

	/** leur nombre de point de vie associ�. */
	public int pointDeVie;

	/** Repr�sente la puissance d'attaque. */
	public int attaque;

	/** Repr�sente l'armure du personnage. */
	public int armure;

	/** Représente le multiplicateur de dégat du personnage. */
	public double multiplicateur;

	/** Représente le taux d'esquive du personnage. */
	public int esquive;

	/** Représente la liste des items que porte le personnage. */
	public Item[] itemCourant;

	public Case postionPersonnage;

	public Personnage(String nom)
	{

		this.nomPersonnage = nom;
		this.pointDeVie = PV;
		this.attaque = ATTAQUE_DE_BASE;
		this.armure = ARMURE_DE_BASE;
		this.multiplicateur = MULTIPLICATEUR_DEGAT_DE_BASE;
		this.esquive = ESQUIVE_DE_BASE;
		itemCourant = new Item[3];
		itemCourant[0] = new Item("Botte en laine", "Bottes", 1, 0);
		itemCourant[1] = new Item("Armure en laine", "Armure", 1, 0);
		itemCourant[2] = new Item("Arme de poing", "Arme", 0, 4);

	}

	/**
	 * Obtenir point de vie permet d'avoir acc�s au nombre de point de vie du
	 * personnage.
	 * 
	 * @return renvoie son nombre de point de vie
	 */
	public int obtenirPointDeVie()
	{
		return this.pointDeVie;
	}

	/**
	 * Obtenir attaque permet d'avoir acc�s a la puissance d'attaque du
	 * personnage
	 * 
	 * @return renvoie sa puissance d'attaque
	 */
	public int obtenirAttaque()
	{
		return this.attaque;
	}

	/**
	 * Obtenir armure permet d'avoir acc�s a la caracteristique d'armure que
	 * possede le personnage
	 * 
	 * @return renvoie l'armure du personnage
	 */
	public int obtenirArmure()
	{
		return this.armure;
	}

	/**
	 * Obtenir le multiplicateur permet le calcule des dégats du personnage
	 * 
	 * @return renvoie le multiplicateur du personnage
	 */
	public double obtenirMultiplicateur()
	{
		return this.multiplicateur;
	}

	public int obtenirEsquive()
	{
		return this.esquive;
	}

	public void attaqueSpecial()
	{

	}

	public void passif()
	{

	}

	public Case obtenirPositionPersonnage()
	{
		return this.postionPersonnage;
	}
	
	
}
