package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.awt.event.KeyEvent;
import java.security.SecureRandom;

import javax.swing.JLabel;

/**
 * La Classe Personnage.
 */
public abstract class Personnage
{
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

	/** leur nombre de point de vie associ�. */
	public int pointDeVie;

	/** Repr�sente la puissance d'attaque. */
	public int attaque;

	/** Repr�sente l'armure du personnage. */
	public int armure;

	/** Représente le multiplicateur de dégat du personnage. */
	public double multiplicateur;

	/** Représente le taux d'esquive du personnage. */
	public int esquive;

	/** Représente la liste des items que porte le personnage. */
	public Item[] itemCourant;

	public Case postionPersonnage;

	/**
	 * Le constructeur du personnage
	 * 
	 * @param String
	 *            nom le nom du personnage
	 */
	public Personnage(String nom)
	{

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
	 * Obtenir point de vie permet d'avoir acc�s au nombre de point de vie du
	 * personnage.
	 * 
	 * @return renvoie son nombre de point de vie
	 */
	public int obtenirPointDeVie()
	{
		return this.pointDeVie;
	}

	/**
	 * Obtenir point de vie permet d'avoir acc�s au nombre de point de vie du
	 * personnage.
	 * 
	 * @return renvoie son nombre de point de vie
	 */
	public String obtenirNomClasse()
	{
		return this.nomClasse;
	}

	/**
	 * Prend un tableau d'item et met a jour les caracteristiques du perso en
	 * fonctions de ceux-ci
	 * 
	 * @param nouvEquip
	 *            Un tableau d'item
	 */

	public void miseAJourInfo(Item[] nouvEquip)
	{

		this.armure = nouvEquip[0].obtenirArmure() + ARMURE_DE_BASE
				+ nouvEquip[1].obtenirArmure();
		this.attaque = ATTAQUE_DE_BASE + nouvEquip[2].obtenirAttaque();
	}

	/**
	 * Obtenir attaque permet d'avoir acc�s a la puissance d'attaque du
	 * personnage
	 * 
	 * @return renvoie sa puissance d'attaque
	 */
	public int obtenirAttaque()
	{
		return this.attaque;
	}

	/**
	 * Equipe l'objet recuper� en entr�e si celui-ci est meilleur que ceux deja
	 * equip�
	 * 
	 * @param un
	 *            objet de type item
	 */

	public void miseAJourDeLEquipement(Item item, JLabel lab)
	{

		for (int i = 0; i < this.itemCourant.length; i++)
			if (item.obtenirType() == this.itemCourant[i].obtenirType())
			{
				if ((item.obtenirArmure() > this.itemCourant[i].obtenirArmure())
						|| (item.obtenirAttaque() > this.itemCourant[i]
								.obtenirAttaque()))
				{
					this.itemCourant[i] = item;
					lab.setText("bravo vous venez d'equiper "
							+ this.itemCourant[i].obtenirNomItem());
				
				}
				else
				{
					lab.setText("D�sol�,l'objet n'etais pas assez puissant");
				}
			}

	}

	/**
	 * Obtenir armure permet d'avoir acc�s a la caracteristique d'armure que
	 * possede le personnage
	 * 
	 * @return renvoie l'armure du personnage
	 */
	public int obtenirArmure()
	{
		return this.armure;
	}

	/**
	 * Obtenir le multiplicateur permet le calcule des dégats du personnage
	 * 
	 * @return renvoie le multiplicateur du personnage
	 */
	public double obtenirMultiplicateur()
	{
		return this.multiplicateur;
	}

	/**
	 * Obtenir l'esquive permet le calcule des dégats du personnage
	 * 
	 * @return renvoie l'esquive du personnage
	 */

	public int obtenirEsquive()
	{
		return this.esquive;
	}

	public void attaqueSpecial()
	{

	}

	public void passif()
	{

	}

	/**
	 * Permet d'obtenir la position du personnage
	 * 
	 * @return renvoie la position du personnage
	 */

	public Case obtenirPositionPersonnage()
	{
		return this.postionPersonnage;
	}

	/**
	 * Tour d'attaque
	 * 
	 * @param p
	 *            le personnage attaquant
	 * @param cible
	 *            le personnage cibl�
	 * @return renvoie les poins de vie de la cible
	 */

	public void attaquer(JLabel lab)
	{
		if (this.obtenirNomClasse() == "sorcier")
		{
			for (int i = 0; i < 4; i++)
				if ((this.obtenirPositionPersonnage().obtenirX() + 1 == IHMJoueur.tabCreat.get(i)
						.obtenirPositionPersonnage().obtenirX() && this
						.obtenirPositionPersonnage().obtenirY() == IHMJoueur.tabCreat.get(i)
						.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() + 2 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() - 1 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() - 2 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() + 1 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() + 2 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() - 1 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() - 2 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY()))
				{
					lab.setText("Vous avez attqué le monstre");
					IHMJoueur.tabCreat.get(i).pointDeVie = (int) (IHMJoueur.tabCreat.get(i).pointDeVie - this.multiplicateur
							* ((this.attaque * 10) / (IHMJoueur.tabCreat.get(i)
								.obtenirArmure() * 2)));
					
				}
		}
		if (this.obtenirNomClasse() == "chasseur")
		{
			for (int i = 0; i < 4; i++)
				if ((this.obtenirPositionPersonnage().obtenirX() + 1 == IHMJoueur.tabCreat.get(i)
						.obtenirPositionPersonnage().obtenirX() && this
						.obtenirPositionPersonnage().obtenirY() == IHMJoueur.tabCreat.get(i)
						.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() + 2 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() + 3 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() - 1 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() - 2 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() - 3 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() + 1 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() + 2 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() + 3 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() - 1 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() - 2 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() - 3 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY()))
				{
					lab.setText("Vous avez attqué le monstre");
					IHMJoueur.tabCreat.get(i).pointDeVie = (int) (IHMJoueur.tabCreat.get(i).pointDeVie - this.multiplicateur
							* ((this.attaque * 10) / (IHMJoueur.tabCreat.get(i)
									.obtenirArmure() * 2)));
				}
		}
		if (this.obtenirNomClasse() == "guerrier")
		{
			for (int i = 0; i < 4; i++)
				if ((this.obtenirPositionPersonnage().obtenirX() + 1 == IHMJoueur.tabCreat.get(i)
						.obtenirPositionPersonnage().obtenirX() && this
						.obtenirPositionPersonnage().obtenirY() == IHMJoueur.tabCreat.get(i)
						.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() - 1 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() + 1 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY())
						|| (this.obtenirPositionPersonnage().obtenirX() == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirX() && this
								.obtenirPositionPersonnage().obtenirY() - 1 == IHMJoueur.tabCreat.get(i)
								.obtenirPositionPersonnage().obtenirY()))
				{
					
					lab.setText("Vous avez attqué le monstre");
					IHMJoueur.tabCreat.get(i).pointDeVie = (int) (IHMJoueur.tabCreat.get(i).pointDeVie - this.multiplicateur
							* ((this.attaque * 10) / (IHMJoueur.tabCreat.get(i)
									.obtenirArmure() * 2)));
				}
		}
			

	}
	
	

	
	public void attaqueMonstre()
	{
		if ((this.obtenirPositionPersonnage().obtenirX() + 1 == IHMJoueur.personnageCourant
				.obtenirPositionPersonnage().obtenirX() && this
				.obtenirPositionPersonnage().obtenirY() == IHMJoueur.personnageCourant
				.obtenirPositionPersonnage().obtenirY())
				|| (this.obtenirPositionPersonnage().obtenirX() - 1 == IHMJoueur.personnageCourant
						.obtenirPositionPersonnage().obtenirX() && this
						.obtenirPositionPersonnage().obtenirY() == IHMJoueur.personnageCourant
						.obtenirPositionPersonnage().obtenirY())
				|| (this.obtenirPositionPersonnage().obtenirX() == IHMJoueur.personnageCourant
						.obtenirPositionPersonnage().obtenirX() && this
						.obtenirPositionPersonnage().obtenirY() + 1 == IHMJoueur.personnageCourant
						.obtenirPositionPersonnage().obtenirY())
				|| (this.obtenirPositionPersonnage().obtenirX() == IHMJoueur.personnageCourant
						.obtenirPositionPersonnage().obtenirX() && this
						.obtenirPositionPersonnage().obtenirY() - 1 == IHMJoueur.personnageCourant
						.obtenirPositionPersonnage().obtenirY()))
		{
			
			
			IHMJoueur.personnageCourant.pointDeVie = (int) (IHMJoueur.personnageCourant.pointDeVie - this.multiplicateur
					* ((this.attaque * 10) / (IHMJoueur.personnageCourant
							.obtenirArmure() * 2)));
		}
	}
	
	/**
	 * 
	 * @return Renvoie un objet de type item tir� aleatoirement dans la liste
	 */
	public Item obtenirItemDUnMonstre() {

		Item Item = new Item("Botte en laine", "Bottes", 1, 0);
		SecureRandom rand = new SecureRandom();
		int nombreAleatoire = rand.nextInt(10 - 1 + 1) + 1;
		switch (nombreAleatoire) {
		case 0:
			Item = new Item("Botte en Cuir", "Bottes", 1, 0);

			break;
		case 1:
			Item = new Item("Botte de b�te", "Bottes", 5, 0);
			break;
		case 2:
			Item = new Item("Botte en or", "Bottes", 10, 0);
			break;
		case 3:
			Item = new Item("Armure en maille", "Torse", 10, 0);
			break;
		case 4:
			Item = new Item("Botte en ficelle", "Bottes", 0, 0);
			break;
		case 5:
			Item = new Item("Arc  H�type ", "Arme", 0, 5);
			break;
		case 6:
			Item = new Item("Baton profocarte", "Arme", 0, 4);
			break;
		case 7:
			Item = new Item("Armure de folie", "Torse", 14, 0);
			break;
		case 8:
			Item = new Item("Torse  primaire", "Torse", 6, 0);
			break;
		case 9:
			Item = new Item("Brodequin", "Bottes", 12, 0);
			break;
		case 10:
			Item = new Item("Sandalette de Zeus", "Bottes", 13, 0);
			break;

		default:
			System.out.println("");

		}

		return Item;

	}


}
