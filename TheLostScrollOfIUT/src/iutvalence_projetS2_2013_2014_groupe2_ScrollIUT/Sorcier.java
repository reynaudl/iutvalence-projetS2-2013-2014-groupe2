package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

public class Sorcier extends Personnage
{
    
    public Sorcier(String nom)
    {
        super(nom);
        this.multiplicateur = 2;
        this.postionPersonnage = new Case(10,10,Texture.SORCIER,null);
        this.nomClasse = "sorcier";
    }

    public void attaqueSpecial()
    {
        this.multiplicateur=this.multiplicateur*2;
    }
    
    public void passif()
    {
        int bouclier;
        /*20 % des degats infligés" */
        
        
    }
    
    
}
