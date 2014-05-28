package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.security.SecureRandom;

/**
 * La classe Decor repr�sentant les d�cors (portes et coffres) dans
 * l'application.
 */
public class Decors {
	/**
	 * Le nom du d�cors.
	 */
	private String nom;
	/**
	 * La position du d�cors sur la carte, d�finit par une Case.
	 */

	protected boolean besoinCle;
	
	public boolean obtenirBesoinCle()
	{
		return this.besoinCle;
	}

	public Decors(String nom,boolean besoinCle)
	{
		this.nom = nom;
		this.besoinCle = besoinCle;
		
	}
	public Item obtenirItemDUnCoffre() {
		
		//if (le joueur clic sur le coffre) 
			
			Item Item= new Item("Botte en laine","Bottes",1,0);
			SecureRandom rand = new SecureRandom();
			int nombreAleatoire = rand.nextInt(10 - 1 + 1) + 1;
			switch (nombreAleatoire)
			{
			  case 0:
				Item=new Item("Botte en Cuir","Bottes",1,0);
			    
			    break;
			  case 1:
					 Item =new Item("Botte en Fer","Bottes",5,0); 
				    break;
			  case 2:
					 Item =new Item("Botte en Diamand","Bottes",10,0);
				    break;
			  case 3:
					 Item =new Item("Armure en Diamand","Torse",10,0);
				    break;
			  case 4:
					 Item =new Item("Botte en ficelle","Bottes",0,0);
				    break;
			  case 5:
					 Item =new Item("Arc de nemesis ","Arme",0,5);
				    break;
			  case 6:
					 Item =new Item("Baton du vide","Arme",0,4);
				    break;
			  case 7:
					 Item =new Item("Armure de folie","Torse",14,0);
				    break;
			  case 8:
					 Item =new Item("Torse de la bete","Torse",6,0);
				    break;
			  case 9:
					 Item =new Item("Botte de feu","Bottes",12,0);
				    break;
			  case 10:
					 Item =new Item("Botte de glace","Bottes",13,0);
				    break;
			 
			  default:
			    System.out.println("");
			   
			}
			
			System.out.println("Vous avez recu "+Item.obtenirNomItem());
			return Item;
			
				

		}

	/**
	 * 
	 * @return Renvoie si une �nigme est pr�sente ou non sur le d�cor.
	 */
	public boolean presenceEnigme() {
		return false;
	}
	
	
}
