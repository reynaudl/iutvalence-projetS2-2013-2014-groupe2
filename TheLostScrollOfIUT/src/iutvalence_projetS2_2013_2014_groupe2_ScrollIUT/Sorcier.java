package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

public class Sorcier extends Personnage {
	/**
	 * Le constructeur du personnage Sorcier
	 * 
	 * @param String
	 *            nom le nom du Sorcier
	 */

	public Sorcier(String nom) {
		super(nom);
		this.multiplicateur = 2;
		this.postionPersonnage = new Case(10, 10, Texture.SORCIER, null);
		this.nomClasse = "sorcier";
	}

	/**
	 * D�fini l'attaque special du Sorcier
	 */

	public void attaqueSpecial() {
		this.multiplicateur = this.multiplicateur * 2;
	}

	/**
	 * D�fini l'abilit� passive du Sorcier
	 */
	public void passif() {
		int bouclier;
		/* 20 % des degats infligés" */

	}

}
