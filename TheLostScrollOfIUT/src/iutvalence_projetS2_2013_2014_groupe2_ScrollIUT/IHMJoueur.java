package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// TODO: Auto-generated Javadoc
/**
 * The Class IHMJoueur.
 */
public class IHMJoueur implements Runnable
{
	public void  run(){
		int largeur = 400;
		int hauteur= 40;
		
		JFrame fenetre = new JFrame();
		fenetre.setTitle("The Secret Scroll of IUT");
		fenetre.setSize(800, 800);
		//Carte carteDuJeux = new Carte(10, 10);
		BoxLayout boxLayout = new BoxLayout(fenetre.getContentPane(), BoxLayout.Y_AXIS); 
		fenetre.setLayout(boxLayout);
		fenetre.add(Box.createHorizontalStrut(largeur));
		fenetre.add(new JButton("Jouer"));
		fenetre.add(Box.createVerticalStrut(hauteur));
		//fenetre.add(Box.createRigidArea(new Dimension(700,0)));
		//fenetre.add(Box.createGlue());
	//	fenetre.add(Box.createVerticalGlue());
		fenetre.add(new JButton("Charger"));
		fenetre.add(Box.createVerticalStrut(hauteur));
		fenetre.add(new JButton("Quitter"));
		fenetre.add(Box.createHorizontalStrut(largeur));
		//fenetre.setBackground(Color.RED);
		fenetre.setVisible(true);
		
	}
		/*
		public void paintComponent(Graphics g){
		try {
			Image img = ImageIO.read(new File("fondscroll.png"));
			g.drawImage(img, 0, 0, (ImageObserver) this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

		
		
	}

	/**
	 * Verifie si le mouvement est possible.
	 */
	public void demandeMouvement()
	{
	}

	/**
	 * actualise l'image a l'ecran.
	 */
	public void actualiserImage()
	{
	}

	/**
	 * Verifie si l'attaque est possible.
	 */
	public boolean demandeAttaque(Case pos)
	{
		//if (pos.caseEnFace==null) || (pos.caseEnFace==decors)
			return false;
	}

	/**
	 * Affiche les dégats infligés par le joueur.
	 * 
	 * @return renvoi la valeur des degats faits
	 */
	public int afficheDegats()
	{
		return 0;
	}

	/**
	 * Affiche les classes disponibles
	 * 
	 * @param prend
	 *            en entrée un personnage
	 */
	public void choixDeClasse(Personnage p1)
	{
	}

	/**
	 * Affiche la classe séléctionné
	 */
	public void afficherClasse()
	{
	}

	/**
	 * Demande la selection d'un objet
	 */
	public void selectionnerUnObjet()
	{
	}

	/**
	 * Selectionenr une réponse parmis N choix
	 */
	public void selection()
	{
	}

	/**
	 * Permet d'afficher l'enigme a l'ecran
	 */
	public void afficherEnigme(Porte p)
	{
		if (p.presenceEnigme() == true)
		{

			switch (p.numeroporte)
			{
				case 0:
					break;
				case 1:
					// La question est bizarre ... c'est pas plutôt en binaire
					System.out.println("Combien fait 1+1 en informatique ?");
					break;
				case 2:
					System.out.println("Quel langage avons nous appris en algorithmie ?");
					break;
				default:

			}

		}
		else
		{

		}
	}

	/**
	 * Verifie si la porte necessite une clé pour etre ouverte
	 * 
	 * @return true, if successful
	 */
	
	//Je me demande si il faut vraiment faire cette méthode, vu que besoinCle est deja un booléen. -TB
	public boolean demandeClefsPorte(Porte p)
	{
		if (p.besoinCle == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * Verifie si le coffre necessite une clé pour etre ouvert
	 * 
	 * @return true, if successful
	 */
	
	//Idem pour ici -TB
	public boolean demandeClefsCoffre(Coffre c)
	{
		if (c.besoinCle == true)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
}
