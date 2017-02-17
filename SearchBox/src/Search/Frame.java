/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

/**
 *
 * @author eyami
 */
import javax.swing.*;
import java.awt.*;



public class Frame extends JFrame {
    //public JButton B;
    public Frame()
    {
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.CYAN);
        //setBounds(100,100,450,352);
        setSize(400,600);
        //add(B);
        
    }
    
    public static void main(String[] args)
    {
         Frame z = new Frame();
    }
}
