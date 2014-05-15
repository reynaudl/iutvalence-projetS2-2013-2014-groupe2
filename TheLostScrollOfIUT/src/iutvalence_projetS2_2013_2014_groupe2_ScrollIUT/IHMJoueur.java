package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class IHMJoueur.
 */
public class IHMJoueur implements Runnable
{
	public JFrame fenetre = new JFrame();
	public JPanel panel = new JPanel();
	public JPanel panel2 = new JPanel();
	public JPanel guerrier = new JPanel();
	public JPanel sorcier = new JPanel();
	public JPanel chasseur = new JPanel();
	public JPanel top = new JPanel();
	// private JLabel label2 = new JLabel("Choisissez votre classe");
	
	
	public JButton bouton7 = new JButton("Annuler");

	public void run()
	{
		int largeur = 700;
		int hauteur = 40;
		int hauteur2 = 150;
		
		top.setPreferredSize(new Dimension(800, 75));

		fenetre.setTitle("The Secret Scroll of IUT");
		fenetre.setSize(800, 800);
		
		// Quand on clique sur la croix, l'appli est détruite
		fenetre.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		// Carte carteDuJeux = new Carte(10, 10);

		JLabel label = new JLabel("asdf");
		label.setPreferredSize(new Dimension(200, 200));

		label.setText("The secret Scroll of IUT");
		label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		
		JButton bouton1 = new JButton("Jouer");
		JButton bouton2 = new JButton("Charger");
		JButton bouton3 = new JButton("Quitter");

		JButton bouton4 = new JButton(new ImageIcon( "images_classes/guerrier.jpg"));
		JButton bouton5 = new JButton(new ImageIcon( "images_classes/sorcier.jpg"));
		JButton bouton6 = new JButton(new ImageIcon( "images_classes/chasseur.jpg"));
		
		// Menu de depart et ses éléments
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(label);
		panel.add(bouton1);
		panel.add(Box.createVerticalStrut(hauteur));
		panel.add(bouton2);
		panel.add(Box.createVerticalStrut(hauteur));
		panel.add(bouton3);
		panel.add(Box.createHorizontalStrut(largeur));
		fenetre.setContentPane(panel);
		panel.setBackground(Color.RED);

		// Menu de selection de la classe
		
		JLabel label2 = new JLabel("Choisissez votre classe");
		label.setPreferredSize(new Dimension(200, 200));

		JTextArea descriptGuerrier = new JTextArea("Le guerrier est un combattant qui n'a peur de rien, donc grâce à sa force surhumaine, c'est la seule personne qui puisse se regènerer ");
		JTextArea descriptGuerrier2 = new JTextArea("constament grâce à la vue du sang de l'ennemi...");
		
		JTextArea descriptSorcier = new JTextArea("Le sorcier est un personnage doté de grand pouvoir maîtrisant les arcanes");
		
		JTextArea descriptChasseur = new JTextArea("Le chasseur sachant chasser sans son chien");
		
		descriptGuerrier.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		descriptGuerrier2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		descriptSorcier.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		descriptChasseur.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		label2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		

		panel2.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel2.setBackground(Color.YELLOW);
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel2.add(Box.createVerticalStrut(hauteur));
		
		top.setBackground(Color.YELLOW);
		guerrier.setBackground(Color.RED);
		sorcier.setBackground(new Color(102, 51, 153));
		chasseur.setBackground(Color.GREEN);
		

		top.add(label2);
		panel2.add(Box.createVerticalStrut(80));
		guerrier.add(bouton4);
		
		//guerrier.add(descriptGuerrier);
		//guerrier.add(descriptGuerrier2);


		sorcier.add(bouton5);
		//sorcier.add(descriptSorcier);
		chasseur.add(bouton6);
	
		
		//chasseur.add(descriptChasseur);
		
		panel2.add(bouton7);
		panel2.add(Box.createHorizontalStrut(largeur));

		fenetre.setVisible(true);

		bouton1.addActionListener(new BoutonListener());
		bouton3.addActionListener(new Quitter());
		bouton7.addActionListener(new Retour());

		
		
		panel2.setLayout(new BorderLayout());
		panel2.add(top, BorderLayout.NORTH);
		panel2.add(guerrier, BorderLayout.WEST);
		panel2.add(sorcier, BorderLayout.CENTER);
		panel2.add(chasseur, BorderLayout.EAST);
	}

	class BoutonListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			fenetre.setContentPane(panel2);
			fenetre.validate();

			/*
			 * panel.removeAll(); panel.repaint(); panel.add(bouton4);
			 * panel.setBackground(Color.GREEN);
			 * 
			 * panel.validate();
			 */

		}
	}
	
	class Quitter implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			if (JOptionPane.showConfirmDialog(fenetre, "Fermer l'application ?", "Confirmation", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
				fenetre.dispose();
		}
	}
	
	class Retour implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			fenetre.setContentPane(panel);
			fenetre.validate();
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
		// if (pos.caseEnFace==null) || (pos.caseEnFace==decors)
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
				System.out
						.println("Quel langage avons nous appris en algorithmie ?");
				break;
			default:

			}

		} else
		{

		}
	}

	/**
	 * Verifie si la porte necessite une clé pour etre ouverte
	 * 
	 * @return true, if successful
	 */

	// Je me demande si il faut vraiment faire cette méthode, vu que besoinCle
	// est deja un booléen. -TB
	public boolean demandeClefsPorte(Porte p)
	{
		if (p.besoinCle == true)
		{
			return true;
		} else
		{
			return false;
		}
	}

	/**
	 * Verifie si le coffre necessite une clé pour etre ouvert
	 * 
	 * @return true, if successful
	 */

	// Idem pour ici -TB
	public boolean demandeClefsCoffre(Coffre c)
	{
		if (c.besoinCle == true)
		{
			return true;
		} else
		{
			return false;
		}

	}
}
