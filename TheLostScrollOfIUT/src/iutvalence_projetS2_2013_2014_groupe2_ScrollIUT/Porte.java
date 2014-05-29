package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

/**
 * La classe Porte, sous-classe de Decors qui ï¿½tend la classe Decors et
 * matï¿½rialise les portes.
 * 
 */
public class Porte extends Decors {

	/**
	 * Donne l'ï¿½tat de la porte, si elle est fermï¿½e (False) ou
	 * ouverte(True).
	 */
	private boolean etat;
	private Couleur couleurPorte;

	public boolean estOuverte() {
		if (this.etat == true)
			return true;
		return false;
	}

	/**
	 * Constructeur de porte.
	 * 
	 * @param besoinCLe
	 *            défini si la porte a besoin d'une clé
	 */

	public Porte(boolean besoinCle) {
		super("Porte", besoinCle);
		this.etat = false;

	}

	/**
	 * Permet d'obtenir la couleur de la porte
	 * 
	 * @return la couleur de la porte
	 */

	public Couleur obtenirCouleurPorte() {
		return this.couleurPorte;
	}

	/**
	 * Permet de changer l'etat courant de la porte
	 */

	public void changerDEtat() {
		if (this.etat == true)
			this.etat = false;
		else
			this.etat = true;
	}

	/**
	 * Permet de diriger l'ouverture d'une porte
	 */

	public void Ouvertureporte(Clef c, Porte p) {
		if (p.estOuverte() == false) {
			if (p.besoinCle = true) {
				if (p.obtenirCouleurPorte() == c.obtenirCouleurClef()) {
					if (this.presenceEnigme() == true) {
						System.out
								.println("Vous devez rï¿½pondre a l'enigme pour ouvrir cette porte");
					} else
						p.changerDEtat();
					int nbcle = c.obtenirCompteurDeClef();
					nbcle--;
				}
				System.out
						.println("Vous ne disposez pas de la bonne clï¿½ pour ouvrir la porte");
			}
		}
	}

}
