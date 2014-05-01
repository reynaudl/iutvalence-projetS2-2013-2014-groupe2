package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.security.SecureRandom;


/**
 * La classe Coffre, sous-classe de Decors qui étend la classe Decors et
 * matérialise les coffres.
 * 
 */
public class Coffre extends Decors {
	
	public Coffre(Case pos)
	{
		super("Coffre",pos);
		
	}

	/**
	 * 
	 * @return Renvoie un item que reçoit le joueur.
	 */
	public Item obtenirItem() {
		Item Item= new Item("Botte en laine","Bottes",1,0);
		SecureRandom rand = new SecureRandom();
		int nombreAleatoire = rand.nextInt(10 - 1 + 1) + 1;
		switch (nombreAleatoire)
		{
		  case 0:
			Item=new Item("Botte en Cuir","Bottes",1,0);
		    
		    break;
		  case 1:
				 Item =new Item("Botte en Fer","Bottes",1,0);
			    
			    break;
		  case 2:
				 Item =new Item("Botte en Diamand","Bottes",1,0);
			    

			    break;
		  case 3:
				 Item =new Item("Armure en Diamand","Torse",1,0);
			    

			    break;
		  case 4:
				 Item =new Item("Botte en ficelle","Bottes",1,0);
			   

			    break;
		  case 5:
				 Item =new Item("Arc de nemesis ","Arme",0,2);
		

			    break;
		  case 6:
				 Item =new Item("Baton du vide","Arme",0,4);


			    break;
		  case 7:
				 Item =new Item("Armure de folie","Torse",1,0);

			    break;
		  case 8:
				 Item =new Item("Torse de la bete","Torse",1,0);

			    break;
		  case 9:
				 Item =new Item("Botte de feu","Bottes",1,0);
			    break;
		  case 10:
				 Item =new Item("Botte de glace","Bottes",1,0);
			    break;
		 
		  default:
		    System.out.println("");
		   
		}
		
		System.out.println("Vous avez recu "+Item.obtenirNomItem());
		return Item;
		
			

	}
	
	/*
	
	public static void main(String[] args) { 
		Coffre c = new Coffre(new Case(3,5));
		c.obtenirItem();
		
	}	  
	*/
	
	

}
