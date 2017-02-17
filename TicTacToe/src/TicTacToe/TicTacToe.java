/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

/**
 *
 * @author Julhas hossain Mohon
 * @id 141014034
 * @dept CSE
 * 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TicTacToe extends JFrame implements ActionListener
{
    private JButton buttons[],reset; //extra button reset
    private int counter;
    public TicTacToe()
    {
        counter = 0;
        setSize(300,300);
        setTitle("Tic Tac Toe Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,3));
        setLocation(500,300);
        setVisible(true);
        setResizable(false);
        buttons = new JButton[9];
        
        for(int i = 0; i<buttons.length; i++)
        {
            buttons[i] = new JButton();
            add(buttons[i]);
            buttons[i].addActionListener(this);
        }
    }
    
    public static void main(String[] a)
    {
        new TicTacToe();
    }
    
    
    public void actionPerformed(ActionEvent e)
    {
        counter++;
        for(int i = 0 ; i < buttons.length; i++)
        {
            if(e.getSource()== buttons[i])
            {
                if(counter == 1 || counter == 3 || counter == 5 || counter == 7 || counter == 9)
                {
                    buttons[i].setText("X");
                    buttons[i].setEnabled(false);
                }
                else if(counter == 2 || counter == 4 || counter == 6 || counter == 8 || counter == 10)
                {
                    buttons[i].setText("O");
                    buttons[i].setEnabled(false);
                }
                //reset ar jonno alada akta condition nilam
            /*    else if(e.getSource() == reset)
                {
                    int answer = JOptionPane.showConfirmDialog(null, "Would you like to play again?", "Confirm", JOptionPane.YES_NO_OPTION);
                    if(answer == JOptionPane.NO_OPTION)
                    {
                        System.exit(0);
                    }
                    else
                    {
                        reset();
                        counter = 0 ;
                    }
                }
                //----------------------------------
                    */
            }
        }
        gameOver();
    }
    
    public void gameOver()
    {
        //int reset = 0;
        //do{
        String i, j, k;
        i = buttons[0].getText();
        j = buttons[1].getText();
        k = buttons[2].getText();
        if(i.equals(j) && j.equals(k) && k.equals("X"))    
              JOptionPane.showMessageDialog(null, "X wins");
        if(i.equals(j) && j.equals(k) && k.equals("O"))    
              JOptionPane.showMessageDialog(null, "O wins");
        
        i = buttons[3].getText();
        j = buttons[4].getText();
        k = buttons[5].getText();
        if(i.equals(j) && j.equals(k) && k.equals("X"))    
              JOptionPane.showMessageDialog(null, "X wins");
        if(i.equals(j) && j.equals(k) && k.equals("O"))    
              JOptionPane.showMessageDialog(null, "O wins");
        
        i = buttons[6].getText();
        j = buttons[7].getText();
        k = buttons[8].getText();
        if(i.equals(j) && j.equals(k) && k.equals("X"))    
              JOptionPane.showMessageDialog(null, "X wins");
        if(i.equals(j) && j.equals(k) && k.equals("O"))    
              JOptionPane.showMessageDialog(null, "O wins");
        
        i = buttons[0].getText();
        j = buttons[3].getText();
        k = buttons[6].getText();
        if(i.equals(j) && j.equals(k) && k.equals("X"))    
              JOptionPane.showMessageDialog(null, "X wins");
        if(i.equals(j) && j.equals(k) && k.equals("O"))    
              JOptionPane.showMessageDialog(null, "O wins");
        
        i = buttons[1].getText();
        j = buttons[4].getText();
        k = buttons[7].getText();
        if(i.equals(j) && j.equals(k) && k.equals("X"))    
              JOptionPane.showMessageDialog(null, "X wins");
        if(i.equals(j) && j.equals(k) && k.equals("O"))    
              JOptionPane.showMessageDialog(null, "O wins");
        
        i = buttons[2].getText();
        j = buttons[5].getText();
        k = buttons[8].getText();
        if(i.equals(j) && j.equals(k) && k.equals("X"))    
              JOptionPane.showMessageDialog(null, "X wins");
        if(i.equals(j) && j.equals(k) && k.equals("O"))    
              JOptionPane.showMessageDialog(null, "O wins");
        
        i = buttons[0].getText();
        j = buttons[4].getText();
        k = buttons[8].getText();
        if(i.equals(j) && j.equals(k) && k.equals("X"))    
              JOptionPane.showMessageDialog(null, "X wins");
        if(i.equals(j) && j.equals(k) && k.equals("O"))    
              JOptionPane.showMessageDialog(null, "O wins");
        
        i = buttons[2].getText();
        j = buttons[4].getText();
        k = buttons[6].getText();
        if(i.equals(j) && j.equals(k) && k.equals("X"))    
              JOptionPane.showMessageDialog(null, "X wins");
        if(i.equals(j) && j.equals(k) && k.equals("O"))    
              JOptionPane.showMessageDialog(null, "O wins");
    }
        //while(reset<5);
}
    
    /*
    // reset function create kora hossa....
    public void reset()
    {
        counter = 0;
        for(int i = 0 ; i < buttons.length; i++)
        {
            buttons[i].setText("X");
            buttons[i].setEnabled(true);
        }
    }
    */


