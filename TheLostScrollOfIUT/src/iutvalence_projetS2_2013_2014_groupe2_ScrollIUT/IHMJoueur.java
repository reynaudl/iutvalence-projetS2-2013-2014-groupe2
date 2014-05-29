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
import java.security.SecureRandom;

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
public class IHMJoueur implements Runnable, KeyListener {
	
	/**************************************Declaration de la partie et des personnages pr�sents*******************/
	
	public Partie partieDeJeux= new Partie(personnageCourant);
	public static Personnage personnageCourant = new Chasseur("lolo");
	public static Personnage monstre1 = new Creature("creat1",20,2,2,1.0,new Case(6,5,Texture.MONSTRE,null));
	public static Personnage monstre2 = new Creature("creat2",20,2,2,1.0,new Case(12,25,Texture.MONSTRE,null));
	public static Personnage monstre3 = new Creature("creat3",20,2,2,1.0,new Case(15,17,Texture.MONSTRE,null));
	public static Personnage monstre4 = new Creature("creat4",20,2,2,1.0,new Case(15,10,Texture.MONSTRE,null));
	
	public Case[][] plateauDeCase;
	public Personnage[] tabCreat = {monstre1,monstre2,monstre3,monstre4};
	
	
	/**************************************Panel de 1er menu*******************/
	public JFrame fenetre = new JFrame();
	public JPanel panel = new JPanel();
	
	
	/**************************************Panel de 2eme menu*******************/
	public JPanel panel2 = new JPanel();
	public JPanel guerrier = new JPanel();
	public JPanel sorcier = new JPanel();
	public JPanel chasseur = new JPanel();
	public JPanel top = new JPanel();
	
	/**************************************Panel 3eme menu *************************/
	public JPanel panel3sorc = new JPanel();
	public JPanel panel4guer = new JPanel();
	public JPanel panel5chass = new JPanel();
	
	public JTextField pseudoSorc = new JTextField(20);
	public JTextField pseudoGuer = new JTextField(20);
	public JTextField pseudoChass = new JTextField(20);
	public String pseudojoueur;
	
	
	/**************************************Panel final contenant carte et info joueur *************************/
	public JPanelMap panelmap = new JPanelMap();
	public JPanel panelinfo = new JPanel();

	JSplitPane separation = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
	JSplitPane separationbas = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	JSplitPane separation2bas = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	JSplitPane separation4bas = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

	public JPanel panelgauche = new JPanel();
	public JPanel paneldroit = new JPanel();

	public JPanel panelgauche1 = new JPanel();
	public JPanel paneldroit1 = new JPanel();

	public JLabel info = new JLabel(); // sert a afficher le pseudo d'un sorcier


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
	
