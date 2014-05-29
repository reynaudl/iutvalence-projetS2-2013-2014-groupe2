package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import javax.swing.SwingUtilities;

// TODO: Auto-generated Javadoc
/**
 * The Class ScrollIUT.
 */
public class ScrollIUT {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new IHMJoueur());

	}

	/**
	 * Declenche l'attaque du personnage en jeu.
	 */

	public void declencheAttaque(Personnage p, Personnage cible) {
		cible.pointDeVie = (int) (cible.obtenirPointDeVie() - (p
				.obtenirAttaque() * p.obtenirMultiplicateur() - cible
				.obtenirArmure()));
	}
}
