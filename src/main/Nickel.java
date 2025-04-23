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

	public Nickel imprintFront(Nickel c) {
		c.frontImage = "T_Jefferson";
		c.frontMotto = "IN GOD WE TRUST";
		c.frontLabel = "LIBERTY";
		c.manufactureYear = 2025;
		System.out.println("Imprinting " + c.commonName + " front...");
		return c;
	}

	public Nickel imprintFront(Nickel c, int year) {
		c.frontImage = "T_Jefferson";
		c.frontMotto = "IN GOD WER TRUST";
		c.frontLabel = "LIBERTY";
		c.manufactureYear = year;
		System.out.println("Imprinting " + c.commonName + " front...");
		return c;
	}

	public Nickel imprintBack(Nickel c) {
		c.backImage = "Jefferson_Memorial";
		c.backMotto = "E PLURIBUS UNUM";
		c.backLabel = "UNITED STATES OF AMERICA";
		c.valueDescription = "FIVE CENTS";
		System.out.println("Imprinting " + c.commonName + " back...");
		return c;
	}

	public Nickel ridging(Nickel c) {
		c.ridgedEdge = false;
		System.out.println("Not ridging " + c.commonName + "...");
		return c;
	}

	public Nickel manufacture(Nickel c0){
        Nickel c1 = (Nickel) c0.smelt(c0);
        c1 = c1.ridging(c1);
        c1 = c1.imprintFront(c1);
        c1.flip(c1);
        c1 = c1.imprintBack(c1);
        c1.buff(c1);
        return c1;
    }

	public Nickel manufacture(Nickel c0, int year){
        Nickel c1 = (Nickel) c0.smelt(c0);
        c1 = c1.ridging(c1);
        c1 = c1.imprintFront(c1, year);
        c1.flip(c1);
        c1 = c1.imprintBack(c1);
        c1.buff(c1);
        return c1;
    }
}
