package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

public class Case {

	private int x;
	private int y;
	private boolean estBloquante;
	public int indexTexture;

	public Case(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean caseBloquante() {
		return this.estBloquante;
	}

	public boolean comparer(Case position) {
		return this.x == position.x && this.y == position.y;
	}
	
	  public Case translater(Mouvement mouvement)
	    {
	return new Case(this.x+mouvement.getDeltaX(), this.y+mouvement.getDeltaY());
	    }
}