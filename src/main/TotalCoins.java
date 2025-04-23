package main;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class TotalCoins extends JFrame{

    private JLabel totalCoinsLabel;
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

            
            nickelButton = new JButton("Nickel");
            add(nickelButton);
            pennyButton = new JButton("Penny");
            add(pennyButton);
            dimeButton = new JButton("Dime");
            add(dimeButton);
            quarterButton = new JButton("Quarter");
            add(quarterButton);
            hdButton = new JButton("HalfDollar");
            add(hdButton);
            dollarButton = new JButton("Dollar");
            add(dollarButton);

            updateButton = new JButton("Update");
        
            updateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    totalCoinsLabel.setText("Total Quarters: " + coinCounter.totalCoins);
                }
            });
            add(updateButton);

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
}
