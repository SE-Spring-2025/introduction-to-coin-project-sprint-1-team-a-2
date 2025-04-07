package main;

public class Dime extends Coin
{
	public Dime()
	{
		super(0.10,"Dime","F_Roosevelt","Torch_Branches","ONE DIME",true,new CuproNickel(),2025);
	}

	public Dime(int year)
	{
		super(0.10,"Dime","F_Roosevelt","Torch_Branches","ONE DIME",true,new CuproNickel(),year);
	}

	public Dime(Metallurgy metal)
	{
		super(0.10,"Dime","F_Roosevelt","Torch_Branches","ONE DIME",true,metal,2025);
	}

	public Dime(int year, Metallurgy metal)
	{
		super(0.10,"Dime","F_Roosevelt","Torch_Branches","ONE DIME",true,metal,year);
	}
}