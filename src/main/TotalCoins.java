package main;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class TotalCoins extends JFrame{

    private JLabel totalCoinsLabel;
    private JButton updateButton;
    
    public TotalCoins(CoinCounts coinCounter) {
            setTitle("Total Coins");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new FlowLayout());

            totalCoinsLabel = new JLabel("Total Coins: " + coinCounter.totalCoins);
            add(totalCoinsLabel);
            
            JButton updateButton = new JButton("Update");
        
            updateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    totalCoinsLabel.setText("Total Coins: " + coinCounter.totalCoins);
                }
            });
            add(updateButton);

            pack();
            setVisible(true);
        }   
}
