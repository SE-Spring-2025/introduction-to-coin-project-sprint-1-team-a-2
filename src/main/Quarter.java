package main;

public class Quarter extends Coin
{
	public Quarter()
	{
		super(0.50,"Quarter","G_Washington","Eagle","QUARTER DOLLAR",true,"Cupro-Nickel",2025);
	}

	public Quarter(int year)
	{
		super(0.50,"Quarter","G_Washington","Eagle","QUARTER DOLLAR",true,"Cupro-Nickel",year);
	}
}