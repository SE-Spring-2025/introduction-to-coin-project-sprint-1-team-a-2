package main;

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
	public static final double PENNY_VALUE = 0.01;
	public static final double NICKEL_VALUE = 0.05;
	public static final double DIME_VALUE = 0.1;
	public static final double QUARTER_VALUE = 0.25;
	public static final double HALFDOLLAR_VALUE = 0.50;
	public static final double DOLLAR_VALUE = 1.00;
	
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
		if(Double.compare(value, PENNY_VALUE) == 0){
			this.value = value;
			this.commonName = "Penny";
			this.frontImage = "A_Lincoln";
			this.backImage = "Lincoln_Memorial";
			this.valueDescription = "ONE CENT";
			this.ridgedEdge = false;
			this.metallurgy = "Copper";
		}
		//check if coin should be a nickel
		else if (Double.compare(value, NICKEL_VALUE) == 0){
			this.value = value;
			this.commonName = "Nickel";
			this.frontImage = "T_Jefferson";
			this.backImage = "Jefferson_Memorial";
			this.valueDescription = "FIVE CENTS";
			this.ridgedEdge = false;
			this.metallurgy = "Cupro-Nickel";
		}
		//check if coin should be a dime
		else if (Double.compare(value, DIME_VALUE) == 0){
			this.value = value;
			this.commonName = "Dime";
			this.frontImage = "F_Roosevelt";
			this.backImage = "Torch_Branches";
			this.valueDescription = "ONE DIME";
			this.ridgedEdge = true;
			this.metallurgy = "Cupro-Nickel";
		}
		//check if coin should be a quarter
		else if (Double.compare(value, QUARTER_VALUE) == 0){
			this.value = value;
			this.commonName = "Quarter";
			this.frontImage = "G_Washington";
			this.backImage = "Eagle";
			this.valueDescription = "QUARTER DOLLAR";
			this.ridgedEdge = true;
			this.metallurgy = "Cupro-Nickel";
		}
		//check if coin should be a half dollar
		else if (Double.compare(value, HALFDOLLAR_VALUE) == 0){
			this.value = value;
			this.commonName = "HalfDollar";
			this.frontImage = "J_Kennedy";
			this.backImage = "Presidential_Seal";
			this.valueDescription = "HALF DOLLAR";
			this.ridgedEdge = true;
			this.metallurgy = "Cupro-Nickel";
		}
		//check if coin should be a dollar
		else if (Double.compare(value, DOLLAR_VALUE) == 0){
			this.value = value;
			this.commonName = "Dollar";
			this.frontImage = "S_Anthony";
			this.backImage = "Moon_Eagle";
			this.valueDescription = "ONE DOLLAR";
			this.ridgedEdge = true;
			this.metallurgy = "Cupro-Nickel";
		}

		this.manufactureYear = 2025;

		this.frontMotto = "IN GOD WE TRUST";
		this.backMotto = "E PLURIBUS UNUM";
		this.frontLabel = "LIBERTY";
		this.backLabel = "UNITED STATES OF AMERICA";
	}

	public Coin(double value, int year)
	{
			//check if coin should be a penny
			if(Double.compare(value, PENNY_VALUE) == 0){
				this.value = value;
				this.commonName = "Penny";
				this.frontImage = "A_Lincoln";
				this.backImage = "Lincoln_Memorial";
				this.valueDescription = "ONE CENT";
				this.ridgedEdge = false;
				this.metallurgy = "Copper";
			}
			//check if coin should be a nickel
			else if (Double.compare(value, NICKEL_VALUE) == 0){
				this.value = value;
				this.commonName = "Nickel";
				this.frontImage = "T_Jefferson";
				this.backImage = "Jefferson_Memorial";
				this.valueDescription = "FIVE CENTS";
				this.ridgedEdge = false;
				this.metallurgy = "Cupro-Nickel";
	
			}
			//check if coin should be a dime
			else if (Double.compare(value, DIME_VALUE) == 0){
				this.value = value;
				this.commonName = "Dime";
				this.frontImage = "F_Roosevelt";
				this.backImage = "Torch_Branches";
				this.valueDescription = "ONE DIME";
				this.ridgedEdge = true;
				this.metallurgy = "Cupro-Nickel";
			}
			//check if coin should be a quarter
			else if (Double.compare(value, QUARTER_VALUE) == 0){
				this.value = value;
				this.commonName = "Quarter";
				this.frontImage = "G_Washington";
				this.backImage = "Eagle";
				this.valueDescription = "QUARTER DOLLAR";
				this.ridgedEdge = true;
				this.metallurgy = "Cupro-Nickel";
	
			}
			//check if coin should be a half dollar
			else if (Double.compare(value, HALFDOLLAR_VALUE) == 0){
				this.value = value;
				this.commonName = "HalfDollar";
				this.frontImage = "J_Kennedy";
				this.backImage = "Presidential_Seal";
				this.valueDescription = "HALF DOLLAR";
				this.ridgedEdge = true;
				this.metallurgy = "Cupro-Nickel";
	
			}
			//check if coin should be a dollar
			else if (Double.compare(value, DOLLAR_VALUE) == 0){
				this.value = value;
				this.commonName = "Dollar";
				this.frontImage = "S_Anthony";
				this.backImage = "Moon_Eagle";
				this.valueDescription = "ONE DOLLAR";
				this.ridgedEdge = true;
				this.metallurgy = "Cupro-Nickel";
			}
	
			this.manufactureYear = year;
	
			this.frontMotto = "IN GOD WE TRUST";
			this.backMotto = "E PLURIBUS UNUM";
			this.frontLabel = "LIBERTY";
			this.backLabel = "UNITED STATES OF AMERICA";
	}

	public double getValue() {
		return value;
	}

	public String getFamiliarName() {
		return commonName;
	}

	public String getFrontMotto() {
		return frontMotto;
	}

	public int getYear() {
		return manufactureYear;
	}

	public String getFrontImage() {
		return frontImage;
	}

	public String getBackImage() {
		return backImage;
	}

	public String getBackMotto() {
		return backMotto;
	}

	public String getFrontLabel() {
		return frontLabel;
	}

	public String getBackLabel() {
		return backLabel;
	}

	public String getValueDescription() {
		return valueDescription;
	}

	public boolean getRidgedEdge() {
		return ridgedEdge;
	}

	public String getMetallurgy() {
		return metallurgy;
	}

	public String toString(){
		return String.format("%s,%f,%d,'%S','%S','%s','%s','%S','%S','%S'", null)
	}
}