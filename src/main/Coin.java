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