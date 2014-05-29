package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Carte {
	private static final int NB_COLONNES = 10;
	private static final int NB_LIGNES = 10;
	private Case[][] plateauCase;

	private int largeurCarte, hauteurCarte, tileWidth, tileHeight;

	private Image[] tileImage;

	public Carte(int largeurCarte, int hauteurCarte) {
		this.largeurCarte = largeurCarte;
		this.hauteurCarte = hauteurCarte;
	}

	public Case[][] plateauCase() {
		return this.plateauCase;

	}

}
