package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

public class Chasseur extends Personnage
{
	public Chasseur(String nom)
	{
		super(nom);
		this.multiplicateur = 1.75;
		this.postionPersonnage = new Case(10,10,Texture.CHASSEUR,null);
		this.nomClasse = "chasseur";
	}

	public void attaqueSpecial()
	{
		this.esquive = 50;
	}

	public void passif()
	{
		this.esquive = 20;
	}
}
