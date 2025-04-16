package main;

public class Penny extends Coin
{
	public Penny()
	{
		super(0.01,"Penny","A_Lincoln","Lincoln_Memorial","ONE CENT",false,new Copper(),2025);
		Coin.coinCounter.incrementPenny();
	}

	public Penny(int year)
	{
		super(0.01,"Penny","A_Lincoln","Lincoln_Memorial","ONE CENT",false,new Copper(),year);
		Coin.coinCounter.incrementPenny();
	}

	public Penny(Metallurgy metal)
	{
		super(0.01,"Penny","A_Lincoln","Lincoln_Memorial","ONE CENT",false,metal,2025);
		Coin.coinCounter.incrementPenny();
	}

	public Penny(int year, Metallurgy metal)
	{
		super(0.01,"Penny","A_Lincoln","Lincoln_Memorial","ONE CENT",false,metal,year);
		Coin.coinCounter.incrementPenny();
	}
}
