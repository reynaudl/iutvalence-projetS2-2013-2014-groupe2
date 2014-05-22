package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Carte
{
	private static final int NB_COLONNES = 10;
	private static final int NB_LIGNES = 10;
	private Case[][] plateauCase = {
			{new Case(0,0,Texture.MUR),new Case(0,1,Texture.MUR),new Case(0,2,Texture.MUR),new Case(0,3,Texture.MUR),new Case(0,4,Texture.MUR),new Case(0,5,Texture.MUR),new Case(0,6,Texture.MUR),new Case(0,7,Texture.MUR),new Case(0,8,Texture.MUR),new Case(0,9,Texture.MUR)},
			{new Case(1,0,Texture.MUR),new Case(1,1,Texture.SOL),new Case(1,2,Texture.MUR),new Case(1,3,Texture.MUR),new Case(1,4,Texture.MUR),new Case(1,5,Texture.MUR),new Case(1,6,Texture.MUR),new Case(1,7,Texture.MUR),new Case(1,8,Texture.MUR),new Case(1,9,Texture.MUR)},
			{new Case(2,0,Texture.MUR),new Case(2,1,Texture.MUR),new Case(2,2,Texture.SOL),new Case(2,3,Texture.MUR),new Case(2,4,Texture.MUR),new Case(2,5,Texture.MUR),new Case(2,6,Texture.MUR),new Case(2,7,Texture.MUR),new Case(2,8,Texture.MUR),new Case(2,9,Texture.MUR)},
			{new Case(3,0,Texture.MUR),new Case(3,1,Texture.MUR),new Case(3,2,Texture.MUR),new Case(3,3,Texture.SOL),new Case(3,4,Texture.MUR),new Case(3,5,Texture.MUR),new Case(3,6,Texture.MUR),new Case(3,7,Texture.MUR),new Case(3,8,Texture.MUR),new Case(3,9,Texture.MUR)},
			{new Case(4,0,Texture.MUR),new Case(4,1,Texture.MUR),new Case(4,2,Texture.MUR),new Case(4,3,Texture.MUR),new Case(4,4,Texture.MUR),new Case(4,5,Texture.MUR),new Case(4,6,Texture.MUR),new Case(4,7,Texture.MUR),new Case(4,8,Texture.MUR),new Case(4,9,Texture.MUR)},
			{new Case(5,0,Texture.MUR),new Case(5,1,Texture.MUR),new Case(5,2,Texture.MUR),new Case(5,3,Texture.MUR),new Case(5,4,Texture.MUR),new Case(5,5,Texture.MUR),new Case(5,6,Texture.MUR),new Case(5,7,Texture.MUR),new Case(5,8,Texture.MUR),new Case(5,9,Texture.MUR)},
			{new Case(6,0,Texture.MUR),new Case(6,1,Texture.MUR),new Case(6,2,Texture.MUR),new Case(6,3,Texture.MUR),new Case(6,4,Texture.MUR),new Case(6,5,Texture.MUR),new Case(6,6,Texture.MUR),new Case(6,7,Texture.MUR),new Case(6,8,Texture.MUR),new Case(6,9,Texture.MUR)},
			{new Case(7,0,Texture.MUR),new Case(7,1,Texture.MUR),new Case(7,2,Texture.MUR),new Case(7,3,Texture.MUR),new Case(7,4,Texture.MUR),new Case(7,5,Texture.MUR),new Case(7,6,Texture.MUR),new Case(7,7,Texture.MUR),new Case(7,8,Texture.MUR),new Case(7,9,Texture.MUR)},
			{new Case(8,0,Texture.MUR),new Case(8,1,Texture.MUR),new Case(8,2,Texture.MUR),new Case(8,3,Texture.MUR),new Case(8,4,Texture.MUR),new Case(8,5,Texture.MUR),new Case(8,6,Texture.MUR),new Case(8,7,Texture.MUR),new Case(8,8,Texture.MUR),new Case(8,9,Texture.MUR)},
			{new Case(9,0,Texture.MUR),new Case(9,1,Texture.MUR),new Case(9,2,Texture.MUR),new Case(9,3,Texture.MUR),new Case(9,4,Texture.MUR),new Case(9,5,Texture.MUR),new Case(9,6,Texture.MUR),new Case(9,7,Texture.MUR),new Case(9,8,Texture.MUR),new Case(9,9,Texture.MUR)},
	};;
	


	private int largeurCarte, hauteurCarte, tileWidth, tileHeight;

	private Image[] tileImage;

	

	public Carte(int largeurCarte, int hauteurCarte)
	{
		this.largeurCarte = largeurCarte;
		this.hauteurCarte = hauteurCarte;
	}

	public Case[][] plateauCase()
	{	
		return this.plateauCase;

	}
	
	

	/*
	 * Méthode générant le plateau entier du jeu. A finir (suivre l'exemple).
	 * public void generer() { exemple :
	 * plateauCase[0][0]=plateauCase[0][1]=plateauCase[0][2]=1; }
	 */

}
