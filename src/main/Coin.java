/**
* Class that creates coin objects based on what 
* data (if any) is passed to methods
*
* @author  Maxwell Brown
* @author  Gabriel Basham
* @author  Josh Jones
*/

abstract class Coin {
    public double value;
    public String commonName;
    public String frontMotto;
    public int manufactureYear;
    public String frontImage;
    public String backImage;
    public String backMotto;
    public String frontLabel;
    public String backLabel;
    public String valueDescription;
    public boolean ridgedEdge;
    public String metallurgy;
	
	//public Coin(){};

	/**
	 * Creates a coin object based on the value passed in
	 * 
	 * @param value	- numerical value that indicates what coin should be created
	 * @param commonName - 
	 * @param frontImage - 
	 * @param backImage - 
	 * @param valueDescription - 
	 * @param ridgedEdge - 
	 * @param metallurgy - 
	 * @param year - 
	 */
	public Coin(double value, String commonName, String frontImage, String backImage,
							String valueDescription, boolean ridgedEdge, String metallurgy, int year)
	{
		this.value = value;
		this.commonName = commonName;
		this.frontImage = frontImage;
		this.backImage = backImage;
		this.valueDescription = valueDescription;
		this.ridgedEdge = ridgedEdge;
		this.metallurgy = metallurgy;

		this.manufactureYear = year;

		this.frontMotto = "IN GOD WE TRUST";
		this.backMotto = "E PLURIBUS UNUM";
		this.frontLabel = "LIBERTY";
		this.backLabel = "UNITED STATES OF AMERICA";
	}
}

class Dollar extends Coin
{
	public Dollar()
	{
		super(1.00, "Dollar","S_Anthony","Moon_Eagle","ONE DOLLAR",true,"Cupro-Nickel",2025);
	}

	public Dollar(int year)
	{
		super(1.00, "Dollar","S_Anthony","Moon_Eagle","ONE DOLLAR",true,"Cupro-Nickel",year);
	}
}

class HalfDollar extends Coin
{
	public HalfDollar()
	{
		super(0.50,"HalfDollar","J_Kennedy","Presidential_Seal","HALF DOLLAR",true,"Cupro-Nickel",2025);
	}

	public HalfDollar(int year)
	{
		super(0.50,"HalfDollar","J_Kennedy","Presidential_Seal","HALF DOLLAR",true,"Cupro-Nickel",year);
	}
}

class Quarter extends Coin
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

class Dime extends Coin
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

class Nickel extends Coin
{
	public Nickel()
	{
		super(0.05,"Nickel","T_Jefferson","Jefferson_Memorial","TEN CENTS",false,"Cupro-Nickel",2025);
	}

	public Nickel(int year)
	{
		super(0.05,"Nickel","T_Jefferson","Jefferson_Memorial","TEN CENTS",false,"Cupro-Nickel",year);
	}
}

class Penny extends Coin
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