package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.awt.Image;
import javax.swing.ImageIcon;

public enum Texture {
	
	SOL(false,"sol.png"),
	MUR(true,"mur.png"),
	COFFRE(true,"coffre.png"),
	PORTE(true,"porte.png"),
	PORTE_OUVERTE (false,"porte_ouverte.png"),
	DEBRIS(true,"debris.png"),
	FENETRE(true,"fenetre.png"),
	LANTERNE(true,"lanterne.png"),
	VIDE (true,"vide.png");
	

	
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
