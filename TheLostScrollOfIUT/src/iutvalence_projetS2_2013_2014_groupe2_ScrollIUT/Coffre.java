package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.security.SecureRandom;

/**
 * La classe Coffre, sous-classe de Decors qui ï¿½tend la classe Decors et
 * matï¿½rialise les coffres.
 * 
 */

public class Coffre extends Decors {

	/**
	 * Donne l'ï¿½tat du coffre, s'il est fermï¿½e (False) s'il est
	 * ouvert(True).
	 */
	private boolean etat;

	/**
	 * Constructeur de coffre
	 * 
	 * @param boolean besoinDeCle défini si le coffre necessite une clé pour
	 *        etre ouvert
	 */

	public Coffre(boolean besoinDeCle) {
		super("Coffre", besoinDeCle);
		this.etat = false;

	}

	/**
	 * Permet de changer l'etat courant du coffre
	 */

	public void changerDEtat() {
		if (this.etat == false) {

			this.etat = true;
		}
	}

	/**
	 * Accesseur pour savoir le besoin de clé du coffre
	 * 
	 * @return l'attribut besoin de clé du coffre
	 */

	public boolean obtenirBesoinCle() {
		return this.besoinCle;
	}

}
