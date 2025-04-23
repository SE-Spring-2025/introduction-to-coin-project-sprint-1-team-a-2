package main;

public class Dime extends Coin
{
    public Dime()
    {
        super(0.10,"Dime", new CuproNickel());
        coinCounter.incrementDime();
    }

    public Dime(Metallurgy metal)
    {
        super(0.10,"Dime",metal);
        coinCounter.incrementDime();
    }

    @Override
    public Coin imprintFront(Coin c) {
        Dime dime = (Dime) c;
        dime.frontImage = "F_Roosevelt";
        dime.frontMotto = "IN GOD WE TRUST";
        dime.frontLabel = "LIBERTY";
        dime.manufactureYear = 2025;
        System.out.println("Imprinting " + dime.commonName + " front...");
        return dime;
    }

    @Override
    public Coin imprintFront(Coin c, int year) {
        Dime dime = (Dime) c;
        dime.frontImage = "F_Roosevelt";
        dime.frontMotto = "IN GOD WE TRUST";
        dime.frontLabel = "LIBERTY";
        dime.manufactureYear = year;
        System.out.println("Imprinting " + dime.commonName + " front...");
        return dime;
    }

    @Override
    public Coin imprintBack(Coin c) {
        Dime dime = (Dime) c;
        dime.backImage = "Torch_Branches";
        dime.backMotto = "E PLURIBUS UNUM";
        dime.backLabel = "UNITED STATES OF AMERICA";
        dime.valueDescription = "ONE DIME";
        System.out.println("Imprinting " + dime.commonName + " back...");
        return dime;
    }

    @Override
    public Coin ridging(Coin c) {
        Dime dime = (Dime) c;
        dime.ridgedEdge = true;
        System.out.println("Ridging " + dime.commonName + "...");
        return dime;
    }
}