package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.security.SecureRandom;

public class Creature extends Personnage {

	/**
	 * Constructeur de Creature.
	 * 
	 * @param nom
	 *            le nom de la cr�ature
	 * @param pointDeVie
	 *            son nombre de point de vie
	 * @param attaque
	 *            la valeur de son attaque
	 * @param armure
	 *            la valeur de son armure
	 * @param multiplicateur
	 *            la valeur de son multiplicateur
	 * @param positionCreature
	 *            la case correspondant a la position de la cr�ature
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

	

}
