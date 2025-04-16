package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TotalQuarters extends JFrame{

    private JLabel quarterLabel;
    private JButton updateButton;
    
    public TotalQuarters(Coin.CoinCounts coinCounter) {
            setTitle("Total Quarters");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new FlowLayout());

            quarterLabel = new JLabel("Total Quarters: " + coinCounter.quarterCount);
            add(quarterLabel);

            JButton updateButton = new JButton("Update");
        
            updateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    quarterLabel.setText("Total Quarters: " + coinCounter.quarterCount);
                }
            });
            add(updateButton);

            pack();
            setVisible(true);
        }
    }