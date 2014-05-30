package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.security.SecureRandom;

public class Creature extends Personnage {

	/**
	 * Constructeur de Creature.
	 * 
	 * @param nom
	 *            le nom de la créature
	 * @param pointDeVie
	 *            son nombre de point de vie
	 * @param attaque
	 *            la valeur de son attaque
	 * @param armure
	 *            la valeur de son armure
	 * @param multiplicateur
	 *            la valeur de son multiplicateur
	 * @param positionCreature
	 *            la case correspondant a la position de la créature
	 * 
	 */
	public Creature(String nom, int pointDeVie, int attaque, int armure,
			double multiplicateur, Case positionCreature) {
		super(nom);
		this.pointDeVie = pointDeVie;
		this.attaque = attaque;
		this.armure = armure;
		this.multiplicateur = multiplicateur;
		this.esquive = 0;
		this.nomClasse = "monstre";
		this.postionPersonnage = positionCreature;

	}
	/**
	 * 
	 * @return Renvoie un objet de type item tiré aleatoirement dans la liste
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
			Item = new Item("Botte de bête", "Bottes", 5, 0);
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
			Item = new Item("Arc  Hétype ", "Arme", 0, 5);
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