		char lettre=e.getKeyChar();
		if (lettre=='z')
		{
			
			if (plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()-1][personnageCourant.obtenirPositionPersonnage().obtenirY()].obtenirIndexTexture().caseBloquante() == false )
			{
				personnageCourant.obtenirPositionPersonnage().setX(personnageCourant.obtenirPositionPersonnage().obtenirX()-1);
				personnageCourant.obtenirPositionPersonnage().setY(personnageCourant.obtenirPositionPersonnage().obtenirY());
				deplacementRandom();
				panelmap.removeAll();
				this.affichageMap();
				panelmap.validate();
			}
			else if (plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()-1][personnageCourant.obtenirPositionPersonnage().obtenirY()].obtenirIndexTexture() == Texture.COFFRE)
			{
				if (plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()-1][personnageCourant.obtenirPositionPersonnage().obtenirY()].obtenirDecors().obtenirBesoinCle() == true )
				{
					
				}
				else
				{
					if (JOptionPane.showConfirmDialog(fenetre,"Ouvrir ?", "Confirmation",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
					{
						plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()-1][personnageCourant.obtenirPositionPersonnage().obtenirY()].setTexture(Texture.COFFRE_OUVERT);
						personnageCourant.miseAJourDeLEquipement(plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()-1][personnageCourant.obtenirPositionPersonnage().obtenirY()].obtenirDecors().obtenirItemDUnCoffre());
						panelmap.removeAll();
						affichagePanneau();
						this.affichageMap();
						panelmap.validate();
						//panelgauche.removeAll();
						//panelgauche.validate();
					}
				}
			}
			else if (plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()-1][personnageCourant.obtenirPositionPersonnage().obtenirY()].obtenirIndexTexture() == Texture.PORTE_FERMER)
			{
				if (plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()-1][personnageCourant.obtenirPositionPersonnage().obtenirY()].obtenirDecors().obtenirBesoinCle() == true )
				{
					
				}
				else
				{
					if (JOptionPane.showConfirmDialog(fenetre,"Ouvrir ?", "Confirmation",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
					{
						plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()-1][personnageCourant.obtenirPositionPersonnage().obtenirY()].setTexture(Texture.PORTE_OUVERTE);
						panelmap.removeAll();
						affichagePanneau();
						this.affichageMap();
						panelmap.validate();
						//panelgauche.removeAll();
						//panelgauche.validate();
					}
				}
			}
		}
		else if (lettre=='s')
		{
			if (plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()+1][personnageCourant.obtenirPositionPersonnage().obtenirY()].obtenirIndexTexture().caseBloquante() == false )
			{
				personnageCourant.obtenirPositionPersonnage().setX(personnageCourant.obtenirPositionPersonnage().obtenirX()+1);
				personnageCourant.obtenirPositionPersonnage().setY(personnageCourant.obtenirPositionPersonnage().obtenirY());
				deplacementRandom();
				panelmap.removeAll();
				this.affichageMap();
				panelmap.validate();
			}
			else if (plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()+1][personnageCourant.obtenirPositionPersonnage().obtenirY()].obtenirIndexTexture() == Texture.COFFRE)
			{
				if (plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()+1][personnageCourant.obtenirPositionPersonnage().obtenirY()].obtenirDecors().obtenirBesoinCle() == true )
				{
					
				}
				else
				{
					if (JOptionPane.showConfirmDialog(fenetre,
							"Ouvrir ?", "Confirmation",
							JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
					{
						plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()+1][personnageCourant.obtenirPositionPersonnage().obtenirY()].setTexture(Texture.COFFRE_OUVERT);
						personnageCourant.miseAJourDeLEquipement(plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()+1][personnageCourant.obtenirPositionPersonnage().obtenirY()].obtenirDecors().obtenirItemDUnCoffre());
						panelmap.removeAll();
						affichagePanneau();
						//panelgauche.revalidate();
						this.affichageMap();
						panelmap.validate();
					}
				}
			}
			else if (plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()+1][personnageCourant.obtenirPositionPersonnage().obtenirY()].obtenirIndexTexture() == Texture.PORTE_FERMER)
			{
				if (plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()+1][personnageCourant.obtenirPositionPersonnage().obtenirY()].obtenirDecors().obtenirBesoinCle() == true )
				{
					
				}
				else
				{
					if (JOptionPane.showConfirmDialog(fenetre,"Ouvrir ?", "Confirmation",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
					{
						plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()+1][personnageCourant.obtenirPositionPersonnage().obtenirY()].setTexture(Texture.PORTE_OUVERTE);
						panelmap.removeAll();
						affichagePanneau();
						this.affichageMap();
						panelmap.validate();
						//panelgauche.removeAll();
						//panelgauche.validate();
					}
				}
			}
		}
		else if (lettre=='q')
		{
			if (plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()][personnageCourant.obtenirPositionPersonnage().obtenirY()-1].obtenirIndexTexture().caseBloquante() == false )
			{
				personnageCourant.obtenirPositionPersonnage().setX(personnageCourant.obtenirPositionPersonnage().obtenirX());
				personnageCourant.obtenirPositionPersonnage().setY(personnageCourant.obtenirPositionPersonnage().obtenirY()-1);
				deplacementRandom();
				panelmap.removeAll();
				this.affichageMap();
				panelmap.validate();
			}
			else if (plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()][personnageCourant.obtenirPositionPersonnage().obtenirY()-1].obtenirIndexTexture() == Texture.COFFRE)
			{
				if (plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()][personnageCourant.obtenirPositionPersonnage().obtenirY()-1].obtenirDecors().obtenirBesoinCle() == true )
				{
					
				}
				else
				{
					if (JOptionPane.showConfirmDialog(fenetre,"Ouvrir ?", "Confirmation",
							JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
					{
						plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()][personnageCourant.obtenirPositionPersonnage().obtenirY()-1].setTexture(Texture.COFFRE_OUVERT);
						personnageCourant.miseAJourDeLEquipement(plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()][personnageCourant.obtenirPositionPersonnage().obtenirY()-1].obtenirDecors().obtenirItemDUnCoffre());
						//plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()+1][personnageCourant.obtenirPositionPersonnage().obtenirY()].obtenirDecors().obtenirItemDUnCoffre();
						panelmap.removeAll();
						affichagePanneau();
						this.affichageMap();
						panelmap.validate();
					}
				}
			}
			else if (plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()][personnageCourant.obtenirPositionPersonnage().obtenirY()-1].obtenirIndexTexture() == Texture.PORTE_FERMER)
			{
				if (plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()][personnageCourant.obtenirPositionPersonnage().obtenirY()-1].obtenirDecors().obtenirBesoinCle() == true )
				{
					
				}
				else
				{
					if (JOptionPane.showConfirmDialog(fenetre,"Ouvrir ?", "Confirmation",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
					{
						plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()-1][personnageCourant.obtenirPositionPersonnage().obtenirY()].setTexture(Texture.PORTE_OUVERTE);
						panelmap.removeAll();
						affichagePanneau();
						this.affichageMap();
						panelmap.validate();
						//panelgauche.removeAll();
						//panelgauche.validate();
					}
				}
			}
		}
		else if (lettre=='d')
		{
			if (plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()][personnageCourant.obtenirPositionPersonnage().obtenirY()+1].obtenirIndexTexture().caseBloquante() == false )
			{
				personnageCourant.obtenirPositionPersonnage().setX(personnageCourant.obtenirPositionPersonnage().obtenirX());
				personnageCourant.obtenirPositionPersonnage().setY(personnageCourant.obtenirPositionPersonnage().obtenirY()+1);
				deplacementRandom();
				
				
				panelmap.removeAll();
				this.affichageMap();
				panelmap.validate();
			}
			else if (plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()][personnageCourant.obtenirPositionPersonnage().obtenirY()+1].obtenirIndexTexture() == Texture.COFFRE)
			{
				if (plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()][personnageCourant.obtenirPositionPersonnage().obtenirY()+1].obtenirDecors().obtenirBesoinCle() == true )
				{
					
				}
				else
				{
					if (JOptionPane.showConfirmDialog(fenetre,
							"Ouvrir ?", "Confirmation",
							JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
					{
						plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()][personnageCourant.obtenirPositionPersonnage().obtenirY()+1].setTexture(Texture.COFFRE_OUVERT);
						personnageCourant.miseAJourDeLEquipement(plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()][personnageCourant.obtenirPositionPersonnage().obtenirY()+1].obtenirDecors().obtenirItemDUnCoffre());
						
						panelmap.removeAll();
						affichagePanneau();
						this.affichageMap();
						panelmap.validate();
						
					}
				}
			}
			else if (plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()][personnageCourant.obtenirPositionPersonnage().obtenirY()+1].obtenirIndexTexture() == Texture.PORTE_FERMER)
			{
				if (plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()][personnageCourant.obtenirPositionPersonnage().obtenirY()+1].obtenirDecors().obtenirBesoinCle() == true )
				{
					
				}
				else
				{
					if (JOptionPane.showConfirmDialog(fenetre,"Ouvrir ?", "Confirmation",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
					{
						plateauDeCase[personnageCourant.obtenirPositionPersonnage().obtenirX()][personnageCourant.obtenirPositionPersonnage().obtenirY()+1].setTexture(Texture.PORTE_OUVERTE);
						panelmap.removeAll();
						affichagePanneau();
						this.affichageMap();
						panelmap.validate();
						//panelgauche.removeAll();
						//panelgauche.validate();
					}
				}
			}
			
					
		}
		else
		{}
	}

	public void run() {
		/************************************** Definition des caracteristiques de base de la fenetre*************************/
		int largeur = 700;
		int hauteur = 40;
		int hauteur2 = 150;

		top.setPreferredSize(new Dimension(800, 75));

		fenetre.setTitle("The Secret Scroll of IUT");
		fenetre.setSize(879, 900);
		fenetre.setFocusable(true);
		fenetre.requestFocus();
		fenetre.addKeyListener(this);
		fenetre.setResizable(false);		// La taille de la fenêtre n'est plus modifiable
		fenetre.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // Quand on clique sur la croix, l'appli est détruite

		/************************************** Ajout et definitions des �l�ments au panel 1*************************/
	
		JLabel label = new JLabel("asdf");
		label.setPreferredSize(new Dimension(200, 200));
		label.setText("The secret Scroll of IUT");
		label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		JButton bouton1 = new JButton("Jouer");
		JButton bouton3 = new JButton("Quitter");
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(label);
		panel.add(bouton1);
		panel.add(Box.createVerticalStrut(hauteur));
		//panel.add(bouton2);
		panel.add(Box.createVerticalStrut(hauteur));
		panel.add(bouton3);
		panel.add(Box.createHorizontalStrut(largeur));
		fenetre.setContentPane(panel);
		panel.setBackground(Color.RED);
		
		/************************************** Ajout et definition des �l�ments au panel 2 select classe*************************/
		
		
		JButton bouton4 = new JButton(new ImageIcon("images_classes/guerrier.jpg"));
		JButton bouton5 = new JButton(new ImageIcon("images_classes/sorcier.jpg"));
		JButton bouton6 = new JButton(new ImageIcon("images_classes/chasseur.jpg"));
		JLabel label2 = new JLabel("Choisissez votre classe \n");
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
		sorcier.add(bouton5);
		chasseur.add(bouton6);
		
		panel2.setLayout(new BorderLayout());
		panel2.add(top, BorderLayout.NORTH);
		panel2.add(guerrier, BorderLayout.WEST);
		panel2.add(sorcier, BorderLayout.CENTER);
		panel2.add(chasseur, BorderLayout.EAST);

		/************************************** Ajout et definitions des �l�ments du panel 3 Classe soricer*************************/

		
		JLabel label3 = new JLabel("Vous avez choisi la classe Sorcier, rentrez votre pseudo");
		label3.setPreferredSize(new Dimension(200, 200));
		label3.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		
		panel3sorc.setLayout(new BoxLayout(panel3sorc, BoxLayout.Y_AXIS));
		panel3sorc.setBackground(Color.MAGENTA);
		pseudoSorc.setMaximumSize(new Dimension(150, 30)); 		
		panel3sorc.add(Box.createVerticalStrut(180));
		panel3sorc.add(label3);
		panel3sorc.add(Box.createVerticalStrut(80));
		panel3sorc.add(pseudoSorc);

		/************************************** Ajout et definitions des �l�ments du panel 4 Classe Guerrier*************************/
		
		JLabel label4 = new JLabel("Vous avez choisi la classe Guerrier, rentrez votre pseudo");
		label4.setPreferredSize(new Dimension(200, 200));
		label4.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		panel4guer.setLayout(new BoxLayout(panel4guer, BoxLayout.Y_AXIS));
		panel4guer.setBackground(Color.RED);
		pseudoGuer.setMaximumSize(new Dimension(150, 30)); 													
		panel4guer.add(Box.createVerticalStrut(180));
		panel4guer.add(label4);
		panel4guer.add(Box.createVerticalStrut(80));
		panel4guer.add(pseudoGuer);

		/************************************** Ajout et definitions des �l�ments du panel 4 Classe Chasseur*************************/
		
		JLabel label5 = new JLabel("Vous avez choisi la classe Chasseur, rentrez votre pseudo");
		label5.setPreferredSize(new Dimension(200, 200));
		label5.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		panel5chass.setLayout(new BoxLayout(panel5chass, BoxLayout.Y_AXIS));
		panel5chass.setBackground(Color.GREEN);
		pseudoChass.setMaximumSize(new Dimension(150, 30)); 													
		panel5chass.add(Box.createVerticalStrut(180));
		panel5chass.add(label5);
		panel5chass.add(Box.createVerticalStrut(80));
		panel5chass.add(pseudoChass);

		
		/************************************** Ajout et definitions des �l�ments du dernier panel*************************/
		
		panelinfo.setBackground(Color.GREEN);
		panelgauche.setBackground(Color.PINK);
		paneldroit.setBackground(Color.RED);
		panelgauche1.setBackground(Color.PINK);
		paneldroit1.setBackground(Color.RED);

		/************************************** Remplissage panneau gauche*************************/
		panelgauche1.add(Box.createVerticalStrut(60));
		panelgauche1.setLayout(new BoxLayout(panelgauche1, BoxLayout.Y_AXIS));
		JLabel lab = new JLabel(new ImageIcon("cleor.png"));
		lab.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		panelgauche1.add(lab);

		/************************************** Remplissage panneau droite*************************/
		paneldroit1.add(Box.createVerticalStrut(60));
		paneldroit1.setLayout(new BoxLayout(paneldroit1, BoxLayout.Y_AXIS));
		JLabel lab2 = new JLabel(new ImageIcon("clegrise.png"));
		lab2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		paneldroit1.add(lab2);

		/************************************** Reglage des Splitpanes*************************/
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
		panelmap.setBackground(Color.BLACK);
		panelmap.setLayout(new GridLayout(29, 0));

		separation.setResizeWeight(1.0);
		separation.setEnabled(false);
		separation.setBorder(null);
		separation.setDividerSize(0);
		separation.setTopComponent(panelmap);
		separation.setBottomComponent(separationbas);
		affichagePanneau();
		fenetre.setVisible(true);

		/************************************** Listener des boutons*************************/
		bouton1.addActionListener(new BoutonListener());
		bouton3.addActionListener(new Quitter());
		bouton5.addActionListener(new PanelSorc());
		bouton4.addActionListener(new PanelGuer());
		bouton6.addActionListener(new PanelChass());
		pseudoSorc.addActionListener(new SavePseudo());
		pseudoGuer.addActionListener(new SavePseudo());
		pseudoChass.addActionListener(new SavePseudo());


		/************************************** Creation et affichage carte *************************/
	
		plateauDeCase = Partie.obtenirPlateauCase();
		Partie.creationCarte();

		this.affichageMap();

	}
	
	/************************************** ActionListener *************************/
	
	class BoutonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			fenetre.setContentPane(panel2);
			fenetre.validate();
		}
	}

	class Quitter implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (JOptionPane.showConfirmDialog(fenetre,
					"Fermer l'application ?", "Confirmation",
					JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION)
				fenetre.dispose();
		}
	}

	class PanelSorc implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			fenetre.setContentPane(panel3sorc);
			fenetre.validate();

		}
	}

	class PanelGuer implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			fenetre.setContentPane(panel4guer);
			fenetre.validate();
		}
	}

	class PanelChass implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			fenetre.setContentPane(panel5chass);
			fenetre.validate();
		}
	}

	class SavePseudo implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			if (source == pseudoSorc) { // verifie que c'etait sur le bouton
										// sorcier
				pseudojoueur = pseudoSorc.getText(); // recupere la valeur
														// du champ
				personnageCourant = new Sorcier(pseudojoueur); // creer un sorcier
				System.out.println(personnageCourant.nomPersonnage);
														// avec cette valeur
				info.setText(personnageCourant.nomPersonnage); // met dans info le
														// nom du

				// personnage = perso;
				// partieDeJeux=new Partie(perso);// perso cr�e

				fenetre.setContentPane(separation);
				fenetre.validate();
				panelmap.removeAll();
				affichageMap();
				affichagePanneau();
				panelmap.validate();
			} else {
				if (source == pseudoGuer) {
					pseudojoueur = pseudoGuer.getText();
					personnageCourant = new Guerrier(pseudojoueur);
					info.setText(personnageCourant.nomPersonnage);
					// personnage = perso;
					// partieDeJeux=new Partie(perso);
					fenetre.setContentPane(separation);
					fenetre.validate();
					panelmap.removeAll();
					affichageMap();
					affichagePanneau();
					panelmap.validate();
				} else {
					pseudojoueur = pseudoChass.getText();
					personnageCourant = new Chasseur(pseudojoueur);
					info.setText(personnageCourant.nomPersonnage);
					// personnage = perso;
					// partieDeJeux=new Partie(perso);
					fenetre.setContentPane(separation);
					fenetre.validate();
					panelmap.removeAll();
					affichageMap();
					affichagePanneau();
					panelmap.validate();

				}
			}

		}

	}

	
	
	/************************************** Methode *************************/
	
	public void affichageMap() {
		for (int i = 0; i < 29; i++)
			for (int j = 0; j < 29; j++) {

				if (i == personnageCourant.obtenirPositionPersonnage()
						.obtenirX()
						&& j == personnageCourant.obtenirPositionPersonnage()
								.obtenirY())

					panelmap.add(new JLabel(new ImageIcon(personnageCourant
							.obtenirPositionPersonnage().obtenirIndexTexture()
							.obtenirIcone())));
				else if(i == monstre1.obtenirPositionPersonnage()
						.obtenirX()
						&& j == monstre1.obtenirPositionPersonnage()
								.obtenirY())
					panelmap.add(new JLabel(new ImageIcon(monstre1
							.obtenirPositionPersonnage().obtenirIndexTexture()
							.obtenirIcone())));
				else if(i == monstre2.obtenirPositionPersonnage()
						.obtenirX()
						&& j == monstre2.obtenirPositionPersonnage()
								.obtenirY())
					panelmap.add(new JLabel(new ImageIcon(monstre2
							.obtenirPositionPersonnage().obtenirIndexTexture()
							.obtenirIcone())));
				else if(i == monstre3.obtenirPositionPersonnage()
						.obtenirX()
						&& j == monstre3.obtenirPositionPersonnage()
								.obtenirY())
					panelmap.add(new JLabel(new ImageIcon(monstre3
							.obtenirPositionPersonnage().obtenirIndexTexture()
							.obtenirIcone())));
				else if(i == monstre4.obtenirPositionPersonnage()
						.obtenirX()
						&& j == monstre4.obtenirPositionPersonnage()
								.obtenirY())
					panelmap.add(new JLabel(new ImageIcon(monstre4
							.obtenirPositionPersonnage().obtenirIndexTexture()
							.obtenirIcone())));
				else
					panelmap.add(new JLabel(new ImageIcon(plateauDeCase[i][j]
							.obtenirIndexTexture().obtenirIcone())));
			}
	}

	public void deplacementRandom()
	{
		for(int i=0;i<tabCreat.length;i++){
			

		SecureRandom rand = new SecureRandom();
		int nombreAleatoire = rand.nextInt(5 - 1 + 1) + 1;
		switch (nombreAleatoire){
		case 1:
			if (plateauDeCase[tabCreat[i].obtenirPositionPersonnage().obtenirX()-1][tabCreat[i].obtenirPositionPersonnage().obtenirY()].obtenirIndexTexture().caseBloquante() == false )
			{
				tabCreat[i].obtenirPositionPersonnage().setX(tabCreat[i].obtenirPositionPersonnage().obtenirX()-1);
				tabCreat[i].obtenirPositionPersonnage().setY(tabCreat[i].obtenirPositionPersonnage().obtenirY());
			
			}
				
			
			 break;
		case 2:

			if (plateauDeCase[tabCreat[i].obtenirPositionPersonnage().obtenirX()+1][tabCreat[i].obtenirPositionPersonnage().obtenirY()].obtenirIndexTexture().caseBloquante() == false )
			{
				tabCreat[i].obtenirPositionPersonnage().setX(tabCreat[i].obtenirPositionPersonnage().obtenirX()+1);
				tabCreat[i].obtenirPositionPersonnage().setY(tabCreat[i].obtenirPositionPersonnage().obtenirY());
			
			}
			
			
			 break;
		case 3:
			if (plateauDeCase[tabCreat[i].obtenirPositionPersonnage().obtenirX()][tabCreat[i].obtenirPositionPersonnage().obtenirY()-1].obtenirIndexTexture().caseBloquante() == false )
			{
				tabCreat[i].obtenirPositionPersonnage().setX(tabCreat[i].obtenirPositionPersonnage().obtenirX());
				tabCreat[i].obtenirPositionPersonnage().setY(tabCreat[i].obtenirPositionPersonnage().obtenirY()-1);
				
			}
			
			 break;
		case 4:
			if (plateauDeCase[tabCreat[i].obtenirPositionPersonnage().obtenirX()][tabCreat[i].obtenirPositionPersonnage().obtenirY()+1].obtenirIndexTexture().caseBloquante() == false )
			{
				tabCreat[i].obtenirPositionPersonnage().setX(tabCreat[i].obtenirPositionPersonnage().obtenirX());
				tabCreat[i].obtenirPositionPersonnage().setY(tabCreat[i].obtenirPositionPersonnage().obtenirY()+1);
			
			}
			
			 break;
	
		}
		}
	}
	public Personnage getPersonnage() {
		return partieDeJeux.personnage;
	}

	
	/**
	 * Verifie si l'attaque est possible.
	 */
	public boolean demandeAttaque(Case pos) {
		// if (pos.caseEnFace==null) || (pos.caseEnFace==decors)
		return false;
	}

	/**
	 * Affiche les dégats infligés par le joueur.
	 * 
	 * @return renvoi la valeur des degats faits
	 */
	public int afficheDegats() {
		return 0;
	}

