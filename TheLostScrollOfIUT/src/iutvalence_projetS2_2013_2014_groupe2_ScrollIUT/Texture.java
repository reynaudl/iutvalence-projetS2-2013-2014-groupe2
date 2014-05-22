package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.awt.Image;
import javax.swing.ImageIcon;

public enum Texture {
	
	SOL(false,new ImageIcon("sol.png").getImage()),
	MUR(true,new ImageIcon("mur.png").getImage()),
	COFFRE(true,new ImageIcon("coffre.png").getImage()),
	PORTE(true,new ImageIcon("porte.png").getImage()),
	PORTE_OUVERTE (false,new ImageIcon("porte_ouverte.png").getImage()),
	DEBRIS(true,new ImageIcon("debris.png").getImage()),
	FENETRE(true,new ImageIcon("fenetre.png").getImage()),
	LANTERNE(true,new ImageIcon("lanterne.png").getImage()),
	VIDE (true,new ImageIcon("vide.png").getImage());
	

	
	private boolean estBloquante;
	private Image icone;
	
	private Texture(boolean blok,Image image)
	{
		this.estBloquante = blok;
		this.icone = image;
	}
	
	public boolean caseBloquante()
	{
		return this.estBloquante;
	}
	
	public Image obtenirIcone()
	{
		return this.icone;
	}
}
