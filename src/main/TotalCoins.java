package main;

import javax.swing.*;

import net.sf.saxon.expr.sort.CodepointCollatingComparer;

import java.awt.*;
import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;


public class TotalCoins extends JFrame implements Observer{

    private JLabel totalCoinsLabel;
    private JLabel quarterCountLabel;
    private JButton updateButton;
    private JButton pennyButton;
    private JButton nickelButton;
    private JButton dimeButton;
    private JButton quarterButton;
    private JButton hdButton;
    private JButton dollarButton;
    
    public TotalCoins(Coin.CoinCounts coinCounter) {
            setTitle("Total Coins");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new FlowLayout());

            totalCoinsLabel = new JLabel("Total Coins: " + coinCounter.totalCoins);
            add(totalCoinsLabel);
            
            //quarterCountLabel = new JLabel("Total Quarters: " + coinCounter.quarterCount);
            //add(quarterCountLabel);

            pennyButton = new JButton("Penny");
            add(pennyButton);
            nickelButton = new JButton("Nickel");
            add(nickelButton);
            dimeButton = new JButton("Dime");
            add(dimeButton);
            quarterButton = new JButton("Quarter");
            add(quarterButton);
            hdButton = new JButton("HalfDollar");
            add(hdButton);
            dollarButton = new JButton("Dollar");
            add(dollarButton);

            pack();
            setVisible(true);
        }
        
        public void addPenny(ActionListener al)
        {
            pennyButton.addActionListener(al);
        }
        public void addNickel(ActionListener al)
        {
            nickelButton.addActionListener(al);
        }
        public void addDime(ActionListener al)
        {
            dimeButton.addActionListener(al);
        }
        public void addQuarter(ActionListener al)
        {
            quarterButton.addActionListener(al);
        }
        public void addHD(ActionListener al)
        {
            hdButton.addActionListener(al);
        }
        public void addDollar(ActionListener al)
        {
            dollarButton.addActionListener(al);
        }

        @Override
        public void update(Observable o, Object arg) {
            if (o instanceof Coin.CoinCounts)
            {
                Coin.CoinCounts coinct = (Coin.CoinCounts) o;
                totalCoinsLabel.setText("Total Coins: " + coinct.totalCoins);
                //quarterCountLabel.setText("Total Quarters: " + coinct.quarterCount);
            }
        }
}
