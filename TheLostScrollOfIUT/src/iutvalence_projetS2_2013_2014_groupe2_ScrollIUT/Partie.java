package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

// TODO: Auto-generated Javadoc
/**
 * The Class Partie.
 */
public class Partie
{

	public Personnage personnage;
	public  Case[][] plateauCase;
	public Decors decors;
	
	public Partie()
	{
		this.personnage = new Sorcier("Ademage");
		this.creationCarte();
	}
	/**
	 * Gere le d�placement du personnage
	 */
	
	public void creationCarte()
	{
		for (int i = 0;i<10;i++)
			for (int j =0;j<10;j++)
				if ((i==0 || i==9) ||(j==0 || j==9))
					this.plateauCase[i][j]=new Case(i,j,Texture.MUR);
				else
					this.plateauCase[i][j]=new Case(i,j,Texture.SOL);
	}
	public void deplacementPersonnage()
	{

	}

	/**
	 * La methode attaque calcule les d�gats inflig�s.
	 * 
	 * @return la valeur des degats inflig�s
	 */
	public int attaque()
	{
		return 0;

	}

	/**
	 * Cette methode permt de demarrer partie.
	 */
	public void demarrerPartie()
	{

		/*
		 * public Partie() { this.mappingClavier = new MappingClavier(); Carte
		 * generateur = new Carte(NB_LIGNES, NB_COLONNES); generateur.generer();
		 */

	}

	/**
	 * Cette m�thode met a jour l'equipement en fonction de l'idem donn� en
	 * entr�e
	 * 
	 * @param prend
	 *            en entr�e un objet de type item
	 */
	public static void miseAJourDeLEquipement(Item item, Personnage p)
	{

		for (int i = 0; i < p.itemCourant.length; i++)
			if (item.obtenirType() == p.itemCourant[i].obtenirType())
			{
				if ((item.obtenirArmure() > p.itemCourant[i].obtenirArmure())
						|| (item.obtenirAttaque() > p.itemCourant[i]
								.obtenirAttaque()))
				{
					p.itemCourant[i] = item;
					System.out.println("bravo vous venez d'equiper "
							+ p.itemCourant[i].obtenirNomItem());
					for (int j = 0; j < p.itemCourant.length; j++)
					{
						System.out.println("objet :  "
								+ p.itemCourant[j].obtenirNomItem());
					}

				} else
				{
					System.out
							.println("L'objet "
									+ item.obtenirNomItem()
									+ " ne possedais pas des caracteristiques assez elev�");
					for (int j = 0; j < p.itemCourant.length; j++)
					{
						System.out.println("objet :  "
								+ p.itemCourant[j].obtenirNomItem());
					}
				}
			}

	}

	/**
	 * Cette m�thode dirigie l'ouverture de coffres et de portes.
	 */
	public void ouvertureCoffreOuPorte()
	{

	}
	/*
	 * public static void main(String[] args) { Sorcier p1 =new Sorcier("p1");
	 * Item i1 = new Item("Brodequin de feu","Bottes",7,0); //
	 * miseAJourDeLEquipement(i1,p1); }
	 */

}
