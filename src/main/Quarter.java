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

	public Quarter imprintFront(Quarter c) {
		c.frontImage = "G_Washington";
		c.frontMotto = "IN GOD WE TRUST";
		c.frontLabel = "LIBERTY";
		c.manufactureYear = 2025;
		System.out.println("Imprinting " + c.commonName + " front...");
		return c;
	}

	public Quarter imprintFront(Quarter c, int year) {
		c.frontImage = "G_Washington";
		c.frontMotto = "IN GOD WER TRUST";
		c.frontLabel = "LIBERTY";
		c.manufactureYear = year;
		System.out.println("Imprinting " + c.commonName + " front...");
		return c;
	}

	public Quarter imprintBack(Quarter c) {
		c.backImage = "Eagle";
		c.backMotto = "E PLURIBUS UNUM";
		c.backLabel = "UNITED STATES OF AMERICA";
		c.valueDescription = "QUARTER DOLLAR";
		System.out.println("Imprinting " + c.commonName + " back...");
		return c;
	}

	public Quarter ridging(Quarter c) {
		c.ridgedEdge = true;
		System.out.println("Ridging " + c.commonName + "...");
		return c;
	}

	public Quarter manufacture(Quarter c0){
        Quarter c1 = (Quarter) c0.smelt(c0);
        c1 = c1.ridging(c1);
        c1 = c1.imprintFront(c1);
        c1.flip(c1);
        c1 = c1.imprintBack(c1);
        c1.buff(c1);
        return c1;
    }

	public Quarter manufacture(Quarter c0, int year){
        Quarter c1 = (Quarter) c0.smelt(c0);
        c1 = c1.ridging(c1);
        c1 = c1.imprintFront(c1, year);
        c1.flip(c1);
        c1 = c1.imprintBack(c1);
        c1.buff(c1);
        return c1;
    }
}