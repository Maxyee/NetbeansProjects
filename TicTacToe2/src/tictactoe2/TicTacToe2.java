/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe2;

/**
 *
 * @author eyami
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TicTacToe2 extends JFrame implements ActionListener{
    private JButton buttons[];
    private int counter;
    public TicTacToe2()
    {
        counter = 0;
        setSize(300, 300);
        setTitle("My Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        
        setLayout(new GridLayout(3,3));
        buttons = new JButton[9];
        
        for(int i = 0; i < buttons.length; i++)
        {
            buttons[i] = new JButton();
            add(buttons[i]);
            buttons[i].addActionListener(this);
        }
    }
    
    public static void main(String[] a)
    {
        new TicTacToe2();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        counter++;
        for(int i =0; i < buttons.length; i++)
        {
            if(e.getSource() == buttons[i])
            {
                if((counter%2)==0)
                    buttons[i].setText("X");
                else
                    buttons[i].setText("O");
            }
        }
        gameOver();
    }
    public void gameOver()
    {
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
}
