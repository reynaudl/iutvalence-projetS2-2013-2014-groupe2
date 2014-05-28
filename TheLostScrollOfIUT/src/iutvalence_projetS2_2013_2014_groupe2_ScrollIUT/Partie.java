package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

// TODO: Auto-generated Javadoc
/**
 * The Class Partie.
 */
public class Partie
{

	public Personnage personnage;
	public static Case[][] plateauCase = new Case[30][30];
	public Decors decors;
	
	public Partie(Personnage personnage)
	{
		this.personnage = personnage;
		
	}
	/**
	 * Gere le d�placement du personnage
	 */
	
	public static void creationCarte()
	{
		plateauCase[0][0] = new Case(0,0,Texture.VIDE);plateauCase[0][1] = new Case(0,1,Texture.VIDE);plateauCase[0][2] = new Case(0,2,Texture.VIDE);plateauCase[0][3] = new Case(0,3,Texture.VIDE);plateauCase[0][4] = new Case(0,4,Texture.VIDE);plateauCase[0][5] = new Case(0,5,Texture.VIDE);plateauCase[0][6] = new Case(0,6,Texture.VIDE);plateauCase[0][7] = new Case(0,7,Texture.VIDE);plateauCase[0][8] = new Case(0,8,Texture.VIDE);
		plateauCase[0][9] = new Case(0,9,Texture.VIDE);plateauCase[0][10] = new Case(0,10,Texture.VIDE);plateauCase[0][11] = new Case(0,11,Texture.VIDE);plateauCase[0][12] = new Case(0,12,Texture.VIDE);plateauCase[0][13] = new Case(0,13,Texture.VIDE);plateauCase[0][14] = new Case(0,14,Texture.VIDE);plateauCase[0][15] = new Case(0,15,Texture.VIDE);plateauCase[0][16] = new Case(0,16,Texture.VIDE);plateauCase[0][17] = new Case(0,17,Texture.VIDE);
		plateauCase[0][18] = new Case(0,18,Texture.VIDE);plateauCase[0][19] = new Case(0,19,Texture.VIDE);plateauCase[0][20] = new Case(0,20,Texture.VIDE);plateauCase[0][21] = new Case(0,21,Texture.VIDE);plateauCase[0][22] = new Case(0,22,Texture.VIDE);plateauCase[0][23] = new Case(0,23,Texture.VIDE);plateauCase[0][24] = new Case(0,24,Texture.VIDE);plateauCase[0][25] = new Case(0,25,Texture.VIDE);plateauCase[0][26] = new Case(0,26,Texture.VIDE);
		plateauCase[0][27] = new Case(0,27,Texture.VIDE);plateauCase[0][28] = new Case(0,28,Texture.VIDE);plateauCase[0][29] = new Case(0,29,Texture.VIDE);plateauCase[1][0] = new Case(1,0,Texture.VIDE);plateauCase[1][1] = new Case(1,1,Texture.MUR);plateauCase[1][2] = new Case(1,2,Texture.MUR);plateauCase[1][3] = new Case(1,3,Texture.FENETRE);plateauCase[1][4] = new Case(1,4,Texture.MUR);plateauCase[1][5] = new Case(1,5,Texture.MUR);
		plateauCase[1][6] = new Case(1,6,Texture.MUR);plateauCase[1][7] = new Case(1,7,Texture.MUR);plateauCase[1][8] = new Case(1,8,Texture.MUR);plateauCase[1][9] = new Case(1,9,Texture.FENETRE);plateauCase[1][10] = new Case(1,10,Texture.MUR);plateauCase[1][11] = new Case(1,11,Texture.FENETRE);plateauCase[1][12] = new Case(1,12,Texture.MUR);plateauCase[1][13] = new Case(1,13,Texture.MUR);plateauCase[1][14] = new Case(1,14,Texture.MUR);
		plateauCase[1][15] = new Case(1,15,Texture.FENETRE);plateauCase[1][16] = new Case(1,16,Texture.MUR);plateauCase[1][17] = new Case(1,17,Texture.MUR);plateauCase[1][18] = new Case(1,18,Texture.MUR);plateauCase[1][19] = new Case(1,19,Texture.MUR);plateauCase[1][20] = new Case(1,20,Texture.MUR);plateauCase[1][21] = new Case(1,21,Texture.MUR);plateauCase[1][22] = new Case(1,22,Texture.MUR);plateauCase[1][23] = new Case(1,23,Texture.FENETRE);
		plateauCase[1][24] = new Case(1,24,Texture.MUR);plateauCase[1][25] = new Case(1,25,Texture.FENETRE);plateauCase[1][26] = new Case(1,26,Texture.MUR);plateauCase[1][27] = new Case(1,27,Texture.FENETRE);plateauCase[1][28] = new Case(1,28,Texture.MUR);plateauCase[1][29] = new Case(1,29,Texture.MUR);plateauCase[2][0] = new Case(2,0,Texture.VIDE);plateauCase[2][1] = new Case(2,1,Texture.MUR);plateauCase[2][2] = new Case(2,2,Texture.SOL);
		plateauCase[2][3] = new Case(2,3,Texture.SOL);plateauCase[2][4] = new Case(2,4,Texture.SOL);plateauCase[2][5] = new Case(2,5,Texture.SOL);plateauCase[2][6] = new Case(2,6,Texture.SOL);plateauCase[2][7] = new Case(2,7,Texture.MUR);plateauCase[2][8] = new Case(2,8,Texture.SOL);plateauCase[2][9] = new Case(2,9,Texture.SOL);plateauCase[2][10] = new Case(2,10,Texture.SOL);plateauCase[2][11] = new Case(2,11,Texture.SOL);
		plateauCase[2][12] = new Case(2,12,Texture.TABLE);plateauCase[2][13] = new Case(2,13,Texture.MUR);plateauCase[2][14] = new Case(2,14,Texture.COFFRE);plateauCase[2][15] = new Case(2,15,Texture.SOL);plateauCase[2][16] = new Case(2,16,Texture.SOL);plateauCase[2][17] = new Case(2,17,Texture.MUR);plateauCase[2][18] = new Case(2,18,Texture.SOL);plateauCase[2][19] = new Case(2,19,Texture.SOL);plateauCase[2][20] = new Case(2,20,Texture.LANTERNE);
		plateauCase[2][21] = new Case(2,21,Texture.MUR);plateauCase[2][22] = new Case(2,22,Texture.TABLE);plateauCase[2][23] = new Case(2,23,Texture.COFFRE);plateauCase[2][24] = new Case(2,24,Texture.MUR);plateauCase[2][25] = new Case(2,25,Texture.COFFRE);plateauCase[2][26] = new Case(2,26,Texture.SOL);plateauCase[2][27] = new Case(2,27,Texture.SOL);plateauCase[2][28] = new Case(2,28,Texture.SOL);plateauCase[2][29] = new Case(2,29,Texture.LANTERNE);
		plateauCase[3][0] = new Case(3,0,Texture.VIDE);plateauCase[3][1] = new Case(3,1,Texture.MUR);plateauCase[3][2] = new Case(3,2,Texture.COFFRE);plateauCase[3][3] = new Case(3,3,Texture.LANTERNE);plateauCase[3][4] = new Case(3,4,Texture.SOL);plateauCase[3][5] = new Case(3,5,Texture.SOL);plateauCase[3][6] = new Case(3,6,Texture.SOL);plateauCase[3][7] = new Case(3,7,Texture.MUR);plateauCase[3][8] = new Case(3,8,Texture.SOL);
		plateauCase[3][9] = new Case(3,9,Texture.SOL);plateauCase[3][10] = new Case(3,10,Texture.SOL);plateauCase[3][11] = new Case(3,11,Texture.LANTERNE);plateauCase[3][12] = new Case(3,12,Texture.TABLE);plateauCase[3][13] = new Case(3,13,Texture.MUR);plateauCase[3][14] = new Case(3,14,Texture.TABLE);plateauCase[3][15] = new Case(3,15,Texture.SOL);plateauCase[3][16] = new Case(3,16,Texture.SOL);plateauCase[3][17] = new Case(3,17,Texture.MUR);
		plateauCase[3][18] = new Case(3,18,Texture.SOL);plateauCase[3][19] = new Case(3,19,Texture.SOL);plateauCase[3][20] = new Case(3,20,Texture.SOL);plateauCase[3][21] = new Case(3,21,Texture.MUR);plateauCase[3][22] = new Case(3,22,Texture.TABLE);plateauCase[3][23] = new Case(3,23,Texture.SOL);plateauCase[3][24] = new Case(3,24,Texture.MUR);plateauCase[3][25] = new Case(3,25,Texture.TABLE);plateauCase[3][26] = new Case(3,26,Texture.TABLE);
		plateauCase[3][27] = new Case(3,27,Texture.SOL);plateauCase[3][28] = new Case(3,28,Texture.SOL);plateauCase[3][29] = new Case(3,29,Texture.SOL);plateauCase[4][0] = new Case(4,0,Texture.VIDE);plateauCase[4][1] = new Case(4,1,Texture.MUR);plateauCase[4][2] = new Case(4,2,Texture.TABLE);plateauCase[4][3] = new Case(4,3,Texture.TABLE);plateauCase[4][4] = new Case(4,4,Texture.SOL);plateauCase[4][5] = new Case(4,5,Texture.SOL);
		plateauCase[4][6] = new Case(4,6,Texture.SOL);plateauCase[4][7] = new Case(4,7,Texture.MUR);plateauCase[4][8] = new Case(4,8,Texture.SOL);plateauCase[4][9] = new Case(4,9,Texture.SOL);plateauCase[4][10] = new Case(4,10,Texture.SOL);plateauCase[4][11] = new Case(4,11,Texture.SOL);plateauCase[4][12] = new Case(4,12,Texture.TABLE);plateauCase[4][13] = new Case(4,13,Texture.MUR);plateauCase[4][14] = new Case(4,14,Texture.TABLE);
		plateauCase[4][15] = new Case(4,15,Texture.SOL);plateauCase[4][16] = new Case(4,16,Texture.LANTERNE);plateauCase[4][17] = new Case(4,17,Texture.MUR);plateauCase[4][18] = new Case(4,18,Texture.SOL);plateauCase[4][19] = new Case(4,19,Texture.SOL);plateauCase[4][20] = new Case(4,20,Texture.SOL);plateauCase[4][21] = new Case(4,21,Texture.MUR);plateauCase[4][22] = new Case(4,22,Texture.SOL);plateauCase[4][23] = new Case(4,23,Texture.SOL);
		plateauCase[4][24] = new Case(4,24,Texture.MUR);plateauCase[4][25] = new Case(4,25,Texture.COFFRE);plateauCase[4][26] = new Case(4,26,Texture.SOL);plateauCase[4][27] = new Case(4,27,Texture.DEBRIS);plateauCase[4][28] = new Case(4,28,Texture.SOL);plateauCase[4][29] = new Case(4,29,Texture.SOL);plateauCase[5][0] = new Case(5,0,Texture.VIDE);plateauCase[5][1] = new Case(5,1,Texture.MUR);plateauCase[5][2] = new Case(5,2,Texture.TABLE);
		plateauCase[5][3] = new Case(5,3,Texture.SOL);plateauCase[5][4] = new Case(5,4,Texture.SOL);plateauCase[5][5] = new Case(5,5,Texture.SOL);plateauCase[5][6] = new Case(5,6,Texture.SOL);plateauCase[5][7] = new Case(5,7,Texture.MUR);plateauCase[5][8] = new Case(5,8,Texture.SOL);plateauCase[5][9] = new Case(5,9,Texture.SOL);plateauCase[5][10] = new Case(5,10,Texture.SOL);plateauCase[5][11] = new Case(5,11,Texture.SOL);
		plateauCase[5][12] = new Case(5,12,Texture.SOL);plateauCase[5][13] = new Case(5,13,Texture.MUR);plateauCase[5][14] = new Case(5,14,Texture.TABLE);plateauCase[5][15] = new Case(5,15,Texture.SOL);plateauCase[5][16] = new Case(5,16,Texture.SOL);plateauCase[5][17] = new Case(5,17,Texture.MUR);plateauCase[5][18] = new Case(5,18,Texture.SOL);plateauCase[5][19] = new Case(5,19,Texture.SOL);plateauCase[5][20] = new Case(5,20,Texture.SOL);
		plateauCase[5][21] = new Case(5,21,Texture.MUR);plateauCase[5][22] = new Case(5,22,Texture.SOL);plateauCase[5][23] = new Case(5,23,Texture.SOL);plateauCase[5][24] = new Case(5,24,Texture.MUR);plateauCase[5][25] = new Case(5,25,Texture.SOL);plateauCase[5][26] = new Case(5,26,Texture.SOL);plateauCase[5][27] = new Case(5,27,Texture.DEBRIS);plateauCase[5][28] = new Case(5,28,Texture.SOL);plateauCase[5][29] = new Case(5,29,Texture.SOL);
		plateauCase[6][0] = new Case(6,0,Texture.VIDE);plateauCase[6][1] = new Case(6,1,Texture.MUR);plateauCase[6][2] = new Case(6,2,Texture.TABLE);plateauCase[6][3] = new Case(6,3,Texture.SOL);plateauCase[6][4] = new Case(6,4,Texture.SOL);plateauCase[6][5] = new Case(6,5,Texture.SOL);plateauCase[6][6] = new Case(6,6,Texture.SOL);plateauCase[6][7] = new Case(6,7,Texture.MUR);plateauCase[6][8] = new Case(6,8,Texture.SOL);
		plateauCase[6][9] = new Case(6,9,Texture.SOL);plateauCase[6][10] = new Case(6,10,Texture.SOL);plateauCase[6][11] = new Case(6,11,Texture.SOL);plateauCase[6][12] = new Case(6,12,Texture.SOL);plateauCase[6][13] = new Case(6,13,Texture.MUR);plateauCase[6][14] = new Case(6,14,Texture.SOL);plateauCase[6][15] = new Case(6,15,Texture.SOL);plateauCase[6][16] = new Case(6,16,Texture.SOL);plateauCase[6][17] = new Case(6,17,Texture.MUR);
		plateauCase[6][18] = new Case(6,18,Texture.SOL);plateauCase[6][19] = new Case(6,19,Texture.TABLE);plateauCase[6][20] = new Case(6,20,Texture.SOL);plateauCase[6][21] = new Case(6,21,Texture.MUR);plateauCase[6][22] = new Case(6,22,Texture.SOL);plateauCase[6][23] = new Case(6,23,Texture.SOL);plateauCase[6][24] = new Case(6,24,Texture.MUR);plateauCase[6][25] = new Case(6,25,Texture.SOL);plateauCase[6][26] = new Case(6,26,Texture.SOL);
		plateauCase[6][27] = new Case(6,27,Texture.DEBRIS);plateauCase[6][28] = new Case(6,28,Texture.SOL);plateauCase[6][29] = new Case(6,29,Texture.SOL);plateauCase[7][0] = new Case(7,0,Texture.VIDE);plateauCase[7][1] = new Case(7,1,Texture.MUR);plateauCase[7][2] = new Case(7,2,Texture.MUR);plateauCase[7][3] = new Case(7,3,Texture.MUR);plateauCase[7][4] = new Case(7,4,Texture.PORTE_FERMER);plateauCase[7][5] = new Case(7,5,Texture.MUR);
		plateauCase[7][6] = new Case(7,6,Texture.MUR);plateauCase[7][7] = new Case(7,7,Texture.MUR);plateauCase[7][8] = new Case(7,8,Texture.MUR);plateauCase[7][9] = new Case(7,9,Texture.MUR);plateauCase[7][10] = new Case(7,10,Texture.PORTE_FERMER);plateauCase[7][11] = new Case(7,11,Texture.MUR);plateauCase[7][12] = new Case(7,12,Texture.MUR);plateauCase[7][13] = new Case(7,13,Texture.MUR);plateauCase[7][14] = new Case(7,14,Texture.SOL);
		plateauCase[7][15] = new Case(7,15,Texture.SOL);plateauCase[7][16] = new Case(7,16,Texture.SOL);plateauCase[7][17] = new Case(7,17,Texture.MUR);plateauCase[7][18] = new Case(7,18,Texture.COFFRE);plateauCase[7][19] = new Case(7,19,Texture.TABLE);plateauCase[7][20] = new Case(7,20,Texture.SOL);plateauCase[7][21] = new Case(7,21,Texture.MUR);plateauCase[7][22] = new Case(7,22,Texture.SOL);plateauCase[7][23] = new Case(7,23,Texture.SOL);
		plateauCase[7][24] = new Case(7,24,Texture.MUR);plateauCase[7][25] = new Case(7,25,Texture.SOL);plateauCase[7][26] = new Case(7,26,Texture.SOL);plateauCase[7][27] = new Case(7,27,Texture.DEBRIS);plateauCase[7][28] = new Case(7,28,Texture.SOL);plateauCase[7][29] = new Case(7,29,Texture.SOL);plateauCase[8][0] = new Case(8,0,Texture.VIDE);plateauCase[8][1] = new Case(8,1,Texture.MUR);plateauCase[8][2] = new Case(8,2,Texture.SOL);
		plateauCase[8][3] = new Case(8,3,Texture.SOL);plateauCase[8][4] = new Case(8,4,Texture.SOL);plateauCase[8][5] = new Case(8,5,Texture.SOL);plateauCase[8][6] = new Case(8,6,Texture.SOL);plateauCase[8][7] = new Case(8,7,Texture.SOL);plateauCase[8][8] = new Case(8,8,Texture.SOL);plateauCase[8][9] = new Case(8,9,Texture.SOL);plateauCase[8][10] = new Case(8,10,Texture.SOL);plateauCase[8][11] = new Case(8,11,Texture.SOL);
		plateauCase[8][12] = new Case(8,12,Texture.SOL);plateauCase[8][13] = new Case(8,13,Texture.PORTE_FERMER);plateauCase[8][14] = new Case(8,14,Texture.SOL);plateauCase[8][15] = new Case(8,15,Texture.MUR);plateauCase[8][16] = new Case(8,16,Texture.MUR);plateauCase[8][17] = new Case(8,17,Texture.MUR);plateauCase[8][18] = new Case(8,18,Texture.MUR);plateauCase[8][19] = new Case(8,19,Texture.MUR);plateauCase[8][20] = new Case(8,20,Texture.PORTE_FERMER);
		plateauCase[8][21] = new Case(8,21,Texture.MUR);plateauCase[8][22] = new Case(8,22,Texture.MUR);plateauCase[8][23] = new Case(8,23,Texture.PORTE_FERMER);plateauCase[8][24] = new Case(8,24,Texture.MUR);plateauCase[8][25] = new Case(8,25,Texture.PORTE_FERMER);plateauCase[8][26] = new Case(8,26,Texture.MUR);plateauCase[8][27] = new Case(8,27,Texture.MUR);plateauCase[8][28] = new Case(8,28,Texture.MUR);plateauCase[8][29] = new Case(8,29,Texture.MUR);
		plateauCase[9][0] = new Case(9,0,Texture.VIDE);plateauCase[9][1] = new Case(9,1,Texture.MUR);plateauCase[9][2] = new Case(9,2,Texture.SOL);plateauCase[9][3] = new Case(9,3,Texture.SOL);plateauCase[9][4] = new Case(9,4,Texture.SOL);plateauCase[9][5] = new Case(9,5,Texture.SOL);plateauCase[9][6] = new Case(9,6,Texture.SOL);plateauCase[9][7] = new Case(9,7,Texture.SOL);plateauCase[9][8] = new Case(9,8,Texture.SOL);
		plateauCase[9][9] = new Case(9,9,Texture.SOL);plateauCase[9][10] = new Case(9,10,Texture.SOL);plateauCase[9][11] = new Case(9,11,Texture.SOL);plateauCase[9][12] = new Case(9,12,Texture.SOL);plateauCase[9][13] = new Case(9,13,Texture.MUR);plateauCase[9][14] = new Case(9,14,Texture.MUR);plateauCase[9][15] = new Case(9,15,Texture.MUR);plateauCase[9][16] = new Case(9,16,Texture.SOL);plateauCase[9][17] = new Case(9,17,Texture.SOL);
		plateauCase[9][18] = new Case(9,18,Texture.SOL);plateauCase[9][19] = new Case(9,19,Texture.SOL);plateauCase[9][20] = new Case(9,20,Texture.SOL);plateauCase[9][21] = new Case(9,21,Texture.SOL);plateauCase[9][22] = new Case(9,22,Texture.DEBRIS);plateauCase[9][23] = new Case(9,23,Texture.SOL);plateauCase[9][24] = new Case(9,24,Texture.SOL);plateauCase[9][25] = new Case(9,25,Texture.SOL);plateauCase[9][26] = new Case(9,26,Texture.SOL);
		plateauCase[9][27] = new Case(9,27,Texture.SOL);plateauCase[9][28] = new Case(9,28,Texture.SOL);plateauCase[9][29] = new Case(9,29,Texture.SOL);plateauCase[10][0] = new Case(10,0,Texture.VIDE);plateauCase[10][1] = new Case(10,1,Texture.MUR);plateauCase[10][2] = new Case(10,2,Texture.SOL);plateauCase[10][3] = new Case(10,3,Texture.DEBRIS);plateauCase[10][4] = new Case(10,4,Texture.DEBRIS);plateauCase[10][5] = new Case(10,5,Texture.DEBRIS);
		plateauCase[10][6] = new Case(10,6,Texture.SOL);plateauCase[10][7] = new Case(10,7,Texture.SOL);plateauCase[10][8] = new Case(10,8,Texture.SOL);plateauCase[10][9] = new Case(10,9,Texture.SOL);plateauCase[10][10] = new Case(10,10,Texture.SOL);plateauCase[10][11] = new Case(10,11,Texture.SOL);plateauCase[10][12] = new Case(10,12,Texture.SOL);plateauCase[10][13] = new Case(10,13,Texture.PORTE_FERMER);plateauCase[10][14] = new Case(10,14,Texture.SOL);
		plateauCase[10][15] = new Case(10,15,Texture.SOL);plateauCase[10][16] = new Case(10,16,Texture.SOL);plateauCase[10][17] = new Case(10,17,Texture.SOL);plateauCase[10][18] = new Case(10,18,Texture.SOL);plateauCase[10][19] = new Case(10,19,Texture.SOL);plateauCase[10][20] = new Case(10,20,Texture.SOL);plateauCase[10][21] = new Case(10,21,Texture.SOL);plateauCase[10][22] = new Case(10,22,Texture.DEBRIS);plateauCase[10][23] = new Case(10,23,Texture.DEBRIS);
		plateauCase[10][24] = new Case(10,24,Texture.DEBRIS);plateauCase[10][25] = new Case(10,25,Texture.DEBRIS);plateauCase[10][26] = new Case(10,26,Texture.DEBRIS);plateauCase[10][27] = new Case(10,27,Texture.DEBRIS);plateauCase[10][28] = new Case(10,28,Texture.DEBRIS);plateauCase[10][29] = new Case(10,29,Texture.DEBRIS);plateauCase[11][0] = new Case(11,0,Texture.FENETRE);plateauCase[11][1] = new Case(11,1,Texture.MUR);plateauCase[11][2] = new Case(11,2,Texture.SOL);
		plateauCase[11][3] = new Case(11,3,Texture.SOL);plateauCase[11][4] = new Case(11,4,Texture.DEBRIS);plateauCase[11][5] = new Case(11,5,Texture.SOL);plateauCase[11][6] = new Case(11,6,Texture.SOL);plateauCase[11][7] = new Case(11,7,Texture.SOL);plateauCase[11][8] = new Case(11,8,Texture.SOL);plateauCase[11][9] = new Case(11,9,Texture.SOL);plateauCase[11][10] = new Case(11,10,Texture.SOL);plateauCase[11][11] = new Case(11,11,Texture.SOL);
		plateauCase[11][12] = new Case(11,12,Texture.SOL);plateauCase[11][13] = new Case(11,13,Texture.MUR);plateauCase[11][14] = new Case(11,14,Texture.SOL);plateauCase[11][15] = new Case(11,15,Texture.SOL);plateauCase[11][16] = new Case(11,16,Texture.SOL);plateauCase[11][17] = new Case(11,17,Texture.SOL);plateauCase[11][18] = new Case(11,18,Texture.DEBRIS);plateauCase[11][19] = new Case(11,19,Texture.SOL);plateauCase[11][20] = new Case(11,20,Texture.SOL);
		plateauCase[11][21] = new Case(11,21,Texture.SOL);plateauCase[11][22] = new Case(11,22,Texture.SOL);plateauCase[11][23] = new Case(11,23,Texture.SOL);plateauCase[11][24] = new Case(11,24,Texture.SOL);plateauCase[11][25] = new Case(11,25,Texture.SOL);plateauCase[11][26] = new Case(11,26,Texture.SOL);plateauCase[11][27] = new Case(11,27,Texture.SOL);plateauCase[11][28] = new Case(11,28,Texture.SOL);plateauCase[11][29] = new Case(11,29,Texture.SOL);
		plateauCase[12][0] = new Case(12,0,Texture.SOL);plateauCase[12][1] = new Case(12,1,Texture.SOL);plateauCase[12][2] = new Case(12,2,Texture.SOL);plateauCase[12][3] = new Case(12,3,Texture.SOL);plateauCase[12][4] = new Case(12,4,Texture.DEBRIS);plateauCase[12][5] = new Case(12,5,Texture.SOL);plateauCase[12][6] = new Case(12,6,Texture.SOL);plateauCase[12][7] = new Case(12,7,Texture.SOL);plateauCase[12][8] = new Case(12,8,Texture.MUR);
		plateauCase[12][9] = new Case(12,9,Texture.MUR);plateauCase[12][10] = new Case(12,10,Texture.PORTE_FERMER);plateauCase[12][11] = new Case(12,11,Texture.MUR);plateauCase[12][12] = new Case(12,12,Texture.PORTE_FERMER);plateauCase[12][13] = new Case(12,13,Texture.MUR);plateauCase[12][14] = new Case(12,14,Texture.MUR);plateauCase[12][15] = new Case(12,15,Texture.MUR);plateauCase[12][16] = new Case(12,16,Texture.MUR);plateauCase[12][17] = new Case(12,17,Texture.PORTE_FERMER);
		plateauCase[12][18] = new Case(12,18,Texture.MUR);plateauCase[12][19] = new Case(12,19,Texture.SOL);plateauCase[12][20] = new Case(12,20,Texture.SOL);plateauCase[12][21] = new Case(12,21,Texture.SOL);plateauCase[12][22] = new Case(12,22,Texture.SOL);plateauCase[12][23] = new Case(12,23,Texture.SOL);plateauCase[12][24] = new Case(12,24,Texture.SOL);plateauCase[12][25] = new Case(12,25,Texture.SOL);plateauCase[12][26] = new Case(12,26,Texture.MUR);
		plateauCase[12][27] = new Case(12,27,Texture.MUR);plateauCase[12][28] = new Case(12,28,Texture.MUR);plateauCase[12][29] = new Case(12,29,Texture.MUR);plateauCase[13][0] = new Case(13,0,Texture.SOL);plateauCase[13][1] = new Case(13,1,Texture.SOL);plateauCase[13][2] = new Case(13,2,Texture.SOL);plateauCase[13][3] = new Case(13,3,Texture.DEBRIS);plateauCase[13][4] = new Case(13,4,Texture.DEBRIS);plateauCase[13][5] = new Case(13,5,Texture.DEBRIS);
		plateauCase[13][6] = new Case(13,6,Texture.SOL);plateauCase[13][7] = new Case(13,7,Texture.SOL);plateauCase[13][8] = new Case(13,8,Texture.MUR);plateauCase[13][9] = new Case(13,9,Texture.SOL);plateauCase[13][10] = new Case(13,10,Texture.SOL);plateauCase[13][11] = new Case(13,11,Texture.MUR);plateauCase[13][12] = new Case(13,12,Texture.SOL);plateauCase[13][13] = new Case(13,13,Texture.SOL);plateauCase[13][14] = new Case(13,14,Texture.DEBRIS);
		plateauCase[13][15] = new Case(13,15,Texture.SOL);plateauCase[13][16] = new Case(13,16,Texture.SOL);plateauCase[13][17] = new Case(13,17,Texture.SOL);plateauCase[13][18] = new Case(13,18,Texture.MUR);plateauCase[13][19] = new Case(13,19,Texture.MUR);plateauCase[13][20] = new Case(13,20,Texture.MUR);plateauCase[13][21] = new Case(13,21,Texture.PORTE_FERMER);plateauCase[13][22] = new Case(13,22,Texture.MUR);plateauCase[13][23] = new Case(13,23,Texture.PORTE_FERMER);
		plateauCase[13][24] = new Case(13,24,Texture.MUR);plateauCase[13][25] = new Case(13,25,Texture.MUR);plateauCase[13][26] = new Case(13,26,Texture.MUR);plateauCase[13][27] = new Case(13,27,Texture.COFFRE);plateauCase[13][28] = new Case(13,28,Texture.TABLE);plateauCase[13][29] = new Case(13,29,Texture.SOL);plateauCase[14][0] = new Case(14,0,Texture.SOL);plateauCase[14][1] = new Case(14,1,Texture.SOL);plateauCase[14][2] = new Case(14,2,Texture.SOL);
		plateauCase[14][3] = new Case(14,3,Texture.SOL);plateauCase[14][4] = new Case(14,4,Texture.SOL);plateauCase[14][5] = new Case(14,5,Texture.SOL);plateauCase[14][6] = new Case(14,6,Texture.SOL);plateauCase[14][7] = new Case(14,7,Texture.SOL);plateauCase[14][8] = new Case(14,8,Texture.MUR);plateauCase[14][9] = new Case(14,9,Texture.SOL);plateauCase[14][10] = new Case(14,10,Texture.SOL);plateauCase[14][11] = new Case(14,11,Texture.MUR);
		plateauCase[14][12] = new Case(14,12,Texture.SOL);plateauCase[14][13] = new Case(14,13,Texture.SOL);plateauCase[14][14] = new Case(14,14,Texture.DEBRIS);plateauCase[14][15] = new Case(14,15,Texture.SOL);plateauCase[14][16] = new Case(14,16,Texture.SOL);plateauCase[14][17] = new Case(14,17,Texture.SOL);plateauCase[14][18] = new Case(14,18,Texture.MUR);plateauCase[14][19] = new Case(14,19,Texture.COFFRE);plateauCase[14][20] = new Case(14,20,Texture.TABLE);
		plateauCase[14][21] = new Case(14,21,Texture.SOL);plateauCase[14][22] = new Case(14,22,Texture.MUR);plateauCase[14][23] = new Case(14,23,Texture.SOL);plateauCase[14][24] = new Case(14,24,Texture.TABLE);plateauCase[14][25] = new Case(14,25,Texture.COFFRE);plateauCase[14][26] = new Case(14,26,Texture.MUR);plateauCase[14][27] = new Case(14,27,Texture.SOL);plateauCase[14][28] = new Case(14,28,Texture.TABLE);plateauCase[14][29] = new Case(14,29,Texture.SOL);
		plateauCase[15][0] = new Case(15,0,Texture.SOL);plateauCase[15][1] = new Case(15,1,Texture.SOL);plateauCase[15][2] = new Case(15,2,Texture.SOL);plateauCase[15][3] = new Case(15,3,Texture.SOL);plateauCase[15][4] = new Case(15,4,Texture.SOL);plateauCase[15][5] = new Case(15,5,Texture.SOL);plateauCase[15][6] = new Case(15,6,Texture.SOL);plateauCase[15][7] = new Case(15,7,Texture.SOL);plateauCase[15][8] = new Case(15,8,Texture.MUR);
		plateauCase[15][9] = new Case(15,9,Texture.SOL);plateauCase[15][10] = new Case(15,10,Texture.SOL);plateauCase[15][11] = new Case(15,11,Texture.MUR);plateauCase[15][12] = new Case(15,12,Texture.SOL);plateauCase[15][13] = new Case(15,13,Texture.SOL);plateauCase[15][14] = new Case(15,14,Texture.DEBRIS);plateauCase[15][15] = new Case(15,15,Texture.DEBRIS);plateauCase[15][16] = new Case(15,16,Texture.SOL);plateauCase[15][17] = new Case(15,17,Texture.SOL);
		plateauCase[15][18] = new Case(15,18,Texture.MUR);plateauCase[15][19] = new Case(15,19,Texture.SOL);plateauCase[15][20] = new Case(15,20,Texture.TABLE);plateauCase[15][21] = new Case(15,21,Texture.SOL);plateauCase[15][22] = new Case(15,22,Texture.MUR);plateauCase[15][23] = new Case(15,23,Texture.SOL);plateauCase[15][24] = new Case(15,24,Texture.TABLE);plateauCase[15][25] = new Case(15,25,Texture.SOL);plateauCase[15][26] = new Case(15,26,Texture.MUR);
		plateauCase[15][27] = new Case(15,27,Texture.SOL);plateauCase[15][28] = new Case(15,28,Texture.SOL);plateauCase[15][29] = new Case(15,29,Texture.SOL);plateauCase[16][0] = new Case(16,0,Texture.SOL);plateauCase[16][1] = new Case(16,1,Texture.SOL);plateauCase[16][2] = new Case(16,2,Texture.MUR);plateauCase[16][3] = new Case(16,3,Texture.MUR);plateauCase[16][4] = new Case(16,4,Texture.MUR);plateauCase[16][5] = new Case(16,5,Texture.MUR);
		plateauCase[16][6] = new Case(16,6,Texture.MUR);plateauCase[16][7] = new Case(16,7,Texture.MUR);plateauCase[16][8] = new Case(16,8,Texture.MUR);plateauCase[16][9] = new Case(16,9,Texture.COFFRE);plateauCase[16][10] = new Case(16,10,Texture.SOL);plateauCase[16][11] = new Case(16,11,Texture.MUR);plateauCase[16][12] = new Case(16,12,Texture.SOL);plateauCase[16][13] = new Case(16,13,Texture.SOL);plateauCase[16][14] = new Case(16,14,Texture.SOL);
		plateauCase[16][15] = new Case(16,15,Texture.DEBRIS);plateauCase[16][16] = new Case(16,16,Texture.SOL);plateauCase[16][17] = new Case(16,17,Texture.SOL);plateauCase[16][18] = new Case(16,18,Texture.MUR);plateauCase[16][19] = new Case(16,19,Texture.SOL);plateauCase[16][20] = new Case(16,20,Texture.SOL);plateauCase[16][21] = new Case(16,21,Texture.SOL);plateauCase[16][22] = new Case(16,22,Texture.MUR);plateauCase[16][23] = new Case(16,23,Texture.SOL);
		plateauCase[16][24] = new Case(16,24,Texture.SOL);plateauCase[16][25] = new Case(16,25,Texture.SOL);plateauCase[16][26] = new Case(16,26,Texture.MUR);plateauCase[16][27] = new Case(16,27,Texture.SOL);plateauCase[16][28] = new Case(16,28,Texture.SOL);plateauCase[16][29] = new Case(16,29,Texture.SOL);plateauCase[17][0] = new Case(17,0,Texture.SOL);plateauCase[17][1] = new Case(17,1,Texture.SOL);plateauCase[17][2] = new Case(17,2,Texture.MUR);
		plateauCase[17][3] = new Case(17,3,Texture.SOL);plateauCase[17][4] = new Case(17,4,Texture.SOL);plateauCase[17][5] = new Case(17,5,Texture.SOL);plateauCase[17][6] = new Case(17,6,Texture.SOL);plateauCase[17][7] = new Case(17,7,Texture.SOL);plateauCase[17][8] = new Case(17,8,Texture.MUR);plateauCase[17][9] = new Case(17,9,Texture.MUR);plateauCase[17][10] = new Case(17,10,Texture.MUR);plateauCase[17][11] = new Case(17,11,Texture.MUR);
		plateauCase[17][12] = new Case(17,12,Texture.SOL);plateauCase[17][13] = new Case(17,13,Texture.SOL);plateauCase[17][14] = new Case(17,14,Texture.SOL);plateauCase[17][15] = new Case(17,15,Texture.DEBRIS);plateauCase[17][16] = new Case(17,16,Texture.SOL);plateauCase[17][17] = new Case(17,17,Texture.SOL);plateauCase[17][18] = new Case(17,18,Texture.MUR);plateauCase[17][19] = new Case(17,19,Texture.SOL);plateauCase[17][20] = new Case(17,20,Texture.SOL);
		plateauCase[17][21] = new Case(17,21,Texture.SOL);plateauCase[17][22] = new Case(17,22,Texture.MUR);plateauCase[17][23] = new Case(17,23,Texture.SOL);plateauCase[17][24] = new Case(17,24,Texture.SOL);plateauCase[17][25] = new Case(17,25,Texture.LANTERNE);plateauCase[17][26] = new Case(17,26,Texture.MUR);plateauCase[17][27] = new Case(17,27,Texture.SOL);plateauCase[17][28] = new Case(17,28,Texture.SOL);plateauCase[17][29] = new Case(17,29,Texture.SOL);
		plateauCase[18][0] = new Case(18,0,Texture.SOL);plateauCase[18][1] = new Case(18,1,Texture.SOL);plateauCase[18][2] = new Case(18,2,Texture.MUR);plateauCase[18][3] = new Case(18,3,Texture.SOL);plateauCase[18][4] = new Case(18,4,Texture.SOL);plateauCase[18][5] = new Case(18,5,Texture.SOL);plateauCase[18][6] = new Case(18,6,Texture.SOL);plateauCase[18][7] = new Case(18,7,Texture.SOL);plateauCase[18][8] = new Case(18,8,Texture.SOL);
		plateauCase[18][9] = new Case(18,9,Texture.SOL);plateauCase[18][10] = new Case(18,10,Texture.SOL);plateauCase[18][11] = new Case(18,11,Texture.MUR);plateauCase[18][12] = new Case(18,12,Texture.SOL);plateauCase[18][13] = new Case(18,13,Texture.TABLE);plateauCase[18][14] = new Case(18,14,Texture.SOL);plateauCase[18][15] = new Case(18,15,Texture.DEBRIS);plateauCase[18][16] = new Case(18,16,Texture.SOL);plateauCase[18][17] = new Case(18,17,Texture.SOL);
		plateauCase[18][18] = new Case(18,18,Texture.MUR);plateauCase[18][19] = new Case(18,19,Texture.SOL);plateauCase[18][20] = new Case(18,20,Texture.DEBRIS);plateauCase[18][21] = new Case(18,21,Texture.SOL);plateauCase[18][22] = new Case(18,22,Texture.MUR);plateauCase[18][23] = new Case(18,23,Texture.SOL);plateauCase[18][24] = new Case(18,24,Texture.SOL);plateauCase[18][25] = new Case(18,25,Texture.SOL);plateauCase[18][26] = new Case(18,26,Texture.MUR);
		plateauCase[18][27] = new Case(18,27,Texture.SOL);plateauCase[18][28] = new Case(18,28,Texture.SOL);plateauCase[18][29] = new Case(18,29,Texture.SOL);plateauCase[19][0] = new Case(19,0,Texture.SOL);plateauCase[19][1] = new Case(19,1,Texture.SOL);plateauCase[19][2] = new Case(19,2,Texture.MUR);plateauCase[19][3] = new Case(19,3,Texture.SOL);plateauCase[19][4] = new Case(19,4,Texture.SOL);plateauCase[19][5] = new Case(19,5,Texture.SOL);
		plateauCase[19][6] = new Case(19,6,Texture.SOL);plateauCase[19][7] = new Case(19,7,Texture.SOL);plateauCase[19][8] = new Case(19,8,Texture.SOL);plateauCase[19][9] = new Case(19,9,Texture.SOL);plateauCase[19][10] = new Case(19,10,Texture.SOL);plateauCase[19][11] = new Case(19,11,Texture.MUR);plateauCase[19][12] = new Case(19,12,Texture.LANTERNE);plateauCase[19][13] = new Case(19,13,Texture.TABLE);plateauCase[19][14] = new Case(19,14,Texture.COFFRE);
		plateauCase[19][15] = new Case(19,15,Texture.DEBRIS);plateauCase[19][16] = new Case(19,16,Texture.COFFRE);plateauCase[19][17] = new Case(19,17,Texture.SOL);plateauCase[19][18] = new Case(19,18,Texture.MUR);plateauCase[19][19] = new Case(19,19,Texture.LANTERNE);plateauCase[19][20] = new Case(19,20,Texture.DEBRIS);plateauCase[19][21] = new Case(19,21,Texture.SOL);plateauCase[19][22] = new Case(19,22,Texture.MUR);plateauCase[19][23] = new Case(19,23,Texture.SOL);
		plateauCase[19][24] = new Case(19,24,Texture.SOL);plateauCase[19][25] = new Case(19,25,Texture.SOL);plateauCase[19][26] = new Case(19,26,Texture.MUR);plateauCase[19][27] = new Case(19,27,Texture.LANTERNE);plateauCase[19][28] = new Case(19,28,Texture.SOL);plateauCase[19][29] = new Case(19,29,Texture.SOL);plateauCase[20][0] = new Case(20,0,Texture.SOL);plateauCase[20][1] = new Case(20,1,Texture.SOL);plateauCase[20][2] = new Case(20,2,Texture.PORTE_FERMER);
		plateauCase[20][3] = new Case(20,3,Texture.SOL);plateauCase[20][4] = new Case(20,4,Texture.SOL);plateauCase[20][5] = new Case(20,5,Texture.SOL);plateauCase[20][6] = new Case(20,6,Texture.SOL);plateauCase[20][7] = new Case(20,7,Texture.SOL);plateauCase[20][8] = new Case(20,8,Texture.SOL);plateauCase[20][9] = new Case(20,9,Texture.SOL);plateauCase[20][10] = new Case(20,10,Texture.COFFRE);plateauCase[20][11] = new Case(20,11,Texture.MUR);
		plateauCase[20][12] = new Case(20,12,Texture.MUR);plateauCase[20][13] = new Case(20,13,Texture.MUR);plateauCase[20][14] = new Case(20,14,Texture.MUR);plateauCase[20][15] = new Case(20,15,Texture.MUR);plateauCase[20][16] = new Case(20,16,Texture.MUR);plateauCase[20][17] = new Case(20,17,Texture.MUR);plateauCase[20][18] = new Case(20,18,Texture.MUR);plateauCase[20][19] = new Case(20,19,Texture.MUR);plateauCase[20][20] = new Case(20,20,Texture.MUR);
		plateauCase[20][21] = new Case(20,21,Texture.MUR);plateauCase[20][22] = new Case(20,22,Texture.MUR);plateauCase[20][23] = new Case(20,23,Texture.MUR);plateauCase[20][24] = new Case(20,24,Texture.MUR);plateauCase[20][25] = new Case(20,25,Texture.MUR);plateauCase[20][26] = new Case(20,26,Texture.MUR);plateauCase[20][27] = new Case(20,27,Texture.MUR);plateauCase[20][28] = new Case(20,28,Texture.MUR);plateauCase[20][29] = new Case(20,29,Texture.MUR);
		plateauCase[21][0] = new Case(21,0,Texture.MUR);plateauCase[21][1] = new Case(21,1,Texture.MUR);plateauCase[21][2] = new Case(21,2,Texture.MUR);plateauCase[21][3] = new Case(21,3,Texture.MUR);plateauCase[21][4] = new Case(21,4,Texture.MUR);plateauCase[21][5] = new Case(21,5,Texture.MUR);plateauCase[21][6] = new Case(21,6,Texture.MUR);plateauCase[21][7] = new Case(21,7,Texture.MUR);plateauCase[21][8] = new Case(21,8,Texture.MUR);
		plateauCase[21][9] = new Case(21,9,Texture.MUR);plateauCase[21][10] = new Case(21,10,Texture.MUR);plateauCase[21][11] = new Case(21,11,Texture.MUR);plateauCase[21][12] = new Case(21,12,Texture.VIDE);plateauCase[21][13] = new Case(21,13,Texture.VIDE);plateauCase[21][14] = new Case(21,14,Texture.VIDE);plateauCase[21][15] = new Case(21,15,Texture.VIDE);plateauCase[21][16] = new Case(21,16,Texture.VIDE);plateauCase[21][17] = new Case(21,17,Texture.VIDE);
		plateauCase[21][18] = new Case(21,18,Texture.VIDE);plateauCase[21][19] = new Case(21,19,Texture.VIDE);plateauCase[21][20] = new Case(21,20,Texture.VIDE);plateauCase[21][21] = new Case(21,21,Texture.VIDE);plateauCase[21][22] = new Case(21,22,Texture.VIDE);plateauCase[21][23] = new Case(21,23,Texture.VIDE);plateauCase[21][24] = new Case(21,24,Texture.VIDE);plateauCase[21][25] = new Case(21,25,Texture.VIDE);plateauCase[21][26] = new Case(21,26,Texture.VIDE);
		plateauCase[21][27] = new Case(21,27,Texture.VIDE);plateauCase[21][28] = new Case(21,28,Texture.VIDE);plateauCase[21][29] = new Case(21,29,Texture.VIDE);plateauCase[22][0] = new Case(22,0,Texture.SOL);plateauCase[22][1] = new Case(22,1,Texture.SOL);plateauCase[22][2] = new Case(22,2,Texture.SOL);plateauCase[22][3] = new Case(22,3,Texture.TABLE);plateauCase[22][4] = new Case(22,4,Texture.TABLE);plateauCase[22][5] = new Case(22,5,Texture.TABLE);
		plateauCase[22][6] = new Case(22,6,Texture.TABLE);plateauCase[22][7] = new Case(22,7,Texture.TABLE);plateauCase[22][8] = new Case(22,8,Texture.TABLE);plateauCase[22][9] = new Case(22,9,Texture.TABLE);plateauCase[22][10] = new Case(22,10,Texture.LANTERNE);plateauCase[22][11] = new Case(22,11,Texture.MUR);plateauCase[22][12] = new Case(22,12,Texture.VIDE);plateauCase[22][13] = new Case(22,13,Texture.VIDE);plateauCase[22][14] = new Case(22,14,Texture.VIDE);
		plateauCase[22][15] = new Case(22,15,Texture.VIDE);plateauCase[22][16] = new Case(22,16,Texture.VIDE);plateauCase[22][17] = new Case(22,17,Texture.VIDE);plateauCase[22][18] = new Case(22,18,Texture.VIDE);plateauCase[22][19] = new Case(22,19,Texture.VIDE);plateauCase[22][20] = new Case(22,20,Texture.VIDE);plateauCase[22][21] = new Case(22,21,Texture.VIDE);plateauCase[22][22] = new Case(22,22,Texture.VIDE);plateauCase[22][23] = new Case(22,23,Texture.VIDE);
		plateauCase[22][24] = new Case(22,24,Texture.VIDE);plateauCase[22][25] = new Case(22,25,Texture.VIDE);plateauCase[22][26] = new Case(22,26,Texture.VIDE);plateauCase[22][27] = new Case(22,27,Texture.VIDE);plateauCase[22][28] = new Case(22,28,Texture.VIDE);plateauCase[22][29] = new Case(22,29,Texture.VIDE);plateauCase[23][0] = new Case(23,0,Texture.SOL);plateauCase[23][1] = new Case(23,1,Texture.SOL);plateauCase[23][2] = new Case(23,2,Texture.SOL);
		plateauCase[23][3] = new Case(23,3,Texture.SOL);plateauCase[23][4] = new Case(23,4,Texture.SOL);plateauCase[23][5] = new Case(23,5,Texture.SOL);plateauCase[23][6] = new Case(23,6,Texture.SOL);plateauCase[23][7] = new Case(23,7,Texture.SOL);plateauCase[23][8] = new Case(23,8,Texture.SOL);plateauCase[23][9] = new Case(23,9,Texture.SOL);plateauCase[23][10] = new Case(23,10,Texture.SOL);plateauCase[23][11] = new Case(23,11,Texture.MUR);
		plateauCase[23][12] = new Case(23,12,Texture.VIDE);plateauCase[23][13] = new Case(23,13,Texture.VIDE);plateauCase[23][14] = new Case(23,14,Texture.VIDE);plateauCase[23][15] = new Case(23,15,Texture.VIDE);plateauCase[23][16] = new Case(23,16,Texture.VIDE);plateauCase[23][17] = new Case(23,17,Texture.VIDE);plateauCase[23][18] = new Case(23,18,Texture.VIDE);plateauCase[23][19] = new Case(23,19,Texture.VIDE);plateauCase[23][20] = new Case(23,20,Texture.VIDE);
		plateauCase[23][21] = new Case(23,21,Texture.VIDE);plateauCase[23][22] = new Case(23,22,Texture.VIDE);plateauCase[23][23] = new Case(23,23,Texture.VIDE);plateauCase[23][24] = new Case(23,24,Texture.VIDE);plateauCase[23][25] = new Case(23,25,Texture.VIDE);plateauCase[23][26] = new Case(23,26,Texture.VIDE);plateauCase[23][27] = new Case(23,27,Texture.VIDE);plateauCase[23][28] = new Case(23,28,Texture.VIDE);plateauCase[23][29] = new Case(23,29,Texture.VIDE);
		plateauCase[24][0] = new Case(24,0,Texture.SOL);plateauCase[24][1] = new Case(24,1,Texture.SOL);plateauCase[24][2] = new Case(24,2,Texture.SOL);plateauCase[24][3] = new Case(24,3,Texture.SOL);plateauCase[24][4] = new Case(24,4,Texture.SOL);plateauCase[24][5] = new Case(24,5,Texture.SOL);plateauCase[24][6] = new Case(24,6,Texture.SOL);plateauCase[24][7] = new Case(24,7,Texture.SOL);plateauCase[24][8] = new Case(24,8,Texture.SOL);
		plateauCase[24][9] = new Case(24,9,Texture.SOL);plateauCase[24][10] = new Case(24,10,Texture.SOL);plateauCase[24][11] = new Case(24,11,Texture.MUR);plateauCase[24][12] = new Case(24,12,Texture.VIDE);plateauCase[24][13] = new Case(24,13,Texture.VIDE);plateauCase[24][14] = new Case(24,14,Texture.VIDE);plateauCase[24][15] = new Case(24,15,Texture.VIDE);plateauCase[24][16] = new Case(24,16,Texture.VIDE);plateauCase[24][17] = new Case(24,17,Texture.VIDE);
		plateauCase[24][18] = new Case(24,18,Texture.VIDE);plateauCase[24][19] = new Case(24,19,Texture.VIDE);plateauCase[24][20] = new Case(24,20,Texture.VIDE);plateauCase[24][21] = new Case(24,21,Texture.VIDE);plateauCase[24][22] = new Case(24,22,Texture.VIDE);plateauCase[24][23] = new Case(24,23,Texture.VIDE);plateauCase[24][24] = new Case(24,24,Texture.VIDE);plateauCase[24][25] = new Case(24,25,Texture.VIDE);plateauCase[24][26] = new Case(24,26,Texture.VIDE);
		plateauCase[24][27] = new Case(24,27,Texture.VIDE);plateauCase[24][28] = new Case(24,28,Texture.VIDE);plateauCase[24][29] = new Case(24,29,Texture.VIDE);plateauCase[25][0] = new Case(25,0,Texture.SOL);plateauCase[25][1] = new Case(25,1,Texture.SOL);plateauCase[25][2] = new Case(25,2,Texture.SOL);plateauCase[25][3] = new Case(25,3,Texture.SOL);plateauCase[25][4] = new Case(25,4,Texture.SOL);plateauCase[25][5] = new Case(25,5,Texture.SOL);
		plateauCase[25][6] = new Case(25,6,Texture.SOL);plateauCase[25][7] = new Case(25,7,Texture.SOL);plateauCase[25][8] = new Case(25,8,Texture.SOL);plateauCase[25][9] = new Case(25,9,Texture.SOL);plateauCase[25][10] = new Case(25,10,Texture.SOL);plateauCase[25][11] = new Case(25,11,Texture.MUR);plateauCase[25][12] = new Case(25,12,Texture.VIDE);plateauCase[25][13] = new Case(25,13,Texture.VIDE);plateauCase[25][14] = new Case(25,14,Texture.VIDE);
		plateauCase[25][15] = new Case(25,15,Texture.VIDE);plateauCase[25][16] = new Case(25,16,Texture.VIDE);plateauCase[25][17] = new Case(25,17,Texture.VIDE);plateauCase[25][18] = new Case(25,18,Texture.VIDE);plateauCase[25][19] = new Case(25,19,Texture.VIDE);plateauCase[25][20] = new Case(25,20,Texture.VIDE);plateauCase[25][21] = new Case(25,21,Texture.VIDE);plateauCase[25][22] = new Case(25,22,Texture.VIDE);plateauCase[25][23] = new Case(25,23,Texture.VIDE);
		plateauCase[25][24] = new Case(25,24,Texture.VIDE);plateauCase[25][25] = new Case(25,25,Texture.VIDE);plateauCase[25][26] = new Case(25,26,Texture.VIDE);plateauCase[25][27] = new Case(25,27,Texture.VIDE);plateauCase[25][28] = new Case(25,28,Texture.VIDE);plateauCase[25][29] = new Case(25,29,Texture.VIDE);plateauCase[26][0] = new Case(26,0,Texture.SOL);plateauCase[26][1] = new Case(26,1,Texture.SOL);plateauCase[26][2] = new Case(26,2,Texture.SOL);
		plateauCase[26][3] = new Case(26,3,Texture.SOL);plateauCase[26][4] = new Case(26,4,Texture.SOL);plateauCase[26][5] = new Case(26,5,Texture.SOL);plateauCase[26][6] = new Case(26,6,Texture.SOL);plateauCase[26][7] = new Case(26,7,Texture.SOL);plateauCase[26][8] = new Case(26,8,Texture.SOL);plateauCase[26][9] = new Case(26,9,Texture.SOL);plateauCase[26][10] = new Case(26,10,Texture.SOL);plateauCase[26][11] = new Case(26,11,Texture.MUR);
		plateauCase[26][12] = new Case(26,12,Texture.VIDE);plateauCase[26][13] = new Case(26,13,Texture.VIDE);plateauCase[26][14] = new Case(26,14,Texture.VIDE);plateauCase[26][15] = new Case(26,15,Texture.VIDE);plateauCase[26][16] = new Case(26,16,Texture.VIDE);plateauCase[26][17] = new Case(26,17,Texture.VIDE);plateauCase[26][18] = new Case(26,18,Texture.VIDE);plateauCase[26][19] = new Case(26,19,Texture.VIDE);plateauCase[26][20] = new Case(26,20,Texture.VIDE);
		plateauCase[26][21] = new Case(26,21,Texture.VIDE);plateauCase[26][22] = new Case(26,22,Texture.VIDE);plateauCase[26][23] = new Case(26,23,Texture.VIDE);plateauCase[26][24] = new Case(26,24,Texture.VIDE);plateauCase[26][25] = new Case(26,25,Texture.VIDE);plateauCase[26][26] = new Case(26,26,Texture.VIDE);plateauCase[26][27] = new Case(26,27,Texture.VIDE);plateauCase[26][28] = new Case(26,28,Texture.VIDE);plateauCase[26][29] = new Case(26,29,Texture.VIDE);
		plateauCase[27][0] = new Case(27,0,Texture.SOL);plateauCase[27][1] = new Case(27,1,Texture.TABLE);plateauCase[27][2] = new Case(27,2,Texture.TABLE);plateauCase[27][3] = new Case(27,3,Texture.TABLE);plateauCase[27][4] = new Case(27,4,Texture.TABLE);plateauCase[27][5] = new Case(27,5,Texture.TABLE);plateauCase[27][6] = new Case(27,6,Texture.TABLE);plateauCase[27][7] = new Case(27,7,Texture.TABLE);plateauCase[27][8] = new Case(27,8,Texture.TABLE);
		plateauCase[27][9] = new Case(27,9,Texture.TABLE);plateauCase[27][10] = new Case(27,10,Texture.COFFRE);plateauCase[27][11] = new Case(27,11,Texture.MUR);plateauCase[27][12] = new Case(27,12,Texture.VIDE);plateauCase[27][13] = new Case(27,13,Texture.VIDE);plateauCase[27][14] = new Case(27,14,Texture.VIDE);plateauCase[27][15] = new Case(27,15,Texture.VIDE);plateauCase[27][16] = new Case(27,16,Texture.VIDE);plateauCase[27][17] = new Case(27,17,Texture.VIDE);
		plateauCase[27][18] = new Case(27,18,Texture.VIDE);plateauCase[27][19] = new Case(27,19,Texture.VIDE);plateauCase[27][20] = new Case(27,20,Texture.VIDE);plateauCase[27][21] = new Case(27,21,Texture.VIDE);plateauCase[27][22] = new Case(27,22,Texture.VIDE);plateauCase[27][23] = new Case(27,23,Texture.VIDE);plateauCase[27][24] = new Case(27,24,Texture.VIDE);plateauCase[27][25] = new Case(27,25,Texture.VIDE);plateauCase[27][26] = new Case(27,26,Texture.VIDE);
		plateauCase[27][27] = new Case(27,27,Texture.VIDE);plateauCase[27][28] = new Case(27,28,Texture.VIDE);plateauCase[27][29] = new Case(27,29,Texture.VIDE);plateauCase[28][0] = new Case(28,0,Texture.MUR);plateauCase[28][1] = new Case(28,1,Texture.MUR);plateauCase[28][2] = new Case(28,2,Texture.MUR);plateauCase[28][3] = new Case(28,3,Texture.MUR);plateauCase[28][4] = new Case(28,4,Texture.MUR);plateauCase[28][5] = new Case(28,5,Texture.MUR);
		plateauCase[28][6] = new Case(28,6,Texture.MUR);plateauCase[28][7] = new Case(28,7,Texture.MUR);plateauCase[28][8] = new Case(28,8,Texture.MUR);plateauCase[28][9] = new Case(28,9,Texture.MUR);plateauCase[28][10] = new Case(28,10,Texture.MUR);plateauCase[28][11] = new Case(28,11,Texture.MUR);plateauCase[28][12] = new Case(28,12,Texture.VIDE);plateauCase[28][13] = new Case(28,13,Texture.VIDE);plateauCase[28][14] = new Case(28,14,Texture.VIDE);
		plateauCase[28][15] = new Case(28,15,Texture.VIDE);plateauCase[28][16] = new Case(28,16,Texture.VIDE);plateauCase[28][17] = new Case(28,17,Texture.VIDE);plateauCase[28][18] = new Case(28,18,Texture.VIDE);plateauCase[28][19] = new Case(28,19,Texture.VIDE);plateauCase[28][20] = new Case(28,20,Texture.VIDE);plateauCase[28][21] = new Case(28,21,Texture.VIDE);plateauCase[28][22] = new Case(28,22,Texture.VIDE);plateauCase[28][23] = new Case(28,23,Texture.VIDE);
		plateauCase[28][24] = new Case(28,24,Texture.VIDE);plateauCase[28][25] = new Case(28,25,Texture.VIDE);plateauCase[28][26] = new Case(28,26,Texture.VIDE);plateauCase[28][27] = new Case(28,27,Texture.VIDE);plateauCase[28][28] = new Case(28,28,Texture.VIDE);plateauCase[28][29] = new Case(28,29,Texture.VIDE);plateauCase[29][0] = new Case(29,0,Texture.SOL);plateauCase[29][1] = new Case(29,1,Texture.SOL);plateauCase[29][2] = new Case(29,2,Texture.TABLE);
		plateauCase[29][3] = new Case(29,3,Texture.TABLE);plateauCase[29][4] = new Case(29,4,Texture.TABLE);plateauCase[29][5] = new Case(29,5,Texture.TABLE);plateauCase[29][6] = new Case(29,6,Texture.TABLE);plateauCase[29][7] = new Case(29,7,Texture.TABLE);plateauCase[29][8] = new Case(29,8,Texture.TABLE);plateauCase[29][9] = new Case(29,9,Texture.TABLE);plateauCase[29][10] = new Case(29,10,Texture.TABLE);plateauCase[29][11] = new Case(29,11,Texture.MUR);
		plateauCase[29][12] = new Case(29,12,Texture.VIDE);plateauCase[29][13] = new Case(29,13,Texture.VIDE);plateauCase[29][14] = new Case(29,14,Texture.VIDE);plateauCase[29][15] = new Case(29,15,Texture.VIDE);plateauCase[29][16] = new Case(29,16,Texture.VIDE);plateauCase[29][17] = new Case(29,17,Texture.VIDE);plateauCase[29][18] = new Case(29,18,Texture.VIDE);plateauCase[29][19] = new Case(29,19,Texture.VIDE);plateauCase[29][20] = new Case(29,20,Texture.VIDE);
		plateauCase[29][21] = new Case(29,21,Texture.VIDE);plateauCase[29][22] = new Case(29,22,Texture.VIDE);plateauCase[29][23] = new Case(29,23,Texture.VIDE);plateauCase[29][24] = new Case(29,24,Texture.VIDE);plateauCase[29][25] = new Case(29,25,Texture.VIDE);plateauCase[29][26] = new Case(29,26,Texture.VIDE);plateauCase[29][27] = new Case(29,27,Texture.VIDE);plateauCase[29][28] = new Case(29,28,Texture.VIDE);plateauCase[29][29] = new Case(29,29,Texture.VIDE);


	}
		
		
	
	
/*	public void AfficherCarte(){
		

		for (int i = 0;i<29;i++){
			System.out.print("\n");
		
			for (int j = 0; j<29;j++){
				if(plateauCase[i][j].indexTexture.obtenirIcone()=="mur.png")
					System.out.print("zob "); 
					else
						System.out.print("coucou "); 	
					
				}
			}
		}
	*/
	
