package main;

public class Dollar extends Coin
{    
    public Dollar()
    {
        super(1.00,"Dollar", new CuproNickel());
        coinCounter.incrementDollar();
    }

    public Dollar(Metallurgy metal)
    {
        super(1.00,"Dollar",metal);
        coinCounter.incrementDollar();
    }

    @Override
    public Coin imprintFront(Coin c) {
        Dollar dollar = (Dollar) c;
        dollar.frontImage = "S_Anthony";
        dollar.frontMotto = "IN GOD WE TRUST";
        dollar.frontLabel = "LIBERTY";
        dollar.manufactureYear = 2025;
        System.out.println("Imprinting " + dollar.commonName + " front...");
        return dollar;
    }

    @Override
    public Coin imprintFront(Coin c, int year) {
        Dollar dollar = (Dollar) c;
        dollar.frontImage = "S_Anthony";
        dollar.frontMotto = "IN GOD WE TRUST";
        dollar.frontLabel = "LIBERTY";
        dollar.manufactureYear = year;
        System.out.println("Imprinting " + dollar.commonName + " front...");
        return dollar;
    }

    @Override
    public Coin imprintBack(Coin c) {
        Dollar dollar = (Dollar) c;
        dollar.backImage = "Moon_Eagle";
        dollar.backMotto = "E PLURIBUS UNUM";
        dollar.backLabel = "UNITED STATES OF AMERICA";
        dollar.valueDescription = "ONE DOLLAR";
        System.out.println("Imprinting " + dollar.commonName + " back...");
        return dollar;
    }

    @Override
    public Coin ridging(Coin c) {
        Dollar dollar = (Dollar) c;
        dollar.ridgedEdge = true;
        System.out.println("Ridging " + dollar.commonName + "...");
        return dollar;
    }
}