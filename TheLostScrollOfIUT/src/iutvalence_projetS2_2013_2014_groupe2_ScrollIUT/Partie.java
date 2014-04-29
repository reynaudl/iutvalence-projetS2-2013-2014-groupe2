package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

// TODO: Auto-generated Javadoc
/**
 * The Class Partie.
 */
public class Partie {
	
	/**
	 *  Gere le déplacement  du personnage
	 */
	public void deplacementPersonnage(){
		
	}
	
	/**
	 *La methode attaque calcule les dégats infligés.
	 *
	 * @return  la valeur des degats infligés
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
	 * Cette méthode met a jour l'equipement en fonction de l'idem donné en entrée
	 * @param  prend en entrée un objet de type item
	 */
	public void miseAJourDeLEquipement( Item item, Personnage p){
		
		for(int i=0;i<p.itemCourant.length;i++)
			if(item.obtenirType()==p.itemCourant[i].obtenirType()){
				
				switch (item.obtenirType())
				{
				  case "Bottes":
				    if(item..obtenirArmure())>itemCourant.obtenirType().obtenirArmure()){
				        	
				    break;
				  case "Arme":
				    System.out.println(" ");
				    break;
				  case "Torse":
				    System.out.println(" ");
				    break;
				  default:
				    System.out.println(" ");
				}
				
			}
			
		}
		
		
			
	}
	
	/**
	 * Cette méthode dirigie l'ouverture de coffres et de portes.
	 */
	public void ouvertureCoffreOuPorte(){
		
	}

}
