package main;

public class Quarter extends Coin
{
	public Quarter()
	{
		super(0.25,"Quarter","G_Washington","Eagle","QUARTER DOLLAR",true,new CuproNickel(),2025);
	}

	public Quarter(int year)
	{
		super(0.25,"Quarter","G_Washington","Eagle","QUARTER DOLLAR",true,new CuproNickel(),year);
	}
}