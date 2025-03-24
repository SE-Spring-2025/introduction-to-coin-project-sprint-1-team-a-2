/**
* Class that creates coin objects based on what 
* data (if any) is passed to methods
*
* @author  Maxwell Brown
* @author  Gabriel Basham
* @author  Josh Jones
*/

public class Coin {
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
	
	public Coin()
	{
		value = 0.0;
		this.commonName = "";
		this.frontMotto = "";
		this.manufactureYear = 0;
		this.frontImage = "";
		this.backImage = "";
		this.backMotto = "";
		this.frontLabel = "";
		this.backLabel = "";
		this.valueDescription = "";
		this.ridgedEdge = false;
		this.metallurgy = "";
	}

	/**
	 * Creates a coin object based on the value passed in
	 * 
	 * @param value	- numerical value that indicates what coin should be created
	 */
	public Coin(double value)
	{
		//check if coin should be a penny
		if (Double.compare(value, 0.01) == 0)
		{
			this.value = value;
			this.commonName = "Penny";
			this.frontImage = "Abe Lincoln";
			this.backImage = "Lincoln Memorial";
			this.valueDescription = "One cent";
			this.ridgedEdge = false;
			this.metallurgy = "Copper";
		}
		//check if coin should be a nickel
		if (Double.compare(value, 0.05) == 0)
		{
			this.value = value;
			this.commonName = "Nickel";
			this.frontImage = "Thomas Jefferson";
			this.backImage = "Jefferson Memorial";
			this.valueDescription = "Five cents";
			this.ridgedEdge = false;
			this.metallurgy = "Cupro-Nickel";
		}
		//check if coin should be a dime
		if (Double.compare(value, 0.10) == 0)
		{
			this.value = value;
			this.commonName = "Dime";
			this.frontImage = "Franklin D. Roosevelt";
			this.backImage = "Olive branch, torch, and oak branch";
			this.valueDescription = "Ten cents";
			this.ridgedEdge = true;
			this.metallurgy = "Cupro-Nickel";
		}
		//check if coin should be a quarter
		if (Double.compare(value, 0.25) == 0)
		{
			this.value = value;
			this.commonName = "Quarter";
			this.frontImage = "George Washington";
			this.backImage = "Eagle";
			this.valueDescription = "25 cents";
			this.ridgedEdge = true;
			this.metallurgy = "Cupro-Nickel";
		}
		//check if coin should be a half dollar
		if (Double.compare(value, 0.50) == 0)
		{
			this.value = value;
			this.commonName = "Half Dollar";
			this.frontImage = "John F. Kennedy";
			this.backImage = "Presidential Seal";
			this.valueDescription = "50 cents";
			this.ridgedEdge = true;
			this.metallurgy = "Cupro-Nickel";
		}
		//check if coin should be a dollar
		if (Double.compare(value, 1.0) == 0)
		{
			this.value = value;
			this.commonName = "Dollar";
			this.frontImage = "Sacagawea Dollar";
			this.backImage = "Eagle";
			this.valueDescription = "100 cents";
			this.ridgedEdge = true;
			this.metallurgy = "Manganese Brass";
		}

		this.manufactureYear = 2025;

		this.frontMotto = "IN GOD WE TRUST";
		this.backMotto = "E PLURIBUS UNUM";
		this.frontLabel = "LIBERTY";
		this.backLabel = "UNITED STATES OF AMERICA";
	}

	public Coin(double value, int year)
	{
	}
}