	public static Case[][] obtenirPlateauCase()
	{
	    return plateauCase;
	}
	
	public void deplacementPersonnage()
	{

	}

	/**
	 * La methode attaque calcule les d�gats inflig�s.
	 * 
	 * @return la valeur des degats inflig�s
	 */
	public int attaque()
	{
		return 0;

	}

	/**
	 * Cette methode permt de demarrer partie.
	 */
	public void demarrerPartie()
	{

		/*
		 * public Partie() { this.mappingClavier = new MappingClavier(); Carte
		 * generateur = new Carte(NB_LIGNES, NB_COLONNES); generateur.generer();
		 */

	}

	/**
	 * Cette m�thode met a jour l'equipement en fonction de l'idem donn� en
	 * entr�e
	 * 
	 * @param prend
	 *            en entr�e un objet de type item
	 */
	public static void miseAJourDeLEquipement(Item item, Personnage p)
	{

		for (int i = 0; i < p.itemCourant.length; i++)
			if (item.obtenirType() == p.itemCourant[i].obtenirType())
			{
				if ((item.obtenirArmure() > p.itemCourant[i].obtenirArmure())
						|| (item.obtenirAttaque() > p.itemCourant[i]
								.obtenirAttaque()))
				{
					p.itemCourant[i] = item;
					System.out.println("bravo vous venez d'equiper "
							+ p.itemCourant[i].obtenirNomItem());
					for (int j = 0; j < p.itemCourant.length; j++)
					{
						System.out.println("objet :  "
								+ p.itemCourant[j].obtenirNomItem());
					}

				} else
				{
					System.out
							.println("L'objet "
									+ item.obtenirNomItem()
									+ " ne possedais pas des caracteristiques assez elev�");
					for (int j = 0; j < p.itemCourant.length; j++)
					{
						System.out.println("objet :  "
								+ p.itemCourant[j].obtenirNomItem());
					}
				}
			}

	}

	/**
	 * Cette m�thode dirigie l'ouverture de coffres et de portes.
	 */
	public void ouvertureCoffreOuPorte()
	{

	}
	/*
	 * public static void main(String[] args) { Sorcier p1 =new Sorcier("p1");
	 * Item i1 = new Item("Brodequin de feu","Bottes",7,0); //
	 * miseAJourDeLEquipement(i1,p1); }
	 */

}
