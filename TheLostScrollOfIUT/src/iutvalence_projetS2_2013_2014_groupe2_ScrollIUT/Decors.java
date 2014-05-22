package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

/**
 * La classe Decor repr�sentant les d�cors (portes et coffres) dans
 * l'application.
 */
public class Decors {
	/**
	 * Le nom du d�cors.
	 */
	private String nom;
	/**
	 * La position du d�cors sur la carte, d�finit par une Case.
	 */
	private Case position;

	public Decors(String nom,Case pos)
	{
		this.nom = nom;
		this.position=pos;
		
	}

	/**
	 * 
	 * @return Renvoie si une �nigme est pr�sente ou non sur le d�cor.
	 */
	public boolean presenceEnigme() {
		return false;
	}
	
	
}
