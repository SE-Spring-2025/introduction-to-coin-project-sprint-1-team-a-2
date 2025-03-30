package main;

public class Nickel extends Coin
{
	public Nickel()
	{
		super(0.05,"Nickel","T_Jefferson","Jefferson_Memorial","FIVE CENTS",false,"Cupro-Nickel",2025);
	}

	public Nickel(int year)
	{
		super(0.05,"Nickel","T_Jefferson","Jefferson_Memorial","FIVE CENTS",false,"Cupro-Nickel",year);
	}
}
