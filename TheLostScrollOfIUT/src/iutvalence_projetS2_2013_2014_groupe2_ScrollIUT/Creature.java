
package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

public class Creature extends Personnage
{

    public Creature(String nom, int pointDeVie, int attaque, int armure,
            double multiplicateur)
    {
        super(nom);
        this.pointDeVie = pointDeVie;
        this.attaque = attaque;
        this.armure = armure;
        this.multiplicateur = multiplicateur;
        this.esquive = 0;
        this.nomClasse= "monstre";
        
    }

}

