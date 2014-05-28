package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints.Key;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class IHMJoueur.
 */
public class IHMJoueur implements Runnable, KeyListener
{
	public Partie partieDeJeux;
	public static Personnage personnageCourant=new Chasseur("lolo");

	public JFrame fenetre = new JFrame();
	public JPanel panel = new JPanel();
	public JPanel panel2 = new JPanel();
	public JPanel panel3sorc = new JPanel();
	public JPanel panel4guer = new JPanel();
	public JPanel panel5chass = new JPanel();

	public JPanel panelmap = new JPanel();
	public JPanel panelinfo = new JPanel();

	public JPanel guerrier = new JPanel();
	public JPanel sorcier = new JPanel();
	public JPanel chasseur = new JPanel();
	public JPanel top = new JPanel();

	JSplitPane separation = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
	JSplitPane separationbas = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	JSplitPane separation2bas = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	JSplitPane separation4bas = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

	public JPanel panelgauche = new JPanel();
	public JPanel paneldroit = new JPanel();

	public JPanel panelgauche1 = new JPanel();
	public JPanel paneldroit1 = new JPanel();

	public JTextField pseudoSorc = new JTextField(20);
	public JTextField pseudoGuer = new JTextField(20);
	public JTextField pseudoChass = new JTextField(20);
	public String pseudojoueur;

	public JLabel info = new JLabel(); // sert a afficher le pseudo d'un sorcier
	public JLabel info2 = new JLabel(); // sert a afficher le pseudo d'un
										// guerrier
	public JLabel info3 = new JLabel(); // sert a afficher le pseudo d'un
										// chasseur

