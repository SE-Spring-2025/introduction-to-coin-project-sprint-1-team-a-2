package main;

public class Dime extends Coin
{
	public Dime()
	{
		super(0.10,"Dime","F_Roosevelt","Torch_Branches","ONE DIME",true,new CuproNickel(),2025);
		coinCounter.incrementDime();
	}

	public Dime(int year)
	{
		super(0.10,"Dime","F_Roosevelt","Torch_Branches","ONE DIME",true,new CuproNickel(),year);
		coinCounter.incrementDime();
	}

	public Dime(Metallurgy metal)
	{
		super(0.10,"Dime","F_Roosevelt","Torch_Branches","ONE DIME",true,metal,2025);
		coinCounter.incrementDime();
	}

	public Dime(int year, Metallurgy metal)
	{
		super(0.10,"Dime","F_Roosevelt","Torch_Branches","ONE DIME",true,metal,year);
		coinCounter.incrementDime();
	}
}