package main;

public class CoinMain {
    
    public static void main(String[] args){
        Penny p = new Penny();
        Penny p1 = p.manufacture(p);
        System.out.println(p1);
        System.out.println(p1.getBackImage());

    }
}
