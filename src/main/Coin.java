package main;

public abstract class Coin implements Metallurgy{
    protected double value;
    protected String commonName;
    protected String frontMotto;
    protected int manufactureYear;
    protected String frontImage;
    protected String backImage;
    protected String backMotto;
    protected String frontLabel;
    protected String backLabel;
    protected String valueDescription;
    protected boolean ridgedEdge;
    protected String metallurgy;
    protected Metallurgy smelter;

    public Coin(double value, String commonName, String frontImage, String backImage,
                String valueDescription, boolean ridgedEdge, Metallurgy smelter, int year) {
        this.value = value;
        this.commonName = commonName;
        this.frontImage = frontImage;
        this.backImage = backImage;
        this.valueDescription = valueDescription;
        this.ridgedEdge = ridgedEdge;
        this.smelter = smelter;
        this.manufactureYear = year;
        this.frontMotto = "IN GOD WE TRUST";
        this.backMotto = "E PLURIBUS UNUM";
        this.frontLabel = "LIBERTY";
        this.backLabel = "UNITED STATES OF AMERICA";
        this.metallurgy = smelt();
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


    public String smelt() {
        return smelter.smelt();
    }

    @Override
    public String toString() {
        String edgeDescription = ridgedEdge ? "ridges" : "no ridges";
        return String.format("[%s, %.2f, %d, '%s', '%s', '%s', '%s', '%s', '%s', '%s', %s, '%s']",
                commonName, value, manufactureYear, frontMotto, backMotto, frontImage, backImage,
                frontLabel, backLabel, valueDescription, edgeDescription, metallurgy);
    }
}