	// private JLabel label2 = new JLabel("Choisissez votre classe");
	JButton boutonHaut = new JButton();
	JButton boutonBas = new JButton();
	JButton boutonGauche = new JButton();
	JButton boutonDroit = new JButton();
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
		Case[][] plateauDeCase = Partie.obtenirPlateauCase();
		Partie.creationCarte();
		char lettre=e.getKeyChar();
		if (lettre=='z')
		{
			personnageCourant.obtenirPositionPersonnage().setX(personnageCourant.obtenirPositionPersonnage().obtenirX());
			personnageCourant.obtenirPositionPersonnage().setY(personnageCourant.obtenirPositionPersonnage().obtenirY()+1);
			
			for (int i=0;i<29;i++)
		            for (int j=0;j<29;j++)
		            {
		 
		            	if (i==personnageCourant.obtenirPositionPersonnage().obtenirX() && j == personnageCourant.obtenirPositionPersonnage().obtenirY())
		                    panelmap.add(new JLabel(new ImageIcon(personnageCourant.obtenirPositionPersonnage().obtenirIndexTexture().obtenirIcone())));
		            	else 
		                    panelmap.add(new JLabel(new ImageIcon(plateauDeCase[i][j].obtenirIndexTexture().obtenirIcone())));
		            }
		}
		else if (lettre=='s')
		{
			personnageCourant.obtenirPositionPersonnage().setX(personnageCourant.obtenirPositionPersonnage().obtenirX());
			personnageCourant.obtenirPositionPersonnage().setY(personnageCourant.obtenirPositionPersonnage().obtenirY()-1);
			Partie.creationCarte();
		}
		else if (lettre=='q')
		{
			personnageCourant.obtenirPositionPersonnage().setX(personnageCourant.obtenirPositionPersonnage().obtenirX()-1);
			personnageCourant.obtenirPositionPersonnage().setY(personnageCourant.obtenirPositionPersonnage().obtenirY());
			Partie.creationCarte();
		}
		else if (lettre=='d')
		{
			personnageCourant.obtenirPositionPersonnage().setX(personnageCourant.obtenirPositionPersonnage().obtenirX()+1);
			personnageCourant.obtenirPositionPersonnage().setY(personnageCourant.obtenirPositionPersonnage().obtenirY());
			Partie.creationCarte();
		}
		else
		{}
	}
	
	
	
	

	public void run()
	{
		int largeur = 700;
		int hauteur = 40;
		int hauteur2 = 150;
		

		top.setPreferredSize(new Dimension(800, 75));

		fenetre.setTitle("The Secret Scroll of IUT");
		fenetre.setSize(879, 900);
		
		fenetre.setFocusable(true);
		fenetre.requestFocus();
		fenetre.addKeyListener(this);
		

		// La taille de la fenêtre n'est plus modifiable
		fenetre.setResizable(false);

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

		JButton bouton4 = new JButton(new ImageIcon(
				"images_classes/guerrier.jpg"));
		JButton bouton5 = new JButton(new ImageIcon(
				"images_classes/sorcier.jpg"));
		JButton bouton6 = new JButton(new ImageIcon(
				"images_classes/chasseur.jpg"));

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

		JLabel label2 = new JLabel("Choisissez votre classe \n");
		label.setPreferredSize(new Dimension(200, 200));

		JTextArea descriptGuerrier = new JTextArea(
				"Le guerrier est un combattant qui n'a peur de rien, donc grâce �  sa force surhumaine, c'est la seule personne qui puisse se regènerer ");
		JTextArea descriptGuerrier2 = new JTextArea(
				"constament grâce �  la vue du sang de l'ennemi...");

		JTextArea descriptSorcier = new JTextArea(
				"Le sorcier est un personnage doté de grand pouvoir maîtrisant les arcanes");

		JTextArea descriptChasseur = new JTextArea(
				"Le chasseur sachant chasser sans son chien");

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

		// guerrier.add(descriptGuerrier);
		// guerrier.add(descriptGuerrier2);

		sorcier.add(bouton5);
		// sorcier.add(descriptSorcier);
		chasseur.add(bouton6);

		// chasseur.add(descriptChasseur);


		// panel2.add(Box.createHorizontalStrut(largeur));

		// Menu de saisie de pseudo et de confirmation de classe Sorcier
		panel3sorc.setLayout(new BoxLayout(panel3sorc, BoxLayout.Y_AXIS));
		JLabel label3 = new JLabel(
				"Vous avez choisi la classe Sorcier, rentrez votre pseudo");
		label3.setPreferredSize(new Dimension(200, 200));
		label3.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		panel3sorc.setBackground(Color.MAGENTA);
		pseudoSorc.setMaximumSize(new Dimension(150, 30)); // dimensionne la
															// fenetre de saisie
		panel3sorc.add(Box.createVerticalStrut(180));
		panel3sorc.add(label3);
		panel3sorc.add(Box.createVerticalStrut(80));
		panel3sorc.add(pseudoSorc);

		// Menu de saisie de pseudo et de confirmation de classe Guerrier
		panel4guer.setLayout(new BoxLayout(panel4guer, BoxLayout.Y_AXIS));
		JLabel label4 = new JLabel(
				"Vous avez choisi la classe Guerrier, rentrez votre pseudo");
		label4.setPreferredSize(new Dimension(200, 200));
		label4.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		panel4guer.setBackground(Color.RED);
		pseudoGuer.setMaximumSize(new Dimension(150, 30)); // dimensionne la
															// fenetre de saisie
		panel4guer.add(Box.createVerticalStrut(180));
		panel4guer.add(label4);
		panel4guer.add(Box.createVerticalStrut(80));
		panel4guer.add(pseudoGuer);

		// Menu de saisie de pseudo et de confirmation de classe Guerrier
		panel5chass.setLayout(new BoxLayout(panel5chass, BoxLayout.Y_AXIS));
		JLabel label5 = new JLabel(
				"Vous avez choisi la classe Chasseur, rentrez votre pseudo");
		label5.setPreferredSize(new Dimension(200, 200));
		label5.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		panel5chass.setBackground(Color.GREEN);
		pseudoChass.setMaximumSize(new Dimension(150, 30)); // dimensionne la
															// fenetre de saisie
		panel5chass.add(Box.createVerticalStrut(180));
		panel5chass.add(label5);
		panel5chass.add(Box.createVerticalStrut(80));
		panel5chass.add(pseudoChass);

		// IHM avec map + info du joueur + cl�

		// panelmap.setBackground(Color.BLACK);
		panelinfo.setBackground(Color.GREEN);
		panelgauche.setBackground(Color.PINK);
		paneldroit.setBackground(Color.RED);
		panelgauche1.setBackground(Color.PINK);
		paneldroit1.setBackground(Color.RED);

		// remplissage panneau tout a gauche
		panelgauche1.add(Box.createVerticalStrut(60));
		panelgauche1.setLayout(new BoxLayout(panelgauche1, BoxLayout.Y_AXIS));
		JLabel lab = new JLabel(new ImageIcon("cleor.png"));
		lab.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		panelgauche1.add(lab);

		// remplissage panneau de droite
		paneldroit1.add(Box.createVerticalStrut(60));
		paneldroit1.setLayout(new BoxLayout(paneldroit1, BoxLayout.Y_AXIS));
		JLabel lab2 = new JLabel(new ImageIcon("clegrise.png"));
		lab2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		paneldroit1.add(lab2);

		separation2bas.setResizeWeight(0.5);
		separation2bas.setEnabled(false);
		separation2bas.setBorder(null);
		separation2bas.setDividerSize(0);

		separation2bas.setLeftComponent(panelgauche1);
		separation2bas.setRightComponent(paneldroit1);

		separation4bas.setResizeWeight(0.5);
		separation4bas.setEnabled(false);
		separation4bas.setBorder(null);
		separation4bas.setDividerSize(0);

		separation4bas.setLeftComponent(panelgauche);
		separation4bas.setRightComponent(paneldroit);

		separationbas.setResizeWeight(0.25);
		separationbas.setEnabled(false);
		separationbas.setBorder(null);
		separationbas.setDividerSize(0);
		separationbas.setLeftComponent(separation2bas);
		separationbas.setRightComponent(separation4bas);

		panelgauche1.setLayout(new BoxLayout(panelgauche1, BoxLayout.Y_AXIS));
		panelgauche1.add(boutonHaut);
		panelgauche1.add(boutonBas);
		panelgauche1.add(boutonGauche);
		panelgauche1.add(boutonDroit);

		// panelmap.setSize(new Dimension(400, 800));
		// panelinfo.setSize(new Dimension(400, 800));
		panelmap.setBackground(Color.BLACK);
		panelmap.setLayout(new GridLayout(29,0));

		


		separation.setResizeWeight(1.0);
        separation.setEnabled(false);
		separation.setBorder(null);
		separation.setDividerSize(0);
		separation.setTopComponent(panelmap);
		separation.setBottomComponent(separationbas);
		
		fenetre.setVisible(true);
		

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
				if (JOptionPane.showConfirmDialog(fenetre,
						"Fermer l'application ?", "Confirmation",
						JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
					fenetre.dispose();
			}
		}

		class PanelSorc implements ActionListener
		{

			public void actionPerformed(ActionEvent e)
			{

				fenetre.setContentPane(panel3sorc);
				fenetre.validate();

			}
		}

		class PanelGuer implements ActionListener
		{

			public void actionPerformed(ActionEvent e)
			{

				fenetre.setContentPane(panel4guer);
				fenetre.validate();
			}
		}

		class PanelChass implements ActionListener
		{

			public void actionPerformed(ActionEvent e)
			{

				fenetre.setContentPane(panel5chass);
				fenetre.validate();
			}
		}

		class SavePseudo implements ActionListener
		{

			private Personnage personnage;
			
			public void actionPerformed(ActionEvent e)
			{
				Object source = e.getSource();
				if (source == pseudoSorc)
				{ // verifie que c'etait sur le bouton
					// sorcier
					pseudojoueur = pseudoSorc.getText(); // recupere la valeur
															// du champ
					personnage = new Sorcier(pseudojoueur); // creer un sorcier
															// avec cette valeur
					info.setText(personnage.nomPersonnage); // met dans info le nom du


					//personnage = perso;
					//partieDeJeux=new Partie(perso);// perso cr�e

					fenetre.setContentPane(separation);
					fenetre.validate();
				} else
				{
					if (source == pseudoGuer)
					{
						pseudojoueur = pseudoGuer.getText();
						personnage = new Guerrier(pseudojoueur);
						info.setText(personnage.nomPersonnage);
						//personnage = perso;
						//partieDeJeux=new Partie(perso);
						fenetre.setContentPane(separation);
						fenetre.validate();
					} else
					{
						pseudojoueur = pseudoChass.getText();
						personnage = new Chasseur(pseudojoueur);
						info.setText(personnage.nomPersonnage);
						//personnage = perso;
						//partieDeJeux=new Partie(perso);
						fenetre.setContentPane(separation);
						fenetre.validate();

					}
				}
				
				
			}

		
			
		}
		class Deplace implements ActionListener
		{

			public void actionPerformed(ActionEvent e)
			{
				Object source = e.getSource();
				if (source == boutonHaut)
				{
					personnageCourant.obtenirPositionPersonnage().setX(personnageCourant.obtenirPositionPersonnage().obtenirX());
					personnageCourant.obtenirPositionPersonnage().setY(personnageCourant.obtenirPositionPersonnage().obtenirY()+1);
					
			}else if (source == boutonBas)
			{
				personnageCourant.obtenirPositionPersonnage().setX(personnageCourant.obtenirPositionPersonnage().obtenirX());
				personnageCourant.obtenirPositionPersonnage().setY(personnageCourant.obtenirPositionPersonnage().obtenirY()-1);
				
		}
			else if (source == boutonGauche)
			{
				personnageCourant.obtenirPositionPersonnage().setX(personnageCourant.obtenirPositionPersonnage().obtenirX()-1);
				personnageCourant.obtenirPositionPersonnage().setY(personnageCourant.obtenirPositionPersonnage().obtenirY());
				
		}
			else if (source == boutonDroit)
				{
					personnageCourant.obtenirPositionPersonnage().setX(personnageCourant.obtenirPositionPersonnage().obtenirX()+1);
					personnageCourant.obtenirPositionPersonnage().setY(personnageCourant.obtenirPositionPersonnage().obtenirY());
					
			}
			else{}
		}
		}
		
		
		
		boutonHaut.addActionListener(new Deplace());
		boutonBas.addActionListener(new Deplace());
		boutonDroit.addActionListener(new Deplace());
		boutonHaut.addActionListener(new Deplace());
		
		bouton1.addActionListener(new BoutonListener());
		bouton3.addActionListener(new Quitter());
		bouton5.addActionListener(new PanelSorc());
		bouton4.addActionListener(new PanelGuer());
		bouton6.addActionListener(new PanelChass());
		pseudoSorc.addActionListener(new SavePseudo());
		pseudoGuer.addActionListener(new SavePseudo());
		pseudoChass.addActionListener(new SavePseudo());

		
		panel3sorc.add(info); // affiche le nom du perso cr�e pour le pannel
								// sorcier
		panel4guer.add(info); // affiche le nom du perso cr�e pour le pannel
								// guerrier
		panel5chass.add(info); // affiche le nom du perso cr�e pour le pannel
								// chasseur

		panel2.setLayout(new BorderLayout());
		panel2.add(top, BorderLayout.NORTH);
		panel2.add(guerrier, BorderLayout.WEST);
		panel2.add(sorcier, BorderLayout.CENTER);
		panel2.add(chasseur, BorderLayout.EAST);

		JLabel label6 = new JLabel("Pseudo : ");

		panelgauche.add(label6);
		panelgauche.add(info);

		
		Case[][] plateauDeCase = Partie.obtenirPlateauCase();
		Partie.creationCarte();
		
		/*
		class TitreKeyListener implements KeyListener {
		 
			
			
		
				 
				 public void keyPressed(KeyEvent e) {
					    if(e.getKeyCode() == KeyEvent.VK_F5)
					        System.out.println("F5 pressed");
					}

		
			
				
				
				/*Object source = e.getSource();
		    	if(source==Key.z){
		    		personnageCourant.obtenirPositionPersonnage().translater(Mouvement.HAUT);
		    		  System.out.println(111);
		    	}else if(source==Key.q){
		    		personnageCourant.obtenirPositionPersonnage().translater(Mouvement.GAUCHE);
		    		
		    	}else if(source==Key.d){
		    		personnageCourant.obtenirPositionPersonnage().translater(Mouvement.DROITE);
		    		
		    	}
		    	else if(source==Key.s){ 
		    		personnageCourant.obtenirPositionPersonnage().translater(Mouvement.BAS);
		    	}
		    	else{}
		    	

		    }
		    */
		    /*public void keyPressed(KeyEvent e) {
		    	switch(e.getKeyChar()){
		    	case 'z':
		    		personnageCourant.obtenirPositionPersonnage().translater(Mouvement.HAUT);
		    		  System.out.println(111);
		    		break;
		    	case 'q':
		    		personnageCourant.obtenirPositionPersonnage().translater(Mouvement.GAUCHE);
		    		break;
		    	case 'd':
		    		personnageCourant.obtenirPositionPersonnage().translater(Mouvement.DROITE);
		    		break;
		    	case 's':
		    		personnageCourant.obtenirPositionPersonnage().translater(Mouvement.BAS);
		    		break;
		    	}
		        
		    }*/
	/*	 
		    public void keyReleased(KeyEvent e) {
		    	 if(e.getKeyCode() == KeyEvent.VK_F5)
				        System.out.println("F6 pressed");
		    }
		 
		    public void keyTyped(KeyEvent e) {
		    	 if(e.getKeyCode() == KeyEvent.VK_F5)
				        System.out.println("F7 pressed");
		        // on ne fait rien
		    }
		    
		}
		*/
		
	/*
		panelmap.addKeyListener(new TitreKeyListener());
		pseudoSorc.addKeyListener(new TitreKeyListener());
		panelinfo.addKeyListener(new TitreKeyListener());	
		pseudoGuer.addKeyListener(new TitreKeyListener());
		pseudoChass.addKeyListener(new TitreKeyListener());
		fenetre.addKeyListener(new TitreKeyListener());
		separation.addKeyListener(new TitreKeyListener());
		panel3sorc.addKeyListener(new TitreKeyListener());
		panel4guer.addKeyListener(new TitreKeyListener());
		panel2.addKeyListener(new TitreKeyListener());
		panel5chass.addKeyListener(new TitreKeyListener());
		*/
        for (int i=0;i<29;i++)
            for (int j=0;j<29;j++)
            {
 
            	if (i==personnageCourant.obtenirPositionPersonnage().obtenirX() && j == personnageCourant.obtenirPositionPersonnage().obtenirY())
                    panelmap.add(new JLabel(new ImageIcon(personnageCourant.obtenirPositionPersonnage().obtenirIndexTexture().obtenirIcone())));
            	else 
                    panelmap.add(new JLabel(new ImageIcon(plateauDeCase[i][j].obtenirIndexTexture().obtenirIcone())));
                    

            }
  

       
         
        
		
		// JLabel label7 = new JLabel("Armure : ");
        System.out.println(personnageCourant.obtenirPositionPersonnage().obtenirIndexTexture());
        





	}

	public Personnage getPersonnage()
	{
		return personnageCourant;
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
	// public void choixDeClasse(Personnage p1)
	// {
	//
	// }

	/**
	 * Affiche la classe séléctionné
	 */
	// public void afficherClasse()
	// {
	// }

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
					System.out.println("Combien fait 1+1 en informatique ?");
					break;
				case 2:
					System.out
							.println("Quel langage avons nous appris en algorithmie ?");
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