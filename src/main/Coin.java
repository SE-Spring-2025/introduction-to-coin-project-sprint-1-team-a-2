
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
	
	public void Coin()
	{
		this.value = 0.0;
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

	public void Coin(double value)
	{
		
		if(value == 0.01){
			this.value = value;
			this.commonName = "Penny";
			this.frontMotto = "IN GOD WE TRUST";
			this.manufactureYear = 2025;
			this.frontImage = "Lincoln";
			this.backImage = "Congress";
			this.backMotto = "E PLURIBUS UNUM";
			this.frontLabel = "LIBERTY";
			this.backLabel = "UNITED STATES OF AMERICA";
			this.valueDescription = "ONE CENT";
			this.ridgedEdge = false;
			this.metallurgy = "Copper";
		}
		else if(value == 0.05){
			this.value = value;
			this.commonName = "Nickel";
			this.frontMotto = "IN GOD WE TRUST";
			this.manufactureYear = 2025;
			this.frontImage = "Jefferson";
			this.backImage = "Jefferson_Memorial";
			this.backMotto = "E PLURIBUS UNUM";
			this.frontLabel = "LIBERTY";
			this.backLabel = "UNITED STATES OF AMERICA";
			this.valueDescription = "FIVE CENTS";
			this.ridgedEdge = false;
			this.metallurgy = "Nickel";

		}
		else if(value == 0.1){
			this.value = value;
			this.commonName = "Dime";
			this.frontMotto = "IN GOD WE TRUST";
			this.manufactureYear = 2025;
			this.frontImage = "F_Roosevelt";
			this.backImage = "Torch_branche";
			this.backMotto = "E PLURIBUS UNUM";
			this.frontLabel = "LIBERTY";
			this.backLabel = "UNITED STATES OF AMERICA";
			this.valueDescription = "ONE DIME";
			this.ridgedEdge = false;
			this.metallurgy = "Silver";

		}
		else if(value == 0.25){
			this.value = value;
			this.commonName = "Quarter";
			this.frontMotto = "IN GOD WE TRUST";
			this.manufactureYear = 2025;
			this.frontImage = "G_Washington";
			this.backImage = "Eagle";
			this.backMotto = "E PLURIBUS UNUM";
			this.frontLabel = "LIBERTY";
			this.backLabel = "UNITED STATES OF AMERICA";
			this.valueDescription = "QUARTER DOLLAR";
			this.ridgedEdge = false;
			this.metallurgy = "Copper-Nickel";

		}
		else if(value == 0.5){
			this.value = value;
			this.commonName = "Half-dollar";
			this.frontMotto = "IN GOD WE TRUST";
			this.manufactureYear = 2025;
			this.frontImage = "J_F_Kennedy";
			this.backImage = "Presidential_Seal";
			this.backMotto = "E PLURIBUS UNUM";
			this.frontLabel = "LIBERTY";
			this.backLabel = "UNITED STATES OF AMERICA";
			this.valueDescription = "HALF DOLLAR";
			this.ridgedEdge = false;
			this.metallurgy = "Copper-Nickel";

		}
		else if(value == 1){
			this.value = value;
			this.commonName = "Dollar";
			this.frontMotto = "IN GOD WE TRUST";
			this.manufactureYear = 2025;
			this.frontImage = "Sacagawea";
			this.backImage = "Eagle_in_flight";
			this.backMotto = "E PLURIBUS UNUM";
			this.frontLabel = "LIBERTY";
			this.backLabel = "UNITED STATES OF AMERICA";
			this.valueDescription = "ONE DOLLAR";
			this.ridgedEdge = false;
			this.metallurgy = "Copper-Brass";
		}
	}
}