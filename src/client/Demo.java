package client;

import main.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class Demo{
    public static void main(String[] args) {
        Coin.CoinCounts coinct = Coin.getCoinCounter();
        TotalCoins totalCoins = new TotalCoins(coinct);
        TotalQuarters totalQuarters = new TotalQuarters(coinct);
        coinct.addObserver(totalCoins);
        coinct.addObserver(totalQuarters);

        totalCoins.addPenny(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new Penny();
            }
        });
        totalCoins.addNickel(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new Nickel();
            }
        });
        totalCoins.addDime(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new Dime();
            }
        });
        totalCoins.addQuarter(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new Quarter();
            }
        });
        totalCoins.addHD(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new HalfDollar();
            }
        });
        totalCoins.addDollar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new Dollar();
            }
        });

        Penny c1 = new Penny();
        Penny c2 = c1.manufacture(c1);
    }
}