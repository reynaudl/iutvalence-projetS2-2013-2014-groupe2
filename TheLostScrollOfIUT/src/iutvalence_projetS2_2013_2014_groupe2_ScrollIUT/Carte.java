package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Carte
{
	private int[][] plateauCase = new int[][]{{0,0,0,0,0,0,0},{0,0,0,1,1,1,1}};
	private int largeurCarte, hauteurCarte, tileWidth, tileHeight;
	
	private Image[] tileImage;
	
	public Carte(int largeurCarte, int hauteurCarte){
        this.largeurCarte = largeurCarte;
        this.hauteurCarte = hauteurCarte;
        this.tileImage = new Image[2];
        this.tileImage[1] = new ImageIcon(this.getClass().getResource("tile.png")).getImage();
        this.tileImage[0] = new ImageIcon(this.getClass().getResource("tile.png")).getImage();
        this.tileWidth = this.tileImage[0].getWidth(null);
        this.tileHeight = this.tileImage[0].getHeight(null);
    }

	
}
