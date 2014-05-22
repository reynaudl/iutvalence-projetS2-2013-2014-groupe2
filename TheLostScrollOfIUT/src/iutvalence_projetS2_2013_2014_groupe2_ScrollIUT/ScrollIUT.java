package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import javax.swing.SwingUtilities;

// TODO: Auto-generated Javadoc
/**
 * The Class ScrollIUT.
 */
public class ScrollIUT
{
	

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new IHMJoueur());
		
		
		
	}

	/**
	 * Declenche mouvement du personnage sur la carte.
	 */
	public void declencheMouvement()
	{
	}

	/**
	 * Declenche l'attaque du personnage en jeu.
	 */
	
	public void declencheAttaque(Personnage p, Personnage cible)
	{
		cible.pointDeVie = (int) (cible.obtenirPointDeVie()-(p.obtenirAttaque()*p.obtenirMultiplicateur()-cible.obtenirArmure()));
	}

	/**
	 * Selectionne la classe choisi par le joueur.
	 * 
	 * @param prend
	 *            en entr�e un personnage
	 */
	public void selectionClasse(Personnage p)
	{
	}

	/**
	 * Permet de recuperer un nouvel objet.
	 */
	public void acquisitionDuNouvelObjet()
	{
	}

	/**
	 * Cette methode calcul aleatoirement l'armure de l'objet recuper�.
	 * 
	 * @param armure
	 *            the armure
	 */
	public void calcul(int armure)
	{
		
	}

	/**
	 * Permet l'ouverture de portes et de coffres.
	 */
	public void declencheSystemeOuverture()
	{
		
	}



}
