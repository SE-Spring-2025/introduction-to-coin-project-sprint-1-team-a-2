package main;

/**
* Class that creates coin objects based on what 
* data (if any) is passed to methods
*
* @author  Maxwell Brown
* @author  Gabriel Basham
* @author  Josh Jones
*/

public abstract class Coin {
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

	public String toString(){
		if(this.ridgedEdge == true) {
			return String.format("[%s,%.2f,%d,'%S','%S','%s','%s','%S','%S','%S',ridges,'%s']", 
			commonName, value, manufactureYear, frontMotto, backMotto, frontImage, backImage,
			frontLabel, backLabel, valueDescription, metallurgy);
		}
		else {
			return String.format("[%s,%f,%d,'%S','%S','%s','%s','%S','%S','%S',no ridges,'%s']", 
			commonName, value, manufactureYear, frontMotto, backMotto, frontImage, backImage,
			frontLabel, backLabel, valueDescription, metallurgy);
		}
	}
}