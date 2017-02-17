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
import javax.swing.*;
import java.awt.*;
public class GamePanel extends JPanel
{
   private int x = 30;
   private int y = 20;
   private int angelx = 1;
   private int angely = 1;
   private int speed = 5;
   
   public GamePanel()
   {
       setBackground(Color.GREEN);
   }
   
   
   public void paint(Graphics g)
   {
       super.paint(g);
       g.setColor(Color.RED);
       g.fillOval(x, y, 50, 50);
   }
   
  /* 
   public void p(Graphics d)
   {
       super.paint(d);
       d.setColor(Color.RED);
       d.fillOval(x, y, 60,60);
   }
   */
   
   void move()
   {
       if(x+angelx<0)
       {
           angelx = speed;
       }
       else if(x+ angelx > getWidth() - 50)
       {
           angelx = - speed;
       }
       else if(y + angely < 0)
       {
           angely = speed;
       }
       else if(y + angely > getHeight() - 50)
       {
           angely = -speed;
       }
       
       x = x+angelx;
       y = y+angely;
   }
}
