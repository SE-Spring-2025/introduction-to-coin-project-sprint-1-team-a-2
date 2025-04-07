package main;

public class Penny extends Coin
{
	public Penny()
	{
		super(0.01,"Penny","A_Lincoln","Lincoln_Memorial","ONE CENT",false,new Copper(),2025);
	}

	public Penny(int year)
	{
		super(0.01,"Penny","A_Lincoln","Lincoln_Memorial","ONE CENT",false,new Copper(),year);
	}

	public Penny(Metallurgy metal)
	{
		super(0.01,"Penny","A_Lincoln","Lincoln_Memorial","ONE CENT",false,metal,2025);
	}

	public Penny(int year, Metallurgy metal)
	{
		super(0.01,"Penny","A_Lincoln","Lincoln_Memorial","ONE CENT",false,metal,year);
	}
}
