import main.*;

public class Demo {

    public static void main(String[] args) {
        
        //Creating a new Coin variable for each concrete implementation of Coin
        Coin p = new Penny(2024);
        Coin n = new Nickel(2024);
        Coin d = new Dime(2024);
        Coin q = new Quarter(2024);
        Coin h = new HalfDollar(2024);
        Coin d1 = new Dollar(2024);

        //Printing each Coin object will print out its toString, which contains 
        //all the information about the attributes of the coin.
        System.out.println(p);
        System.out.println(n);
        System.out.println(d);
        System.out.println(q);
        System.out.println(h);
        System.out.println(d1);
    }
}