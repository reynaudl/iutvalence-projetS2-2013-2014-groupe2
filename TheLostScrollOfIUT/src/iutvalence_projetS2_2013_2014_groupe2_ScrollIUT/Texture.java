package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.awt.Image;
import javax.swing.ImageIcon;

public enum Texture {
	
	SOL(false,"texture/sol.png"),
	MUR(true,"texture/mur.png"),
	COFFRE(true,"texture/coffre.png"),
	PORTE_FERMER(true,"texture/porte fermer.png"),
	PORTE_OUVERTE (false,"texture/porte_ouverte.png"),
	DEBRIS(true,"texture/debris.png"),
	FENETRE(true,"texture/fenetre.png"),
	LANTERNE(true,"texture/lanterne.png"),
	VIDE (true,"texture/vide.png"),
	CHASSEUR(true,"texture/chasseur.png"),
	GUERRIER(true,"texture/guerrier.png"),
	SORCIER(true,"texture/mage.png"),
	TABLE(true,"texture/table.png"),
	MONSTRE(true,"texture/monstre.png"),
	PILIER(true,"texture/pilier.png"),
	COFFRE_OUVERT(true,"texture/coffre_ouvert.png");
	

	
	private boolean estBloquante;
	private String icone;
	
	/**
	 * Constructeur de texture.
	 * 
	 * @param blok
	 *            si la texture est bloquante ou non
	 * @param image
	 *            chemin vers la texture
	 */
	private Texture(boolean blok,String image)
	{
		this.estBloquante = blok;
		this.icone = image;
	}
	
	/**
	 * Permet d'avoir acces a l'attribut bloquant de la case
	 * 
	 * @return  si la case est bloquante ou non
	 */
	
	public boolean caseBloquante()
	{
		return this.estBloquante;
	}
	
	/**
	 * Permet d'avoir acces a l'icone  de la case
	 * 
	 * @return  l'icone correspondante a la case
	 */
	
	public String obtenirIcone()
	{
		return this.icone;
	}
}
