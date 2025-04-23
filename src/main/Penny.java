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

	public Penny imprintFront(Penny c) {
		c.frontImage = "A_Lincoln";
		c.frontMotto = "IN GOD WE TRUST";
		c.frontLabel = "LIBERTY";
		c.manufactureYear = 2025;
		System.out.println("Imprinting " + c.commonName + " front...");
		return c;
	}

	public Penny imprintFront(Penny c, int year) {
		c.frontImage = "A_Lincoln";
		c.frontMotto = "IN GOD WER TRUST";
		c.frontLabel = "LIBERTY";
		c.manufactureYear = year;
		System.out.println("Imprinting " + c.commonName + " front...");
		return c;
	}

	public Penny imprintBack(Penny c) {
		c.backImage = "Lincoln_Memorial";
		c.backMotto = "E PLURIBUS UNUM";
		c.backLabel = "UNITED STATES OF AMERICA";
		c.valueDescription = "ONE CENT";
		System.out.println("Imprinting " + c.commonName + " back...");
		return c;
	}

	public Penny ridging(Penny c) {
		c.ridgedEdge = false;
		System.out.println("Not ridging " + c.commonName + "...");
		return c;
	}

	public Penny manufacture(Penny c0){
        Penny c1 = (Penny) c0.smelt(c0);
        c1 = c1.ridging(c1);
        c1 = c1.imprintFront(c1);
        c1.flip(c1);
        c1 = c1.imprintBack(c1);
        c1.buff(c1);
        return c1;
    }

	public Penny manufacture(Penny c0, int year){
        Penny c1 = (Penny) c0.smelt(c0);
        c1 = c1.ridging(c1);
        c1 = c1.imprintFront(c1, year);
        c1.flip(c1);
        c1 = c1.imprintBack(c1);
        c1.buff(c1);
        return c1;
    }
}
