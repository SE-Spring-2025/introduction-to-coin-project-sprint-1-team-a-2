package main;

import javax.swing.*;
import java.awt.*;

import net.sf.saxon.expr.sort.CodepointCollatingComparer;

import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;


public class TotalQuarters extends JFrame implements Observer{

    private JLabel quarterLabel;
    private JButton updateButton;
    
    public TotalQuarters(Coin.CoinCounts coinCounter) {
            setTitle("Total Quarters");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new FlowLayout());

            quarterLabel = new JLabel("Total Quarters: " + coinCounter.quarterCount);
            add(quarterLabel);
            
            pack();
            setVisible(true);
        }

        @Override
        public void update(Observable o, Object arg) {
            if (o instanceof Coin.CoinCounts)
            {
                Coin.CoinCounts coinct = (Coin.CoinCounts) o;
                quarterLabel.setText("Total Quarters: " + coinct.quarterCount);
            }
        }

    }