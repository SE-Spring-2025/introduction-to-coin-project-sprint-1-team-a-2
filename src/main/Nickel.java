package main;

public class Nickel extends Coin
{
	public Nickel()
	{
		super(0.05,"Nickel","T_Jefferson","Jefferson_Memorial","FIVE CENTS",false,new CuproNickel(),2025);
		coinCounter.incrementNickel();
	}

	public Nickel(int year)
	{
		super(0.05,"Nickel","T_Jefferson","Jefferson_Memorial","FIVE CENTS",false,new CuproNickel(),year);
		coinCounter.incrementNickel();
	}

	public Nickel(Metallurgy metal)
	{
		super(0.05,"Nickel","T_Jefferson","Jefferson_Memorial","FIVE CENTS",false, metal,2025);
		coinCounter.incrementNickel();
	}

	public Nickel(int year, Metallurgy metal)
	{
		super(0.05,"Nickel","T_Jefferson","Jefferson_Memorial","FIVE CENTS",false, metal,year);
		coinCounter.incrementNickel();
	}
}
