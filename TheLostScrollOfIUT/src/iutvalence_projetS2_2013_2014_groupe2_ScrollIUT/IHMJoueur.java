package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

// TODO: Auto-generated Javadoc
/**
 * The Class IHMJoueur.
 */
public class IHMJoueur
{

	/**
	 * Verifie si le mouvement est possible.
	 */
	public void demandeMouvement()
	{
	}

	/**
	 * actualise l'image a l'ecran.
	 */
	public void actualiserImage()
	{
	}

	/**
	 * Verifie si l'attaque est possible.
	 */
	public boolean demandeAttaque(Case pos)
	{
		//if (pos.caseEnFace==null) || (pos.caseEnFace==decors)
			return false;
	}

	/**
	 * Affiche les d�gats inflig�s par le joueur.
	 * 
	 * @return renvoi la valeur des degats faits
	 */
	public int afficheDegats()
	{
		return 0;
	}

	/**
	 * Affiche les classes disponibles
	 * 
	 * @param prend
	 *            en entr�e un personnage
	 */
	public void choixDeClasse(Personnage p1)
	{
	}

	/**
	 * Affiche la classe s�l�ctionn�
	 */
	public void afficherClasse()
	{
	}

	/**
	 * Demande la selection d'un objet
	 */
	public void selectionnerUnObjet()
	{
	}

	/**
	 * Selectionenr une r�ponse parmis N choix
	 */
	public void selection()
	{
	}

	/**
	 * Permet d'afficher l'enigme a l'ecran
	 */
	public void afficherEnigme(Porte p)
	{
		if (p.presenceEnigme() == true)
		{

			switch (p.numeroporte)
			{
				case 0:
					break;
				case 1:
					// La question est bizarre ... c'est pas plut�t en binaire
					System.out.println("Combien fait 1+1 en informatique ?");
					break;
				case 2:
					System.out.println("Quel langage avons nous appris en algorithmie ?");
					break;
				default:

			}

		}
		else
		{

		}
	}

	/**
	 * Verifie si la porte necessite une cl� pour etre ouverte
	 * 
	 * @return true, if successful
	 */
	
	//Je me demande si il faut vraiment faire cette m�thode, vu que besoinCle est deja un bool�en. -TB
	public boolean demandeClefsPorte(Porte p)
	{
		if (p.besoinCle == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * Verifie si le coffre necessite une cl� pour etre ouvert
	 * 
	 * @return true, if successful
	 */
	
	//Idem pour ici -TB
	public boolean demandeClefsCoffre(Coffre c)
	{
		if (c.besoinCle == true)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
}
