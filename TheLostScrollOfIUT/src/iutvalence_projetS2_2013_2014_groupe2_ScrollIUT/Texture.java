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
	TABLE(true,"texture/table.png");
	

	
	private boolean estBloquante;
	private String icone;
	
	private Texture(boolean blok,String image)
	{
		this.estBloquante = blok;
		this.icone = image;
	}
	
	public boolean caseBloquante()
	{
		return this.estBloquante;
	}
	
	public String obtenirIcone()
	{
		return this.icone;
	}
}
