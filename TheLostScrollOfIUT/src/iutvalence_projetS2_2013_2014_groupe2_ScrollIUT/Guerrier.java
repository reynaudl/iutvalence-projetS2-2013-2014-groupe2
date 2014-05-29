package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

public class Guerrier extends Personnage {
	/**
	 * Le constructeur du personnage guerrier
	 * 
	 * @param String
	 *            nom le nom du guerrier
	 */
	public Guerrier(String nom) {
		super(nom);
		this.armure = 10;
		this.multiplicateur = 1.5;
		this.postionPersonnage = new Case(10, 10, Texture.GUERRIER, null);
		this.nomClasse = "guerrier";

	}

	/**
	 * Défini l'attaque special du guerrier
	 */
	public void attaqueSpecial() {
		if (pointDeVie >= 40)
			pointDeVie = 50;
		else
			pointDeVie = pointDeVie + 10;
	}

	/**
	 * Défini l'abilité passive du guerrier
	 */

	public void passif() {
		if (pointDeVie <= 49)
			pointDeVie = pointDeVie + 1;
		else
			pointDeVie = 50;
	}

}
