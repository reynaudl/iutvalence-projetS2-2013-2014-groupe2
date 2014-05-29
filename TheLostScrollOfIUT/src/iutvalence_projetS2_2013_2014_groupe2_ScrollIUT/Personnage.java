package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.awt.event.KeyEvent;

import javax.swing.JLabel;

/**
 * La Classe Personnage.
 */
public abstract class Personnage {
	/** Ensemble de constantes. */
	private static final int ATTAQUE_DE_BASE = 1;

	private static final int ARMURE_DE_BASE = 0;

	private static final int MULTIPLICATEUR_DEGAT_DE_BASE = 1;

	private static final int ESQUIVE_DE_BASE = 10;

	private static final int PV = 50;

	private static final String NOM_CLASSE_DEFAUT = "";

	public String nomClasse;

	/** le nom du personnage. */
	public String nomPersonnage;

	/** leur nombre de point de vie associï¿½. */
	public int pointDeVie;

	/** Reprï¿½sente la puissance d'attaque. */
	public int attaque;

	/** Reprï¿½sente l'armure du personnage. */
	public int armure;

	/** ReprÃ©sente le multiplicateur de dÃ©gat du personnage. */
	public double multiplicateur;

	/** ReprÃ©sente le taux d'esquive du personnage. */
	public int esquive;

	/** ReprÃ©sente la liste des items que porte le personnage. */
	public Item[] itemCourant;

	public Case postionPersonnage;

	/**
	 * Le constructeur du personnage 
	 * 
	 * @param String
	 *            nom le nom du personnage
	 */
	public Personnage(String nom) {

		this.nomPersonnage = nom;
		this.pointDeVie = PV;
		this.multiplicateur = MULTIPLICATEUR_DEGAT_DE_BASE;
		this.esquive = ESQUIVE_DE_BASE;
		this.nomClasse = NOM_CLASSE_DEFAUT;
		itemCourant = new Item[3];
		itemCourant[0] = new Item("Botte en laine", "Bottes", 1, 0);
		itemCourant[1] = new Item("Armure en laine", "Torse", 1, 0);
		itemCourant[2] = new Item("Arme de poing", "Arme", 0, 4);
		this.attaque = ATTAQUE_DE_BASE + this.itemCourant[2].obtenirAttaque();
		this.armure = ARMURE_DE_BASE + itemCourant[1].obtenirArmure()
				+ this.itemCourant[0].obtenirArmure();

	}

	/**
	 * Obtenir point de vie permet d'avoir accï¿½s au nombre de point de vie du
	 * personnage.
	 * 
	 * @return renvoie son nombre de point de vie
	 */
	public int obtenirPointDeVie() {
		return this.pointDeVie;
	}

	/**
	 * Obtenir point de vie permet d'avoir accï¿½s au nombre de point de vie du
	 * personnage.
	 * 
	 * @return renvoie son nombre de point de vie
	 */
	public String obtenirNomClasse() {
		return this.nomClasse;
	}
	
	/**
	 * Prend un tableau d'item et met a jour les caracteristiques du perso en fonctions de ceux-ci
	 * @param nouvEquip
	 * 			Un tableau d'item
	 */

	public void miseAJourInfo(Item[] nouvEquip) {

		this.armure = nouvEquip[0].obtenirArmure() + ARMURE_DE_BASE
				+ nouvEquip[1].obtenirArmure();
		this.attaque = ATTAQUE_DE_BASE + nouvEquip[2].obtenirAttaque();
	}

	/**
	 * Obtenir attaque permet d'avoir accï¿½s a la puissance d'attaque du
	 * personnage
	 * 
	 * @return renvoie sa puissance d'attaque
	 */
	public int obtenirAttaque() {
		return this.attaque;
	}
	
	/**
	 * Equipe l'objet recuperé en entrée si celui-ci est meilleur que ceux deja equipé
	 * @param un objet de type item
	 */

	public void miseAJourDeLEquipement(Item item,JLabel lab) {

		for (int i = 0; i < this.itemCourant.length; i++)
			if (item.obtenirType() == this.itemCourant[i].obtenirType()) {
				if ((item.obtenirArmure() > this.itemCourant[i].obtenirArmure())
						|| (item.obtenirAttaque() > this.itemCourant[i]
								.obtenirAttaque())) {
					this.itemCourant[i] = item;
					lab.setText("bravo vous venez d'equiper "+this.itemCourant[i].obtenirNomItem());
					for (int j = 0; j < this.itemCourant.length; j++) {
						System.out.println("objet :  "
								+ this.itemCourant[j].obtenirNomItem());
					}

				} else {
					lab.setText("Désolé,l'objet n'etais pas assez puissant");
				
					for (int j = 0; j < this.itemCourant.length; j++) {
						System.out.println("objet :  "
								+ this.itemCourant[j].obtenirNomItem());
					}
				}
			}

	}





