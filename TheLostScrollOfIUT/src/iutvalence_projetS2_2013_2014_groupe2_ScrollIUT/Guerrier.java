package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

public class Guerrier extends Personnage
{

    public Guerrier(String nom)
    {
        super();
    }

    public void attaqueSpecial()
    {
        if (pointDeVie>=40)
            pointDeVie = 50;
        else 
            pointDeVie = pointDeVie+10;
    }
}
