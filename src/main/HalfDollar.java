package main;

public class HalfDollar extends Coin
{
    public HalfDollar()
    {
        super(0.50,"HalfDollar", new CuproNickel());
        coinCounter.incrementHalfDollar();
    }

    public HalfDollar(Metallurgy metal)
    {
        super(0.50,"HalfDollar",metal);
        coinCounter.incrementHalfDollar();
    }

    @Override
    public Coin imprintFront(Coin c) {
        HalfDollar halfDollar = (HalfDollar) c;
        halfDollar.frontImage = "J_Kennedy";
        halfDollar.frontMotto = "IN GOD WE TRUST";
        halfDollar.frontLabel = "LIBERTY";
        halfDollar.manufactureYear = 2025;
        System.out.println("Imprinting " + halfDollar.commonName + " front...");
        return halfDollar;
    }

    @Override
    public Coin imprintFront(Coin c, int year) {
        HalfDollar halfDollar = (HalfDollar) c;
        halfDollar.frontImage = "J_Kennedy";
        halfDollar.frontMotto = "IN GOD WE TRUST";
        halfDollar.frontLabel = "LIBERTY";
        halfDollar.manufactureYear = year;
        System.out.println("Imprinting " + halfDollar.commonName + " front...");
        return halfDollar;
    }

    @Override
    public Coin imprintBack(Coin c) {
        HalfDollar halfDollar = (HalfDollar) c;
        halfDollar.backImage = "Presidential_Seal";
        halfDollar.backMotto = "E PLURIBUS UNUM";
        halfDollar.backLabel = "UNITED STATES OF AMERICA";
        halfDollar.valueDescription = "HALF DOLLAR";
        System.out.println("Imprinting " + halfDollar.commonName + " back...");
        return halfDollar;
    }

    @Override
    public Coin ridging(Coin c) {
        HalfDollar halfDollar = (HalfDollar) c;
        halfDollar.ridgedEdge = true;
        System.out.println("Ridging " + halfDollar.commonName + "...");
        return halfDollar;
    }
}