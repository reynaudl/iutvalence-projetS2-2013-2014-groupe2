package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

// TODO: Auto-generated Javadoc
/**
 * The Class Personnage.
 */
public abstract class Personnage
{

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

    public Personnage(String nom)
    {
        this.nomPersonnage = nom;
        this.pointDeVie = 50;
        this.attaque = 1;
        this.armure = 0;
        this.multiplicateur = 1;
        this.esquive = 10;
    }

    /**
     * Obtenir point de vie permet d'avoir acc�s au nombre de point de vie du
     * personnage.
     * 
     * @return renvoie son nombre de point de vie
     */
    public int obtenirPointDeVie()
    {
        return pointDeVie;
    }

    /**
     * Obtenir attaque permet d'avoir acc�s a la puissance d'attaque du
     * personnage
     * 
     * @return renvoie sa puissance d'attaque
     */
    public int obtenirAttaque()
    {
        return attaque;
    }

    /**
     * Obtenir armure permet d'avoir acc�s a la caracteristique d'armure que
     * possede le personnage
     * 
     * @return renvoie l'armure du personnage
     */
    public int obtenirArmure()
    {
        return armure;
    }

    /**
     * Obtenir le multiplicateur permet le calcule des dégats du personnage
     * 
     * @return renvoie le multiplicateur du personnage
     */
    public double obtenirMultiplicateur()
    {
        return multiplicateur;
    }

    public void attaqueSpecial()
    {

    }

    public int obtenirEsquive()
    {
        return esquive;
    }

}
