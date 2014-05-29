package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

public class Chasseur extends Personnage {
	/**
	 * Le constructeur du personnage chasseur
	 * 
	 * @param String
	 *            nom le nom du chasseur
	 */
	public Chasseur(String nom) {
		super(nom);
		this.multiplicateur = 1.75;
		this.postionPersonnage = new Case(10, 10, Texture.CHASSEUR, null);
		this.nomClasse = "chasseur";
	}

	/**
	 * Défini l'attaque special du chasseur
	 */
	public void attaqueSpecial() {
		this.esquive = 50;
	}

	/**
	 * Défini l'abilité passive du chasseur
	 */
	public void passif() {
		this.esquive = 20;
	}
}
