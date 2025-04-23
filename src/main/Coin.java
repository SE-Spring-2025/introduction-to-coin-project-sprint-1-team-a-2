package main;

import java.util.Observable;

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
    //protected static CoinCounts coinCounter;

    public Coin(double value, String commonName, Metallurgy smelter) {
        this.value = value;
        this.commonName = commonName;
        this.smelter = smelter;
    }

    public Coin manufacture(Coin c0){
        Coin c1 = c0.smelt(c0);
        c1 = c1.ridging(c1);
        c1 = c1.imprintFront(c1);
        c1.flip(c1);
        c1 = c1.imprintBack(c1);
        c1.buff(c1);
        return c1;
    }

    public Coin smelt(Coin c){
        System.out.println("Smelting " + c.smelter.smelt() + "...");
        c.metallurgy = c.smelter.smelt();
        return c;
    }

    public void flip(Coin c){
        System.out.println("Flipping " + c.commonName + " over...");
    }

    public void buff(Coin c){
        System.out.println("Buffing " + c.commonName + "...");
    }

    public Coin imprintFront(Coin c){return c;};
    public Coin imprintFront(Coin c, int year){return c;};
    public Coin imprintBack(Coin c){return c;};
    public Coin ridging(Coin c){return c;};



    protected static CoinCounts coinCounter = new CoinCounts();

    public static CoinCounts getCoinCounter()
    {
        return Coin.coinCounter;
    }
/*
    static {
        Coin.coinCounter = new CoinCounts();
    }*/

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

    public static CoinCounts getCounter(){
        return coinCounter;
    }

    @Override
    public String toString() {
        String edgeDescription = ridgedEdge ? "ridges" : "no ridges";
        return String.format("[%s,%.2f,%d,'%s','%s','%s','%s','%s','%s','%s',%s,'%s']",
                commonName, value, manufactureYear, frontMotto, backMotto, frontImage, backImage,
                frontLabel, backLabel, valueDescription, edgeDescription, metallurgy);
    }
    public static class CoinCounts extends Observable
    {
        public int pennyCount;
        public int nickelCount;
        public int dimeCount;
        public int quarterCount;
        public int halfDollarCount;
        public int dollarCount;
        public int totalCoins;

        public CoinCounts()
        {
            this.pennyCount = 0;
            this.nickelCount = 0;
            this.dimeCount = 0;
            this.quarterCount = 0;
            this.halfDollarCount = 0;
            this.dollarCount = 0;
            this.totalCoins = 0;
        }

        public int incrementPenny()
        {
            this.pennyCount += 1;
            this.totalCoins += 1;
            setChanged();
            notifyObservers();
            return this.pennyCount;
        }

        public int incrementNickel()
        {
            this.nickelCount += 1;
            this.totalCoins += 1;
            setChanged();
            notifyObservers();
            return this.nickelCount;
        }

        public int incrementDime()
        {
            this.dimeCount += 1;
            this.totalCoins += 1;
            setChanged();
            notifyObservers();
            return this.dimeCount;
        }

        public int incrementQuarter()
        {
            this.quarterCount += 1;
            this.totalCoins += 1;
            setChanged();
            notifyObservers();
            return this.quarterCount;
        }

        public int incrementHalfDollar()
        {
            this.halfDollarCount += 1;
            this.totalCoins += 1;
            setChanged();
            notifyObservers();
            return this.halfDollarCount;
        }

        public int incrementDollar()
        {
            this.totalCoins += 1;
            this.dollarCount += 1;
            setChanged();
            notifyObservers();
            return this.dollarCount;
        }
}
}

