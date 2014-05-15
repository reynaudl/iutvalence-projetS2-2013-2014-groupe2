package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

/**
 * 
 * Enumération des différents mouvements possibles.
 * 
 */
public enum Mouvement
{

	HAUT(-1, 0), BAS(1, 0), GAUCHE(0, -1), DROITE(0, 1), FIXE(0, 0);

	/** Nouvelle position x. */
	private final int deltaX;
	/** Nouvelle position y. */
	private final int deltaY;

	/** Définition d'une direction. */
	private Mouvement(int dx, int dy)
	{
		this.deltaX = dx;
		this.deltaY = dy;
	}

	/** @return Renvoie la position de X. */
	public int getDeltaX()
	{
		return this.deltaX;
	}

	/** @return Renvoie la position de Y. */
	public int getDeltaY()
	{
		return this.deltaY;
	}


}
