package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

// TODO: Auto-generated Javadoc
/**
 * The Class Partie.
 */
public class Partie {
	
	/**
	 *  Gere le d�placement  du personnage
	 */
	public void deplacementPersonnage(){
		
	}
	
	/**
	 *La methode attaque calcule les d�gats inflig�s.
	 *
	 * @return  la valeur des degats inflig�s
	 */
	public int attaque(){
		return 0;
		
	}
	
	/**
	 * Cette methode permt de demarrer partie.
	 */
	public void demarrerPartie(){
		
	}
	
	/**
	 * Cette m�thode met a jour l'equipement en fonction de l'idem donn� en entr�e
	 * @param  prend en entr�e un objet de type item
	 */
	public void miseAJourDeLEquipement( Item item, Personnage p){
		
		for(int i=0;i<p.itemCourant.length;i++)
			if(item.obtenirType()==p.itemCourant[i].obtenirType()){
				    if((item.obtenirArmure()>p.itemCourant[i].obtenirArmure())||(item.obtenirAttaque()>p.itemCourant[i].obtenirAttaque())){
				    	p.itemCourant[i]=item;
				}	
			}	
		}
		
		
			
	
	
	/**
	 * Cette m�thode dirigie l'ouverture de coffres et de portes.
	 */
	public void ouvertureCoffreOuPorte(){
		
	}

}
