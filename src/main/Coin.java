
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
}