/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ball;

/**
 *
 * @author eyami
 */

import java.awt.Color;
import java.awt.*;
import javax.swing.*;
public class Frame extends JFrame{
    private static GamePanel gpanel;
    //private static DrawingPanel dpanel;
    public Frame()
    {
        setTitle("Look Ball Moving!!!!");
        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setBackground(Color.BLACK);
        gpanel = new GamePanel();
        add(gpanel);
       // dpanel = new DrawingPanel();
        //add(dpanel);
    }
    
    public static void main(String[] args)
    {
        try
        {  
            new Frame();
            while(true)
            {
            gpanel.move();
            //gpanel.resecond();
            gpanel.repaint();
            //dpanel.repaint();
            Thread.sleep(10);
            }
        }
        catch(Exception e)
        {
        System.out.println("Exception: " + e);
        }
    }    
}
