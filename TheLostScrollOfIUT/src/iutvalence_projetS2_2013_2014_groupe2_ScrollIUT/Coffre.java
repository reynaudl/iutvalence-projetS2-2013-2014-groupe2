package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.security.SecureRandom;

/**
 * La classe Coffre, sous-classe de Decors qui �tend la classe Decors et
 * mat�rialise les coffres.
 * 
 */

public class Coffre extends Decors {

	/**
	 * Donne l'�tat du coffre, s'il est ferm�e (False) s'il est
	 * ouvert(True).
	 */
	private boolean etat;

	/**
	 * Constructeur de coffre
	 * 
	 * @param boolean besoinDeCle d�fini si le coffre necessite une cl� pour
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
	 * Accesseur pour savoir le besoin de cl� du coffre
	 * 
	 * @return l'attribut besoin de cl� du coffre
	 */

	public boolean obtenirBesoinCle() {
		return this.besoinCle;
	}

}
