package main;

public class Penny extends Coin
{
    public Penny()
    {
        super(0.01,"Penny", new Copper());
        coinCounter.incrementPenny();
    }

    public Penny(Metallurgy metal)
    {
        super(0.01,"Penny",metal);
        coinCounter.incrementPenny();
    }

    @Override
    public Coin imprintFront(Coin c) {
        Penny penny = (Penny) c;
        penny.frontImage = "A_Lincoln";
        penny.frontMotto = "IN GOD WE TRUST";
        penny.frontLabel = "LIBERTY";
        penny.manufactureYear = 2025;
        System.out.println("Imprinting " + penny.commonName + " front...");
        return penny;
    }

    @Override
    public Coin imprintFront(Coin c, int year) {
        Penny penny = (Penny) c;
        penny.frontImage = "A_Lincoln";
        penny.frontMotto = "IN GOD WE TRUST";
        penny.frontLabel = "LIBERTY";
        penny.manufactureYear = year;
        System.out.println("Imprinting " + penny.commonName + " front...");
        return penny;
    }

    @Override
    public Coin imprintBack(Coin c) {
        Penny penny = (Penny) c;
        penny.backImage = "Lincoln_Memorial";
        penny.backMotto = "E PLURIBUS UNUM";
        penny.backLabel = "UNITED STATES OF AMERICA";
        penny.valueDescription = "ONE CENT";
        System.out.println("Imprinting " + penny.commonName + " back...");
        return penny;
    }

    @Override
    public Coin ridging(Coin c) {
        Penny penny = (Penny) c;
        penny.ridgedEdge = false;
        System.out.println("Not ridging " + penny.commonName + "...");
        return penny;
    }
}