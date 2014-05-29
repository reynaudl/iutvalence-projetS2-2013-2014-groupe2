package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

/**
 * La classe Porte, sous-classe de Decors qui �tend la classe Decors et
 * mat�rialise les portes.
 * 
 */
public class Porte extends Decors {

	/**
	 * Donne l'�tat de la porte, si elle est ferm�e (False) ou
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
	 *            d�fini si la porte a besoin d'une cl�
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
								.println("Vous devez r�pondre a l'enigme pour ouvrir cette porte");
					} else
						p.changerDEtat();
					int nbcle = c.obtenirCompteurDeClef();
					nbcle--;
				}
				System.out
						.println("Vous ne disposez pas de la bonne cl� pour ouvrir la porte");
			}
		}
	}

}
