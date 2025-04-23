package main;

public class Nickel extends Coin
{
    public Nickel()
    {
        super(0.05,"Nickel", new CuproNickel());
        coinCounter.incrementNickel();
    }

    public Nickel(Metallurgy metal)
    {
        super(0.05,"Nickel",metal);
        coinCounter.incrementNickel();
    }

    @Override
    public Coin imprintFront(Coin c) {
        Nickel nickel = (Nickel) c;
        nickel.frontImage = "T_Jefferson";
        nickel.frontMotto = "IN GOD WE TRUST";
        nickel.frontLabel = "LIBERTY";
        nickel.manufactureYear = 2025;
        System.out.println("Imprinting " + nickel.commonName + " front...");
        return nickel;
    }

    @Override
    public Coin imprintFront(Coin c, int year) {
        Nickel nickel = (Nickel) c;
        nickel.frontImage = "T_Jefferson";
        nickel.frontMotto = "IN GOD WE TRUST";
        nickel.frontLabel = "LIBERTY";
        nickel.manufactureYear = year;
        System.out.println("Imprinting " + nickel.commonName + " front...");
        return nickel;
    }

    @Override
    public Coin imprintBack(Coin c) {
        Nickel nickel = (Nickel) c;
        nickel.backImage = "Jefferson_Memorial";
        nickel.backMotto = "E PLURIBUS UNUM";
        nickel.backLabel = "UNITED STATES OF AMERICA";
        nickel.valueDescription = "FIVE CENTS";
        System.out.println("Imprinting " + nickel.commonName + " back...");
        return nickel;
    }

    @Override
    public Coin ridging(Coin c) {
        Nickel nickel = (Nickel) c;
        nickel.ridgedEdge = false;
        System.out.println("Not ridging " + nickel.commonName + "...");
        return nickel;
    }
}