package main;

public class Quarter extends Coin
{
    public Quarter()
    {
        super(0.25,"Quarter", new CuproNickel());
        coinCounter.incrementQuarter();
    }

    public Quarter(Metallurgy metal)
    {
        super(0.25,"Quarter",metal);
        coinCounter.incrementQuarter();
    }

    @Override
    public Coin imprintFront(Coin c) {
        Quarter quarter = (Quarter) c;
        quarter.frontImage = "G_Washington";
        quarter.frontMotto = "IN GOD WE TRUST";
        quarter.frontLabel = "LIBERTY";
        quarter.manufactureYear = 2025;
        System.out.println("Imprinting " + quarter.commonName + " front...");
        return quarter;
    }

    @Override
    public Coin imprintFront(Coin c, int year) {
        Quarter quarter = (Quarter) c;
        quarter.frontImage = "G_Washington";
        quarter.frontMotto = "IN GOD WE TRUST";
        quarter.frontLabel = "LIBERTY";
        quarter.manufactureYear = year;
        System.out.println("Imprinting " + quarter.commonName + " front...");
        return quarter;
    }

    @Override
    public Coin imprintBack(Coin c) {
        Quarter quarter = (Quarter) c;
        quarter.backImage = "Eagle";
        quarter.backMotto = "E PLURIBUS UNUM";
        quarter.backLabel = "UNITED STATES OF AMERICA";
        quarter.valueDescription = "QUARTER DOLLAR";
        System.out.println("Imprinting " + quarter.commonName + " back...");
        return quarter;
    }

    @Override
    public Coin ridging(Coin c) {
        Quarter quarter = (Quarter) c;
        quarter.ridgedEdge = true;
        System.out.println("Ridging " + quarter.commonName + "...");
        return quarter;
    }
}