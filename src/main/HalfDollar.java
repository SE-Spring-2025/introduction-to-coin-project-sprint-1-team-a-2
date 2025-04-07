package main;

public class HalfDollar extends Coin
{
	public HalfDollar()
	{
		super(0.50,"HalfDollar","J_Kennedy","Presidential_Seal","HALF DOLLAR",true,new CuproNickel(),2025);
	}

	public HalfDollar(int year)
	{
		super(0.50,"HalfDollar","J_Kennedy","Presidential_Seal","HALF DOLLAR",true,new CuproNickel(),year);
	}

	public HalfDollar(Metallurgy metal)
	{
		super(0.50,"HalfDollar","J_Kennedy","Presidential_Seal","HALF DOLLAR",true,metal,2025);
	}

	public HalfDollar(int year, Metallurgy metal)
	{
		super(0.50,"HalfDollar","J_Kennedy","Presidential_Seal","HALF DOLLAR",true,metal,year);
	}
}