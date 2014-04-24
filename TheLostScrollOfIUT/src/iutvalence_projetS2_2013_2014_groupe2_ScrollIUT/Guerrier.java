package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

public class Guerrier extends Personnage
{

    public Guerrier(String nom)
    {
        super(nom);
        this.armure = 10;
        this.multiplicateur = 1.5;

    }

    public void attaqueSpecial()
    {
        if (pointDeVie >= 40)
            pointDeVie = 50;
        else
            pointDeVie = pointDeVie + 10;
    }

    public void passif()
    {
        if (pointDeVie <= 49)
            pointDeVie=pointDeVie+1;
        else 
            pointDeVie = 50;
    }
    
}
