package main;

public class CoinMain {
    
    public static void main(String[] args){
        new Penny();
        new Penny();
        TotalCoins totalCoins = new TotalCoins(Coin.coinCounter);
        new Penny();
        new Quarter();
        TotalQuarters totalQuarters = new TotalQuarters(Coin.coinCounter);
        new Quarter();

    }
}
