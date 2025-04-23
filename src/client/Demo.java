package client;

import main.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.ArrayList;

public class Demo{
    public static void main(String[] args) {
        Coin.CoinCounts coinct = Coin.getCoinCounter();
        TotalCoins totalCoins = new TotalCoins(coinct);
        TotalQuarters totalQuarters = new TotalQuarters(coinct);
        coinct.addObserver(totalCoins);
        coinct.addObserver(totalQuarters);
        ArrayList<Coin> coinList = new ArrayList<Coin>();

        totalCoins.addPenny(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Penny p = new Penny();
                p = (Penny) p.manufacture(p);
                coinList.add(p);
                System.out.println("Manufactured a new " + p.getFamiliarName() + ": " + p);
            }
        });
        totalCoins.addNickel(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Nickel n = new Nickel();
                n = (Nickel) n.manufacture(n);
                coinList.add(n);
                System.out.println("Manufactured a new " + n.getFamiliarName() + ": " + n);
            }
        });
        totalCoins.addDime(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Dime d = new Dime();
                d = (Dime) d.manufacture(d);
                coinList.add(d);
                System.out.println("Manufactured a new " + d.getFamiliarName() + ": " + d);
            }
        });
        totalCoins.addQuarter(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Quarter q = new Quarter();
                q = (Quarter) q.manufacture(q);
                coinList.add(q);
                System.out.println("Manufactured a new " + q.getFamiliarName() + ": " + q);
            }
        });
        totalCoins.addHD(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                HalfDollar h = new HalfDollar();
                h = (HalfDollar) h.manufacture(h);
                coinList.add(h);
                System.out.println("Manufactured a new " + h.getFamiliarName() + ": " + h);
            }
        });
        totalCoins.addDollar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Dollar d = new Dollar();
                d = (Dollar) d.manufacture(d);
                coinList.add(d);
                System.out.println("Manufactured a new " + d.getFamiliarName() + ": " + d);
            }
        });

        // Example of manufacturing with different years
        System.out.println("\nDemonstrating coin manufacture with specific years:");
        Penny p2020 = new Penny();
        p2020 = (Penny) p2020.manufacture(p2020, 2020);
        System.out.println("Manufactured a 2020 " + p2020.getFamiliarName() + ": " + p2020);
        
        Nickel n1999 = new Nickel();
        n1999 = (Nickel) n1999.manufacture(n1999, 1999);
        System.out.println("Manufactured a 1999 " + n1999.getFamiliarName() + ": " + n1999);
        
        // Print summary of coins manufactured
        System.out.println("\nCoin Counter Summary:");
        System.out.println("Pennies: " + coinct.pennyCount);
        System.out.println("Nickels: " + coinct.nickelCount);
        System.out.println("Dimes: " + coinct.dimeCount);
        System.out.println("Quarters: " + coinct.quarterCount);
        System.out.println("Half Dollars: " + coinct.halfDollarCount);
        System.out.println("Dollars: " + coinct.dollarCount);
        System.out.println("Total Coins: " + coinct.totalCoins);
    }
}