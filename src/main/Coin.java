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
		if(Double.compare(value, 0.01) == 0){
			this.value = value;
			this.commonName = "Penny";
			this.frontImage = "Lincoln";
			this.backImage = "Lincoln Memorial";
			this.valueDescription = "ONE CENT";
			this.ridgedEdge = false;
			this.metallurgy = "Copper";
		}
		//check if coin should be a nickel
		else if (Double.compare(value, 0.05) == 0){
			this.value = value;
			this.commonName = "Nickel";
			this.frontImage = "Jefferson";
			this.backImage = "Jefferson Memorial";
			this.valueDescription = "FIVE CENTS";
			this.ridgedEdge = false;
			this.metallurgy = "Cupro-Nickel";

		}
		//check if coin should be a dime
		else if (Double.compare(value, 0.10) == 0){
			this.value = value;
			this.commonName = "Dime";
			this.frontImage = "F_Roosevelt";
			this.backImage = "Torch_branches";
			this.valueDescription = "TEN CENTS";
			this.ridgedEdge = false;
			this.metallurgy = "Cupro-Nickel";
		}
		//check if coin should be a quarter
		else if (Double.compare(value, 0.25) == 0){
			this.value = value;
			this.commonName = "Quarter";
			this.frontImage = "G_Washington";
			this.backImage = "Eagle";
			this.valueDescription = "QUARTER DOLLAR";
			this.ridgedEdge = false;
			this.metallurgy = "Cupro-Nickel";

		}
		//check if coin should be a half dollar
		else if (Double.compare(value, 0.50) == 0){
			this.value = value;
			this.commonName = "Half-dollar";
			this.frontImage = "J_F_Kennedy";
			this.backImage = "Presidential_Seal";
			this.valueDescription = "HALF DOLLAR";
			this.ridgedEdge = false;
			this.metallurgy = "Cupro-Nickel";

		}
		//check if coin should be a dollar
		else if (Double.compare(value, 1.0) == 0){
			this.value = value;
			this.commonName = "Dollar";
			this.frontImage = "Sacagawea";
			this.backImage = "Eagle_in_flight";
			this.valueDescription = "ONE DOLLAR";
			this.ridgedEdge = false;
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
			//check if coin should be a penny
			if(Double.compare(value, 0.01) == 0){
				this.value = value;
				this.commonName = "Penny";
				this.frontImage = "Lincoln";
				this.backImage = "Lincoln Memorial";
				this.valueDescription = "ONE CENT";
				this.ridgedEdge = false;
				this.metallurgy = "Copper";
			}
			//check if coin should be a nickel
			else if (Double.compare(value, 0.05) == 0){
				this.value = value;
				this.commonName = "Nickel";
				this.frontImage = "Jefferson";
				this.backImage = "Jefferson Memorial";
				this.valueDescription = "FIVE CENTS";
				this.ridgedEdge = false;
				this.metallurgy = "Cupro-Nickel";
	
			}
			//check if coin should be a dime
			else if (Double.compare(value, 0.10) == 0){
				this.value = value;
				this.commonName = "Dime";
				this.frontImage = "F_Roosevelt";
				this.backImage = "Torch_branches";
				this.valueDescription = "TEN CENTS";
				this.ridgedEdge = false;
				this.metallurgy = "Cupro-Nickel";
			}
			//check if coin should be a quarter
			else if (Double.compare(value, 0.25) == 0){
				this.value = value;
				this.commonName = "Quarter";
				this.frontImage = "G_Washington";
				this.backImage = "Eagle";
				this.valueDescription = "QUARTER DOLLAR";
				this.ridgedEdge = false;
				this.metallurgy = "Cupro-Nickel";
	
			}
			//check if coin should be a half dollar
			else if (Double.compare(value, 0.50) == 0){
				this.value = value;
				this.commonName = "Half-dollar";
				this.frontImage = "J_F_Kennedy";
				this.backImage = "Presidential_Seal";
				this.valueDescription = "HALF DOLLAR";
				this.ridgedEdge = false;
				this.metallurgy = "Cupro-Nickel";
	
			}
			//check if coin should be a dollar
			else if (Double.compare(value, 1.0) == 0){
				this.value = value;
				this.commonName = "Dollar";
				this.frontImage = "Sacagawea";
				this.backImage = "Eagle_in_flight";
				this.valueDescription = "ONE DOLLAR";
				this.ridgedEdge = false;
				this.metallurgy = "Manganese Brass";
			}
	
			this.manufactureYear = year;
	
			this.frontMotto = "IN GOD WE TRUST";
			this.backMotto = "E PLURIBUS UNUM";
			this.frontLabel = "LIBERTY";
			this.backLabel = "UNITED STATES OF AMERICA";
	}
}