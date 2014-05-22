package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

public class Case
{

	private int x;
	private int y;
	
	public Texture indexTexture;

	public Case(int x, int y, Texture indexTexture)
	{
		this.x = x;
		this.y = y;
		this.indexTexture = indexTexture;
	}

	public boolean comparer(Case position)
	{
		return this.x == position.x && this.y == position.y;
	}

	public Case translater(Mouvement mouvement)
	{
		return new Case(this.x + mouvement.getDeltaX(), this.y
				+ mouvement.getDeltaY(), this.indexTexture);
	}
}