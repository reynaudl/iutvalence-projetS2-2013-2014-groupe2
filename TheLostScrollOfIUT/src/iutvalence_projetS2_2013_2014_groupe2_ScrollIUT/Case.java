package iutvalence_projetS2_2013_2014_groupe2_ScrollIUT;

public class Case
{

	private int x;
	private int y;
	
	public Texture indexTexture;
	private Decors d;
	
	public Case(int x, int y, Texture indexTexture, Decors d)
	{
		this.x = x;
		this.y = y;
		this.indexTexture = indexTexture;
		this.d = d;
	}


	public Decors obtenirDecors()
	{
		return this.d;
	}
	
	public Texture obtenirIndexTexture()
	{
	    return this.indexTexture;
	}
	
	public int obtenirX()
	{
		return this.x;
	}

	public int obtenirY()
	{
		return this.y;
	}
	
	public void setX(int a){
		this.x=a;
	}
	public void setY(int b){
		this.y=b;
	}
	

	public void setTexture(Texture t)
	{
		this.indexTexture=t;
	}
	
}