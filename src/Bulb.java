public class Bulb
{
	public static final int DEFAULT_POWER = 100; // constante
	private final int power; // attribut
	private boolean isLit; // attribut

	public Bulb() // constructeur
	{
		this.power = Bulb.DEFAULT_POWER;
		this.isLit = false;
	}

	public Bulb(int powerValue) // constructeur
	{
		this.power = powerValue;
		this.isLit = false;
	}

	public void switchOn() // methode
	{
		isLit = true;
	}

	public void switchOff() // methode
	{
		isLit = false;
	}

	public int getpower() // methode
	{
		return this.power;
	}

	public boolean isLit() // methode
	{
		return this.isLit;
	}

}
