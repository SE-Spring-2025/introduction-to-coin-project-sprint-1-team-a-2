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
                p = p.manufacture(p);
                coinList.add(p);
            }
        });
        totalCoins.addNickel(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Nickel n = new Nickel();
                n = n.manufacture(n);
                coinList.add(n);
            }
        });
        totalCoins.addDime(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Dime d = new Dime();
                d = d.manufacture(d);
                coinList.add(d);
            }
        });
        totalCoins.addQuarter(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Quarter q = new Quarter();
                q = q.manufacture(q);
                coinList.add(q);
            }
        });
        totalCoins.addHD(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                HalfDollar h = new HalfDollar();
                h = h.manufacture(h);
                coinList.add(h);
            }
        });
        totalCoins.addDollar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Dollar d = new Dollar();
                d = d.manufacture(d);
                coinList.add(d);
            }
        });

        Penny c1 = new Penny();
        Penny c2 = c1.manufacture(c1);
    }
}