	/**
	 * Obtenir armure permet d'avoir accï¿½s a la caracteristique d'armure que
	 * possede le personnage
	 * 
	 * @return renvoie l'armure du personnage
	 */
	public int obtenirArmure() {
		return this.armure;
	}

	/**
	 * Obtenir le multiplicateur permet le calcule des dÃ©gats du personnage
	 * 
	 * @return renvoie le multiplicateur du personnage
	 */
	public double obtenirMultiplicateur() {
		return this.multiplicateur;
	}
	/**
	 * Obtenir l'esquive permet le calcule des dÃ©gats du personnage
	 * 
	 * @return renvoie l'esquive du personnage
	 */

	public int obtenirEsquive() {
		return this.esquive;
	}

	public void attaqueSpecial() {

	}

	public void passif() {

	}
	/**
	 * Permet d'obtenir la position du personnage
	 * 
	 * @return renvoie la position du personnage
	 */

	public Case obtenirPositionPersonnage() {
		return this.postionPersonnage;
	}

	/**
	 * Tour d'attaque
	 * 
	 *  @param p
	 *  	le personnage attaquant
	 *  @param cible
	 *  	le personnage ciblé 
	 * @return renvoie les poins de vie de la cible
	 */


	public int Attaquer(Personnage p, Personnage cible) {
		if (p.nomClasse == "sorcier") {
			if (((-3 < p.postionPersonnage.obtenirX()
					- cible.postionPersonnage.obtenirX())
					&& (p.postionPersonnage.obtenirX()
							- cible.postionPersonnage.obtenirX() < 3) && (p.postionPersonnage
					.obtenirY() == cible.postionPersonnage.obtenirY()))
					|| ((-3 < p.postionPersonnage.obtenirY()
							- cible.postionPersonnage.obtenirY())
							&& (p.postionPersonnage.obtenirY()
									- cible.postionPersonnage.obtenirY() < 3) && (p.postionPersonnage
							.obtenirX() == cible.postionPersonnage.obtenirX())))
				cible.pointDeVie = (int) p.obtenirMultiplicateur()*((p.obtenirAttaque()*10)/(cible.obtenirArmure()*2));
		}
		else if ((p.nomClasse == "guerrier")||(p.nomClasse == "monstre"))  {
			if (((-2 < p.postionPersonnage.obtenirX()
					- cible.postionPersonnage.obtenirX())
					&& (p.postionPersonnage.obtenirX()
							- cible.postionPersonnage.obtenirX() < 2) && (p.postionPersonnage
					.obtenirY() == cible.postionPersonnage.obtenirY()))
					|| ((-2 < p.postionPersonnage.obtenirY()
							- cible.postionPersonnage.obtenirY())
							&& (p.postionPersonnage.obtenirY()
									- cible.postionPersonnage.obtenirY() < 2) && (p.postionPersonnage
							.obtenirX() == cible.postionPersonnage.obtenirX())))
				cible.pointDeVie = (int) p.obtenirMultiplicateur()*((p.obtenirAttaque()*10)/(cible.obtenirArmure()*2));
		}
		else if (p.nomClasse == "chasseur")  {
			if (((-4 < p.postionPersonnage.obtenirX()
					- cible.postionPersonnage.obtenirX())
					&& (p.postionPersonnage.obtenirX()
							- cible.postionPersonnage.obtenirX() < 4) && (p.postionPersonnage
					.obtenirY() == cible.postionPersonnage.obtenirY()))
					|| ((-4 < p.postionPersonnage.obtenirY()
							- cible.postionPersonnage.obtenirY())
							&& (p.postionPersonnage.obtenirY()
									- cible.postionPersonnage.obtenirY() < 4) && (p.postionPersonnage
							.obtenirX() == cible.postionPersonnage.obtenirX())))
				cible.pointDeVie = (int) p.obtenirMultiplicateur()*((p.obtenirAttaque()*10)/(cible.obtenirArmure()*2));
		}

		return cible.pointDeVie;
	}
}
