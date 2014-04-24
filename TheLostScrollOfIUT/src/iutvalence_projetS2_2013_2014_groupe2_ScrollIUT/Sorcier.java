package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

public class Sorcier extends Personnage
{
    
    public Sorcier(String nom)
    {
        super(nom);
        this.multiplicateur = 2;
    }

    public void attaqueSpecial()
    {
        multiplicateur=multiplicateur*2;
    }
    
    public void passif()
    {
        int nbBoubou;
        /*20 % des degats infligés" */
        
        
    }
    
    
}
