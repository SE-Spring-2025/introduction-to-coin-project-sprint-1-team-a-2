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

	public HalfDollar imprintFront(HalfDollar c) {
		c.frontImage = "J_Kennedy";
		c.frontMotto = "IN GOD WE TRUST";
		c.frontLabel = "LIBERTY";
		c.manufactureYear = 2025;
		System.out.println("Imprinting " + c.commonName + " front...");
		return c;
	}

	public HalfDollar imprintFront(HalfDollar c, int year) {
		c.frontImage = "J_Kennedy";
		c.frontMotto = "IN GOD WER TRUST";
		c.frontLabel = "LIBERTY";
		c.manufactureYear = year;
		System.out.println("Imprinting " + c.commonName + " front...");
		return c;
	}

	public HalfDollar imprintBack(HalfDollar c) {
		c.backImage = "Presidential_Seal";
		c.backMotto = "E PLURIBUS UNUM";
		c.backLabel = "UNITED STATES OF AMERICA";
		c.valueDescription = "HALF DOLLAR";
		System.out.println("Imprinting " + c.commonName + " back...");
		return c;
	}

	public HalfDollar ridging(HalfDollar c) {
		c.ridgedEdge = true;
		System.out.println("Ridging " + c.commonName + "...");
		return c;
	}

	public HalfDollar manufacture(HalfDollar c0){
        HalfDollar c1 = (HalfDollar) c0.smelt(c0);
        c1 = c1.ridging(c1);
        c1 = c1.imprintFront(c1);
        c1.flip(c1);
        c1 = c1.imprintBack(c1);
        c1.buff(c1);
        return c1;
    }

	public HalfDollar manufacture(HalfDollar c0, int year){
        HalfDollar c1 = (HalfDollar) c0.smelt(c0);
        c1 = c1.ridging(c1);
        c1 = c1.imprintFront(c1, year);
        c1.flip(c1);
        c1 = c1.imprintBack(c1);
        c1.buff(c1);
        return c1;
    }
}