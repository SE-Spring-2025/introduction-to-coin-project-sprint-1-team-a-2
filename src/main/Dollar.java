package main;

public class Dollar extends Coin
{    
    public Dollar()
    {
        super(1.00, "Dollar","S_Anthony","Moon_Eagle","ONE DOLLAR",true,new CuproNickel(),2025);
    }
    
    public Dollar(int year)
    {
        super(1.00, "Dollar","S_Anthony","Moon_Eagle","ONE DOLLAR",true,new CuproNickel(),year);
    }
}

