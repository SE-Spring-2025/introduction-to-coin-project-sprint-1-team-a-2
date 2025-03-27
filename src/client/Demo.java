package client;
import main.Coin;

public class Demo{

    public static void main(String[] args){
        Coin coin = new Coin(.5, 1999);
        System.out.println(coin.toString());
    }
}