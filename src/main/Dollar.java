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

	public Dollar imprintFront(Dollar c) {
		c.frontImage = "S_Anthony";
		c.frontMotto = "IN GOD WE TRUST";
		c.frontLabel = "LIBERTY";
		c.manufactureYear = 2025;
        System.out.println("Imprinting " + c.commonName + " front...");
		return c;
	}

	public Dollar imprintFront(Dollar c, int year) {
		c.frontImage = "S_Anthony";
		c.frontMotto = "IN GOD WER TRUST";
		c.frontLabel = "LIBERTY";
		c.manufactureYear = year;
        System.out.println("Imprinting " + c.commonName + " front...");
		return c;
	}

	public Dollar imprintBack(Dollar c) {
		c.backImage = "Moon_Eagle";
		c.backMotto = "E PLURIBUS UNUM";
		c.backLabel = "UNITED STATES OF AMERICA";
		c.valueDescription = "ONE DOLLAR";
        System.out.println("Imprinting " + c.commonName + " back...");
		return c;
	}

	public Dollar ridging(Dollar c) {
		c.ridgedEdge = true;
        System.out.println("Ridging " + c.commonName + "...");
		return c;
	}

	public Dollar manufacture(Dollar c0){
        Dollar c1 = (Dollar) c0.smelt(c0);
        c1 = c1.ridging(c1);
        c1 = c1.imprintFront(c1);
        c1.flip(c1);
        c1 = c1.imprintBack(c1);
        c1.buff(c1);
        return c1;
    }

	public Dollar manufacture(Dollar c0, int year){
        Dollar c1 = (Dollar) c0.smelt(c0);
        c1 = c1.ridging(c1);
        c1 = c1.imprintFront(c1, year);
        c1.flip(c1);
        c1 = c1.imprintBack(c1);
        c1.buff(c1);
        return c1;
    }
}

