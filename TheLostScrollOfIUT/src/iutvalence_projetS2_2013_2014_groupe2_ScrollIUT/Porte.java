package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

/**
 * La classe Porte, sous-classe de Decors qui étend la classe Decors et matérialise les portes.
 *
 */
public class Porte extends Decors {
	
	/**
	 * Donne l'état de la porte, si elle est fermée (False) ou ouverte(True).
	 */
	private boolean etat;
	private Couleur couleurPorte;
	
	public boolean estOuverte(){
		if (this.etat==true)
				return true;
		return false;
		
	}
	
	public Couleur obtenirCouleurPorte() 
	{
		return this.couleurPorte;
	}
	
	public void changerDEtat(){
		if(this.etat==true)
			this.etat=false;
		else
			this.etat=true;
		
	}


	public void Ouvertureporte(Clef c,Porte p){
		if (p.estOuverte()==false)
			if (p.obtenirCouleurPorte()==c.obtenirCouleurClef())
				if(this.presenceEnigme()==true)
					System.out.println("Vous devez répondre a l'enigme pour ouvrir cette porte");
				else p.changerDEtat(); 
				int nbcle =	c.obtenirCompteurDeClef();
				nbcle--;
					
							
			System.out.println("Vous ne disposez pas de la bonne clé pour ouvrir la porte");
	}
	 
	
}