public void affichagePanneau(){
		
	panelgauche.removeAll();
	personnageCourant.miseAJourInfo(personnageCourant.itemCourant);
	JLabel label6 = new JLabel("Pseudo : ");
	JLabel label7 =new JLabel("Armure : ");
	JLabel label8 = new JLabel(Integer.toString(personnageCourant.armure));
	JLabel label9 =new JLabel("Attaque : ");
	JLabel label10 = new JLabel(Integer.toString(personnageCourant.attaque));
	JLabel label11 =new JLabel("PDV : ");
	JLabel label12 = new JLabel(Integer.toString(personnageCourant.pointDeVie));
	JLabel label13 =new JLabel("Esquive: ");
	JLabel label14 = new JLabel(Integer.toString(personnageCourant.esquive));
	JLabel label15=new JLabel(personnageCourant.nomPersonnage);
	panelgauche.setLayout(new BoxLayout(panelgauche, BoxLayout.X_AXIS));
	panelgauche.add(label6);
	panelgauche.add(label15);
	panelgauche.add(Box.createHorizontalStrut(20));
	panelgauche.add(label7);
	panelgauche.add(label8);
	panelgauche.add(Box.createHorizontalStrut(20));
	panelgauche.add(label9);
	panelgauche.add(label10);
	panelgauche.add(Box.createHorizontalStrut(20));
	panelgauche.add(label11);
	panelgauche.add(label12);
	panelgauche.validate();
}

	/**
	 * Demande la selection d'un objet
	 */
	public void selectionnerUnObjet() {
	}

	/**
	 * Selectionenr une réponse parmis N choix
	 */
	public void selection() {
	}

	/**
	 * Permet d'afficher l'enigme a l'ecran
	 */
	/*
	public void afficherEnigme(Porte p) {
		if (p.presenceEnigme() == true) {

			switch (p.numeroporte) {
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

		} else {

		}
	}*/
	

	/**
	 * Verifie si la porte necessite une clé pour etre ouverte
	 * 
	 * @return true, if successful
	 */

	public boolean demandeClefsPorte(Porte p) {
		if (p.besoinCle == true) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Verifie si le coffre necessite une clé pour etre ouvert
	 * 
	 * @return true, if successful
	 */

	public boolean demandeClefsCoffre(Coffre c) {
		if (c.besoinCle == true) {
			return true;
		} else {
			return false;
		}

	}

}
