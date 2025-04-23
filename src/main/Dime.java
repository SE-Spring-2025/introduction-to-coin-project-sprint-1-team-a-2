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

	public Dime imprintFront(Dime c) {
		c.frontImage = "F_Roosevelt";
		c.frontMotto = "IN GOD WE TRUST";
		c.frontLabel = "LIBERTY";
		c.manufactureYear = 2025;
		System.out.println("Imprinting " + c.commonName + " front...");
		return c;
	}

	public Dime imprintFront(Dime c, int year) {
		c.frontImage = "F_Roosevelt";
		c.frontMotto = "IN GOD WR TRUST";
		c.frontLabel = "LIBERTY";
		c.manufactureYear = year;
		System.out.println("Imprinting " + c.commonName + " front...");
		return c;
	}

	public Dime imprintBack(Dime c) {
		c.backImage = "Torch_Branches";
		c.backMotto = "E PLURIBUS UNUM";
		c.backLabel = "UNITED STATES OF AMERICA";
		c.valueDescription = "ONE DIME";
		System.out.println("Imprinting " + c.commonName + " back...");
		return c;
	}

	public Dime ridging(Dime c) {
		c.ridgedEdge = true;
		System.out.println("Ridging " + c.commonName + "...");
		return c;
	}

	public Dime manufacture(Dime c0){
        Dime c1 = (Dime) c0.smelt(c0);
        c1 = c1.ridging(c1);
        c1 = c1.imprintFront(c1);
        c1.flip(c1);
        c1 = c1.imprintBack(c1);
        c1.buff(c1);
        return c1;
    }

	public Dime manufacture(Dime c0, int year){
        Dime c1 = (Dime) c0.smelt(c0);
        c1 = c1.ridging(c1);
        c1 = c1.imprintFront(c1, year);
        c1.flip(c1);
        c1 = c1.imprintBack(c1);
        c1.buff(c1);
        return c1;
    }
}