public class Dime extends Coin
{
	public Dime()
	{
		super(0.10,"Dime","F_Roosevelt","Torch_Branches","ONE DIME",true,"Cupro-Nickel",2025);
	}

	public Dime(int year)
	{
		super(0.10,"Dime","F_Roosevelt","Torch_Branches","ONE DIME",true,"Cupro-Nickel",year);
	}
}