package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelMap extends JPanel 
{
	
	private JLabel[][] cells;
	
	public void bougerPerso(Case depart, Case arrivee)
	{
		Case dep = depart;
		Case arr = arrivee;
		this.cells[arr.obtenirX()][arr.obtenirY()] = this.cells[dep.obtenirX()][dep.obtenirY()];
		this.cells[dep.obtenirX()][dep.obtenirY()] = this.cells[arr.obtenirX()][arr.obtenirY()];
	}

}
