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

        totalCoins.addPenny(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new Penny(2024);
            }
        });
        totalCoins.addNickel(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new Nickel(2024);
            }
        });
        totalCoins.addDime(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new Dime(2024);
            }
        });
        totalCoins.addQuarter(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new Quarter(2024);
            }
        });
        totalCoins.addHD(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new HalfDollar(2024);
            }
        });
        totalCoins.addDollar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new Dollar(2024);
            }
        });

        new Penny(2024);
        new Nickel(2024);
        new Dime(2024);
    }
}