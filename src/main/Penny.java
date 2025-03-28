package main;

public class Penny extends Coin
{
	public Penny()
	{
		super(0.01,"Penny","A_Lincoln","Lincoln_Memorial","ONE CENT",false,"Copper",2025);
	}

	public Penny(int year)
	{
		super(0.01,"Penny","A_Lincoln","Lincoln_Memorial","ONE CENT",false,"Copper",year);
	}
}
