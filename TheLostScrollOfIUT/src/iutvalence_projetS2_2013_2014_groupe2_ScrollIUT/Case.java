package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

public class Case {

	private int x;
	private int y;

	public Texture indexTexture;
	private Decors d;

	/**
	 * Constructeur d'une case
	 * 
	 * @param int x la position sur l'axe x
	 * @param int y la position sur l'axe y
	 * @param Texture
	 *            indexTexture Repr�sente la texture associ� a la case
	 * @param Decors
	 *            d Repr�sente l'objet du decors associ� a la case
	 */
	public Case(int x, int y, Texture indexTexture, Decors d) {
		this.x = x;
		this.y = y;
		this.indexTexture = indexTexture;
		this.d = d;
	}

	/**
	 * Accesseur au decors de la case courante
	 * 
	 * @return le decors de la case
	 */

	public Decors obtenirDecors() {
		return this.d;
	}

	/**
	 * Accesseur a la texture de la case courante
	 * 
	 * @return la texture de la case
	 */

	public Texture obtenirIndexTexture() {
		return this.indexTexture;
	}

	/**
	 * Accesseur a la coordonn�e x la case courante
	 * 
	 * @return la coordonn�e x
	 */

	public int obtenirX() {
		return this.x;
	}

	/**
	 * Accesseur a la coordonn�e y la case courante
	 * 
	 * @return la coordon�e y
	 */

	public int obtenirY() {
		return this.y;
	}

	/**
	 * Modifie la coordon�e x de la case
	 * 
	 * @param int a la nouvelle coordon�e x de la case
	 * 
	 */
	public void setX(int a) {
		this.x = a;
	}

	/**
	 * Modifie la coordon�e y de la case
	 * 
	 * @param int b la nouvelle coordon�e y de la case
	 */

	public void setY(int b) {
		this.y = b;
	}

	/**
	 * Modifie la texture de la case
	 * 
	 * @param Texture
	 *            t la nouvelle texture de la case
	 */

	public void setTexture(Texture t) {
		this.indexTexture = t;
	}

}