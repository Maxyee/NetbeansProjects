/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bounce;

/**
 *
 * @author eyami
 */
import javax.swing.*;
import java.awt.*;
public class DrawingPanel extends JPanel{private int x=30,y=20;
	private int anglex = 1;
	private int angley = 1;
	private int speed = 5;
	
	public DrawingPanel(){
		setBackground(Color.WHITE);
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.CYAN);
		g.fillOval(x, y, 50, 50);
		
	}
	
	void move(){
		if(x+anglex<0){
			anglex = speed;
		} else if(x+anglex> getWidth() - 50){
			anglex = -speed;
		} else if(y+angley<0){
			angley = speed;
		} else if(y+angley> getHeight() - 50){
			angley = -speed;
		}
		
		x=x+anglex;
		y=y+angley;
	}
    
}
